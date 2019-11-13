package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import typings.atGoogleDashCloudKms.Anon_Purpose
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKey
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.Omit
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsStrings.purpose
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCryptoKeyRequest extends js.Object {
  var cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with Anon_Purpose
  var cryptoKeyId: String
  var parent: String
  var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
}

object CreateCryptoKeyRequest {
  @scala.inline
  def apply(
    cryptoKey: (Partial[Omit[CryptoKey, purpose]]) with Anon_Purpose,
    cryptoKeyId: String,
    parent: String,
    skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
  ): CreateCryptoKeyRequest = {
    val __obj = js.Dynamic.literal(cryptoKey = cryptoKey, cryptoKeyId = cryptoKeyId, parent = parent)
    if (!js.isUndefined(skipInitialVersionCreation)) __obj.updateDynamic("skipInitialVersionCreation")(skipInitialVersionCreation)
    __obj.asInstanceOf[CreateCryptoKeyRequest]
  }
}

