package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalFormatRule extends js.Object {
  /** The formatting is either "on" or "off" according to the rule. */
  var booleanRule: js.UndefOr[BooleanRule] = js.undefined
  /** The formatting will vary based on the gradients in the rule. */
  var gradientRule: js.UndefOr[GradientRule] = js.undefined
  /**
    * The ranges that will be formatted if the condition is true.
    * All the ranges must be on the same grid.
    */
  var ranges: js.UndefOr[js.Array[GridRange]] = js.undefined
}

