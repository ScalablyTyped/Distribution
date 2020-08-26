package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var collectdTimeSeries: CollectdTimeSeriesResource = js.native
  var groups: GroupsResource = js.native
  var metricDescriptors: MetricDescriptorsResource = js.native
  var monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
  var timeSeries: TimeSeriesResource = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(
    collectdTimeSeries: CollectdTimeSeriesResource,
    groups: GroupsResource,
    metricDescriptors: MetricDescriptorsResource,
    monitoredResourceDescriptors: MonitoredResourceDescriptorsResource,
    timeSeries: TimeSeriesResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(collectdTimeSeries = collectdTimeSeries.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metricDescriptors = metricDescriptors.asInstanceOf[js.Any], monitoredResourceDescriptors = monitoredResourceDescriptors.asInstanceOf[js.Any], timeSeries = timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
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
    def setCollectdTimeSeries(value: CollectdTimeSeriesResource): Self = this.set("collectdTimeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: GroupsResource): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricDescriptors(value: MetricDescriptorsResource): Self = this.set("metricDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoredResourceDescriptors(value: MonitoredResourceDescriptorsResource): Self = this.set("monitoredResourceDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSeries(value: TimeSeriesResource): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
  }
  
}

