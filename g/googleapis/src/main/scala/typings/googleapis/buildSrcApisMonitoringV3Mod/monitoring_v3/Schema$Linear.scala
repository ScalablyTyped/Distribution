package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a linear sequence of buckets that all have the same width (except
  * overflow and underflow). Each bucket represents a constant absolute
  * uncertainty on the specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): offset + (width * i).  Lower
  * bound (1 &lt;= i &lt; N): offset + (width * (i - 1)).
  */
@js.native
trait Schema$Linear extends js.Object {
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * Lower bound of the first bucket.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var width: js.UndefOr[Double] = js.native
}

object Schema$Linear {
  @scala.inline
  def apply(numFiniteBuckets: Int | Double = null, offset: Int | Double = null, width: Int | Double = null): Schema$Linear = {
    val __obj = js.Dynamic.literal()
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Linear]
  }
}

