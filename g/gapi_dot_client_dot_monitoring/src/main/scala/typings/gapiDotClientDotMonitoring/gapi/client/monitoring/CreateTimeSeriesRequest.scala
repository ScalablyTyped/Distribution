package typings.gapiDotClientDotMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTimeSeriesRequest extends js.Object {
  /**
    * The new data to be added to a list of time series. Adds at most one data point to each of several time series. The new data point must be more recent
    * than any other point in its time series. Each TimeSeries value must fully specify a unique time series by supplying all label values for the metric and
    * the monitored resource.
    */
  var timeSeries: js.UndefOr[js.Array[TimeSeries]] = js.undefined
}

object CreateTimeSeriesRequest {
  @scala.inline
  def apply(timeSeries: js.Array[TimeSeries] = null): CreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    if (timeSeries != null) __obj.updateDynamic("timeSeries")(timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimeSeriesRequest]
  }
}

