package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedValue extends js.Object {
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Represents an error.
    * This field is read-only.
    */
  var errorValue: js.UndefOr[ErrorValue] = js.undefined
  /** Represents a formula. */
  var formulaValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents a double value.
    * Note: Dates, Times and DateTimes are represented as doubles in
    * "serial number" format.
    */
  var numberValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Represents a string value.
    * Leading single quotes are not included. For example, if the user typed
    * `'123` into the UI, this would be represented as a `stringValue` of
    * `"123"`.
    */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object ExtendedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    errorValue: ErrorValue = null,
    formulaValue: java.lang.String = null,
    numberValue: scala.Int | scala.Double = null,
    stringValue: java.lang.String = null
  ): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (errorValue != null) __obj.updateDynamic("errorValue")(errorValue)
    if (formulaValue != null) __obj.updateDynamic("formulaValue")(formulaValue)
    if (numberValue != null) __obj.updateDynamic("numberValue")(numberValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[ExtendedValue]
  }
}

