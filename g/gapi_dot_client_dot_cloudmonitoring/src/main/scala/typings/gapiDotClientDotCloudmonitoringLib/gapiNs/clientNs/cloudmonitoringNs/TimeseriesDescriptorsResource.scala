package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeseriesDescriptorsResource extends js.Object {
  /**
    * List the descriptors of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: gapiDotClientDotCloudmonitoringLib.Anon_Aggregator): gapiDotClientLib.gapiNs.clientNs.Request[ListTimeseriesDescriptorsResponse]
}

object TimeseriesDescriptorsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudmonitoringLib.Anon_Aggregator, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListTimeseriesDescriptorsResponse]
    ]
  ): TimeseriesDescriptorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[TimeseriesDescriptorsResource]
  }
}

