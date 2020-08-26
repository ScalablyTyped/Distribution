package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1KAnonymityHistogramBucket extends js.Object {
  /** Total number of records in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Sample of equivalence classes in this bucket. The total number of
    * classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]] = js.native
  /** Lower bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.native
  /** Upper bound on the size of the equivalence classes in this bucket. */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1KAnonymityHistogramBucket {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityHistogramBucket]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1KAnonymityHistogramBucketOps[Self <: GooglePrivacyDlpV2beta1KAnonymityHistogramBucket] (val x: Self) extends AnyVal {
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
    def setBucketSize(value: String): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    @scala.inline
    def setBucketValuesVarargs(value: GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass*): Self = this.set("bucketValues", js.Array(value :_*))
    @scala.inline
    def setBucketValues(value: js.Array[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]): Self = this.set("bucketValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketValues: Self = this.set("bucketValues", js.undefined)
    @scala.inline
    def setEquivalenceClassSizeLowerBound(value: String): Self = this.set("equivalenceClassSizeLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquivalenceClassSizeLowerBound: Self = this.set("equivalenceClassSizeLowerBound", js.undefined)
    @scala.inline
    def setEquivalenceClassSizeUpperBound(value: String): Self = this.set("equivalenceClassSizeUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquivalenceClassSizeUpperBound: Self = this.set("equivalenceClassSizeUpperBound", js.undefined)
  }
  
}

