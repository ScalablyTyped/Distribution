package typings.gapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKey extends js.Object {
  /** An expiration time in microseconds since epoch. */
  var expirationTimeUsec: js.UndefOr[String] = js.undefined
  /**
    * The SHA-256 fingerprint of the SSH public key.
    * Output only.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * Public key text in SSH format, defined by
    * <a href="https://www.ietf.org/rfc/rfc4253.txt" target="_blank">RFC4253</a>
    * section 6.6.
    */
  var key: js.UndefOr[String] = js.undefined
}

object SshPublicKey {
  @scala.inline
  def apply(expirationTimeUsec: String = null, fingerprint: String = null, key: String = null): SshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshPublicKey]
  }
}

