package typings.firebase.compatMod.firebase.auth

import typings.firebase.compatMod.firebase.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure containing a User, an AuthCredential, the operationType, and
  * any additional user information that was returned from the identity provider.
  * operationType could be 'signIn' for a sign-in operation, 'link' for a linking
  * operation and 'reauthenticate' for a reauthentication operation.
  */
trait UserCredential extends StObject {
  
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | Null] = js.undefined
  
  var credential: AuthCredential | Null
  
  var operationType: js.UndefOr[String | Null] = js.undefined
  
  var user: User | Null
}
object UserCredential {
  
  inline def apply(): UserCredential = {
    val __obj = js.Dynamic.literal(credential = null, user = null)
    __obj.asInstanceOf[UserCredential]
  }
  
  extension [Self <: UserCredential](x: Self) {
    
    inline def setAdditionalUserInfo(value: AdditionalUserInfo): Self = StObject.set(x, "additionalUserInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalUserInfoNull: Self = StObject.set(x, "additionalUserInfo", null)
    
    inline def setAdditionalUserInfoUndefined: Self = StObject.set(x, "additionalUserInfo", js.undefined)
    
    inline def setCredential(value: AuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialNull: Self = StObject.set(x, "credential", null)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
