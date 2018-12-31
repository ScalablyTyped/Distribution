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

