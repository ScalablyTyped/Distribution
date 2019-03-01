package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptRequest extends js.Object {
  /**
    * Optional data that must match the data originally supplied in
    * EncryptRequest.additional_authenticated_data.
    */
  var additionalAuthenticatedData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. The encrypted data originally returned in
    * EncryptResponse.ciphertext.
    */
  var ciphertext: js.UndefOr[java.lang.String] = js.undefined
}

object DecryptRequest {
  @scala.inline
  def apply(additionalAuthenticatedData: java.lang.String = null, ciphertext: java.lang.String = null): DecryptRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalAuthenticatedData != null) __obj.updateDynamic("additionalAuthenticatedData")(additionalAuthenticatedData)
    if (ciphertext != null) __obj.updateDynamic("ciphertext")(ciphertext)
    __obj.asInstanceOf[DecryptRequest]
  }
}

