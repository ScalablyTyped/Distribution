package typings.gapiDotClientDotAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolValue extends js.Object {
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

object Anon_BoolValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    intValue: String = null,
    multiIntValue: js.Array[String] = null,
    multiValue: js.Array[String] = null,
    name: String = null,
    value: String = null
  ): Anon_BoolValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (intValue != null) __obj.updateDynamic("intValue")(intValue)
    if (multiIntValue != null) __obj.updateDynamic("multiIntValue")(multiIntValue)
    if (multiValue != null) __obj.updateDynamic("multiValue")(multiValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_BoolValue]
  }
}

