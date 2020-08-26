package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyResetPasswordRequest extends js.Object {
  /** The email address of the user. */
  var email: js.UndefOr[String] = js.native
  /** The new password inputted by the user. */
  var newPassword: js.UndefOr[String] = js.native
  /** The old password inputted by the user. */
  var oldPassword: js.UndefOr[String] = js.native
  /** The confirmation code. */
  var oobCode: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyResetPasswordRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyResetPasswordRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyResetPasswordRequestOps[Self <: IdentitytoolkitRelyingpartyResetPasswordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setNewPassword(value: String): Self = this.set("newPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPassword: Self = this.set("newPassword", js.undefined)
    @scala.inline
    def setOldPassword(value: String): Self = this.set("oldPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldPassword: Self = this.set("oldPassword", js.undefined)
    @scala.inline
    def setOobCode(value: String): Self = this.set("oobCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOobCode: Self = this.set("oobCode", js.undefined)
  }
  
}

