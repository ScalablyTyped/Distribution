package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A public key certificate format and data.
  */
@js.native
trait SchemaPublicKeyCertificate extends js.Object {
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
  var x509Details: js.UndefOr[SchemaX509CertificateDetails] = js.native
}

object SchemaPublicKeyCertificate {
  @scala.inline
  def apply(
    certificate: String = null,
    format: String = null,
    x509Details: SchemaX509CertificateDetails = null
  ): SchemaPublicKeyCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (x509Details != null) __obj.updateDynamic("x509Details")(x509Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublicKeyCertificate]
  }
}

