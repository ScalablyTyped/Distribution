package typings.firebaseAdmin.authConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDCUpdateAuthProviderRequest
  extends StObject
     with UpdateAuthProviderRequest {
  
  /**
    * The OIDC provider's updated client ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The OIDC provider's client secret to enable OIDC code flow.
    * If not provided, the existing configuration's value is not modified.
    */
  var clientSecret: js.UndefOr[String] = js.undefined
  
  /**
    * The OIDC provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the OIDC provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The OIDC provider's updated issuer. If not provided, the existing
    * configuration's value is not modified.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The OIDC provider's response object for OAuth authorization flow.
    */
  var responseType: js.UndefOr[OAuthResponseType] = js.undefined
}
object OIDCUpdateAuthProviderRequest {
  
  inline def apply(): OIDCUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OIDCUpdateAuthProviderRequest]
  }
  
  extension [Self <: OIDCUpdateAuthProviderRequest](x: Self) {
    
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
    
    inline def setResponseType(value: OAuthResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
