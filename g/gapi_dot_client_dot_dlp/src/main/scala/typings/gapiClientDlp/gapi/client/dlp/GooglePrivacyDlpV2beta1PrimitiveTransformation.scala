package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1PrimitiveTransformation extends js.Object {
  var bucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1BucketingConfig] = js.native
  var characterMaskConfig: js.UndefOr[GooglePrivacyDlpV2beta1CharacterMaskConfig] = js.native
  var cryptoHashConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoHashConfig] = js.native
  var cryptoReplaceFfxFpeConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig] = js.native
  var fixedSizeBucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1FixedSizeBucketingConfig] = js.native
  var redactConfig: js.UndefOr[js.Any] = js.native
  var replaceConfig: js.UndefOr[GooglePrivacyDlpV2beta1ReplaceValueConfig] = js.native
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.native
  var timePartConfig: js.UndefOr[GooglePrivacyDlpV2beta1TimePartConfig] = js.native
}

object GooglePrivacyDlpV2beta1PrimitiveTransformation {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrimitiveTransformation]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1PrimitiveTransformationOps[Self <: GooglePrivacyDlpV2beta1PrimitiveTransformation] (val x: Self) extends AnyVal {
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
    def setBucketingConfig(value: GooglePrivacyDlpV2beta1BucketingConfig): Self = this.set("bucketingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketingConfig: Self = this.set("bucketingConfig", js.undefined)
    @scala.inline
    def setCharacterMaskConfig(value: GooglePrivacyDlpV2beta1CharacterMaskConfig): Self = this.set("characterMaskConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterMaskConfig: Self = this.set("characterMaskConfig", js.undefined)
    @scala.inline
    def setCryptoHashConfig(value: GooglePrivacyDlpV2beta1CryptoHashConfig): Self = this.set("cryptoHashConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoHashConfig: Self = this.set("cryptoHashConfig", js.undefined)
    @scala.inline
    def setCryptoReplaceFfxFpeConfig(value: GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig): Self = this.set("cryptoReplaceFfxFpeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoReplaceFfxFpeConfig: Self = this.set("cryptoReplaceFfxFpeConfig", js.undefined)
    @scala.inline
    def setFixedSizeBucketingConfig(value: GooglePrivacyDlpV2beta1FixedSizeBucketingConfig): Self = this.set("fixedSizeBucketingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedSizeBucketingConfig: Self = this.set("fixedSizeBucketingConfig", js.undefined)
    @scala.inline
    def setRedactConfig(value: js.Any): Self = this.set("redactConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactConfig: Self = this.set("redactConfig", js.undefined)
    @scala.inline
    def setReplaceConfig(value: GooglePrivacyDlpV2beta1ReplaceValueConfig): Self = this.set("replaceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceConfig: Self = this.set("replaceConfig", js.undefined)
    @scala.inline
    def setReplaceWithInfoTypeConfig(value: js.Any): Self = this.set("replaceWithInfoTypeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceWithInfoTypeConfig: Self = this.set("replaceWithInfoTypeConfig", js.undefined)
    @scala.inline
    def setTimePartConfig(value: GooglePrivacyDlpV2beta1TimePartConfig): Self = this.set("timePartConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePartConfig: Self = this.set("timePartConfig", js.undefined)
  }
  
}

