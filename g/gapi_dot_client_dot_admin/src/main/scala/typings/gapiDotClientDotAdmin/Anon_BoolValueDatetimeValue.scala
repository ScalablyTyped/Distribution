package typings.gapiDotClientDotAdmin

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolValueDatetimeValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /** RFC 3339 formatted value of the parameter. */
  var datetimeValue: js.UndefOr[String] = js.undefined
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[String] = js.undefined
  /** Nested message value of the parameter. */
  var msgValue: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
  /** The name of the parameter. */
  var name: js.UndefOr[String] = js.undefined
  /** String value of the parameter. */
  var stringValue: js.UndefOr[String] = js.undefined
}

object Anon_BoolValueDatetimeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    datetimeValue: String = null,
    intValue: String = null,
    msgValue: js.Array[Record[String, _]] = null,
    name: String = null,
    stringValue: String = null
  ): Anon_BoolValueDatetimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (msgValue != null) __obj.updateDynamic("msgValue")(msgValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BoolValueDatetimeValue]
  }
}

