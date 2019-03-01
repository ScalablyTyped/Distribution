package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregationInfo extends js.Object {
  /**
    * The number of intervals to aggregate over.
    * Example: If aggregation_level is "DAILY" and aggregation_count is 14,
    * aggregation will be over 14 days.
    */
  var aggregationCount: js.UndefOr[scala.Double] = js.undefined
  var aggregationInterval: js.UndefOr[java.lang.String] = js.undefined
  var aggregationLevel: js.UndefOr[java.lang.String] = js.undefined
}

object AggregationInfo {
  @scala.inline
  def apply(
    aggregationCount: scala.Int | scala.Double = null,
    aggregationInterval: java.lang.String = null,
    aggregationLevel: java.lang.String = null
  ): AggregationInfo = {
    val __obj = js.Dynamic.literal()
    if (aggregationCount != null) __obj.updateDynamic("aggregationCount")(aggregationCount.asInstanceOf[js.Any])
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval)
    if (aggregationLevel != null) __obj.updateDynamic("aggregationLevel")(aggregationLevel)
    __obj.asInstanceOf[AggregationInfo]
  }
}

