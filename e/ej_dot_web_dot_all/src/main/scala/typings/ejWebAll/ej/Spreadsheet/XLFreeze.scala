package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLFreeze extends js.Object {
  /** This method is used to freeze columns upto the specified column index in the Spreadsheet.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezeColumns(colIdx: Double): Unit = js.native
  /** This method is used to freeze the first column in the Spreadsheet.
    * @returns {void}
    */
  def freezeLeftColumn(): Unit = js.native
  /** This method is used to freeze rows and columns before the specified cell in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezePanes(rowIdx: Double, colIdx: Double): Unit = js.native
  /** This method is used to freeze rows upto the specified row index in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @returns {void}
    */
  def freezeRows(rowIdx: Double): Unit = js.native
  /** This method is used to freeze the top row in the Spreadsheet.
    * @returns {void}
    */
  def freezeTopRow(): Unit = js.native
  /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
    * @returns {void}
    */
  def unfreezePanes(): Unit = js.native
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
  @scala.inline
  implicit class XLFreezeOps[Self <: XLFreeze] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFreezeColumns(value: Double => Unit): Self = this.set("freezeColumns", js.Any.fromFunction1(value))
    @scala.inline
    def setFreezeLeftColumn(value: () => Unit): Self = this.set("freezeLeftColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setFreezePanes(value: (Double, Double) => Unit): Self = this.set("freezePanes", js.Any.fromFunction2(value))
    @scala.inline
    def setFreezeRows(value: Double => Unit): Self = this.set("freezeRows", js.Any.fromFunction1(value))
    @scala.inline
    def setFreezeTopRow(value: () => Unit): Self = this.set("freezeTopRow", js.Any.fromFunction0(value))
    @scala.inline
    def setUnfreezePanes(value: () => Unit): Self = this.set("unfreezePanes", js.Any.fromFunction0(value))
  }
  
}

