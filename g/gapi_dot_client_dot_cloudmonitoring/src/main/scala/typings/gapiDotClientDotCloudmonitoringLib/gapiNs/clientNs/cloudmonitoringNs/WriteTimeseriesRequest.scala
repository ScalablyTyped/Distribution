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

