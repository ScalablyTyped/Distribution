package typings.gapiDotClientDotCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptRequest extends js.Object {
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  Must be no
    * larger than 64KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  /** Required. The data to encrypt. Must be no larger than 64KiB. */
  var plaintext: js.UndefOr[String] = js.undefined
}

object EncryptRequest {
  @scala.inline
  def apply(additionalAuthenticatedData: String = null, plaintext: String = null): EncryptRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData.asInstanceOf[js.Any])
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptRequest]
  }
}

