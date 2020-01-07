package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to reset the password.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartyResetPasswordRequest extends js.Object {
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The new password inputted by the user.
    */
  var newPassword: js.UndefOr[String] = js.native
  /**
    * The old password inputted by the user.
    */
  var oldPassword: js.UndefOr[String] = js.native
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartyResetPasswordRequest {
  @scala.inline
  def apply(
    email: String = null,
    newPassword: String = null,
    oldPassword: String = null,
    oobCode: String = null
  ): Schema$IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (newPassword != null) __obj.updateDynamic("newPassword")(newPassword.asInstanceOf[js.Any])
    if (oldPassword != null) __obj.updateDynamic("oldPassword")(oldPassword.asInstanceOf[js.Any])
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
}

