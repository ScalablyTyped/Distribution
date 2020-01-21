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
  def apply(ciphertext: String = null, name: String = null): SchemaEncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEncryptResponse]
  }
}

