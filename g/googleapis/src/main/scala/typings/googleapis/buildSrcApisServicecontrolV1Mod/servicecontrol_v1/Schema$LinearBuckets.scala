package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with constant width.
  */
@js.native
trait Schema$LinearBuckets extends js.Object {
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive. Must be strictly positive.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$LinearBuckets {
  @scala.inline
  def apply(numFiniteBuckets: Int | Double = null, offset: Int | Double = null, width: Int | Double = null): Schema$LinearBuckets = {
    val __obj = js.Dynamic.literal()
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LinearBuckets]
  }
}

