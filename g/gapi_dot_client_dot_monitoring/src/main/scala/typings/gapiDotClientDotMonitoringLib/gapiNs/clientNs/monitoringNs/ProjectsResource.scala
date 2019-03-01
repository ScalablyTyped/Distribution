package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectdTimeSeries")(collectdTimeSeries)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("metricDescriptors")(metricDescriptors)
    __obj.updateDynamic("monitoredResourceDescriptors")(monitoredResourceDescriptors)
    __obj.updateDynamic("timeSeries")(timeSeries)
    __obj.asInstanceOf[ProjectsResource]
  }
}

