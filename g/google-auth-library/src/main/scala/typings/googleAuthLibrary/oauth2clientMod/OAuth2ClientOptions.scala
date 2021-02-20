package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2ClientOptions extends RefreshOptions {
  
  var clientId: js.UndefOr[String] = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
}
object OAuth2ClientOptions {
  
  @scala.inline
  def apply(): OAuth2ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2ClientOptions]
  }
  
  @scala.inline
  implicit class OAuth2ClientOptionsMutableBuilder[Self <: OAuth2ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
