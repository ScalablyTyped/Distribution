package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a customer-supplied encryption key
  */
@js.native
trait Schema$CustomerEncryptionKey extends js.Object {
  /**
    * The name of the encryption key that is stored in Google Cloud KMS.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648
    * base64 to either encrypt or decrypt this resource.
    */
  var rawKey: js.UndefOr[String] = js.native
  /**
    * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the
    * customer-supplied encryption key that protects this resource.
    */
  var sha256: js.UndefOr[String] = js.native
}

object Schema$CustomerEncryptionKey {
  @scala.inline
  def apply(kmsKeyName: String = null, rawKey: String = null, sha256: String = null): Schema$CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (rawKey != null) __obj.updateDynamic("rawKey")(rawKey.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerEncryptionKey]
  }
}

