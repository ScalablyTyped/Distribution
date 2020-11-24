package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthError extends Error {
  
  var credential: js.UndefOr[AuthCredential] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var phoneNumber: js.UndefOr[String] = js.native
  
  var tenantId: js.UndefOr[String] = js.native
}
object AuthError {
  
  @scala.inline
  def apply(code: String, message: String): AuthError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthError]
  }
  
  @scala.inline
  implicit class AuthErrorOps[Self <: AuthError] (val x: Self) extends AnyVal {
    
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
    def setCredential(value: AuthCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
  }
}
