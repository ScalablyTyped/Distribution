package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration and status of a self-managed SSL certificate.
  */
@js.native
trait SchemaSslCertificateSelfManagedSslCertificate extends js.Object {
  /**
    * A local certificate file. The certificate must be in PEM format. The
    * certificate chain must be no greater than 5 certs long. The chain must
    * include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String] = js.native
  /**
    * A write-only private key in PEM format. Only insert requests will include
    * this field.
    */
  var privateKey: js.UndefOr[String] = js.native
}

object SchemaSslCertificateSelfManagedSslCertificate {
  @scala.inline
  def apply(certificate: String = null, privateKey: String = null): SchemaSslCertificateSelfManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertificateSelfManagedSslCertificate]
  }
}

