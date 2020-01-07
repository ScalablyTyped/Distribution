package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.Encrypt.
  */
@js.native
trait Schema$EncryptResponse extends js.Object {
  /**
    * The encrypted data.
    */
  var ciphertext: js.UndefOr[String] = js.native
  /**
    * The resource name of the CryptoKeyVersion used in encryption.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$EncryptResponse {
  @scala.inline
  def apply(ciphertext: String = null, name: String = null): Schema$EncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EncryptResponse]
  }
}

