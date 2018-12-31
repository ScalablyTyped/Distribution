package typings
package gapiDotClientDotOsloginLib.gapiNs.clientNs.osloginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKey extends js.Object {
  /** An expiration time in microseconds since epoch. */
  var expirationTimeUsec: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA-256 fingerprint of the SSH public key.
    * Output only.
    */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Public key text in SSH format, defined by
    * <a href="https://www.ietf.org/rfc/rfc4253.txt" target="_blank">RFC4253</a>
    * section 6.6.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

