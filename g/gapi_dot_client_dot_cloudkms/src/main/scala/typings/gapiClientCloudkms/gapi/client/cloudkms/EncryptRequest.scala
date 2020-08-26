package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptRequest extends js.Object {
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  Must be no
    * larger than 64KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /** Required. The data to encrypt. Must be no larger than 64KiB. */
  var plaintext: js.UndefOr[String] = js.native
}

object EncryptRequest {
  @scala.inline
  def apply(): EncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptRequest]
  }
  @scala.inline
  implicit class EncryptRequestOps[Self <: EncryptRequest] (val x: Self) extends AnyVal {
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
    def setAdditionalAuthenticatedData(value: String): Self = this.set("additionalAuthenticatedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalAuthenticatedData: Self = this.set("additionalAuthenticatedData", js.undefined)
    @scala.inline
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
  }
  
}

