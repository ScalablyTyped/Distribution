package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExplicitBuckets extends js.Object {
  /**
    * 'bound' is a list of strictly increasing boundaries between
    * buckets. Note that a list of length N-1 defines N buckets because
    * of fenceposting. See comments on `bucket_options` for details.
    *
    * The i'th finite bucket covers the interval
    * [bound[i-1], bound[i])
    * where i ranges from 1 to bound_size() - 1. Note that there are no
    * finite buckets at all if 'bound' only contains a single element; in
    * that special case the single bound defines the boundary between the
    * underflow and overflow buckets.
    *
    * bucket number                   lower bound    upper bound
    * i == 0 (underflow)              -inf           bound[i]
    * 0 < i < bound_size()            bound[i-1]     bound[i]
    * i == bound_size() (overflow)    bound[i-1]     +inf
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}

object ExplicitBuckets {
  @scala.inline
  def apply(): ExplicitBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplicitBuckets]
  }
  @scala.inline
  implicit class ExplicitBucketsOps[Self <: ExplicitBuckets] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
  }
  
}

