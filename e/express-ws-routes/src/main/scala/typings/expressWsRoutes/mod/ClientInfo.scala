package typings.expressWsRoutes.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var origin: String
  var req: Request_[ParamsDictionary]
  var secure: Boolean
}

object ClientInfo {
  @scala.inline
  def apply(origin: String, req: Request_[ParamsDictionary], secure: Boolean): ClientInfo = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientInfo]
  }
}

