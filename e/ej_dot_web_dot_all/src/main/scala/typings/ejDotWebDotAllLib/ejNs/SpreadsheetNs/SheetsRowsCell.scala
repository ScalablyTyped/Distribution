package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsRowsCell extends js.Object {
  /** Specifies the comment for a cell in Spreadsheet.
    * @Default {null}
    */
  var comment: js.UndefOr[SheetsRowsCellsComment] = js.undefined
  /** Specifies the format of a cell in Spreadsheet.
    * @Default {null}
    */
  var format: js.UndefOr[SheetsRowsCellsFormat] = js.undefined
  /** Specifies the hyperlink for a cell in Spreadsheet.
    * @Default {null}
    */
  var hyperlink: js.UndefOr[SheetsRowsCellsHyperlink] = js.undefined
  /** Specifies the index of a cell in Spreadsheet.
    * @Default {0}
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Specifies whether to lock or unlock a particular cell.
    * @Default {false}
    */
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the styles of a cell in Spreadsheet.
    * @Default {null}
    */
  var style: js.UndefOr[SheetsRowsCellsStyle] = js.undefined
  /** Specifies the value for a cell in Spreadsheet.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

