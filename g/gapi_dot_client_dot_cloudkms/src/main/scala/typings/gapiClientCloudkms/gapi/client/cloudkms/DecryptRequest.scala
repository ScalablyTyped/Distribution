package typings.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptRequest extends js.Object {
  /**
    * Optional data that must match the data originally supplied in
    * EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /**
    * Required. The encrypted data originally returned in
    * EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[String] = js.native
}

object DecryptRequest {
  @scala.inline
  def apply(): DecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptRequest]
  }
  @scala.inline
  implicit class DecryptRequestOps[Self <: DecryptRequest] (val x: Self) extends AnyVal {
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
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
  }
  
}

