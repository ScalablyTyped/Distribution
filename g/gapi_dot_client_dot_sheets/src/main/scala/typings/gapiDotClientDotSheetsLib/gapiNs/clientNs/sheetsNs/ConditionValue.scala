package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionValue extends js.Object {
  /**
    * A relative date (based on the current date).
    * Valid only if the type is
    * DATE_BEFORE,
    * DATE_AFTER,
    * DATE_ON_OR_BEFORE or
    * DATE_ON_OR_AFTER.
    *
    * Relative dates are not supported in data validation.
    * They are supported only in conditional formatting and
    * conditional filters.
    */
  var relativeDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value the condition is based on.
    * The value will be parsed as if the user typed into a cell.
    * Formulas are supported (and must begin with an `=`).
    */
  var userEnteredValue: js.UndefOr[java.lang.String] = js.undefined
}

