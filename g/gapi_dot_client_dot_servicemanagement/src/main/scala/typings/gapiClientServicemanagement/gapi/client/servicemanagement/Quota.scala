package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quota extends js.Object {
  /** List of `QuotaLimit` definitions for the service. */
  var limits: js.UndefOr[js.Array[QuotaLimit]] = js.native
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to one
    * or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[MetricRule]] = js.native
}

object Quota {
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
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
    def setLimitsVarargs(value: QuotaLimit*): Self = this.set("limits", js.Array(value :_*))
    @scala.inline
    def setLimits(value: js.Array[QuotaLimit]): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    @scala.inline
    def setMetricRulesVarargs(value: MetricRule*): Self = this.set("metricRules", js.Array(value :_*))
    @scala.inline
    def setMetricRules(value: js.Array[MetricRule]): Self = this.set("metricRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricRules: Self = this.set("metricRules", js.undefined)
  }
  
}

