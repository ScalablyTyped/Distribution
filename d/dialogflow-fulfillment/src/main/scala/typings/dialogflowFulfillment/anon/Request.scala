package typings.dialogflowFulfillment.anon

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var request: Request_[ParamsDictionary, _, _, Query] = js.native
  var response: Response_[_] = js.native
}

object Request {
  @scala.inline
  def apply(request: Request_[ParamsDictionary, _, _, Query], response: Response_[_]): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setRequest(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Response_[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

