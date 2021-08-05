package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPasswordInformation extends StObject {
  
  /**
    * The user's current password to be changed.
    */
  var currentPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address for the associated account.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * A complex element containing up to four Question/Answer pairs for forgotten password information.
    */
  var forgottenPasswordInfo: js.UndefOr[
    /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
  ] = js.undefined
  
  /**
    * The user's new password.
    */
  var newPassword: js.UndefOr[String] = js.undefined
}
object UserPasswordInformation {
  
  inline def apply(): UserPasswordInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPasswordInformation]
  }
  
  extension [Self <: UserPasswordInformation](x: Self) {
    
    inline def setCurrentPassword(value: String): Self = StObject.set(x, "currentPassword", value.asInstanceOf[js.Any])
    
    inline def setCurrentPasswordUndefined: Self = StObject.set(x, "currentPassword", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setForgottenPasswordInfo(
      value: /* A complex element that has up to four Question/Answer pairs for forgotten password information. */ ForgottenPasswordInformation
    ): Self = StObject.set(x, "forgottenPasswordInfo", value.asInstanceOf[js.Any])
    
    inline def setForgottenPasswordInfoUndefined: Self = StObject.set(x, "forgottenPasswordInfo", js.undefined)
    
    inline def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
  }
}
