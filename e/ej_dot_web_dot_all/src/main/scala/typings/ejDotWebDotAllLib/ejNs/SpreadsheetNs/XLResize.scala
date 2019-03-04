package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLResize extends js.Object {
  /** This method is used to fit the height of rows in the Spreadsheet.
    * @param {any[]} Optional. Pass row index collection that you want to fit its height.
    * @returns {void}
    */
  def fitHeight(rowIndexes: js.Array[_]): scala.Unit
  /** This method is used to fit the width of columns in the Spreadsheet.
    * @param {any[]} Optional. Pass column index collection that you want to fit its width.
    * @returns {void}
    */
  def fitWidth(colIndexes: js.Array[_]): scala.Unit
  /** This method is used to get the column width of the specified column index in the Spreadsheet.
    * @param {number} Pass the column index.
    * @returns {number}
    */
  def getColWidth(colIdx: scala.Double): scala.Double
  /** This method is used to get the row height of the specified row index in the Spreadsheet.
    * @param {number} Pass the row index which you want to find its height.
    * @returns {number}
    */
  def getRowHeight(rowIdx: scala.Double): scala.Double
  /** This method is used to set the column width of the specified column index in the Spreadsheet.
    * @param {number} Pass the column index.
    * @param {number} Pass the width value that you want to set.
    * @returns {void}
    */
  def setColWidth(colIdx: scala.Double, size: scala.Double): scala.Unit
  /** This method is used to set the row height of the specified row index in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the height value that you want to set.
    * @returns {void}
    */
  def setRowHeight(rowIdx: scala.Double, size: scala.Double): scala.Unit
}

object XLResize {
  @scala.inline
  def apply(
    fitHeight: js.Function1[js.Array[_], scala.Unit],
    fitWidth: js.Function1[js.Array[_], scala.Unit],
    getColWidth: js.Function1[scala.Double, scala.Double],
    getRowHeight: js.Function1[scala.Double, scala.Double],
    setColWidth: js.Function2[scala.Double, scala.Double, scala.Unit],
    setRowHeight: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XLResize = {
    val __obj = js.Dynamic.literal(fitHeight = fitHeight, fitWidth = fitWidth, getColWidth = getColWidth, getRowHeight = getRowHeight, setColWidth = setColWidth, setRowHeight = setRowHeight)
  
    __obj.asInstanceOf[XLResize]
  }
}

