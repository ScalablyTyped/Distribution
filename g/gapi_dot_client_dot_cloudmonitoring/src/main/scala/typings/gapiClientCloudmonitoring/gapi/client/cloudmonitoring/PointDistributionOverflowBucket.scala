package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDistributionOverflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[String] = js.undefined
  /** The lower bound of the value interval of this bucket (inclusive). */
  var lowerBound: js.UndefOr[Double] = js.undefined
}

object PointDistributionOverflowBucket {
  @scala.inline
  def apply(count: String = null, lowerBound: js.UndefOr[Double] = js.undefined): PointDistributionOverflowBucket = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(lowerBound)) __obj.updateDynamic("lowerBound")(lowerBound.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDistributionOverflowBucket]
  }
}

