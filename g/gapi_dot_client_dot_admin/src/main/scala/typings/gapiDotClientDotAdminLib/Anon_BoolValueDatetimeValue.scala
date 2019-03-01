package typings
package gapiDotClientDotAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolValueDatetimeValue extends js.Object {
  /** Boolean value of the parameter. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** RFC 3339 formatted value of the parameter. */
  var datetimeValue: js.UndefOr[java.lang.String] = js.undefined
  /** Integral value of the parameter. */
  var intValue: js.UndefOr[java.lang.String] = js.undefined
  /** Nested message value of the parameter. */
  var msgValue: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
  /** The name of the parameter. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** String value of the parameter. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BoolValueDatetimeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    datetimeValue: java.lang.String = null,
    intValue: java.lang.String = null,
    msgValue: js.Array[stdLib.Record[java.lang.String, _]] = null,
    name: java.lang.String = null,
    stringValue: java.lang.String = null
  ): Anon_BoolValueDatetimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue)
    if (intValue != null) __obj.updateDynamic("intValue")(intValue)
    if (msgValue != null) __obj.updateDynamic("msgValue")(msgValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[Anon_BoolValueDatetimeValue]
  }
}

