package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyResetPasswordRequest extends js.Object {
  /** The email address of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The new password inputted by the user. */
  var newPassword: js.UndefOr[java.lang.String] = js.undefined
  /** The old password inputted by the user. */
  var oldPassword: js.UndefOr[java.lang.String] = js.undefined
  /** The confirmation code. */
  var oobCode: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyResetPasswordRequest {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    newPassword: java.lang.String = null,
    oldPassword: java.lang.String = null,
    oobCode: java.lang.String = null
  ): IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (newPassword != null) __obj.updateDynamic("newPassword")(newPassword)
    if (oldPassword != null) __obj.updateDynamic("oldPassword")(oldPassword)
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
}

