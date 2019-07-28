package typings.expressDashWsDashRoutes.expressDashWsDashRoutesMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var origin: String
  var req: Request
  var secure: Boolean
}

object ClientInfo {
  @scala.inline
  def apply(origin: String, req: Request, secure: Boolean): ClientInfo = {
    val __obj = js.Dynamic.literal(origin = origin, req = req, secure = secure)
  
    __obj.asInstanceOf[ClientInfo]
  }
}

