package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDistributionUnderflowBucket extends js.Object {
  /** The number of events whose values are in the interval defined by this bucket. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** The upper bound of the value interval of this bucket (exclusive). */
  var upperBound: js.UndefOr[scala.Double] = js.undefined
}

object PointDistributionUnderflowBucket {
  @scala.inline
  def apply(count: java.lang.String = null, upperBound: scala.Int | scala.Double = null): PointDistributionUnderflowBucket = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointDistributionUnderflowBucket]
  }
}

