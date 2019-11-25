package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerEncryptionKey extends js.Object {
  /** Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. */
  var rawKey: js.UndefOr[String] = js.undefined
  /** [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource. */
  var sha256: js.UndefOr[String] = js.undefined
}

object CustomerEncryptionKey {
  @scala.inline
  def apply(rawKey: String = null, sha256: String = null): CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    if (rawKey != null) __obj.updateDynamic("rawKey")(rawKey.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerEncryptionKey]
  }
}

