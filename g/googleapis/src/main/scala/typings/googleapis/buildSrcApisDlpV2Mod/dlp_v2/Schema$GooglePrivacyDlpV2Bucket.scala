package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bucket is represented as a range, along with replacement values.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Bucket extends js.Object {
  /**
    * Upper bound of the range, exclusive; type must match min.
    */
  var max: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
  /**
    * Replacement value for this bucket. If not provided the default behavior
    * will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
}

object Schema$GooglePrivacyDlpV2Bucket {
  @scala.inline
  def apply(
    max: Schema$GooglePrivacyDlpV2Value = null,
    min: Schema$GooglePrivacyDlpV2Value = null,
    replacementValue: Schema$GooglePrivacyDlpV2Value = null
  ): Schema$GooglePrivacyDlpV2Bucket = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (replacementValue != null) __obj.updateDynamic("replacementValue")(replacementValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Bucket]
  }
}

