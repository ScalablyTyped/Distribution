package typings.gapiDotClientDotCloudmonitoring.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDistribution extends js.Object {
  /** The finite buckets. */
  var buckets: js.UndefOr[js.Array[PointDistributionBucket]] = js.undefined
  /** The overflow bucket. */
  var overflowBucket: js.UndefOr[PointDistributionOverflowBucket] = js.undefined
  /** The underflow bucket. */
  var underflowBucket: js.UndefOr[PointDistributionUnderflowBucket] = js.undefined
}

object PointDistribution {
  @scala.inline
  def apply(
    buckets: js.Array[PointDistributionBucket] = null,
    overflowBucket: PointDistributionOverflowBucket = null,
    underflowBucket: PointDistributionUnderflowBucket = null
  ): PointDistribution = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (overflowBucket != null) __obj.updateDynamic("overflowBucket")(overflowBucket)
    if (underflowBucket != null) __obj.updateDynamic("underflowBucket")(underflowBucket)
    __obj.asInstanceOf[PointDistribution]
  }
}

