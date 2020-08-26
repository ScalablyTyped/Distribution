package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLResize extends js.Object {
  /** This method is used to fit the height of rows in the Spreadsheet.
    * @param {any[]} Optional. Pass row index collection that you want to fit its height.
    * @returns {void}
    */
  def fitHeight(rowIndexes: js.Array[_]): Unit = js.native
  /** This method is used to fit the width of columns in the Spreadsheet.
    * @param {any[]} Optional. Pass column index collection that you want to fit its width.
    * @returns {void}
    */
  def fitWidth(colIndexes: js.Array[_]): Unit = js.native
  /** This method is used to get the column width of the specified column index in the Spreadsheet.
    * @param {number} Pass the column index.
    * @returns {number}
    */
  def getColWidth(colIdx: Double): Double = js.native
  /** This method is used to get the row height of the specified row index in the Spreadsheet.
    * @param {number} Pass the row index which you want to find its height.
    * @returns {number}
    */
  def getRowHeight(rowIdx: Double): Double = js.native
  /** This method is used to set the column width of the specified column index in the Spreadsheet.
    * @param {number} Pass the column index.
    * @param {number} Pass the width value that you want to set.
    * @returns {void}
    */
  def setColWidth(colIdx: Double, size: Double): Unit = js.native
  /** This method is used to set the row height of the specified row index in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the height value that you want to set.
    * @returns {void}
    */
  def setRowHeight(rowIdx: Double, size: Double): Unit = js.native
}

object XLResize {
  @scala.inline
  def apply(
    fitHeight: js.Array[_] => Unit,
    fitWidth: js.Array[_] => Unit,
    getColWidth: Double => Double,
    getRowHeight: Double => Double,
    setColWidth: (Double, Double) => Unit,
    setRowHeight: (Double, Double) => Unit
  ): XLResize = {
    val __obj = js.Dynamic.literal(fitHeight = js.Any.fromFunction1(fitHeight), fitWidth = js.Any.fromFunction1(fitWidth), getColWidth = js.Any.fromFunction1(getColWidth), getRowHeight = js.Any.fromFunction1(getRowHeight), setColWidth = js.Any.fromFunction2(setColWidth), setRowHeight = js.Any.fromFunction2(setRowHeight))
    __obj.asInstanceOf[XLResize]
  }
  @scala.inline
  implicit class XLResizeOps[Self <: XLResize] (val x: Self) extends AnyVal {
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
    def setFitHeight(value: js.Array[_] => Unit): Self = this.set("fitHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setFitWidth(value: js.Array[_] => Unit): Self = this.set("fitWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColWidth(value: Double => Double): Self = this.set("getColWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRowHeight(value: Double => Double): Self = this.set("getRowHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColWidth(value: (Double, Double) => Unit): Self = this.set("setColWidth", js.Any.fromFunction2(value))
    @scala.inline
    def setSetRowHeight(value: (Double, Double) => Unit): Self = this.set("setRowHeight", js.Any.fromFunction2(value))
  }
  
}

