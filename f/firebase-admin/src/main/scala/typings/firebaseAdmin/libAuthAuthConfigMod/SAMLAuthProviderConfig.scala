package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLAuthProviderConfig
  extends StObject
     with BaseAuthProviderConfig
     with AuthProviderConfig {
  
  /**
    * This is fixed and must always be the same as the OAuth redirect URL
    * provisioned by Firebase Auth,
    * `https://project-id.firebaseapp.com/__/auth/handler` unless a custom
    * `authDomain` is used.
    * The callback URL should also be provided to the SAML IdP during
    * configuration.
    */
  var callbackURL: js.UndefOr[String] = js.undefined
  
  /**
    * The SAML IdP entity identifier.
    */
  var idpEntityId: String
  
  /**
    * The SAML relying party (service provider) entity ID.
    * This is defined by the developer but needs to be provided to the SAML IdP.
    */
  var rpEntityId: String
  
  /**
    * The SAML IdP SSO URL. This must be a valid URL.
    */
  var ssoURL: String
  
  /**
    * The list of SAML IdP X.509 certificates issued by CA for this provider.
    * Multiple certificates are accepted to prevent outages during
    * IdP key rotation (for example ADFS rotates every 10 days). When the Auth
    * server receives a SAML response, it will match the SAML response with the
    * certificate on record. Otherwise the response is rejected.
    * Developers are expected to manage the certificate updates as keys are
    * rotated.
    */
  var x509Certificates: js.Array[String]
}
object SAMLAuthProviderConfig {
  
  inline def apply(
    enabled: Boolean,
    idpEntityId: String,
    providerId: String,
    rpEntityId: String,
    ssoURL: String,
    x509Certificates: js.Array[String]
  ): SAMLAuthProviderConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], idpEntityId = idpEntityId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], rpEntityId = rpEntityId.asInstanceOf[js.Any], ssoURL = ssoURL.asInstanceOf[js.Any], x509Certificates = x509Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLAuthProviderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAMLAuthProviderConfig] (val x: Self) extends AnyVal {
    
    inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
    
    inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
    
    inline def setIdpEntityId(value: String): Self = StObject.set(x, "idpEntityId", value.asInstanceOf[js.Any])
    
    inline def setRpEntityId(value: String): Self = StObject.set(x, "rpEntityId", value.asInstanceOf[js.Any])
    
    inline def setSsoURL(value: String): Self = StObject.set(x, "ssoURL", value.asInstanceOf[js.Any])
    
    inline def setX509Certificates(value: js.Array[String]): Self = StObject.set(x, "x509Certificates", value.asInstanceOf[js.Any])
    
    inline def setX509CertificatesVarargs(value: String*): Self = StObject.set(x, "x509Certificates", js.Array(value*))
  }
}
