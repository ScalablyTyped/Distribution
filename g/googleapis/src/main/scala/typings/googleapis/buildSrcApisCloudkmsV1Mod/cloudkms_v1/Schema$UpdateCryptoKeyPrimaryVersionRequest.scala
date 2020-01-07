package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.UpdateCryptoKeyPrimaryVersion.
  */
@js.native
trait Schema$UpdateCryptoKeyPrimaryVersionRequest extends js.Object {
  /**
    * The id of the child CryptoKeyVersion to use as primary.
    */
  var cryptoKeyVersionId: js.UndefOr[String] = js.native
}

object Schema$UpdateCryptoKeyPrimaryVersionRequest {
  @scala.inline
  def apply(cryptoKeyVersionId: String = null): Schema$UpdateCryptoKeyPrimaryVersionRequest = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeyVersionId != null) __obj.updateDynamic("cryptoKeyVersionId")(cryptoKeyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateCryptoKeyPrimaryVersionRequest]
  }
}

