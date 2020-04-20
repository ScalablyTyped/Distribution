package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var collectdTimeSeries: CollectdTimeSeriesResource
  var groups: GroupsResource
  var metricDescriptors: MetricDescriptorsResource
  var monitoredResourceDescriptors: MonitoredResourceDescriptorsResource
  var timeSeries: TimeSeriesResource
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
}

