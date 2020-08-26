package typings.expressWsRoutes.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInfo extends js.Object {
  var origin: String = js.native
  var req: Request_[ParamsDictionary, _, _, Query] = js.native
  var secure: Boolean = js.native
}

object ClientInfo {
  @scala.inline
  def apply(origin: String, req: Request_[ParamsDictionary, _, _, Query], secure: Boolean): ClientInfo = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  @scala.inline
  implicit class ClientInfoOps[Self <: ClientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
  }
  
}

