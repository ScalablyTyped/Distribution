package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the categorical stats computation.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CategoricalStatsResult extends js.Object {
  /**
    * Histogram of value frequencies in the column.
    */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.native
}

object Schema$GooglePrivacyDlpV2CategoricalStatsResult {
  @scala.inline
  def apply(
    valueFrequencyHistogramBuckets: js.Array[Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket] = null
  ): Schema$GooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (valueFrequencyHistogramBuckets != null) __obj.updateDynamic("valueFrequencyHistogramBuckets")(valueFrequencyHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CategoricalStatsResult]
  }
}

