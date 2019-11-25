package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyResetPasswordRequest extends js.Object {
  /** The email address of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** The new password inputted by the user. */
  var newPassword: js.UndefOr[String] = js.undefined
  /** The old password inputted by the user. */
  var oldPassword: js.UndefOr[String] = js.undefined
  /** The confirmation code. */
  var oobCode: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartyResetPasswordRequest {
  @scala.inline
  def apply(
    email: String = null,
    newPassword: String = null,
    oldPassword: String = null,
    oobCode: String = null
  ): IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (newPassword != null) __obj.updateDynamic("newPassword")(newPassword.asInstanceOf[js.Any])
    if (oldPassword != null) __obj.updateDynamic("oldPassword")(oldPassword.asInstanceOf[js.Any])
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
}

