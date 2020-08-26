package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExponentialBuckets extends js.Object {
  /**
    * The i'th exponential bucket covers the interval
    * [scale &#42; growth_factor^(i-1), scale &#42; growth_factor^i)
    * where i ranges from 1 to num_finite_buckets inclusive.
    * Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2.
    * See comments on `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i'th exponential bucket covers the interval
    * [scale &#42; growth_factor^(i-1), scale &#42; growth_factor^i)
    * where i ranges from 1 to num_finite_buckets inclusive.
    * Must be > 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object ExponentialBuckets {
  @scala.inline
  def apply(): ExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExponentialBuckets]
  }
  @scala.inline
  implicit class ExponentialBucketsOps[Self <: ExponentialBuckets] (val x: Self) extends AnyVal {
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
    def setGrowthFactor(value: Double): Self = this.set("growthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrowthFactor: Self = this.set("growthFactor", js.undefined)
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = this.set("numFiniteBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFiniteBuckets: Self = this.set("numFiniteBuckets", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

