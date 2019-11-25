package typings.fb.FB

import typings.fb.AuthResponse
import typings.fb.LoginStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginStatusResponse extends js.Object {
  var authResponse: js.UndefOr[AuthResponse] = js.undefined
  var status: LoginStatus
}

object LoginStatusResponse {
  @scala.inline
  def apply(status: LoginStatus, authResponse: AuthResponse = null): LoginStatusResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStatusResponse]
  }
}

