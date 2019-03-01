package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptRequest extends js.Object {
  /**
    * Optional data that, if specified, must also be provided during decryption
    * through DecryptRequest.additional_authenticated_data.  Must be no
    * larger than 64KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The data to encrypt. Must be no larger than 64KiB. */
  var plaintext: js.UndefOr[java.lang.String] = js.undefined
}

object EncryptRequest {
  @scala.inline
  def apply(additionalAuthenticatedData: java.lang.String = null, plaintext: java.lang.String = null): EncryptRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData)
    if (plaintext != null) __obj.updateDynamic("plaintext")(plaintext)
    __obj.asInstanceOf[EncryptRequest]
  }
}

