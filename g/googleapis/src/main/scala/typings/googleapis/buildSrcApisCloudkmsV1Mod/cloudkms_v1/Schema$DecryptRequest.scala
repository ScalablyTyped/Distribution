package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.Decrypt.
  */
@js.native
trait Schema$DecryptRequest extends js.Object {
  /**
    * Optional data that must match the data originally supplied in
    * EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  /**
    * Required. The encrypted data originally returned in
    * EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[String] = js.native
}

object Schema$DecryptRequest {
  @scala.inline
  def apply(additionalAuthenticatedData: String = null, ciphertext: String = null): Schema$DecryptRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData.asInstanceOf[js.Any])
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DecryptRequest]
  }
}

