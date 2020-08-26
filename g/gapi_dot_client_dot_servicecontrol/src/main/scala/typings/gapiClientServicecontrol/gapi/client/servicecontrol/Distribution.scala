package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are
    * optional. If present, they must sum to the `count` value.
    *
    * The buckets are defined below in `bucket_option`. There are N buckets.
    * `bucket_counts[0]` is the number of samples in the underflow bucket.
    * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples
    * in each of the finite buckets. And `bucket_counts[N] is the number
    * of samples in the overflow bucket. See the comments of `bucket_option`
    * below for more details.
    *
    * Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /** The total number of samples in the distribution. Must be >= 0. */
  var count: js.UndefOr[String] = js.native
  /** Buckets with arbitrary user-provided width. */
  var explicitBuckets: js.UndefOr[ExplicitBuckets] = js.native
  /** Buckets with exponentially growing width. */
  var exponentialBuckets: js.UndefOr[ExponentialBuckets] = js.native
  /** Buckets with constant width. */
  var linearBuckets: js.UndefOr[LinearBuckets] = js.native
  /** The maximum of the population of values. Ignored if `count` is zero. */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.native
  /** The minimum of the population of values. Ignored if `count` is zero. */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * The sum of squared deviations from the mean:
    * Sum[i=1..count]((x_i - mean)^2)
    * where each x_i is a sample values. If `count` is zero then this field
    * must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}

object Distribution {
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
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
    def setBucketCountsVarargs(value: String*): Self = this.set("bucketCounts", js.Array(value :_*))
    @scala.inline
    def setBucketCounts(value: js.Array[String]): Self = this.set("bucketCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketCounts: Self = this.set("bucketCounts", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setExplicitBuckets(value: ExplicitBuckets): Self = this.set("explicitBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitBuckets: Self = this.set("explicitBuckets", js.undefined)
    @scala.inline
    def setExponentialBuckets(value: ExponentialBuckets): Self = this.set("exponentialBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentialBuckets: Self = this.set("exponentialBuckets", js.undefined)
    @scala.inline
    def setLinearBuckets(value: LinearBuckets): Self = this.set("linearBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearBuckets: Self = this.set("linearBuckets", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setSumOfSquaredDeviation(value: Double): Self = this.set("sumOfSquaredDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumOfSquaredDeviation: Self = this.set("sumOfSquaredDeviation", js.undefined)
  }
  
}

