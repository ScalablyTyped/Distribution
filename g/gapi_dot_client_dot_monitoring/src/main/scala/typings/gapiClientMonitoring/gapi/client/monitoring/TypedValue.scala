package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedValue extends js.Object {
  /** A Boolean value: true or false. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is approximately &plusmn;10<sup>&plusmn;300</sup> and it has 16 significant digits of
    * precision.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /** A 64-bit integer. Its range is approximately &plusmn;9.2x10<sup>18</sup>. */
  var int64Value: js.UndefOr[String] = js.undefined
  /** A variable-length string value. */
  var stringValue: js.UndefOr[String] = js.undefined
}

object TypedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    distributionValue: Distribution = null,
    doubleValue: js.UndefOr[Double] = js.undefined,
    int64Value: String = null,
    stringValue: String = null
  ): TypedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.get.asInstanceOf[js.Any])
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedValue]
  }
}

