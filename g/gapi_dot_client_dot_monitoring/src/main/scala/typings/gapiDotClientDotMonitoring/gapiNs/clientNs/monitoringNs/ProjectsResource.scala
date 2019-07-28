package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

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
    val __obj = js.Dynamic.literal(collectdTimeSeries = collectdTimeSeries, groups = groups, metricDescriptors = metricDescriptors, monitoredResourceDescriptors = monitoredResourceDescriptors, timeSeries = timeSeries)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

