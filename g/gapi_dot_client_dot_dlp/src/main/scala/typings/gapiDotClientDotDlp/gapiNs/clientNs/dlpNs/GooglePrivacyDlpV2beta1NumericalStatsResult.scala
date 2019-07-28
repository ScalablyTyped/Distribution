package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1NumericalStatsResult extends js.Object {
  /** Maximum value appearing in the column. */
  var maxValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /** Minimum value appearing in the column. */
  var minValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
}

object GooglePrivacyDlpV2beta1NumericalStatsResult {
  @scala.inline
  def apply(
    maxValue: GooglePrivacyDlpV2beta1Value = null,
    minValue: GooglePrivacyDlpV2beta1Value = null,
    quantileValues: js.Array[GooglePrivacyDlpV2beta1Value] = null
  ): GooglePrivacyDlpV2beta1NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue)
    if (minValue != null) __obj.updateDynamic("minValue")(minValue)
    if (quantileValues != null) __obj.updateDynamic("quantileValues")(quantileValues)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1NumericalStatsResult]
  }
}

