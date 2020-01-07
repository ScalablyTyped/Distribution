package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket extends js.Object {
  /**
    * Total number of values in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of value frequencies in this bucket. The total number of values
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2ValueFrequency]] = js.native
  /**
    * Lower bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyLowerBound: js.UndefOr[String] = js.native
  /**
    * Upper bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyUpperBound: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValueCount: String = null,
    bucketValues: js.Array[Schema$GooglePrivacyDlpV2ValueFrequency] = null,
    valueFrequencyLowerBound: String = null,
    valueFrequencyUpperBound: String = null
  ): Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (bucketValueCount != null) __obj.updateDynamic("bucketValueCount")(bucketValueCount.asInstanceOf[js.Any])
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues.asInstanceOf[js.Any])
    if (valueFrequencyLowerBound != null) __obj.updateDynamic("valueFrequencyLowerBound")(valueFrequencyLowerBound.asInstanceOf[js.Any])
    if (valueFrequencyUpperBound != null) __obj.updateDynamic("valueFrequencyUpperBound")(valueFrequencyUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CategoricalStatsHistogramBucket]
  }
}

