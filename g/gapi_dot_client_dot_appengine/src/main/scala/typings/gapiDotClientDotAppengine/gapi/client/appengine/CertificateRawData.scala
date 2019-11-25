package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateRawData extends js.Object {
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer.
    * Must include the header and footer. Example: <pre> -----BEGIN RSA PRIVATE KEY----- <unencrypted_key_value> -----END RSA PRIVATE KEY----- </pre>
    * @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.undefined
  /**
    * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: <pre> -----BEGIN
    * CERTIFICATE----- <certificate_value> -----END CERTIFICATE----- </pre>
    */
  var publicCertificate: js.UndefOr[String] = js.undefined
}

object CertificateRawData {
  @scala.inline
  def apply(privateKey: String = null, publicCertificate: String = null): CertificateRawData = {
    val __obj = js.Dynamic.literal()
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (publicCertificate != null) __obj.updateDynamic("publicCertificate")(publicCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRawData]
  }
}

