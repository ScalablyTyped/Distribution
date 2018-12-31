package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerEncryptionKey extends js.Object {
  /** Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. */
  var rawKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource. */
  var sha256: js.UndefOr[java.lang.String] = js.undefined
}

