package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTimeSeriesResponse extends js.Object {
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** One or more time series that match the filter included in the request. */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.native
}

object ListTimeSeriesResponse {
  @scala.inline
  def apply(): ListTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTimeSeriesResponse]
  }
  @scala.inline
  implicit class ListTimeSeriesResponseOps[Self <: ListTimeSeriesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTimeSeriesVarargs(value: TimeSeries*): Self = this.set("timeSeries", js.Array(value :_*))
    @scala.inline
    def setTimeSeries(value: js.Array[TimeSeries]): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSeries: Self = this.set("timeSeries", js.undefined)
  }
  
}

