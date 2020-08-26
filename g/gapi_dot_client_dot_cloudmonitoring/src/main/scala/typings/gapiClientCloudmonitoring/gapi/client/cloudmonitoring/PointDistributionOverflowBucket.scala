package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDistributionOverflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[String] = js.native
  /** The lower bound of the value interval of this bucket (inclusive). */
  var lowerBound: js.UndefOr[Double] = js.native
}

object PointDistributionOverflowBucket {
  @scala.inline
  def apply(): PointDistributionOverflowBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointDistributionOverflowBucket]
  }
  @scala.inline
  implicit class PointDistributionOverflowBucketOps[Self <: PointDistributionOverflowBucket] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLowerBound(value: Double): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerBound: Self = this.set("lowerBound", js.undefined)
  }
  
}

