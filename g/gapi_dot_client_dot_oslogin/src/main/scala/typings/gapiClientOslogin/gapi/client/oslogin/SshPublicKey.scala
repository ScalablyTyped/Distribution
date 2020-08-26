package typings.gapiClientOslogin.gapi.client.oslogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshPublicKey extends js.Object {
  /** An expiration time in microseconds since epoch. */
  var expirationTimeUsec: js.UndefOr[String] = js.native
  /**
    * The SHA-256 fingerprint of the SSH public key.
    * Output only.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Public key text in SSH format, defined by
    * <a href="https://www.ietf.org/rfc/rfc4253.txt" target="_blank">RFC4253</a>
    * section 6.6.
    */
  var key: js.UndefOr[String] = js.native
}

object SshPublicKey {
  @scala.inline
  def apply(): SshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SshPublicKey]
  }
  @scala.inline
  implicit class SshPublicKeyOps[Self <: SshPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpirationTimeUsec(value: String): Self = this.set("expirationTimeUsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTimeUsec: Self = this.set("expirationTimeUsec", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

