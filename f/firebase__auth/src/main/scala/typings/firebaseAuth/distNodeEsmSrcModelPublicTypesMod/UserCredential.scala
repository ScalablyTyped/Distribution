package typings.firebaseAuth.distNodeEsmSrcModelPublicTypesMod

import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCredential extends StObject {
  
  /**
    * The type of operation which was used to authenticate the user (such as sign-in or link).
    */
  var operationType: link | reauthenticate | signIn
  
  /**
    * The provider which was used to authenticate the user.
    */
  var providerId: String | Null
  
  /**
    * The user authenticated by this credential.
    */
  var user: User
}
object UserCredential {
  
  inline def apply(operationType: link | reauthenticate | signIn, user: User): UserCredential = {
    val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], providerId = null)
    __obj.asInstanceOf[UserCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserCredential] (val x: Self) extends AnyVal {
    
    inline def setOperationType(value: link | reauthenticate | signIn): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
