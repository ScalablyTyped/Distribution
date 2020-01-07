package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait Schema$AsymmetricDecryptRequest extends js.Object {
  /**
    * Required. The data encrypted with the named CryptoKeyVersion&#39;s public
    * key using OAEP.
    */
  var ciphertext: js.UndefOr[String] = js.native
}

object Schema$AsymmetricDecryptRequest {
  @scala.inline
  def apply(ciphertext: String = null): Schema$AsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsymmetricDecryptRequest]
  }
}

