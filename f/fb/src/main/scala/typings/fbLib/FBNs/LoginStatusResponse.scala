package typings
package fbLib.FBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginStatusResponse extends js.Object {
  var authResponse: js.UndefOr[fbLib.AuthResponse] = js.undefined
  var status: fbLib.LoginStatus
}

object LoginStatusResponse {
  @scala.inline
  def apply(status: fbLib.LoginStatus, authResponse: fbLib.AuthResponse = null): LoginStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse)
    __obj.asInstanceOf[LoginStatusResponse]
  }
}

