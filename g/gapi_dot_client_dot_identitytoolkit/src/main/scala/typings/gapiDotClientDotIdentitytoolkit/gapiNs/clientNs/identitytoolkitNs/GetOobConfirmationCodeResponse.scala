package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOobConfirmationCodeResponse extends js.Object {
  /** The email address that the email is sent to. */
  var email: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#GetOobConfirmationCodeResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The code to be send to the user. */
  var oobCode: js.UndefOr[String] = js.undefined
}

object GetOobConfirmationCodeResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null, oobCode: String = null): GetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode)
    __obj.asInstanceOf[GetOobConfirmationCodeResponse]
  }
}

