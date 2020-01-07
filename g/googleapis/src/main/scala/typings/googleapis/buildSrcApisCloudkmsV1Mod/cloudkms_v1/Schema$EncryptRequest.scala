package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.Encrypt.
  */
@js.native
trait Schema$EncryptRequest extends js.Object {
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  The maximum size
    * depends on the key version&#39;s protection_level. For SOFTWARE keys, the
    * AAD must be no larger than 64KiB. For HSM keys, the combined length of
    * the plaintext and additional_authenticated_data fields must be no larger
    * than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB.  The maximum
    * size depends on the key version&#39;s protection_level. For SOFTWARE
    * keys, the plaintext must be no larger than 64KiB. For HSM keys, the
    * combined length of the plaintext and additional_authenticated_data fields
    * must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.native
}

object Schema$EncryptRequest {
  @scala.inline
  def apply(additionalAuthenticatedData: String = null, plaintext: String = null): Schema$EncryptRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData.asInstanceOf[js.Any])
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EncryptRequest]
  }
}

