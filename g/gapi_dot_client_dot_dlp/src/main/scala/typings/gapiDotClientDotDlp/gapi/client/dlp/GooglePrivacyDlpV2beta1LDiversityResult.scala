package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1LDiversityResult extends js.Object {
  /** Histogram of l-diversity equivalence class sensitive value frequencies. */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1LDiversityHistogramBucket]] = js.undefined
}

object GooglePrivacyDlpV2beta1LDiversityResult {
  @scala.inline
  def apply(
    sensitiveValueFrequencyHistogramBuckets: js.Array[GooglePrivacyDlpV2beta1LDiversityHistogramBucket] = null
  ): GooglePrivacyDlpV2beta1LDiversityResult = {
    val __obj = js.Dynamic.literal()
    if (sensitiveValueFrequencyHistogramBuckets != null) __obj.updateDynamic("sensitiveValueFrequencyHistogramBuckets")(sensitiveValueFrequencyHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityResult]
  }
}

