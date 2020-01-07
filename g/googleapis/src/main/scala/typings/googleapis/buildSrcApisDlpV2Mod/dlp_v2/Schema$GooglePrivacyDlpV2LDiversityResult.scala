package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the l-diversity computation.
  */
@js.native
trait Schema$GooglePrivacyDlpV2LDiversityResult extends js.Object {
  /**
    * Histogram of l-diversity equivalence class sensitive value frequencies.
    */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}

object Schema$GooglePrivacyDlpV2LDiversityResult {
  @scala.inline
  def apply(
    sensitiveValueFrequencyHistogramBuckets: js.Array[Schema$GooglePrivacyDlpV2LDiversityHistogramBucket] = null
  ): Schema$GooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    if (sensitiveValueFrequencyHistogramBuckets != null) __obj.updateDynamic("sensitiveValueFrequencyHistogramBuckets")(sensitiveValueFrequencyHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2LDiversityResult]
  }
}

