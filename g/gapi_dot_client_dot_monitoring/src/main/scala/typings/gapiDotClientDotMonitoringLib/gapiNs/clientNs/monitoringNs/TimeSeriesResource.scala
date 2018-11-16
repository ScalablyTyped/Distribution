package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimeSeriesResource extends js.Object {
  /**
               * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
               * written, a corresponding failure message is included in the error response.
               */
  def create(request: gapiDotClientDotMonitoringLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: gapiDotClientDotMonitoringLib.Anon_NameAccesstokenAggregationgroupByFields): gapiDotClientLib.gapiNs.clientNs.Request[ListTimeSeriesResponse]
}

