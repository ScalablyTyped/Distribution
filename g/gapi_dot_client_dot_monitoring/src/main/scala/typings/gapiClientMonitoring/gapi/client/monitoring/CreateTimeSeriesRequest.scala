package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTimeSeriesRequest extends js.Object {
  /**
    * The new data to be added to a list of time series. Adds at most one data point to each of several time series. The new data point must be more recent
    * than any other point in its time series. Each TimeSeries value must fully specify a unique time series by supplying all label values for the metric and
    * the monitored resource.
    */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.native
}

object CreateTimeSeriesRequest {
  @scala.inline
  def apply(): CreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeSeriesRequest]
  }
  @scala.inline
  implicit class CreateTimeSeriesRequestOps[Self <: CreateTimeSeriesRequest] (val x: Self) extends AnyVal {
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
    def setTimeSeriesVarargs(value: TimeSeries*): Self = this.set("timeSeries", js.Array(value :_*))
    @scala.inline
    def setTimeSeries(value: js.Array[TimeSeries]): Self = this.set("timeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSeries: Self = this.set("timeSeries", js.undefined)
  }
  
}

