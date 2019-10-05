package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KAnonymityResult extends js.Object {
  /** Histogram of k-anonymity equivalence classes. */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]] = js.undefined
}

object GooglePrivacyDlpV2beta1KAnonymityResult {
  @scala.inline
  def apply(
    equivalenceClassHistogramBuckets: js.Array[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket] = null
  ): GooglePrivacyDlpV2beta1KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassHistogramBuckets != null) __obj.updateDynamic("equivalenceClassHistogramBuckets")(equivalenceClassHistogramBuckets)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityResult]
  }
}

