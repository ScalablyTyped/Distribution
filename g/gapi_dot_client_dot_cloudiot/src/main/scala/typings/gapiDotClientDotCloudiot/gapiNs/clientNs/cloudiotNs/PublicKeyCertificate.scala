package typings.gapiDotClientDotCloudiot.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCertificate extends js.Object {
  /** The certificate data. */
  var certificate: js.UndefOr[String] = js.undefined
  /** The certificate format. */
  var format: js.UndefOr[String] = js.undefined
  /** [Output only] The certificate details. Used only for X.509 certificates. */
  var x509Details: js.UndefOr[X509CertificateDetails] = js.undefined
}

object PublicKeyCertificate {
  @scala.inline
  def apply(certificate: String = null, format: String = null, x509Details: X509CertificateDetails = null): PublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (format != null) __obj.updateDynamic("format")(format)
    if (x509Details != null) __obj.updateDynamic("x509Details")(x509Details)
    __obj.asInstanceOf[PublicKeyCertificate]
  }
}

