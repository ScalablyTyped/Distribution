package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServiceIAP extends StObject {
  
  /**
    * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * OAuth2 client ID to use for the authentication flow.
    */
  var oauth2ClientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Input Only] OAuth client info required to generate client id to be used for IAP.
    */
  var oauth2ClientInfo: js.UndefOr[SchemaBackendServiceIAPOAuth2ClientInfo] = js.undefined
  
  /**
    * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
    */
  var oauth2ClientSecretSha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaBackendServiceIAP {
  
  inline def apply(): SchemaBackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceIAP]
  }
  
  extension [Self <: SchemaBackendServiceIAP](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOauth2ClientId(value: String): Self = StObject.set(x, "oauth2ClientId", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientIdNull: Self = StObject.set(x, "oauth2ClientId", null)
    
    inline def setOauth2ClientIdUndefined: Self = StObject.set(x, "oauth2ClientId", js.undefined)
    
    inline def setOauth2ClientInfo(value: SchemaBackendServiceIAPOAuth2ClientInfo): Self = StObject.set(x, "oauth2ClientInfo", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientInfoUndefined: Self = StObject.set(x, "oauth2ClientInfo", js.undefined)
    
    inline def setOauth2ClientSecret(value: String): Self = StObject.set(x, "oauth2ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientSecretNull: Self = StObject.set(x, "oauth2ClientSecret", null)
    
    inline def setOauth2ClientSecretSha256(value: String): Self = StObject.set(x, "oauth2ClientSecretSha256", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientSecretSha256Null: Self = StObject.set(x, "oauth2ClientSecretSha256", null)
    
    inline def setOauth2ClientSecretSha256Undefined: Self = StObject.set(x, "oauth2ClientSecretSha256", js.undefined)
    
    inline def setOauth2ClientSecretUndefined: Self = StObject.set(x, "oauth2ClientSecret", js.undefined)
  }
}
