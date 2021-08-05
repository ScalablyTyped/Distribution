package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface that represents the OAuth credentials returned by an OAuth
  * provider. Implementations specify the details about each auth provider's
  * credential requirements.
  *
  */
trait OAuthCredential
  extends StObject
     with AuthCredential {
  
  /**
    * The OAuth access token associated with the credential if it belongs to
    * an OAuth provider, such as `facebook.com`, `twitter.com`, etc.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth ID token associated with the credential if it belongs to an
    * OIDC provider, such as `google.com`.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth access token secret associated with the credential if it
    * belongs to an OAuth 1.0 provider, such as `twitter.com`.
    */
  var secret: js.UndefOr[String] = js.undefined
}
object OAuthCredential {
  
  inline def apply(providerId: String, signInMethod: String, toJSON: () => js.Object): OAuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], signInMethod = signInMethod.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OAuthCredential]
  }
  
  extension [Self <: OAuthCredential](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
