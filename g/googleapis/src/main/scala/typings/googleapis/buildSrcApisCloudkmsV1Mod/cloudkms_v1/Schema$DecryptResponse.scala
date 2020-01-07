package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.Decrypt.
  */
@js.native
trait Schema$DecryptResponse extends js.Object {
  /**
    * The decrypted data originally supplied in EncryptRequest.plaintext.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object Schema$DecryptResponse {
  @scala.inline
  def apply(plaintext: String = null): Schema$DecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DecryptResponse]
  }
}

