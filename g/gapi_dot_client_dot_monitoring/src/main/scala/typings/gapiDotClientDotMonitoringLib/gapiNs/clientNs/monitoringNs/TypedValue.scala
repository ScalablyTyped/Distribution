package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedValue extends js.Object {
  /** A Boolean value: true or false. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is approximately &plusmn;10<sup>&plusmn;300</sup> and it has 16 significant digits of
    * precision.
    */
  var doubleValue: js.UndefOr[scala.Double] = js.undefined
  /** A 64-bit integer. Its range is approximately &plusmn;9.2x10<sup>18</sup>. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /** A variable-length string value. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object TypedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    distributionValue: Distribution = null,
    doubleValue: scala.Int | scala.Double = null,
    int64Value: java.lang.String = null,
    stringValue: java.lang.String = null
  ): TypedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue)
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[TypedValue]
  }
}

