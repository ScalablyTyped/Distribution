package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResponse extends js.Object {
  /** The decrypted data originally supplied in EncryptRequest.plaintext. */
  var plaintext: js.UndefOr[String] = js.native
}

object DecryptResponse {
  @scala.inline
  def apply(): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptResponse]
  }
  @scala.inline
  implicit class DecryptResponseOps[Self <: DecryptResponse] (val x: Self) extends AnyVal {
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
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
  }
  
}

