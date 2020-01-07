package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single metric value.
  */
@js.native
trait Schema$MetricValue extends js.Object {
  /**
    * A boolean value.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[Schema$Distribution] = js.native
  /**
    * A double precision floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * The end of the time period over which this metric value&#39;s measurement
    * applies.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * A signed 64-bit integer value.
    */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * The labels describing the metric value. See comments on
    * google.api.servicecontrol.v1.Operation.labels for the overriding
    * relationship.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A money value.
    */
  var moneyValue: js.UndefOr[Schema$Money] = js.native
  /**
    * The start of the time period over which this metric value&#39;s
    * measurement applies. The time period has different semantics for
    * different metric types (cumulative, delta, and gauge). See the metric
    * definition documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * A text string value.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Schema$MetricValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    distributionValue: Schema$Distribution = null,
    doubleValue: Int | Double = null,
    endTime: String = null,
    int64Value: String = null,
    labels: StringDictionary[String] = null,
    moneyValue: Schema$Money = null,
    startTime: String = null,
    stringValue: String = null
  ): Schema$MetricValue = {
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
    __obj.asInstanceOf[Schema$MetricValue]
  }
}

