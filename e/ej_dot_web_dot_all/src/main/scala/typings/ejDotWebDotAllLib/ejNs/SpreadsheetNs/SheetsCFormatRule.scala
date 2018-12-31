package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsCFormatRule extends js.Object {
  /** Specifies the conditions to apply for the range of cells in Spreadsheet.
    */
  var action: js.UndefOr[CFormatRule | java.lang.String] = js.undefined
  /** Specifies the color to apply for the range of cell while conditional formatting.
    */
  var color: js.UndefOr[CFormatHighlightColor | java.lang.String] = js.undefined
  /** Specifies the inputs for conditional formatting in Spreadsheet.
    * @Default {[]}
    */
  var inputs: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the range for conditional formatting in Spreadsheet.
    */
  var range: js.UndefOr[java.lang.String] = js.undefined
}

