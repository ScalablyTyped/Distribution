package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the k-anonymity computation.
  */
@js.native
trait Schema$GooglePrivacyDlpV2KAnonymityResult extends js.Object {
  /**
    * Histogram of k-anonymity equivalence classes.
    */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.native
}

object Schema$GooglePrivacyDlpV2KAnonymityResult {
  @scala.inline
  def apply(
    equivalenceClassHistogramBuckets: js.Array[Schema$GooglePrivacyDlpV2KAnonymityHistogramBucket] = null
  ): Schema$GooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassHistogramBuckets != null) __obj.updateDynamic("equivalenceClassHistogramBuckets")(equivalenceClassHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KAnonymityResult]
  }
}

