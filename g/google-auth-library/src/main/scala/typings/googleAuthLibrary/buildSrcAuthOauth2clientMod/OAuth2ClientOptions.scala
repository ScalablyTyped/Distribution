package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2ClientOptions
  extends StObject
     with RefreshOptions {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
}
object OAuth2ClientOptions {
  
  inline def apply(): OAuth2ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2ClientOptions]
  }
  
  extension [Self <: OAuth2ClientOptions](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
  }
}
