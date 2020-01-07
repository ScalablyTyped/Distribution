package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting a code for user confirmation (reset password, change
  * email etc.).
  */
@js.native
trait Schema$GetOobConfirmationCodeResponse extends js.Object {
  /**
    * The email address that the email is sent to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The fixed string
    * &quot;identitytoolkit#GetOobConfirmationCodeResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The code to be send to the user.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object Schema$GetOobConfirmationCodeResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null, oobCode: String = null): Schema$GetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOobConfirmationCodeResponse]
  }
}

