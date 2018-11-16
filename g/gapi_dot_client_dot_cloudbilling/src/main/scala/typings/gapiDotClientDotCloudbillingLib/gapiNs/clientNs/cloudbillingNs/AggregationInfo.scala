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

