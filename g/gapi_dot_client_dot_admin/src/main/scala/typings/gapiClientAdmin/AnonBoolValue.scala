package typings.gapiClientAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[String] = js.undefined
  /** Multi-int value of the parameter. */
  var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
  /** Multi-string value of the parameter. */
  var multiValue: js.UndefOr[js.Array[String]] = js.undefined
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.undefined
  /** String value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}

object AnonBoolValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    multiIntValue: js.Array[String] = null,
    multiValue: js.Array[String] = null,
    name: String = null,
    value: String = null
  ): AnonBoolValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (multiIntValue != null) __obj.updateDynamic("multiIntValue")(multiIntValue.asInstanceOf[js.Any])
    if (multiValue != null) __obj.updateDynamic("multiValue")(multiValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolValue]
  }
}

