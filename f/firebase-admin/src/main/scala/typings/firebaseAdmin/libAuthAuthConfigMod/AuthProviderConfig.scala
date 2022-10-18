package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.libAuthAuthConfigMod.SAMLAuthProviderConfig
  - typings.firebaseAdmin.libAuthAuthConfigMod.OIDCAuthProviderConfig
*/
trait AuthProviderConfig extends StObject
object AuthProviderConfig {
  
  inline def OIDCAuthProviderConfig(clientId: String, enabled: Boolean, issuer: String, providerId: String): typings.firebaseAdmin.libAuthAuthConfigMod.OIDCAuthProviderConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.libAuthAuthConfigMod.OIDCAuthProviderConfig]
  }
  
  inline def SAMLAuthProviderConfig(
    enabled: Boolean,
    idpEntityId: String,
    providerId: String,
    rpEntityId: String,
    ssoURL: String,
    x509Certificates: js.Array[String]
  ): typings.firebaseAdmin.libAuthAuthConfigMod.SAMLAuthProviderConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], idpEntityId = idpEntityId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], rpEntityId = rpEntityId.asInstanceOf[js.Any], ssoURL = ssoURL.asInstanceOf[js.Any], x509Certificates = x509Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.firebaseAdmin.libAuthAuthConfigMod.SAMLAuthProviderConfig]
  }
}
