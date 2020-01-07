package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An SSL certificate obtained from a certificate authority.
  */
@js.native
trait Schema$CertificateRawData extends js.Object {
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on
    * certificate creation and then encrypted. The key size must be 2048 bits
    * or fewer. Must include the header and footer. Example: &lt;pre&gt;
    * -----BEGIN RSA PRIVATE KEY----- &lt;unencrypted_key_value&gt; -----END
    * RSA PRIVATE KEY----- &lt;/pre&gt; @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.native
  /**
    * PEM encoded x.509 public key certificate. This field is set once on
    * certificate creation. Must include the header and footer. Example:
    * &lt;pre&gt; -----BEGIN CERTIFICATE----- &lt;certificate_value&gt;
    * -----END CERTIFICATE----- &lt;/pre&gt;
    */
  var publicCertificate: js.UndefOr[String] = js.native
}

object Schema$CertificateRawData {
  @scala.inline
  def apply(privateKey: String = null, publicCertificate: String = null): Schema$CertificateRawData = {
    val __obj = js.Dynamic.literal()
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (publicCertificate != null) __obj.updateDynamic("publicCertificate")(publicCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CertificateRawData]
  }
}

