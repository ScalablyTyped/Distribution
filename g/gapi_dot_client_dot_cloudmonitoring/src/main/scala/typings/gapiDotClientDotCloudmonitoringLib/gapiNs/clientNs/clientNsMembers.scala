package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val metricDescriptors: gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs.MetricDescriptorsResource = js.native
  val timeseries: gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs.TimeseriesResource = js.native
  val timeseriesDescriptors: gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs.TimeseriesDescriptorsResource = js.native
  /** Load Cloud Monitoring API v2beta2 */
  def load(
    name: gapiDotClientDotCloudmonitoringLib.gapiDotClientDotCloudmonitoringLibStrings.cloudmonitoring,
    version: gapiDotClientDotCloudmonitoringLib.gapiDotClientDotCloudmonitoringLibStrings.v2beta2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCloudmonitoringLib.gapiDotClientDotCloudmonitoringLibStrings.cloudmonitoring,
    version: gapiDotClientDotCloudmonitoringLib.gapiDotClientDotCloudmonitoringLibStrings.v2beta2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

