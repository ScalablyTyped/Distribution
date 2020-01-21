package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValue extends js.Object {
  /** A boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  /** A double precision floating point value. */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /**
    * The end of the time period over which this metric value's measurement
    * applies.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** A signed 64-bit integer value. */
  var int64Value: js.UndefOr[String] = js.undefined
  /**
    * The labels describing the metric value.
    * See comments on google.api.servicecontrol.v1.Operation.labels for
    * the overriding relationship.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** A money value. */
  var moneyValue: js.UndefOr[Money] = js.undefined
  /**
    * The start of the time period over which this metric value's measurement
    * applies. The time period has different semantics for different metric
    * types (cumulative, delta, and gauge). See the metric definition
    * documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** A text string value. */
  var stringValue: js.UndefOr[String] = js.undefined
}

object MetricValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    distributionValue: Distribution = null,
    doubleValue: Int | Double = null,
    endTime: String = null,
    int64Value: String = null,
    labels: Record[String, String] = null,
    moneyValue: Money = null,
    startTime: String = null,
    stringValue: String = null
  ): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (moneyValue != null) __obj.updateDynamic("moneyValue")(moneyValue.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValue]
  }
}

