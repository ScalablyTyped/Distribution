package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KAnonymityHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[String] = js.undefined
  /**
    * Sample of equivalence classes in this bucket. The total number of
    * classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]] = js.undefined
  /** Lower bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.undefined
  /** Upper bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1KAnonymityHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValues: js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass] = null,
    equivalenceClassSizeLowerBound: String = null,
    equivalenceClassSizeUpperBound: String = null
  ): GooglePrivacyDlpV2beta1KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize)
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues)
    if (equivalenceClassSizeLowerBound != null) __obj.updateDynamic("equivalenceClassSizeLowerBound")(equivalenceClassSizeLowerBound)
    if (equivalenceClassSizeUpperBound != null) __obj.updateDynamic("equivalenceClassSizeUpperBound")(equivalenceClassSizeUpperBound)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]
  }
}

