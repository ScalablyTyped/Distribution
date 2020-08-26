package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudmonitoring.anon.Aggregator
import typings.gapiClientCloudmonitoring.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesResource extends js.Object {
  /**
    * List the data points of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: Aggregator): Request[ListTimeseriesResponse] = js.native
  /**
    * Put data points to one or more time series for one or more metrics. If a time series does not exist, a new time series will be created. It is not
    * allowed to write a time series point that is older than the existing youngest point of that time series. Points that are older than the existing
    * youngest point of that time series will be discarded silently. Therefore, users should make sure that points of a time series are written sequentially
    * in the order of their end time.
    */
  def write(request: Alt): Request[WriteTimeseriesResponse] = js.native
}

object TimeseriesResource {
  @scala.inline
  def apply(
    list: Aggregator => Request[ListTimeseriesResponse],
    write: Alt => Request[WriteTimeseriesResponse]
  ): TimeseriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[TimeseriesResource]
  }
  @scala.inline
  implicit class TimeseriesResourceOps[Self <: TimeseriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: Aggregator => Request[ListTimeseriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: Alt => Request[WriteTimeseriesResponse]): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

