//DEPS io.quarkus:quarkus-resteasy:999-SNAPSHOT
//DEPS io.quarkus:quarkus-container-image-jib:999-SNAPSHOT
//CONFIG quarkus.http.port=7777
//CONFIG quarkus.native.container-build=true
//CONFIG quarkus.container-image.build=true
//CONFIG quarkus.container-image.name=jbang-test

import io.quarkus.runtime.Quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class quarkusadv {

    public static void main(String... args) {
        Quarkus.run(args);
    }

    @GET
    public String sayHello() {
        return "hello";
    }
}