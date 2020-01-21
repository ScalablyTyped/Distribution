package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var bucketCounts: js.UndefOr[js.Array[String]] = js.undefined
  /** The total number of samples in the distribution. Must be >= 0. */
  var count: js.UndefOr[String] = js.undefined
  /** Buckets with arbitrary user-provided width. */
  var explicitBuckets: js.UndefOr[ExplicitBuckets] = js.undefined
  /** Buckets with exponentially growing width. */
  var exponentialBuckets: js.UndefOr[ExponentialBuckets] = js.undefined
  /** Buckets with constant width. */
  var linearBuckets: js.UndefOr[LinearBuckets] = js.undefined
  /** The maximum of the population of values. Ignored if `count` is zero. */
  var maximum: js.UndefOr[Double] = js.undefined
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.undefined
  /** The minimum of the population of values. Ignored if `count` is zero. */
  var minimum: js.UndefOr[Double] = js.undefined
  /**
    * The sum of squared deviations from the mean:
    * Sum[i=1..count]((x_i - mean)^2)
    * where each x_i is a sample values. If `count` is zero then this field
    * must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.undefined
}

object Distribution {
  @scala.inline
  def apply(
    bucketCounts: js.Array[String] = null,
    count: String = null,
    explicitBuckets: ExplicitBuckets = null,
    exponentialBuckets: ExponentialBuckets = null,
    linearBuckets: LinearBuckets = null,
    maximum: Int | Double = null,
    mean: Int | Double = null,
    minimum: Int | Double = null,
    sumOfSquaredDeviation: Int | Double = null
  ): Distribution = {
    val __obj = js.Dynamic.literal()
    if (bucketCounts != null) __obj.updateDynamic("bucketCounts")(bucketCounts.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (explicitBuckets != null) __obj.updateDynamic("explicitBuckets")(explicitBuckets.asInstanceOf[js.Any])
    if (exponentialBuckets != null) __obj.updateDynamic("exponentialBuckets")(exponentialBuckets.asInstanceOf[js.Any])
    if (linearBuckets != null) __obj.updateDynamic("linearBuckets")(linearBuckets.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (sumOfSquaredDeviation != null) __obj.updateDynamic("sumOfSquaredDeviation")(sumOfSquaredDeviation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

