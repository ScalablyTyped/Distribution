package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointDistribution extends js.Object {
  /** The finite buckets. */
  var buckets: js.UndefOr[js.Array[PointDistributionBucket]] = js.native
  /** The overflow bucket. */
  var overflowBucket: js.UndefOr[PointDistributionOverflowBucket] = js.native
  /** The underflow bucket. */
  var underflowBucket: js.UndefOr[PointDistributionUnderflowBucket] = js.native
}

object PointDistribution {
  @scala.inline
  def apply(): PointDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointDistribution]
  }
  @scala.inline
  implicit class PointDistributionOps[Self <: PointDistribution] (val x: Self) extends AnyVal {
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
    def setBucketsVarargs(value: PointDistributionBucket*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[PointDistributionBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    @scala.inline
    def setOverflowBucket(value: PointDistributionOverflowBucket): Self = this.set("overflowBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowBucket: Self = this.set("overflowBucket", js.undefined)
    @scala.inline
    def setUnderflowBucket(value: PointDistributionUnderflowBucket): Self = this.set("underflowBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderflowBucket: Self = this.set("underflowBucket", js.undefined)
  }
  
}

