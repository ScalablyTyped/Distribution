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
  def apply(plaintext: String = null): SchemaDecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDecryptResponse]
  }
}

