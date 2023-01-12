package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCredentialOptions extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[String] = js.undefined
  
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
