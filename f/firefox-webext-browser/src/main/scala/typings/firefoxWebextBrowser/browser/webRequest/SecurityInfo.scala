package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the security properties of the request (ie. SSL/TLS information). */
@js.native
trait SecurityInfo extends StObject {
  
  /**
    * Certificate transparency compliance per RFC 6962\. See `https://www.certificate-transparency.org/what-is-ct` for more information.
    */
  var certificateTransparencyStatus: js.UndefOr[CertificateTransparencyStatus] = js.native
  
  /**
    * Certificate data if state is "secure". Will only contain one entry unless `certificateChain` is passed as an option.
    */
  var certificates: js.Array[CertificateInfo] = js.native
  
  /** The cipher suite used in this request if state is "secure". */
  var cipherSuite: js.UndefOr[String] = js.native
  
  /** Error message if state is "broken" */
  var errorMessage: js.UndefOr[String] = js.native
  
  /** True if host uses Public Key Pinning and state is "secure". */
  var hpkp: js.UndefOr[String] = js.native
  
  /** True if host uses Strict Transport Security and state is "secure". */
  var hsts: js.UndefOr[Boolean] = js.native
  
  /** The domain name does not match the certificate domain. */
  var isDomainMismatch: js.UndefOr[Boolean] = js.native
  
  var isExtendedValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end dates.
    */
  var isNotValidAtThisTime: js.UndefOr[Boolean] = js.native
  
  var isUntrusted: js.UndefOr[Boolean] = js.native
  
  /** The key exchange algorithm used in this request if state is "secure". */
  var keaGroupName: js.UndefOr[String] = js.native
  
  /** Protocol version if state is "secure" */
  var protocolVersion: js.UndefOr[SecurityInfoProtocolVersion] = js.native
  
  /** The signature scheme used in this request if state is "secure". */
  var signatureSchemeName: js.UndefOr[String] = js.native
  
  var state: SecurityInfoState = js.native
  
  /** list of reasons that cause the request to be considered weak, if state is "weak" */
  var weaknessReasons: js.UndefOr[js.Array[TransportWeaknessReasons]] = js.native
}
object SecurityInfo {
  
  @scala.inline
  def apply(certificates: js.Array[CertificateInfo], state: SecurityInfoState): SecurityInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfo]
  }
  
  @scala.inline
  implicit class SecurityInfoMutableBuilder[Self <: SecurityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateTransparencyStatus(value: CertificateTransparencyStatus): Self = StObject.set(x, "certificateTransparencyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateTransparencyStatusUndefined: Self = StObject.set(x, "certificateTransparencyStatus", js.undefined)
    
    @scala.inline
    def setCertificates(value: js.Array[CertificateInfo]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesVarargs(value: CertificateInfo*): Self = StObject.set(x, "certificates", js.Array(value :_*))
    
    @scala.inline
    def setCipherSuite(value: String): Self = StObject.set(x, "cipherSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherSuiteUndefined: Self = StObject.set(x, "cipherSuite", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setHpkp(value: String): Self = StObject.set(x, "hpkp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHpkpUndefined: Self = StObject.set(x, "hpkp", js.undefined)
    
    @scala.inline
    def setHsts(value: Boolean): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
    
    @scala.inline
    def setIsDomainMismatch(value: Boolean): Self = StObject.set(x, "isDomainMismatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDomainMismatchUndefined: Self = StObject.set(x, "isDomainMismatch", js.undefined)
    
    @scala.inline
    def setIsExtendedValidation(value: Boolean): Self = StObject.set(x, "isExtendedValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExtendedValidationUndefined: Self = StObject.set(x, "isExtendedValidation", js.undefined)
    
    @scala.inline
    def setIsNotValidAtThisTime(value: Boolean): Self = StObject.set(x, "isNotValidAtThisTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNotValidAtThisTimeUndefined: Self = StObject.set(x, "isNotValidAtThisTime", js.undefined)
    
    @scala.inline
    def setIsUntrusted(value: Boolean): Self = StObject.set(x, "isUntrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUntrustedUndefined: Self = StObject.set(x, "isUntrusted", js.undefined)
    
    @scala.inline
    def setKeaGroupName(value: String): Self = StObject.set(x, "keaGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeaGroupNameUndefined: Self = StObject.set(x, "keaGroupName", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: SecurityInfoProtocolVersion): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    @scala.inline
    def setSignatureSchemeName(value: String): Self = StObject.set(x, "signatureSchemeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureSchemeNameUndefined: Self = StObject.set(x, "signatureSchemeName", js.undefined)
    
    @scala.inline
    def setState(value: SecurityInfoState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeaknessReasons(value: js.Array[TransportWeaknessReasons]): Self = StObject.set(x, "weaknessReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeaknessReasonsUndefined: Self = StObject.set(x, "weaknessReasons", js.undefined)
    
    @scala.inline
    def setWeaknessReasonsVarargs(value: TransportWeaknessReasons*): Self = StObject.set(x, "weaknessReasons", js.Array(value :_*))
  }
}
