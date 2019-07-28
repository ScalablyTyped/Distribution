package typings.facebookDashJsDashSdk.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusResponse extends js.Object {
  var authResponse: AuthResponse
  var status: LoginStatus
}

object StatusResponse {
  @scala.inline
  def apply(authResponse: AuthResponse, status: LoginStatus): StatusResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse, status = status)
  
    __obj.asInstanceOf[StatusResponse]
  }
}

