package typings.expressRouters.expressRoutersMod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig extends js.Object {
  var handler: RequestHandler[ParamsDictionary] | js.Array[RequestHandler[ParamsDictionary]]
  var method: RouteConfigMethod
  var path: String
}

object RouteConfig {
  @scala.inline
  def apply(
    handler: RequestHandler[ParamsDictionary] | js.Array[RequestHandler[ParamsDictionary]],
    method: RouteConfigMethod,
    path: String
  ): RouteConfig = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteConfig]
  }
}

