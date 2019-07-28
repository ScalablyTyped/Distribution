package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLSelection extends js.Object {
  /** This method is used to clear the selection of the active sheet in the Spreadsheet.
    * @returns {void}
    */
  def clearAll(): Unit = js.native
  /** This method is used to get the selected cells element based on specified sheet index in the Spreadsheet.
    * @param {number} Pass the sheet index to get the cells element.
    * @returns {HTMLElement}
    */
  def getSelectedCells(sheetIdx: Double): HTMLElement = js.native
  def refreshSelection(range: String): Unit = js.native
  /** This method is used to refresh the selection in the Spreadsheet.
    * @param {any[]|string} Optional. Pass range to refresh selection.
    * @returns {void}
    */
  def refreshSelection(range: js.Array[_]): Unit = js.native
  /** This method is used to select a single column in the Spreadsheet.
    * @param {number} Pass the column index value.
    * @returns {void}
    */
  def selectColumn(colIdx: Double): Unit = js.native
  /** This method is used to select entire columns in a specified range (start index and end index) in the Spreadsheet.
    * @param {number} Pass the column start index.
    * @param {number} Pass the column end index.
    * @returns {void}
    */
  def selectColumns(startIdx: Double, endIdx: Double): Unit = js.native
  /** This method is used to select the specified range of cells in the Spreadsheet.
    * @param {string} Pass range which want to select.
    * @returns {void}
    */
  def selectRange(range: String): Unit = js.native
  /** This method is used to select a single row in the Spreadsheet.
    * @param {number} Pass the row index value.
    * @returns {void}
    */
  def selectRow(rowIdx: Double): Unit = js.native
  /** This method is used to select entire rows in a specified range (start index and end index) in the Spreadsheet.
    * @param {number} Pass the start row index.
    * @param {number} Pass the end row index.
    * @returns {void}
    */
  def selectRows(startIdx: Double, endIdx: Double): Unit = js.native
  /** This method is used to select all cells in active sheet.
    * @returns {void}
    */
  def selectSheet(): Unit = js.native
}

