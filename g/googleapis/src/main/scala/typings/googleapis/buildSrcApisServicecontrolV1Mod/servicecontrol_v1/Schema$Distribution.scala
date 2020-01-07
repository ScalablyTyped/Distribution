package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Distribution represents a frequency distribution of double-valued sample
  * points. It contains the size of the population of sample points plus
  * additional optional information:    - the arithmetic mean of the samples -
  * the minimum and maximum of the samples   - the sum-squared-deviation of the
  * samples, used to compute variance   - a histogram of the values of the
  * sample points
  */
@js.native
trait Schema$Distribution extends js.Object {
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are
    * optional. If present, they must sum to the `count` value.  The buckets
    * are defined below in `bucket_option`. There are N buckets.
    * `bucket_counts[0]` is the number of samples in the underflow bucket.
    * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples in
    * each of the finite buckets. And `bucket_counts[N] is the number of
    * samples in the overflow bucket. See the comments of `bucket_option` below
    * for more details.  Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The total number of samples in the distribution. Must be &gt;= 0.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Buckets with arbitrary user-provided width.
    */
  var explicitBuckets: js.UndefOr[Schema$ExplicitBuckets] = js.native
  /**
    * Buckets with exponentially growing width.
    */
  var exponentialBuckets: js.UndefOr[Schema$ExponentialBuckets] = js.native
  /**
    * Buckets with constant width.
    */
  var linearBuckets: js.UndefOr[Schema$LinearBuckets] = js.native
  /**
    * The maximum of the population of values. Ignored if `count` is zero.
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.native
  /**
    * The minimum of the population of values. Ignored if `count` is zero.
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i -
    * mean)^2) where each x_i is a sample values. If `count` is zero then this
    * field must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}

object Schema$Distribution {
  @scala.inline
  def apply(
    bucketCounts: js.Array[String] = null,
    count: String = null,
    explicitBuckets: Schema$ExplicitBuckets = null,
    exponentialBuckets: Schema$ExponentialBuckets = null,
    linearBuckets: Schema$LinearBuckets = null,
    maximum: Int | Double = null,
    mean: Int | Double = null,
    minimum: Int | Double = null,
    sumOfSquaredDeviation: Int | Double = null
  ): Schema$Distribution = {
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
    __obj.asInstanceOf[Schema$Distribution]
  }
}

