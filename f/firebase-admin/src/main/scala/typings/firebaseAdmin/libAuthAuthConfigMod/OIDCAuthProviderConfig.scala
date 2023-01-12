package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDCAuthProviderConfig
  extends StObject
     with BaseAuthProviderConfig
     with AuthProviderConfig {
  
  /**
    * This is the required client ID used to confirm the audience of an OIDC
    * provider's
    * [ID token](https://openid.net/specs/openid-connect-core-1_0-final.html#IDToken).
    */
  var clientId: String
  
  /**
    * The OIDC provider's client secret to enable OIDC code flow.
    */
  var clientSecret: js.UndefOr[String] = js.undefined
  
  /**
    * This is the required provider issuer used to match the provider issuer of
    * the ID token and to determine the corresponding OIDC discovery document, eg.
    * [`/.well-known/openid-configuration`](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderConfig).
    * This is needed for the following:
    * <ul>
    * <li>To verify the provided issuer.</li>
    * <li>Determine the authentication/authorization endpoint during the OAuth
    *     `id_token` authentication flow.</li>
    * <li>To retrieve the public signing keys via `jwks_uri` to verify the OIDC
    *     provider's ID token's signature.</li>
    * <li>To determine the claims_supported to construct the user attributes to be
    *     returned in the additional user info response.</li>
    * </ul>
    * ID token validation will be performed as defined in the
    * [spec](https://openid.net/specs/openid-connect-core-1_0.html#IDTokenValidation).
    */
  var issuer: String
  
  /**
    * The OIDC provider's response object for OAuth authorization flow.
    */
  var responseType: js.UndefOr[OAuthResponseType] = js.undefined
}
object OIDCAuthProviderConfig {
  
  inline def apply(clientId: String, enabled: Boolean, issuer: String, providerId: String): OIDCAuthProviderConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDCAuthProviderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OIDCAuthProviderConfig] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: OAuthResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
