package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.UpdateCryptoKeyPrimaryVersion.
  */
@js.native
trait SchemaUpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  /**
    * The id of the child CryptoKeyVersion to use as primary.
    */
  var cryptoKeyVersionId: js.UndefOr[String] = js.native
}

object SchemaUpdateCryptoKeyPrimaryVersionRequest {
  @scala.inline
  def apply(cryptoKeyVersionId: String = null): SchemaUpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersionId != null) __obj.updateDynamic("cryptoKeyVersionId")(cryptoKeyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateCryptoKeyPrimaryVersionRequest]
  }
}

