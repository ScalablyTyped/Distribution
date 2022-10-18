package typings.firebaseAuth.distAuthMod

import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait UserCredentialInternal
  extends StObject
     with UserCredential
     with TaggedWithTokenResponse {
  
  @JSName("user")
  var user_UserCredentialInternal: UserInternal
}
object UserCredentialInternal {
  
  inline def apply(operationType: link | reauthenticate | signIn, user: UserInternal): UserCredentialInternal = {
    val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], providerId = null)
    __obj.asInstanceOf[UserCredentialInternal]
  }
  
  extension [Self <: UserCredentialInternal](x: Self) {
    
    inline def setUser(value: UserInternal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
