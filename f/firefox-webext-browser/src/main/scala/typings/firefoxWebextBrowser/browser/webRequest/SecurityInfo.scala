package typings.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the security properties of the request (ie. SSL/TLS information). */
@js.native
trait SecurityInfo extends js.Object {
  /**
    * Certificate transparency compliance per RFC 6962\. See `https://www.certificate-transparency.org/what-is-ct`
    * for more information.
    */
  var certificateTransparencyStatus: js.UndefOr[CertificateTransparencyStatus] = js.native
  /**
    * Certificate data if state is "secure". Will only contain one entry unless `certificateChain` is passed as an
    * option.
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
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end
    * dates.
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
  implicit class SecurityInfoOps[Self <: SecurityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificatesVarargs(value: CertificateInfo*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[CertificateInfo]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: SecurityInfoState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateTransparencyStatus(value: CertificateTransparencyStatus): Self = this.set("certificateTransparencyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateTransparencyStatus: Self = this.set("certificateTransparencyStatus", js.undefined)
    @scala.inline
    def setCipherSuite(value: String): Self = this.set("cipherSuite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCipherSuite: Self = this.set("cipherSuite", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setHpkp(value: String): Self = this.set("hpkp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpkp: Self = this.set("hpkp", js.undefined)
    @scala.inline
    def setHsts(value: Boolean): Self = this.set("hsts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsts: Self = this.set("hsts", js.undefined)
    @scala.inline
    def setIsDomainMismatch(value: Boolean): Self = this.set("isDomainMismatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDomainMismatch: Self = this.set("isDomainMismatch", js.undefined)
    @scala.inline
    def setIsExtendedValidation(value: Boolean): Self = this.set("isExtendedValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExtendedValidation: Self = this.set("isExtendedValidation", js.undefined)
    @scala.inline
    def setIsNotValidAtThisTime(value: Boolean): Self = this.set("isNotValidAtThisTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNotValidAtThisTime: Self = this.set("isNotValidAtThisTime", js.undefined)
    @scala.inline
    def setIsUntrusted(value: Boolean): Self = this.set("isUntrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUntrusted: Self = this.set("isUntrusted", js.undefined)
    @scala.inline
    def setKeaGroupName(value: String): Self = this.set("keaGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeaGroupName: Self = this.set("keaGroupName", js.undefined)
    @scala.inline
    def setProtocolVersion(value: SecurityInfoProtocolVersion): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    @scala.inline
    def setSignatureSchemeName(value: String): Self = this.set("signatureSchemeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureSchemeName: Self = this.set("signatureSchemeName", js.undefined)
    @scala.inline
    def setWeaknessReasonsVarargs(value: TransportWeaknessReasons*): Self = this.set("weaknessReasons", js.Array(value :_*))
    @scala.inline
    def setWeaknessReasons(value: js.Array[TransportWeaknessReasons]): Self = this.set("weaknessReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeaknessReasons: Self = this.set("weaknessReasons", js.undefined)
  }
  
}

