package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersion extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm
  var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
  var createTime: AsObject
  var destroyEventTime: js.UndefOr[AsObject] = js.undefined
  var destroyTime: js.UndefOr[AsObject] = js.undefined
  var generateTime: AsObject
  var name: String
  var protectionLevel: ProtectionLevel
  var state: CryptoKeyVersionState
}

object CryptoKeyVersion {
  @scala.inline
  def apply(
    algorithm: CryptoKeyVersionAlgorithm,
    createTime: AsObject,
    generateTime: AsObject,
    name: String,
    protectionLevel: ProtectionLevel,
    state: CryptoKeyVersionState,
    attestation: KeyOperationAttestation = null,
    destroyEventTime: AsObject = null,
    destroyTime: AsObject = null
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], generateTime = generateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (destroyEventTime != null) __obj.updateDynamic("destroyEventTime")(destroyEventTime.asInstanceOf[js.Any])
    if (destroyTime != null) __obj.updateDynamic("destroyTime")(destroyTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersion]
  }
}

