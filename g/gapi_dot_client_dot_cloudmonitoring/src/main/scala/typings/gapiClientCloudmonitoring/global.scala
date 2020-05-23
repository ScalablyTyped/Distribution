package typings.gapiClientCloudmonitoring

import typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.MetricDescriptorsResource
import typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.TimeseriesDescriptorsResource
import typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring.TimeseriesResource
import typings.gapiClientCloudmonitoring.gapiClientCloudmonitoringStrings.cloudmonitoring
import typings.gapiClientCloudmonitoring.gapiClientCloudmonitoringStrings.v2beta2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val metricDescriptors: MetricDescriptorsResource = js.native
      val timeseries: TimeseriesResource = js.native
      val timeseriesDescriptors: TimeseriesDescriptorsResource = js.native
      /** Load Cloud Monitoring API v2beta2 */
      def load(name: cloudmonitoring, version: v2beta2): js.Thenable[Unit] = js.native
      def load(name: cloudmonitoring, version: v2beta2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

