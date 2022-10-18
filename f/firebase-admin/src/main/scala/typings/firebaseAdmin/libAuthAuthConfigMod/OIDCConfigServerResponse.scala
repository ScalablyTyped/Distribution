package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDCConfigServerResponse extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[OAuthResponseType] = js.undefined
}
object OIDCConfigServerResponse {
  
  inline def apply(): OIDCConfigServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OIDCConfigServerResponse]
  }
  
  extension [Self <: OIDCConfigServerResponse](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponseType(value: OAuthResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
