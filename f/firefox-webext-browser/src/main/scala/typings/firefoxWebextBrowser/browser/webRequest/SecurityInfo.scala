package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the security properties of the request (ie. SSL/TLS information). */
trait SecurityInfo extends StObject {
  
  /**
    * Certificate transparency compliance per RFC 6962\. See `https://www.certificate-transparency.org/what-is-ct` for more information.
    */
  var certificateTransparencyStatus: js.UndefOr[CertificateTransparencyStatus] = js.undefined
  
  /**
    * Certificate data if state is "secure". Will only contain one entry unless `certificateChain` is passed as an option.
    */
  var certificates: js.Array[CertificateInfo]
  
  /** The cipher suite used in this request if state is "secure". */
  var cipherSuite: js.UndefOr[String] = js.undefined
  
  /** Error message if state is "broken" */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** True if host uses Public Key Pinning and state is "secure". */
  var hpkp: js.UndefOr[String] = js.undefined
  
  /** True if host uses Strict Transport Security and state is "secure". */
  var hsts: js.UndefOr[Boolean] = js.undefined
  
  /** The domain name does not match the certificate domain. */
  var isDomainMismatch: js.UndefOr[Boolean] = js.undefined
  
  var isExtendedValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end dates.
    */
  var isNotValidAtThisTime: js.UndefOr[Boolean] = js.undefined
  
  var isUntrusted: js.UndefOr[Boolean] = js.undefined
  
  /** The key exchange algorithm used in this request if state is "secure". */
  var keaGroupName: js.UndefOr[String] = js.undefined
  
  /** Protocol version if state is "secure" */
  var protocolVersion: js.UndefOr[SecurityInfoProtocolVersion] = js.undefined
  
  /** The signature scheme used in this request if state is "secure". */
  var signatureSchemeName: js.UndefOr[String] = js.undefined
  
  var state: SecurityInfoState
  
  /** list of reasons that cause the request to be considered weak, if state is "weak" */
  var weaknessReasons: js.UndefOr[js.Array[TransportWeaknessReasons]] = js.undefined
}
object SecurityInfo {
  
  inline def apply(certificates: js.Array[CertificateInfo], state: SecurityInfoState): SecurityInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfo]
  }
  
  extension [Self <: SecurityInfo](x: Self) {
    
    inline def setCertificateTransparencyStatus(value: CertificateTransparencyStatus): Self = StObject.set(x, "certificateTransparencyStatus", value.asInstanceOf[js.Any])
    
    inline def setCertificateTransparencyStatusUndefined: Self = StObject.set(x, "certificateTransparencyStatus", js.undefined)
    
    inline def setCertificates(value: js.Array[CertificateInfo]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: CertificateInfo*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setCipherSuite(value: String): Self = StObject.set(x, "cipherSuite", value.asInstanceOf[js.Any])
    
    inline def setCipherSuiteUndefined: Self = StObject.set(x, "cipherSuite", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHpkp(value: String): Self = StObject.set(x, "hpkp", value.asInstanceOf[js.Any])
    
    inline def setHpkpUndefined: Self = StObject.set(x, "hpkp", js.undefined)
    
    inline def setHsts(value: Boolean): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
    
    inline def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
    
    inline def setIsDomainMismatch(value: Boolean): Self = StObject.set(x, "isDomainMismatch", value.asInstanceOf[js.Any])
    
    inline def setIsDomainMismatchUndefined: Self = StObject.set(x, "isDomainMismatch", js.undefined)
    
    inline def setIsExtendedValidation(value: Boolean): Self = StObject.set(x, "isExtendedValidation", value.asInstanceOf[js.Any])
    
    inline def setIsExtendedValidationUndefined: Self = StObject.set(x, "isExtendedValidation", js.undefined)
    
    inline def setIsNotValidAtThisTime(value: Boolean): Self = StObject.set(x, "isNotValidAtThisTime", value.asInstanceOf[js.Any])
    
    inline def setIsNotValidAtThisTimeUndefined: Self = StObject.set(x, "isNotValidAtThisTime", js.undefined)
    
    inline def setIsUntrusted(value: Boolean): Self = StObject.set(x, "isUntrusted", value.asInstanceOf[js.Any])
    
    inline def setIsUntrustedUndefined: Self = StObject.set(x, "isUntrusted", js.undefined)
    
    inline def setKeaGroupName(value: String): Self = StObject.set(x, "keaGroupName", value.asInstanceOf[js.Any])
    
    inline def setKeaGroupNameUndefined: Self = StObject.set(x, "keaGroupName", js.undefined)
    
    inline def setProtocolVersion(value: SecurityInfoProtocolVersion): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setSignatureSchemeName(value: String): Self = StObject.set(x, "signatureSchemeName", value.asInstanceOf[js.Any])
    
    inline def setSignatureSchemeNameUndefined: Self = StObject.set(x, "signatureSchemeName", js.undefined)
    
    inline def setState(value: SecurityInfoState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setWeaknessReasons(value: js.Array[TransportWeaknessReasons]): Self = StObject.set(x, "weaknessReasons", value.asInstanceOf[js.Any])
    
    inline def setWeaknessReasonsUndefined: Self = StObject.set(x, "weaknessReasons", js.undefined)
    
    inline def setWeaknessReasonsVarargs(value: TransportWeaknessReasons*): Self = StObject.set(x, "weaknessReasons", js.Array(value*))
  }
}
