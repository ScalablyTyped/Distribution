package typings.firebaseAuth.authMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.authMod.SignInWithPhoneNumberResponse
  - typings.firebaseAuth.authMod.SignInWithIdpResponse
  - typings.firebaseAuth.authMod.IdTokenResponse
*/
trait PhoneOrOauthTokenResponse extends StObject
object PhoneOrOauthTokenResponse {
  
  inline def IdTokenResponse(localId: String): typings.firebaseAuth.authMod.IdTokenResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.authMod.IdTokenResponse]
  }
  
  inline def SignInWithIdpResponse(localId: String): typings.firebaseAuth.authMod.SignInWithIdpResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.authMod.SignInWithIdpResponse]
  }
  
  inline def SignInWithPhoneNumberResponse(localId: String): typings.firebaseAuth.authMod.SignInWithPhoneNumberResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.authMod.SignInWithPhoneNumberResponse]
  }
}
