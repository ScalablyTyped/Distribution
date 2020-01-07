package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key certificate format and data.
  */
@js.native
trait Schema$PublicKeyCertificate extends js.Object {
  /**
    * The certificate data.
    */
  var certificate: js.UndefOr[String] = js.native
  /**
    * The certificate format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * [Output only] The certificate details. Used only for X.509 certificates.
    */
  var x509Details: js.UndefOr[Schema$X509CertificateDetails] = js.native
}

object Schema$PublicKeyCertificate {
  @scala.inline
  def apply(
    certificate: String = null,
    format: String = null,
    x509Details: Schema$X509CertificateDetails = null
  ): Schema$PublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (x509Details != null) __obj.updateDynamic("x509Details")(x509Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublicKeyCertificate]
  }
}

