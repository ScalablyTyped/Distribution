package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKey extends js.Object {
  var createTime: AsObject
  var labels: StringDictionary[String]
  var name: String
  var nextRotationTime: js.UndefOr[AsObject] = js.undefined
  var primary: CryptoKeyVersion
  var purpose: CryptoKeyPurpose
  var versionTemplate: CryptoKeyVersionTemplate
}

object CryptoKey {
  @scala.inline
  def apply(
    createTime: AsObject,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate,
    nextRotationTime: AsObject = null
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime, labels = labels, name = name, primary = primary, purpose = purpose, versionTemplate = versionTemplate)
    if (nextRotationTime != null) __obj.updateDynamic("nextRotationTime")(nextRotationTime)
    __obj.asInstanceOf[CryptoKey]
  }
}

