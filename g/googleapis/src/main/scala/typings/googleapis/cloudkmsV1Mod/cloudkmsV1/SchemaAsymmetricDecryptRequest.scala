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
  def apply(ciphertext: String = null): SchemaAsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsymmetricDecryptRequest]
  }
}

