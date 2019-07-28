package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoricalStatsResult extends js.Object {
  /** Histogram of value frequencies in the column. */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket]] = js.undefined
}

object GooglePrivacyDlpV2beta1CategoricalStatsResult {
  @scala.inline
  def apply(
    valueFrequencyHistogramBuckets: js.Array[GooglePrivacyDlpV2beta1CategoricalStatsHistogramBucket] = null
  ): GooglePrivacyDlpV2beta1CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (valueFrequencyHistogramBuckets != null) __obj.updateDynamic("valueFrequencyHistogramBuckets")(valueFrequencyHistogramBuckets)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoricalStatsResult]
  }
}

