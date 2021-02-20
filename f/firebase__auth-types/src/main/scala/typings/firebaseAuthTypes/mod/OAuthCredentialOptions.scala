package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthCredentialOptions extends StObject {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var idToken: js.UndefOr[String] = js.native
  
  var rawNonce: js.UndefOr[String] = js.native
}
object OAuthCredentialOptions {
  
  @scala.inline
  def apply(): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
  
  @scala.inline
  implicit class OAuthCredentialOptionsMutableBuilder[Self <: OAuthCredentialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setRawNonce(value: String): Self = StObject.set(x, "rawNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawNonceUndefined: Self = StObject.set(x, "rawNonce", js.undefined)
  }
}
