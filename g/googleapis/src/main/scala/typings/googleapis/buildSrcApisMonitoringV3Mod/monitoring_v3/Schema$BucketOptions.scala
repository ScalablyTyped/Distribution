package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BucketOptions describes the bucket boundaries used to create a histogram
  * for the distribution. The buckets can be in a linear sequence, an
  * exponential sequence, or each bucket can be specified explicitly.
  * BucketOptions does not include the number of values in each bucket.A bucket
  * has an inclusive lower bound and exclusive upper bound for the values that
  * are counted for that bucket. The upper bound of a bucket must be strictly
  * greater than the lower bound. The sequence of N buckets for a distribution
  * consists of an underflow bucket (number 0), zero or more finite buckets
  * (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets
  * are contiguous: the lower bound of bucket i (i &gt; 0) is the same as the
  * upper bound of bucket i - 1. The buckets span the whole range of finite
  * values: lower bound of the underflow bucket is -infinity and the upper
  * bound of the overflow bucket is +infinity. The finite buckets are so-called
  * because both bounds are finite.
  */
@js.native
trait Schema$BucketOptions extends js.Object {
  /**
    * The explicit buckets.
    */
  var explicitBuckets: js.UndefOr[Schema$Explicit] = js.native
  /**
    * The exponential buckets.
    */
  var exponentialBuckets: js.UndefOr[Schema$Exponential] = js.native
  /**
    * The linear bucket.
    */
  var linearBuckets: js.UndefOr[Schema$Linear] = js.native
}

object Schema$BucketOptions {
  @scala.inline
  def apply(
    explicitBuckets: Schema$Explicit = null,
    exponentialBuckets: Schema$Exponential = null,
    linearBuckets: Schema$Linear = null
  ): Schema$BucketOptions = {
    val __obj = js.Dynamic.literal()
    if (explicitBuckets != null) __obj.updateDynamic("explicitBuckets")(explicitBuckets.asInstanceOf[js.Any])
    if (exponentialBuckets != null) __obj.updateDynamic("exponentialBuckets")(exponentialBuckets.asInstanceOf[js.Any])
    if (linearBuckets != null) __obj.updateDynamic("linearBuckets")(linearBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BucketOptions]
  }
}

