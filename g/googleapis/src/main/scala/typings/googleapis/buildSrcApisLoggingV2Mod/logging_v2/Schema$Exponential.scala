package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an exponential sequence of buckets that have a width that is
  * proportional to the value of the lower bound. Each bucket represents a
  * constant relative uncertainty on a specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i).
  * Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
  */
@js.native
trait Schema$Exponential extends js.Object {
  /**
    * Must be greater than 1.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object Schema$Exponential {
  @scala.inline
  def apply(
    growthFactor: Int | Double = null,
    numFiniteBuckets: Int | Double = null,
    scale: Int | Double = null
  ): Schema$Exponential = {
    val __obj = js.Dynamic.literal()
    if (growthFactor != null) __obj.updateDynamic("growthFactor")(growthFactor.asInstanceOf[js.Any])
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Exponential]
  }
}

