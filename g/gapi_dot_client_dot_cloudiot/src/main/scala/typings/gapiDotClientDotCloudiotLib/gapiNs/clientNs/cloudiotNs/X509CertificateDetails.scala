package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X509CertificateDetails extends js.Object {
  /** The time the certificate becomes invalid. */
  var expiryTime: js.UndefOr[java.lang.String] = js.undefined
  /** The entity that signed the certificate. */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /** The type of public key in the certificate. */
  var publicKeyType: js.UndefOr[java.lang.String] = js.undefined
  /** The algorithm used to sign the certificate. */
  var signatureAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** The time the certificate becomes valid. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The entity the certificate and public key belong to. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object X509CertificateDetails {
  @scala.inline
  def apply(
    expiryTime: java.lang.String = null,
    issuer: java.lang.String = null,
    publicKeyType: java.lang.String = null,
    signatureAlgorithm: java.lang.String = null,
    startTime: java.lang.String = null,
    subject: java.lang.String = null
  ): X509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (publicKeyType != null) __obj.updateDynamic("publicKeyType")(publicKeyType)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[X509CertificateDetails]
  }
}

