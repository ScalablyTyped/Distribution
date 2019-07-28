package typings.fb.FBNs

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
    val __obj = js.Dynamic.literal(status = status)
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse)
    __obj.asInstanceOf[LoginStatusResponse]
  }
}

