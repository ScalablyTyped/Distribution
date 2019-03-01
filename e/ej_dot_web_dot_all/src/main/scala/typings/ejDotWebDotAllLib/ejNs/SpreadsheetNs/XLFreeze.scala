package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLFreeze extends js.Object {
  /** This method is used to freeze columns upto the specified column index in the Spreadsheet.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezeColumns(colIdx: scala.Double): scala.Unit
  /** This method is used to freeze the first column in the Spreadsheet.
    * @returns {void}
    */
  def freezeLeftColumn(): scala.Unit
  /** This method is used to freeze rows and columns before the specified cell in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @param {number} Index of the column to be freeze.
    * @returns {void}
    */
  def freezePanes(rowIdx: scala.Double, colIdx: scala.Double): scala.Unit
  /** This method is used to freeze rows upto the specified row index in the Spreadsheet.
    * @param {number} Index of the row to be freeze.
    * @returns {void}
    */
  def freezeRows(rowIdx: scala.Double): scala.Unit
  /** This method is used to freeze the top row in the Spreadsheet.
    * @returns {void}
    */
  def freezeTopRow(): scala.Unit
  /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
    * @returns {void}
    */
  def unfreezePanes(): scala.Unit
}

object XLFreeze {
  @scala.inline
  def apply(
    freezeColumns: js.Function1[scala.Double, scala.Unit],
    freezeLeftColumn: js.Function0[scala.Unit],
    freezePanes: js.Function2[scala.Double, scala.Double, scala.Unit],
    freezeRows: js.Function1[scala.Double, scala.Unit],
    freezeTopRow: js.Function0[scala.Unit],
    unfreezePanes: js.Function0[scala.Unit]
  ): XLFreeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("freezeColumns")(freezeColumns)
    __obj.updateDynamic("freezeLeftColumn")(freezeLeftColumn)
    __obj.updateDynamic("freezePanes")(freezePanes)
    __obj.updateDynamic("freezeRows")(freezeRows)
    __obj.updateDynamic("freezeTopRow")(freezeTopRow)
    __obj.updateDynamic("unfreezePanes")(unfreezePanes)
    __obj.asInstanceOf[XLFreeze]
  }
}

