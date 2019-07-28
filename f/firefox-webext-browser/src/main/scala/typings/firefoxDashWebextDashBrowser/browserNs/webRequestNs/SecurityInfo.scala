package typings.firefoxDashWebextDashBrowser.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the security properties of the request (ie. SSL/TLS information). */
trait SecurityInfo extends js.Object {
  /**
    * Certificate transparency compliance per RFC 6962\. See `https://www.certificate-transparency.org/what-is-ct`
    * for more information.
    */
  var certificateTransparencyStatus: js.UndefOr[CertificateTransparencyStatus] = js.undefined
  /**
    * Certificate data if state is "secure". Will only contain one entry unless `certificateChain` is passed as an
    * option.
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
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end
    * dates.
    */
  var isNotValidAtThisTime: js.UndefOr[Boolean] = js.undefined
  var isUntrusted: js.UndefOr[Boolean] = js.undefined
  /** The key exchange algorithm used in this request if state is "secure". */
  var keaGroupName: js.UndefOr[String] = js.undefined
  /** Protocol version if state is "secure" */
  var protocolVersion: js.UndefOr[_SecurityInfoProtocolVersion] = js.undefined
  /** The signature scheme used in this request if state is "secure". */
  var signatureSchemeName: js.UndefOr[String] = js.undefined
  var state: _SecurityInfoState
  /** list of reasons that cause the request to be considered weak, if state is "weak" */
  var weaknessReasons: js.UndefOr[js.Array[TransportWeaknessReasons]] = js.undefined
}

object SecurityInfo {
  @scala.inline
  def apply(
    certificates: js.Array[CertificateInfo],
    state: _SecurityInfoState,
    certificateTransparencyStatus: CertificateTransparencyStatus = null,
    cipherSuite: String = null,
    errorMessage: String = null,
    hpkp: String = null,
    hsts: js.UndefOr[Boolean] = js.undefined,
    isDomainMismatch: js.UndefOr[Boolean] = js.undefined,
    isExtendedValidation: js.UndefOr[Boolean] = js.undefined,
    isNotValidAtThisTime: js.UndefOr[Boolean] = js.undefined,
    isUntrusted: js.UndefOr[Boolean] = js.undefined,
    keaGroupName: String = null,
    protocolVersion: _SecurityInfoProtocolVersion = null,
    signatureSchemeName: String = null,
    weaknessReasons: js.Array[TransportWeaknessReasons] = null
  ): SecurityInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates, state = state)
    if (certificateTransparencyStatus != null) __obj.updateDynamic("certificateTransparencyStatus")(certificateTransparencyStatus)
    if (cipherSuite != null) __obj.updateDynamic("cipherSuite")(cipherSuite)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (hpkp != null) __obj.updateDynamic("hpkp")(hpkp)
    if (!js.isUndefined(hsts)) __obj.updateDynamic("hsts")(hsts)
    if (!js.isUndefined(isDomainMismatch)) __obj.updateDynamic("isDomainMismatch")(isDomainMismatch)
    if (!js.isUndefined(isExtendedValidation)) __obj.updateDynamic("isExtendedValidation")(isExtendedValidation)
    if (!js.isUndefined(isNotValidAtThisTime)) __obj.updateDynamic("isNotValidAtThisTime")(isNotValidAtThisTime)
    if (!js.isUndefined(isUntrusted)) __obj.updateDynamic("isUntrusted")(isUntrusted)
    if (keaGroupName != null) __obj.updateDynamic("keaGroupName")(keaGroupName)
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion)
    if (signatureSchemeName != null) __obj.updateDynamic("signatureSchemeName")(signatureSchemeName)
    if (weaknessReasons != null) __obj.updateDynamic("weaknessReasons")(weaknessReasons)
    __obj.asInstanceOf[SecurityInfo]
  }
}

