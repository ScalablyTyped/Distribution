package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.firebaseAuth.distAuthMod.PhoneOrOauthTokenResponse because Already inherited */ trait SignInWithIdpResponse
  extends StObject
     with IdTokenResponse {
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var oauthAccessToken: js.UndefOr[String] = js.undefined
  
  var oauthIdToken: js.UndefOr[String] = js.undefined
  
  var oauthTokenSecret: js.UndefOr[String] = js.undefined
  
  var pendingToken: js.UndefOr[String] = js.undefined
}
object SignInWithIdpResponse {
  
  inline def apply(localId: String): SignInWithIdpResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInWithIdpResponse]
  }
  
  extension [Self <: SignInWithIdpResponse](x: Self) {
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOauthAccessToken(value: String): Self = StObject.set(x, "oauthAccessToken", value.asInstanceOf[js.Any])
    
    inline def setOauthAccessTokenUndefined: Self = StObject.set(x, "oauthAccessToken", js.undefined)
    
    inline def setOauthIdToken(value: String): Self = StObject.set(x, "oauthIdToken", value.asInstanceOf[js.Any])
    
    inline def setOauthIdTokenUndefined: Self = StObject.set(x, "oauthIdToken", js.undefined)
    
    inline def setOauthTokenSecret(value: String): Self = StObject.set(x, "oauthTokenSecret", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenSecretUndefined: Self = StObject.set(x, "oauthTokenSecret", js.undefined)
    
    inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
    
    inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
  }
}
