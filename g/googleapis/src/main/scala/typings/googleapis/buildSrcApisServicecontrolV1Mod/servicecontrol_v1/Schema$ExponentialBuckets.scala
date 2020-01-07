package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with exponentially growing width.
  */
@js.native
trait Schema$ExponentialBuckets extends js.Object {
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be &gt; 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object Schema$ExponentialBuckets {
  @scala.inline
  def apply(
    growthFactor: Int | Double = null,
    numFiniteBuckets: Int | Double = null,
    scale: Int | Double = null
  ): Schema$ExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    if (growthFactor != null) __obj.updateDynamic("growthFactor")(growthFactor.asInstanceOf[js.Any])
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExponentialBuckets]
  }
}

