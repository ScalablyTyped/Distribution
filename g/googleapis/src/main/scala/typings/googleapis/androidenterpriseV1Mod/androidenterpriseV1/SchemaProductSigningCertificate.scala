package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductSigningCertificate extends js.Object {
  /**
    * The base64 urlsafe encoded SHA1 hash of the certificate. (This field is
    * deprecated in favor of SHA2-256. It should not be used and may be removed
    * at any time.)
    */
  var certificateHashSha1: js.UndefOr[String] = js.native
  /**
    * The base64 urlsafe encoded SHA2-256 hash of the certificate.
    */
  var certificateHashSha256: js.UndefOr[String] = js.native
}

object SchemaProductSigningCertificate {
  @scala.inline
  def apply(certificateHashSha1: String = null, certificateHashSha256: String = null): SchemaProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateHashSha1 != null) __obj.updateDynamic("certificateHashSha1")(certificateHashSha1.asInstanceOf[js.Any])
    if (certificateHashSha256 != null) __obj.updateDynamic("certificateHashSha256")(certificateHashSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductSigningCertificate]
  }
}

