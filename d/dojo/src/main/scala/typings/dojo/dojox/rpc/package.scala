package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rpc {
  type JsonRest = typings.dojo.dojox.rpc.JsonRest_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/rpc/Rest.html
    *
    * This provides a HTTP REST service with full range REST verbs include PUT,POST, and DELETE.
    * A normal GET query is done by using the service directly:
    *
    * var restService = dojox.rpc.Rest("Project");
    * restService("4");
    * This will do a GET for the URL "/Project/4".
    *
    * restService.put("4","new content");
    * This will do a PUT to the URL "/Project/4" with the content of "new content".
    *
    * You can also use the SMD service to generate a REST service:
    *
    * var services = dojox.rpc.Service({services: {myRestService: {transport: "REST",...
    * services.myRestService("parameters");
    * The modifying methods can be called as sub-methods of the rest service method like:
    *
    * services.myRestService.put("parameters","data to put in resource");
    * services.myRestService.post("parameters","data to post to the resource");
    * services.myRestService['delete']("parameters");
    *
    * @param path
    * @param isJson       Optional
    * @param schema       Optional
    * @param getRequest       Optional
    */
  type Rest = js.Function4[
    /* path */ java.lang.String, 
    /* isJson */ js.UndefOr[scala.Boolean], 
    /* schema */ js.UndefOr[js.Object], 
    /* getRequest */ js.UndefOr[js.Function], 
    scala.Unit
  ]
}
