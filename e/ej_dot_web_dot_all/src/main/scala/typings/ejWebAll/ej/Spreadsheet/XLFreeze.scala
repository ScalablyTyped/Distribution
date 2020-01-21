package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLFreeze extends js.Object {
  /** This method is used to freeze columns upto the specified column index in the Spreadsheet.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezeColumns(colIdx: Double): Unit
  /** This method is used to freeze the first column in the Spreadsheet.
    * @returns {void}
    */
  def freezeLeftColumn(): Unit
  /** This method is used to freeze rows and columns before the specified cell in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezePanes(rowIdx: Double, colIdx: Double): Unit
  /** This method is used to freeze rows upto the specified row index in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @returns {void}
    */
  def freezeRows(rowIdx: Double): Unit
  /** This method is used to freeze the top row in the Spreadsheet.
    * @returns {void}
    */
  def freezeTopRow(): Unit
  /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
    * @returns {void}
    */
  def unfreezePanes(): Unit
}

object XLFreeze {
  @scala.inline
  def apply(
    freezeColumns: Double => Unit,
    freezeLeftColumn: () => Unit,
    freezePanes: (Double, Double) => Unit,
    freezeRows: Double => Unit,
    freezeTopRow: () => Unit,
    unfreezePanes: () => Unit
  ): XLFreeze = {
    val __obj = js.Dynamic.literal(freezeColumns = js.Any.fromFunction1(freezeColumns), freezeLeftColumn = js.Any.fromFunction0(freezeLeftColumn), freezePanes = js.Any.fromFunction2(freezePanes), freezeRows = js.Any.fromFunction1(freezeRows), freezeTopRow = js.Any.fromFunction0(freezeTopRow), unfreezePanes = js.Any.fromFunction0(unfreezePanes))
  
    __obj.asInstanceOf[XLFreeze]
  }
}

