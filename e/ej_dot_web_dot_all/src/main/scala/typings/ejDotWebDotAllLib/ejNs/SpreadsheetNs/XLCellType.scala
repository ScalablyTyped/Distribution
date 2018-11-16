package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLCellType extends js.Object {
  /** This method is used to set a cell type from the specified range of cells in the spreadsheet.
               * @param {string} Pass the range where you want apply cell type.
               * @param {any} Pass type of cell type and its settings.
               * @param {number} Optional. Pass sheet index.
               * @returns {void}
               */
  def addCellTypes(range: java.lang.String, settings: js.Any, sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to remove cell type from the specified range of cells in the Spreadsheet.
               * @param {string|any[]} Pass the range where you want remove cell type.
               * @param {number} Optional. Pass sheet index.
               * @returns {void}
               */
  def removeCellTypes(range: java.lang.String, sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to remove cell type from the specified range of cells in the Spreadsheet.
               * @param {string|any[]} Pass the range where you want remove cell type.
               * @param {number} Optional. Pass sheet index.
               * @returns {void}
               */
  def removeCellTypes(range: js.Array[_], sheetIdx: scala.Double): scala.Unit = js.native
}

