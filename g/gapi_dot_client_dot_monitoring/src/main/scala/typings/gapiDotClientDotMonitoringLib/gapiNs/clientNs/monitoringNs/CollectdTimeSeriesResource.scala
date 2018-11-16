package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectdTimeSeriesResource extends js.Object {
  /**
               * Stackdriver Monitoring Agent only: Creates a new time series.<aside class="caution">This method is only for use by the Stackdriver Monitoring Agent.
               * Use projects.timeSeries.create instead.</aside>
               */
  def create(request: gapiDotClientDotMonitoringLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CreateCollectdTimeSeriesResponse]
}

