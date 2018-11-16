package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetricRule extends js.Object {
  /**
               * Metrics to update when the selected methods are called, and the associated
               * cost applied to each metric.
               *
               * The key of the map is the metric name, and the values are the amount
               * increased for the metric against which the quota limits are defined.
               * The value must not be negative.
               */
  var metricCosts: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
               * Selects the methods to which this rule applies.
               *
               * Refer to selector for syntax details.
               */
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

