package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule for transforming a value.
  */
@js.native
trait Schema$GooglePrivacyDlpV2PrimitiveTransformation extends js.Object {
  var bucketingConfig: js.UndefOr[Schema$GooglePrivacyDlpV2BucketingConfig] = js.native
  var characterMaskConfig: js.UndefOr[Schema$GooglePrivacyDlpV2CharacterMaskConfig] = js.native
  var cryptoDeterministicConfig: js.UndefOr[Schema$GooglePrivacyDlpV2CryptoDeterministicConfig] = js.native
  var cryptoHashConfig: js.UndefOr[Schema$GooglePrivacyDlpV2CryptoHashConfig] = js.native
  var cryptoReplaceFfxFpeConfig: js.UndefOr[Schema$GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig] = js.native
  var dateShiftConfig: js.UndefOr[Schema$GooglePrivacyDlpV2DateShiftConfig] = js.native
  var fixedSizeBucketingConfig: js.UndefOr[Schema$GooglePrivacyDlpV2FixedSizeBucketingConfig] = js.native
  var redactConfig: js.UndefOr[Schema$GooglePrivacyDlpV2RedactConfig] = js.native
  var replaceConfig: js.UndefOr[Schema$GooglePrivacyDlpV2ReplaceValueConfig] = js.native
  var replaceWithInfoTypeConfig: js.UndefOr[Schema$GooglePrivacyDlpV2ReplaceWithInfoTypeConfig] = js.native
  var timePartConfig: js.UndefOr[Schema$GooglePrivacyDlpV2TimePartConfig] = js.native
}

object Schema$GooglePrivacyDlpV2PrimitiveTransformation {
  @scala.inline
  def apply(
    bucketingConfig: Schema$GooglePrivacyDlpV2BucketingConfig = null,
    characterMaskConfig: Schema$GooglePrivacyDlpV2CharacterMaskConfig = null,
    cryptoDeterministicConfig: Schema$GooglePrivacyDlpV2CryptoDeterministicConfig = null,
    cryptoHashConfig: Schema$GooglePrivacyDlpV2CryptoHashConfig = null,
    cryptoReplaceFfxFpeConfig: Schema$GooglePrivacyDlpV2CryptoReplaceFfxFpeConfig = null,
    dateShiftConfig: Schema$GooglePrivacyDlpV2DateShiftConfig = null,
    fixedSizeBucketingConfig: Schema$GooglePrivacyDlpV2FixedSizeBucketingConfig = null,
    redactConfig: Schema$GooglePrivacyDlpV2RedactConfig = null,
    replaceConfig: Schema$GooglePrivacyDlpV2ReplaceValueConfig = null,
    replaceWithInfoTypeConfig: Schema$GooglePrivacyDlpV2ReplaceWithInfoTypeConfig = null,
    timePartConfig: Schema$GooglePrivacyDlpV2TimePartConfig = null
  ): Schema$GooglePrivacyDlpV2PrimitiveTransformation = {
    val __obj = js.Dynamic.literal()
    if (bucketingConfig != null) __obj.updateDynamic("bucketingConfig")(bucketingConfig.asInstanceOf[js.Any])
    if (characterMaskConfig != null) __obj.updateDynamic("characterMaskConfig")(characterMaskConfig.asInstanceOf[js.Any])
    if (cryptoDeterministicConfig != null) __obj.updateDynamic("cryptoDeterministicConfig")(cryptoDeterministicConfig.asInstanceOf[js.Any])
    if (cryptoHashConfig != null) __obj.updateDynamic("cryptoHashConfig")(cryptoHashConfig.asInstanceOf[js.Any])
    if (cryptoReplaceFfxFpeConfig != null) __obj.updateDynamic("cryptoReplaceFfxFpeConfig")(cryptoReplaceFfxFpeConfig.asInstanceOf[js.Any])
    if (dateShiftConfig != null) __obj.updateDynamic("dateShiftConfig")(dateShiftConfig.asInstanceOf[js.Any])
    if (fixedSizeBucketingConfig != null) __obj.updateDynamic("fixedSizeBucketingConfig")(fixedSizeBucketingConfig.asInstanceOf[js.Any])
    if (redactConfig != null) __obj.updateDynamic("redactConfig")(redactConfig.asInstanceOf[js.Any])
    if (replaceConfig != null) __obj.updateDynamic("replaceConfig")(replaceConfig.asInstanceOf[js.Any])
    if (replaceWithInfoTypeConfig != null) __obj.updateDynamic("replaceWithInfoTypeConfig")(replaceWithInfoTypeConfig.asInstanceOf[js.Any])
    if (timePartConfig != null) __obj.updateDynamic("timePartConfig")(timePartConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2PrimitiveTransformation]
  }
}

