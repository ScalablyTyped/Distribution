package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanRule extends js.Object {
  /**
    * The condition of the rule. If the condition evaluates to true,
    * the format will be applied.
    */
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  /**
    * The format to apply.
    * Conditional formatting can only apply a subset of formatting:
    * bold, italic,
    * strikethrough,
    * foreground color &
    * background color.
    */
  var format: js.UndefOr[CellFormat] = js.undefined
}

