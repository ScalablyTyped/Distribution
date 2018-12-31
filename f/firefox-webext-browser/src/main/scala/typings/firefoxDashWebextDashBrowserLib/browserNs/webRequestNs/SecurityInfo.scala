package typings
package firefoxDashWebextDashBrowserLib.browserNs.webRequestNs

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
  var cipherSuite: js.UndefOr[java.lang.String] = js.undefined
  /** Error message if state is "broken" */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** True if host uses Public Key Pinning and state is "secure". */
  var hpkp: js.UndefOr[java.lang.String] = js.undefined
  /** True if host uses Strict Transport Security and state is "secure". */
  var hsts: js.UndefOr[scala.Boolean] = js.undefined
  /** The domain name does not match the certificate domain. */
  var isDomainMismatch: js.UndefOr[scala.Boolean] = js.undefined
  var isExtendedValidation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end
    * dates.
    */
  var isNotValidAtThisTime: js.UndefOr[scala.Boolean] = js.undefined
  var isUntrusted: js.UndefOr[scala.Boolean] = js.undefined
  /** The key exchange algorithm used in this request if state is "secure". */
  var keaGroupName: js.UndefOr[java.lang.String] = js.undefined
  /** Protocol version if state is "secure" */
  var protocolVersion: js.UndefOr[_SecurityInfoProtocolVersion] = js.undefined
  /** The signature scheme used in this request if state is "secure". */
  var signatureSchemeName: js.UndefOr[java.lang.String] = js.undefined
  var state: _SecurityInfoState
  /** list of reasons that cause the request to be considered weak, if state is "weak" */
  var weaknessReasons: js.UndefOr[js.Array[TransportWeaknessReasons]] = js.undefined
}

