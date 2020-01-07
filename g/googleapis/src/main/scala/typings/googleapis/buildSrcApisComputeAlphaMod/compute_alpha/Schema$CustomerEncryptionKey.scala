package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

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
  var kmsKeyServiceAccount: js.UndefOr[String] = js.native
  /**
    * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648
    * base64 to either encrypt or decrypt this resource.
    */
  var rawKey: js.UndefOr[String] = js.native
  /**
    * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit
    * customer-supplied encryption key to either encrypt or decrypt this
    * resource.  The key must meet the following requirements before you can
    * provide it to Compute Engine:   - The key is wrapped using a RSA public
    * key certificate provided by Google.  - After being wrapped, the key must
    * be encoded in RFC 4648 base64 encoding.  Gets the RSA public key
    * certificate provided by Google at:
    * https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
    */
  var rsaEncryptedKey: js.UndefOr[String] = js.native
  /**
    * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the
    * customer-supplied encryption key that protects this resource.
    */
  var sha256: js.UndefOr[String] = js.native
}

object Schema$CustomerEncryptionKey {
  @scala.inline
  def apply(
    kmsKeyName: String = null,
    kmsKeyServiceAccount: String = null,
    rawKey: String = null,
    rsaEncryptedKey: String = null,
    sha256: String = null
  ): Schema$CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (kmsKeyServiceAccount != null) __obj.updateDynamic("kmsKeyServiceAccount")(kmsKeyServiceAccount.asInstanceOf[js.Any])
    if (rawKey != null) __obj.updateDynamic("rawKey")(rawKey.asInstanceOf[js.Any])
    if (rsaEncryptedKey != null) __obj.updateDynamic("rsaEncryptedKey")(rsaEncryptedKey.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerEncryptionKey]
  }
}

