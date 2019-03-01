package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValue extends js.Object {
  /** A boolean value. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  /** A double precision floating point value. */
  var doubleValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The end of the time period over which this metric value's measurement
    * applies.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** A signed 64-bit integer value. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The labels describing the metric value.
    * See comments on google.api.servicecontrol.v1.Operation.labels for
    * the overriding relationship.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** A money value. */
  var moneyValue: js.UndefOr[Money] = js.undefined
  /**
    * The start of the time period over which this metric value's measurement
    * applies. The time period has different semantics for different metric
    * types (cumulative, delta, and gauge). See the metric definition
    * documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** A text string value. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object MetricValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    distributionValue: Distribution = null,
    doubleValue: scala.Int | scala.Double = null,
    endTime: java.lang.String = null,
    int64Value: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    moneyValue: Money = null,
    startTime: java.lang.String = null,
    stringValue: java.lang.String = null
  ): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue)
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (moneyValue != null) __obj.updateDynamic("moneyValue")(moneyValue)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[MetricValue]
  }
}

