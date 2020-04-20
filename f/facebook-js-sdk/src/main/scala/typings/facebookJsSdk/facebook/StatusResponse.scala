package typings.facebookJsSdk.facebook

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
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusResponse]
  }
}

