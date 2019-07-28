package typings.expressDashRouters.distExpressDashRoutersMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig extends js.Object {
  var handler: RequestHandler | js.Array[RequestHandler]
  var method: RouteConfigMethod
  var path: String
}

object RouteConfig {
  @scala.inline
  def apply(handler: RequestHandler | js.Array[RequestHandler], method: RouteConfigMethod, path: String): RouteConfig = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method, path = path)
  
    __obj.asInstanceOf[RouteConfig]
  }
}

