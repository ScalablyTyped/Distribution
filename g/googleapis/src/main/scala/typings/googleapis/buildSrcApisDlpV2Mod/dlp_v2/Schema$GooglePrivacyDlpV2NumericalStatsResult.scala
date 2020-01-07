package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the numerical stats computation.
  */
@js.native
trait Schema$GooglePrivacyDlpV2NumericalStatsResult extends js.Object {
  /**
    * Maximum value appearing in the column.
    */
  var maxValue: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
  /**
    * Minimum value appearing in the column.
    */
  var minValue: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Value]] = js.native
}

object Schema$GooglePrivacyDlpV2NumericalStatsResult {
  @scala.inline
  def apply(
    maxValue: Schema$GooglePrivacyDlpV2Value = null,
    minValue: Schema$GooglePrivacyDlpV2Value = null,
    quantileValues: js.Array[Schema$GooglePrivacyDlpV2Value] = null
  ): Schema$GooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (quantileValues != null) __obj.updateDynamic("quantileValues")(quantileValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2NumericalStatsResult]
  }
}

