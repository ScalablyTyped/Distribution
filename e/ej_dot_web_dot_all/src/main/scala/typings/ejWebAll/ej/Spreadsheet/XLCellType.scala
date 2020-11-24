package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLCellType extends js.Object {
  
  /** This method is used to set a cell type from the specified range of cells in the spreadsheet.
    * @param {string} Pass the range where you want apply cell type.
    * @param {Spreadsheet.CellTypeSettings} Pass the Object "CellTypeSettings"
    * @param {number} Optional. Pass sheet index.
    * @returns {void}
    */
  def addCellTypes(range: String, settings: CellTypeSettings, sheetIdx: Double): Unit = js.native
  
  /** This method is used to remove cell type from the specified range of cells in the Spreadsheet.
    * @param {string|any[]} Pass the range where you want remove cell type.
    * @param {number} Optional. Pass sheet index.
    * @returns {void}
    */
  def removeCellTypes(range: String, sheetIdx: Double): Unit = js.native
  def removeCellTypes(range: js.Array[_], sheetIdx: Double): Unit = js.native
}
