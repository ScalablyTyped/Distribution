package typings.googleCloudKms

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudKms.mod.v1.CryptoKeyVersion
import typings.googleCloudKms.mod.v1.CryptoKeyVersionTemplate
import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/kms.@google-cloud/kms.v1.Omit<@google-cloud/kms.@google-cloud/kms.v1.CryptoKey, 'purpose'>> & {  purpose  :keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CryptoKeyPurpose * / any} */
trait PartialOmitCryptoKeypurpo extends js.Object {
  var createTime: js.UndefOr[AsObject] = js.undefined
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nextRotationTime: js.UndefOr[AsObject] = js.undefined
  var primary: js.UndefOr[CryptoKeyVersion] = js.undefined
  var purpose: String
  var versionTemplate: js.UndefOr[CryptoKeyVersionTemplate] = js.undefined
}

object PartialOmitCryptoKeypurpo {
  @scala.inline
  def apply(
    purpose: String,
    createTime: AsObject = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    nextRotationTime: AsObject = null,
    primary: CryptoKeyVersion = null,
    versionTemplate: CryptoKeyVersionTemplate = null
  ): PartialOmitCryptoKeypurpo = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextRotationTime != null) __obj.updateDynamic("nextRotationTime")(nextRotationTime.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (versionTemplate != null) __obj.updateDynamic("versionTemplate")(versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOmitCryptoKeypurpo]
  }
}

