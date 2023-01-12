package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCredentialOptions extends StObject {
  
  /**
    * The OAuth access token used to initialize the {@link OAuthCredential}.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth ID token used to initialize the {@link OAuthCredential}.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The raw nonce associated with the ID token.
    *
    * @remarks
    * It is required when an ID token with a nonce field is provided. The SHA-256 hash of the
    * raw nonce must match the nonce field in the ID token.
    */
  var rawNonce: js.UndefOr[String] = js.undefined
}
object OAuthCredentialOptions {
  
  inline def apply(): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setRawNonce(value: String): Self = StObject.set(x, "rawNonce", value.asInstanceOf[js.Any])
    
    inline def setRawNonceUndefined: Self = StObject.set(x, "rawNonce", js.undefined)
  }
}
