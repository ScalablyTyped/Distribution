package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCredentialParams extends StObject {
  
  var accessToken: js.UndefOr[String | Null] = js.undefined
  
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var oauthToken: js.UndefOr[String] = js.undefined
  
  var oauthTokenSecret: js.UndefOr[String] = js.undefined
  
  var pendingToken: js.UndefOr[String] = js.undefined
  
  var providerId: String
  
  var secret: js.UndefOr[String] = js.undefined
  
  var signInMethod: String
}
object OAuthCredentialParams {
  
  inline def apply(providerId: String, signInMethod: String): OAuthCredentialParams = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCredentialParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthCredentialParams] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOauthToken(value: String): Self = StObject.set(x, "oauthToken", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenSecret(value: String): Self = StObject.set(x, "oauthTokenSecret", value.asInstanceOf[js.Any])
    
    inline def setOauthTokenSecretUndefined: Self = StObject.set(x, "oauthTokenSecret", js.undefined)
    
    inline def setOauthTokenUndefined: Self = StObject.set(x, "oauthToken", js.undefined)
    
    inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
    
    inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSignInMethod(value: String): Self = StObject.set(x, "signInMethod", value.asInstanceOf[js.Any])
  }
}
