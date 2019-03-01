package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTimeseriesRequest extends js.Object {
  /** The label's name. */
  var commonLabels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Provide time series specific labels and the data points for each time series. The labels in timeseries and the common_labels should form a complete
    * list of labels that required by the metric.
    */
  var timeseries: js.UndefOr[js.Array[TimeseriesPoint]] = js.undefined
}

object WriteTimeseriesRequest {
  @scala.inline
  def apply(
    commonLabels: stdLib.Record[java.lang.String, java.lang.String] = null,
    timeseries: js.Array[TimeseriesPoint] = null
  ): WriteTimeseriesRequest = {
    val __obj = js.Dynamic.literal()
    if (commonLabels != null) __obj.updateDynamic("commonLabels")(commonLabels)
    if (timeseries != null) __obj.updateDynamic("timeseries")(timeseries)
    __obj.asInstanceOf[WriteTimeseriesRequest]
  }
}

