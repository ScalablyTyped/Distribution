package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersion extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm
  var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
  var createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  var destroyEventTime: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  ] = js.undefined
  var destroyTime: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  ] = js.undefined
  var generateTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  var name: String
  var protectionLevel: ProtectionLevel
  var state: CryptoKeyVersionState
}

object CryptoKeyVersion {
  @scala.inline
  def apply(
    algorithm: CryptoKeyVersionAlgorithm,
    createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any,
    generateTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any,
    name: String,
    protectionLevel: ProtectionLevel,
    state: CryptoKeyVersionState,
    attestation: KeyOperationAttestation = null,
    destroyEventTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any = null,
    destroyTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any = null
  ): CryptoKeyVersion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], generateTime = generateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (attestation != null) __obj.updateDynamic("attestation")(attestation.asInstanceOf[js.Any])
    if (destroyEventTime != null) __obj.updateDynamic("destroyEventTime")(destroyEventTime.asInstanceOf[js.Any])
    if (destroyTime != null) __obj.updateDynamic("destroyTime")(destroyTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyVersion]
  }
}

