package typings.gapiDotClientDotCloudmonitoring.gapiNs.clientNs

import typings.gapiDotClientDotCloudmonitoring.gapiDotClientDotCloudmonitoringStrings.cloudmonitoring
import typings.gapiDotClientDotCloudmonitoring.gapiDotClientDotCloudmonitoringStrings.v2beta2
import typings.gapiDotClientDotCloudmonitoring.gapiNs.clientNs.cloudmonitoringNs.MetricDescriptorsResource
import typings.gapiDotClientDotCloudmonitoring.gapiNs.clientNs.cloudmonitoringNs.TimeseriesDescriptorsResource
import typings.gapiDotClientDotCloudmonitoring.gapiNs.clientNs.cloudmonitoringNs.TimeseriesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val metricDescriptors: MetricDescriptorsResource = js.native
  val timeseries: TimeseriesResource = js.native
  val timeseriesDescriptors: TimeseriesDescriptorsResource = js.native
  /** Load Cloud Monitoring API v2beta2 */
  def load(name: cloudmonitoring, version: v2beta2): js.Thenable[Unit] = js.native
  def load(name: cloudmonitoring, version: v2beta2, callback: js.Function0[_]): Unit = js.native
}

