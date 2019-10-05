package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PrimitiveTransformation extends js.Object {
  var bucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1BucketingConfig] = js.undefined
  var characterMaskConfig: js.UndefOr[GooglePrivacyDlpV2beta1CharacterMaskConfig] = js.undefined
  var cryptoHashConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoHashConfig] = js.undefined
  var cryptoReplaceFfxFpeConfig: js.UndefOr[GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig] = js.undefined
  var fixedSizeBucketingConfig: js.UndefOr[GooglePrivacyDlpV2beta1FixedSizeBucketingConfig] = js.undefined
  var redactConfig: js.UndefOr[js.Any] = js.undefined
  var replaceConfig: js.UndefOr[GooglePrivacyDlpV2beta1ReplaceValueConfig] = js.undefined
  var replaceWithInfoTypeConfig: js.UndefOr[js.Any] = js.undefined
  var timePartConfig: js.UndefOr[GooglePrivacyDlpV2beta1TimePartConfig] = js.undefined
}

object GooglePrivacyDlpV2beta1PrimitiveTransformation {
  @scala.inline
  def apply(
    bucketingConfig: GooglePrivacyDlpV2beta1BucketingConfig = null,
    characterMaskConfig: GooglePrivacyDlpV2beta1CharacterMaskConfig = null,
    cryptoHashConfig: GooglePrivacyDlpV2beta1CryptoHashConfig = null,
    cryptoReplaceFfxFpeConfig: GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig = null,
    fixedSizeBucketingConfig: GooglePrivacyDlpV2beta1FixedSizeBucketingConfig = null,
    redactConfig: js.Any = null,
    replaceConfig: GooglePrivacyDlpV2beta1ReplaceValueConfig = null,
    replaceWithInfoTypeConfig: js.Any = null,
    timePartConfig: GooglePrivacyDlpV2beta1TimePartConfig = null
  ): GooglePrivacyDlpV2beta1PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    if (bucketingConfig != null) __obj.updateDynamic("bucketingConfig")(bucketingConfig)
    if (characterMaskConfig != null) __obj.updateDynamic("characterMaskConfig")(characterMaskConfig)
    if (cryptoHashConfig != null) __obj.updateDynamic("cryptoHashConfig")(cryptoHashConfig)
    if (cryptoReplaceFfxFpeConfig != null) __obj.updateDynamic("cryptoReplaceFfxFpeConfig")(cryptoReplaceFfxFpeConfig)
    if (fixedSizeBucketingConfig != null) __obj.updateDynamic("fixedSizeBucketingConfig")(fixedSizeBucketingConfig)
    if (redactConfig != null) __obj.updateDynamic("redactConfig")(redactConfig)
    if (replaceConfig != null) __obj.updateDynamic("replaceConfig")(replaceConfig)
    if (replaceWithInfoTypeConfig != null) __obj.updateDynamic("replaceWithInfoTypeConfig")(replaceWithInfoTypeConfig)
    if (timePartConfig != null) __obj.updateDynamic("timePartConfig")(timePartConfig)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PrimitiveTransformation]
  }
}

