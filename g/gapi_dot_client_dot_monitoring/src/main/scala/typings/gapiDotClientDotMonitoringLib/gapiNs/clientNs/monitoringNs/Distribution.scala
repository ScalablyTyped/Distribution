package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  /**
    * Required in the Stackdriver Monitoring API v3. The values for each bucket specified in bucket_options. The sum of the values in bucketCounts must equal
    * the value in the count field of the Distribution object. The order of the bucket counts follows the numbering schemes described for the three bucket
    * types. The underflow bucket has number 0; the finite buckets, if any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of
    * bucket_counts must not be greater than N. If the size is less than N, then the remaining buckets are assigned values of zero.
    */
  var bucketCounts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Required in the Stackdriver Monitoring API v3. Defines the histogram bucket boundaries. */
  var bucketOptions: js.UndefOr[BucketOptions] = js.undefined
  /** The number of values in the population. Must be non-negative. This value must equal the sum of the values in bucket_counts if a histogram is provided. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** The arithmetic mean of the values in the population. If count is zero then this field must be zero. */
  var mean: js.UndefOr[scala.Double] = js.undefined
  /**
    * If specified, contains the range of the population values. The field must not be present if the count is zero. This field is presently ignored by the
    * Stackdriver Monitoring API v3.
    */
  var range: js.UndefOr[Range] = js.undefined
  /**
    * The sum of squared deviations from the mean of the values in the population. For values x_i this is:
    * Sum[i=1..n]((x_i - mean)^2)
    * Knuth, "The Art of Computer Programming", Vol. 2, page 323, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is
    * zero then this field must be zero.
    */
  var sumOfSquaredDeviation: js.UndefOr[scala.Double] = js.undefined
}

