package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2LDiversityHistogramBucket extends js.Object {
  /**
    * Total number of equivalence classes in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct equivalence classes in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of equivalence classes in this bucket. The total number of classes
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2LDiversityEquivalenceClass]] = js.native
  /**
    * Lower bound on the sensitive value frequencies of the equivalence classes
    * in this bucket.
    */
  var sensitiveValueFrequencyLowerBound: js.UndefOr[String] = js.native
  /**
    * Upper bound on the sensitive value frequencies of the equivalence classes
    * in this bucket.
    */
  var sensitiveValueFrequencyUpperBound: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2LDiversityHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValueCount: String = null,
    bucketValues: js.Array[Schema$GooglePrivacyDlpV2LDiversityEquivalenceClass] = null,
    sensitiveValueFrequencyLowerBound: String = null,
    sensitiveValueFrequencyUpperBound: String = null
  ): Schema$GooglePrivacyDlpV2LDiversityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (bucketValueCount != null) __obj.updateDynamic("bucketValueCount")(bucketValueCount.asInstanceOf[js.Any])
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues.asInstanceOf[js.Any])
    if (sensitiveValueFrequencyLowerBound != null) __obj.updateDynamic("sensitiveValueFrequencyLowerBound")(sensitiveValueFrequencyLowerBound.asInstanceOf[js.Any])
    if (sensitiveValueFrequencyUpperBound != null) __obj.updateDynamic("sensitiveValueFrequencyUpperBound")(sensitiveValueFrequencyUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2LDiversityHistogramBucket]
  }
}

