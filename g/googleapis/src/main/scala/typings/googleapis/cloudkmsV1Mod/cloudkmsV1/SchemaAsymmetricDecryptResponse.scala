package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.AsymmetricDecrypt.
  */
@js.native
trait SchemaAsymmetricDecryptResponse extends js.Object {
  /**
    * The decrypted data originally encrypted with the matching public key.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object SchemaAsymmetricDecryptResponse {
  @scala.inline
  def apply(plaintext: String = null): SchemaAsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsymmetricDecryptResponse]
  }
}

