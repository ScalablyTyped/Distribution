package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteTimeseriesRequest extends js.Object {
  /** The label's name. */
  var commonLabels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Provide time series specific labels and the data points for each time series. The labels in timeseries and the common_labels should form a complete
    * list of labels that required by the metric.
    */
  var timeseries: js.UndefOr[js.Array[TimeseriesPoint]] = js.native
}

object WriteTimeseriesRequest {
  @scala.inline
  def apply(): WriteTimeseriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteTimeseriesRequest]
  }
  @scala.inline
  implicit class WriteTimeseriesRequestOps[Self <: WriteTimeseriesRequest] (val x: Self) extends AnyVal {
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
    def setCommonLabels(value: Record[String, String]): Self = this.set("commonLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonLabels: Self = this.set("commonLabels", js.undefined)
    @scala.inline
    def setTimeseriesVarargs(value: TimeseriesPoint*): Self = this.set("timeseries", js.Array(value :_*))
    @scala.inline
    def setTimeseries(value: js.Array[TimeseriesPoint]): Self = this.set("timeseries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeseries: Self = this.set("timeseries", js.undefined)
  }
  
}

