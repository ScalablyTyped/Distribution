package typings
package expressDashRoutersLib.distExpressDashRoutersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig extends js.Object {
  var handler: expressLib.expressMod.eNs.RequestHandler | js.Array[expressLib.expressMod.eNs.RequestHandler]
  var method: RouteConfigMethod
  var path: java.lang.String
}

object RouteConfig {
  @scala.inline
  def apply(
    handler: expressLib.expressMod.eNs.RequestHandler | js.Array[expressLib.expressMod.eNs.RequestHandler],
    method: RouteConfigMethod,
    path: java.lang.String
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RouteConfig]
  }
}

