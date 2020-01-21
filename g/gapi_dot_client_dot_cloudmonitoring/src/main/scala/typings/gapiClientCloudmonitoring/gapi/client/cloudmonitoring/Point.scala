package typings.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The value of this data point. Either "true" or "false". */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of this data point as a distribution. A distribution value can contain a list of buckets and/or an underflowBucket and an overflowBucket. The
    * values of these points can be used to create a histogram.
    */
  var distributionValue: js.UndefOr[PointDistribution] = js.undefined
  /** The value of this data point as a double-precision floating-point number. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var end: js.UndefOr[String] = js.undefined
  /** The value of this data point as a 64-bit integer. */
  var int64Value: js.UndefOr[String] = js.undefined
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var start: js.UndefOr[String] = js.undefined
  /** The value of this data point in string format. */
  var stringValue: js.UndefOr[String] = js.undefined
}

object Point {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    distributionValue: PointDistribution = null,
    doubleValue: Int | Double = null,
    end: String = null,
    int64Value: String = null,
    start: String = null,
    stringValue: String = null
  ): Point = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

