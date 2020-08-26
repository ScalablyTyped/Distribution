package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringDestination extends js.Object {
  /**
    * Names of the metrics to report to this monitoring destination.
    * Each name must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object MonitoringDestination {
  @scala.inline
  def apply(): MonitoringDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringDestination]
  }
  @scala.inline
  implicit class MonitoringDestinationOps[Self <: MonitoringDestination] (val x: Self) extends AnyVal {
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
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setMonitoredResource(value: String): Self = this.set("monitoredResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoredResource: Self = this.set("monitoredResource", js.undefined)
  }
  
}

