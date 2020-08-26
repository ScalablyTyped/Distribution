package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleProtobuf.timestampPbMod.Timestamp.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoKey extends js.Object {
  var createTime: AsObject = js.native
  var labels: StringDictionary[String] = js.native
  var name: String = js.native
  var nextRotationTime: js.UndefOr[AsObject] = js.native
  var primary: CryptoKeyVersion = js.native
  var purpose: CryptoKeyPurpose = js.native
  var versionTemplate: CryptoKeyVersionTemplate = js.native
}

object CryptoKey {
  @scala.inline
  def apply(
    createTime: AsObject,
    labels: StringDictionary[String],
    name: String,
    primary: CryptoKeyVersion,
    purpose: CryptoKeyPurpose,
    versionTemplate: CryptoKeyVersionTemplate
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purpose = purpose.asInstanceOf[js.Any], versionTemplate = versionTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: CryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateTime(value: AsObject): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary(value: CryptoKeyVersion): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurpose(value: CryptoKeyPurpose): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionTemplate(value: CryptoKeyVersionTemplate): Self = this.set("versionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextRotationTime(value: AsObject): Self = this.set("nextRotationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextRotationTime: Self = this.set("nextRotationTime", js.undefined)
  }
  
}

