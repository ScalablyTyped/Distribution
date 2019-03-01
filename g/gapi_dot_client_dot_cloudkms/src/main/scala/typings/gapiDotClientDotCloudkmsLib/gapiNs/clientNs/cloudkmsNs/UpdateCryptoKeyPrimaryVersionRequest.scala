package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  /** The id of the child CryptoKeyVersion to use as primary. */
  var cryptoKeyVersionId: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateCryptoKeyPrimaryVersionRequest {
  @scala.inline
  def apply(cryptoKeyVersionId: java.lang.String = null): UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersionId != null) __obj.updateDynamic("cryptoKeyVersionId")(cryptoKeyVersionId)
    __obj.asInstanceOf[UpdateCryptoKeyPrimaryVersionRequest]
  }
}

