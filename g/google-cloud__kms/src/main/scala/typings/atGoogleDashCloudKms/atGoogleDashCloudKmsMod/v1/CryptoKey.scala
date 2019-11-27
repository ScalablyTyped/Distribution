package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKey extends js.Object {
  var createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  var labels: StringDictionary[String]
  var name: String
  var nextRotationTime: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any
  ] = js.undefined
  var primary: CryptoKeyVersion
  var purpose: CryptoKeyPurpose
  var versionTemplate: CryptoKeyVersionTemplate
}

object CryptoKey {
  @scala.inline
  def apply(
    createTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate,
    nextRotationTime: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_timestamp_pb.Timestamp.AsObject */ js.Any = null
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], versionTemplate = versionTemplate.asInstanceOf[js.Any])
    if (nextRotationTime != null) __obj.updateDynamic("nextRotationTime")(nextRotationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
}

