package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDistributionOverflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** The lower bound of the value interval of this bucket (inclusive). */
  var lowerBound: js.UndefOr[scala.Double] = js.undefined
}

object PointDistributionOverflowBucket {
  @scala.inline
  def apply(count: java.lang.String = null, lowerBound: scala.Int | scala.Double = null): PointDistributionOverflowBucket = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (lowerBound != null) __obj.updateDynamic("lowerBound")(lowerBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDistributionOverflowBucket]
  }
}

