package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait Schema$AsymmetricDecryptResponse extends js.Object {
  /**
    * The decrypted data originally encrypted with the matching public key.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object Schema$AsymmetricDecryptResponse {
  @scala.inline
  def apply(plaintext: String = null): Schema$AsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsymmetricDecryptResponse]
  }
}

