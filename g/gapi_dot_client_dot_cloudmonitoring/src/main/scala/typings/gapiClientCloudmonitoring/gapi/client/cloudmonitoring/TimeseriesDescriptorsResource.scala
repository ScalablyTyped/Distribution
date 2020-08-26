package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudmonitoring.anon.Aggregator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeseriesDescriptorsResource extends js.Object {
  /**
    * List the descriptors of the time series that match the metric and labels values and that have data points in the interval. Large responses are
    * paginated; use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: Aggregator): Request[ListTimeseriesDescriptorsResponse] = js.native
}

object TimeseriesDescriptorsResource {
  @scala.inline
  def apply(list: Aggregator => Request[ListTimeseriesDescriptorsResponse]): TimeseriesDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TimeseriesDescriptorsResource]
  }
  @scala.inline
  implicit class TimeseriesDescriptorsResourceOps[Self <: TimeseriesDescriptorsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Aggregator => Request[ListTimeseriesDescriptorsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

