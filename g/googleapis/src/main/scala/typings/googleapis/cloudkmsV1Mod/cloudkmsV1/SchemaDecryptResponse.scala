package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.Decrypt.
  */
@js.native
trait SchemaDecryptResponse extends js.Object {
  /**
    * The decrypted data originally supplied in EncryptRequest.plaintext.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object SchemaDecryptResponse {
  @scala.inline
  def apply(): SchemaDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDecryptResponse]
  }
  @scala.inline
  implicit class SchemaDecryptResponseOps[Self <: SchemaDecryptResponse] (val x: Self) extends AnyVal {
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

