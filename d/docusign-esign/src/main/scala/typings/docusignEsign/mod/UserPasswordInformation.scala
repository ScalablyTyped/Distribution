package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPasswordInformation extends js.Object {
  
  /**
    * The user's current password to be changed.
    */
  var currentPassword: js.UndefOr[String] = js.native
  
  /**
    * The user's email address for the associated account.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * A complex element containing up to four Question/Answer pairs for forgotten password information.
    */
  var forgottenPasswordInfo: js.UndefOr[
    /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
  ] = js.native
  
  /**
    * The user's new password.
    */
  var newPassword: js.UndefOr[String] = js.native
}
object UserPasswordInformation {
  
  @scala.inline
  def apply(): UserPasswordInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPasswordInformation]
  }
  
  @scala.inline
  implicit class UserPasswordInformationOps[Self <: UserPasswordInformation] (val x: Self) extends AnyVal {
    
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
    def setCurrentPassword(value: String): Self = this.set("currentPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPassword: Self = this.set("currentPassword", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setForgottenPasswordInfo(
      value: /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
    ): Self = this.set("forgottenPasswordInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordInfo: Self = this.set("forgottenPasswordInfo", js.undefined)
    
    @scala.inline
    def setNewPassword(value: String): Self = this.set("newPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPassword: Self = this.set("newPassword", js.undefined)
  }
}
