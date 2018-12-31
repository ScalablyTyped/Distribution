package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSeries extends js.Object {
  /** The associated metric. A fully-specified metric used to identify the time series. */
  var metric: js.UndefOr[Metric] = js.undefined
  /**
    * The metric kind of the time series. When listing time series, this metric kind might be different from the metric kind of the associated metric if this
    * time series is an alignment or reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as
    * the metric kind of the associated metric. If the associated metric's descriptor must be auto-created, then this field specifies the metric kind of the
    * new descriptor and must be either GAUGE (the default) or CUMULATIVE.
    */
  var metricKind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The data points of this time series. When listing time series, the order of the points is specified by the list method.When creating a time series,
    * this field must contain exactly one point and the point's type must be the same as the value type of the associated metric. If the associated metric's
    * descriptor must be auto-created, then the value type of the descriptor is determined by the point's type, which must be BOOL, INT64, DOUBLE, or
    * DISTRIBUTION.
    */
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  /** The associated monitored resource. Custom metrics can use only certain monitored resource types in their time series data. */
  var resource: js.UndefOr[MonitoredResource] = js.undefined
  /**
    * The value type of the time series. When listing time series, this value type might be different from the value type of the associated metric if this
    * time series is an alignment or reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as
    * the type of the data in the points field.
    */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

