package typings.firebaseAdmin.authConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLUpdateAuthProviderRequest
  extends StObject
     with UpdateAuthProviderRequest {
  
  /**
    * The SAML provider's callback URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var callbackURL: js.UndefOr[String] = js.undefined
  
  /**
    * The SAML provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the SAML provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The SAML provider's updated IdP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var idpEntityId: js.UndefOr[String] = js.undefined
  
  /**
    * The SAML provider's updated RP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var rpEntityId: js.UndefOr[String] = js.undefined
  
  /**
    * The SAML provider's updated SSO URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var ssoURL: js.UndefOr[String] = js.undefined
  
  /**
    * The SAML provider's updated list of X.509 certificated. If not provided, the
    * existing configuration list is not modified.
    */
  var x509Certificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SAMLUpdateAuthProviderRequest {
  
  inline def apply(): SAMLUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLUpdateAuthProviderRequest]
  }
  
  extension [Self <: SAMLUpdateAuthProviderRequest](x: Self) {
    
    inline def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
    
    inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdpEntityId(value: String): Self = StObject.set(x, "idpEntityId", value.asInstanceOf[js.Any])
    
    inline def setIdpEntityIdUndefined: Self = StObject.set(x, "idpEntityId", js.undefined)
    
    inline def setRpEntityId(value: String): Self = StObject.set(x, "rpEntityId", value.asInstanceOf[js.Any])
    
    inline def setRpEntityIdUndefined: Self = StObject.set(x, "rpEntityId", js.undefined)
    
    inline def setSsoURL(value: String): Self = StObject.set(x, "ssoURL", value.asInstanceOf[js.Any])
    
    inline def setSsoURLUndefined: Self = StObject.set(x, "ssoURL", js.undefined)
    
    inline def setX509Certificates(value: js.Array[String]): Self = StObject.set(x, "x509Certificates", value.asInstanceOf[js.Any])
    
    inline def setX509CertificatesUndefined: Self = StObject.set(x, "x509Certificates", js.undefined)
    
    inline def setX509CertificatesVarargs(value: String*): Self = StObject.set(x, "x509Certificates", js.Array(value*))
  }
}
