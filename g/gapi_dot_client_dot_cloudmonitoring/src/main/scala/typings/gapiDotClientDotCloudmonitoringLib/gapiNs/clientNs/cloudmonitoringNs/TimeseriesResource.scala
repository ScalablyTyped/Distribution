package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesResource extends js.Object {
  /**
    * List the data points of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: gapiDotClientDotCloudmonitoringLib.Anon_Aggregator): gapiDotClientLib.gapiNs.clientNs.Request[ListTimeseriesResponse]
  /**
    * Put data points to one or more time series for one or more metrics. If a time series does not exist, a new time series will be created. It is not
    * allowed to write a time series point that is older than the existing youngest point of that time series. Points that are older than the existing
    * youngest point of that time series will be discarded silently. Therefore, users should make sure that points of a time series are written sequentially
    * in the order of their end time.
    */
  def write(request: gapiDotClientDotCloudmonitoringLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[WriteTimeseriesResponse]
}

object TimeseriesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_Aggregator, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListTimeseriesResponse]
    ],
    write: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[WriteTimeseriesResponse]
    ]
  ): TimeseriesResource = {
    val __obj = js.Dynamic.literal(list = list, write = write)
  
    __obj.asInstanceOf[TimeseriesResource]
  }
}

