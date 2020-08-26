package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait SchemaAsymmetricDecryptRequest extends js.Object {
  /**
    * Required. The data encrypted with the named CryptoKeyVersion&#39;s public
    * key using OAEP.
    */
  var ciphertext: js.UndefOr[String] = js.native
}

object SchemaAsymmetricDecryptRequest {
  @scala.inline
  def apply(): SchemaAsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricDecryptRequest]
  }
  @scala.inline
  implicit class SchemaAsymmetricDecryptRequestOps[Self <: SchemaAsymmetricDecryptRequest] (val x: Self) extends AnyVal {
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
  }
  
}

