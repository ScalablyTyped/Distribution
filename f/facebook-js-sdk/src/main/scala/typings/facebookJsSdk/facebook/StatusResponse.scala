package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusResponse extends js.Object {
  var authResponse: AuthResponse = js.native
  var status: LoginStatus = js.native
}

object StatusResponse {
  @scala.inline
  def apply(authResponse: AuthResponse, status: LoginStatus): StatusResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusResponse]
  }
  @scala.inline
  implicit class StatusResponseOps[Self <: StatusResponse] (val x: Self) extends AnyVal {
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
    def setAuthResponse(value: AuthResponse): Self = this.set("authResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: LoginStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

