package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateTimeSeries request.
  */
@js.native
trait Schema$CreateTimeSeriesRequest extends js.Object {
  /**
    * The new data to be added to a list of time series. Adds at most one data
    * point to each of several time series. The new data point must be more
    * recent than any other point in its time series. Each TimeSeries value
    * must fully specify a unique time series by supplying all label values for
    * the metric and the monitored resource.The maximum number of TimeSeries
    * objects per Create request is 200.
    */
  var timeSeries: js.UndefOr[js.Array[Schema$TimeSeries]] = js.native
}

object Schema$CreateTimeSeriesRequest {
  @scala.inline
  def apply(timeSeries: js.Array[Schema$TimeSeries] = null): Schema$CreateTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    if (timeSeries != null) __obj.updateDynamic("timeSeries")(timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateTimeSeriesRequest]
  }
}

