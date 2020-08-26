package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSeries extends js.Object {
  /** The associated metric. A fully-specified metric used to identify the time series. */
  var metric: js.UndefOr[Metric] = js.native
  /**
    * The metric kind of the time series. When listing time series, this metric kind might be different from the metric kind of the associated metric if this
    * time series is an alignment or reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as
    * the metric kind of the associated metric. If the associated metric's descriptor must be auto-created, then this field specifies the metric kind of the
    * new descriptor and must be either GAUGE (the default) or CUMULATIVE.
    */
  var metricKind: js.UndefOr[String] = js.native
  /**
    * The data points of this time series. When listing time series, the order of the points is specified by the list method.When creating a time series,
    * this field must contain exactly one point and the point's type must be the same as the value type of the associated metric. If the associated metric's
    * descriptor must be auto-created, then the value type of the descriptor is determined by the point's type, which must be BOOL, INT64, DOUBLE, or
    * DISTRIBUTION.
    */
  var points: js.UndefOr[js.Array[Point]] = js.native
  /** The associated monitored resource. Custom metrics can use only certain monitored resource types in their time series data. */
  var resource: js.UndefOr[MonitoredResource] = js.native
  /**
    * The value type of the time series. When listing time series, this value type might be different from the value type of the associated metric if this
    * time series is an alignment or reduction of other time series.When creating a time series, this field is optional. If present, it must be the same as
    * the type of the data in the points field.
    */
  var valueType: js.UndefOr[String] = js.native
}

object TimeSeries {
  @scala.inline
  def apply(): TimeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeries]
  }
  @scala.inline
  implicit class TimeSeriesOps[Self <: TimeSeries] (val x: Self) extends AnyVal {
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
    def setMetric(value: Metric): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setMetricKind(value: String): Self = this.set("metricKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricKind: Self = this.set("metricKind", js.undefined)
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setResource(value: MonitoredResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setValueType(value: String): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
  
}

