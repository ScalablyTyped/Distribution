package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  /** The value of this data point. Either "true" or "false". */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * The value of this data point as a distribution. A distribution value can contain a list of buckets and/or an underflowBucket and an overflowBucket. The
    * values of these points can be used to create a histogram.
    */
  var distributionValue: js.UndefOr[PointDistribution] = js.native
  /** The value of this data point as a double-precision floating-point number. */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var end: js.UndefOr[String] = js.native
  /** The value of this data point as a 64-bit integer. */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var start: js.UndefOr[String] = js.native
  /** The value of this data point in string format. */
  var stringValue: js.UndefOr[String] = js.native
}

object Point {
  @scala.inline
  def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setDistributionValue(value: PointDistribution): Self = this.set("distributionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionValue: Self = this.set("distributionValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

