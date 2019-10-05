package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  /** List of `QuotaLimit` definitions for the service. */
  var limits: js.UndefOr[js.Array[QuotaLimit]] = js.undefined
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to one
    * or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[MetricRule]] = js.undefined
}

object Quota {
  @scala.inline
  def apply(limits: js.Array[QuotaLimit] = null, metricRules: js.Array[MetricRule] = null): Quota = {
    val __obj = js.Dynamic.literal()
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (metricRules != null) __obj.updateDynamic("metricRules")(metricRules)
    __obj.asInstanceOf[Quota]
  }
}

