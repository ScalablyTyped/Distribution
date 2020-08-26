package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1LDiversityResult extends js.Object {
  /** Histogram of l-diversity equivalence class sensitive value frequencies. */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1LDiversityHistogramBucket]] = js.native
}

object GooglePrivacyDlpV2beta1LDiversityResult {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityResult]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LDiversityResultOps[Self <: GooglePrivacyDlpV2beta1LDiversityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSensitiveValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2beta1LDiversityHistogramBucket*): Self = this.set("sensitiveValueFrequencyHistogramBuckets", js.Array(value :_*))
    @scala.inline
    def setSensitiveValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2beta1LDiversityHistogramBucket]): Self = this.set("sensitiveValueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitiveValueFrequencyHistogramBuckets: Self = this.set("sensitiveValueFrequencyHistogramBuckets", js.undefined)
  }
  
}

