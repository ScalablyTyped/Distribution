package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import typings.std.Record
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
  var metricCosts: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object MetricRule {
  @scala.inline
  def apply(metricCosts: Record[String, String] = null, selector: String = null): MetricRule = {
    val __obj = js.Dynamic.literal()
    if (metricCosts != null) __obj.updateDynamic("metricCosts")(metricCosts)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[MetricRule]
  }
}

