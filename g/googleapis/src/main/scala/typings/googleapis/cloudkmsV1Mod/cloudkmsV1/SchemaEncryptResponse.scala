package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.Encrypt.
  */
@js.native
trait SchemaEncryptResponse extends js.Object {
  /**
    * The encrypted data.
    */
  var ciphertext: js.UndefOr[String] = js.native
  /**
    * The resource name of the CryptoKeyVersion used in encryption.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaEncryptResponse {
  @scala.inline
  def apply(): SchemaEncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptResponse]
  }
  @scala.inline
  implicit class SchemaEncryptResponseOps[Self <: SchemaEncryptResponse] (val x: Self) extends AnyVal {
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
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

