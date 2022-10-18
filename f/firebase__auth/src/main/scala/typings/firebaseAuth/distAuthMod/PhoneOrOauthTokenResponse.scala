package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse
  - typings.firebaseAuth.distAuthMod.SignInWithIdpResponse
  - typings.firebaseAuth.distAuthMod.IdTokenResponse
*/
trait PhoneOrOauthTokenResponse extends StObject
object PhoneOrOauthTokenResponse {
  
  inline def IdTokenResponse(localId: String): typings.firebaseAuth.distAuthMod.IdTokenResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.IdTokenResponse]
  }
  
  inline def SignInWithIdpResponse(localId: String): typings.firebaseAuth.distAuthMod.SignInWithIdpResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.SignInWithIdpResponse]
  }
  
  inline def SignInWithPhoneNumberResponse(localId: String): typings.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse]
  }
}
