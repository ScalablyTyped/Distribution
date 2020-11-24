package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCredential extends js.Object {
  
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | Null] = js.native
  
  var credential: AuthCredential | Null = js.native
  
  var operationType: js.UndefOr[String | Null] = js.native
  
  var user: User | Null = js.native
}
object UserCredential {
  
  @scala.inline
  def apply(): UserCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserCredential]
  }
  
  @scala.inline
  implicit class UserCredentialOps[Self <: UserCredential] (val x: Self) extends AnyVal {
    
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
    def setAdditionalUserInfo(value: AdditionalUserInfo): Self = this.set("additionalUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalUserInfo: Self = this.set("additionalUserInfo", js.undefined)
    
    @scala.inline
    def setAdditionalUserInfoNull: Self = this.set("additionalUserInfo", null)
    
    @scala.inline
    def setCredential(value: AuthCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialNull: Self = this.set("credential", null)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setOperationTypeNull: Self = this.set("operationType", null)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = this.set("user", null)
  }
}
