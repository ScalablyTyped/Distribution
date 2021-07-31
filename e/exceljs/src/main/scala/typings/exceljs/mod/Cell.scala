package typings.exceljs.mod

import typings.exceljs.anon.PartialStyle
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cell
  extends StObject
     with Style
     with Address {
  
  def addMergeRef(): Unit = js.native
  
  def addName(name: String): Unit = js.native
  
  /**
  	 * Cells can define what values are valid or not and provide
  	 * prompting to the user to help guide them.
  	 */
  var dataValidation: DataValidation = js.native
  
  def destroy(): Unit = js.native
  
  val effectiveType: ValueType = js.native
  
  /**
  	 * convenience getter to access the formula
  	 */
  val formula: String = js.native
  
  /**
  	 * The type of the cell's formula
  	 */
  val formulaType: FormulaType = js.native
  
  val fullAddress: typings.exceljs.anon.Address = js.native
  
  val hyperlink: String = js.native
  
  val isHyperlink: Boolean = js.native
  
  val isMerged: Boolean = js.native
  
  def isMergedTo(master: Cell): Boolean = js.native
  
  val master: Cell = js.native
  
  def merge(master: Cell): Unit = js.native
  def merge(master: Cell, ignoreStyle: Boolean): Unit = js.native
  
  var model: CellModel = js.native
  
  /**
  	 * Assign (or get) a name for a cell (will overwrite any other names that cell had)
  	 */
  var name: String = js.native
  
  /**
  	 * Assign (or get) an array of names for a cell (cells can have more than one name)
  	 */
  var names: js.Array[String] = js.native
  
  /**
  	 * comment of the cell
  	 */
  var note: String | Comment = js.native
  
  def release(): Unit = js.native
  
  def releaseMergeRef(): Unit = js.native
  
  def removeAllNames(): Unit = js.native
  
  /**
  	 * Remove a name from a cell
  	 */
  def removeName(name: String): Unit = js.native
  
  /**
  	 * convenience getter to access the formula result
  	 */
  val result: Double | String | Date = js.native
  
  /**
  	 * The styles of the cell
  	 */
  var style: PartialStyle = js.native
  
  // todo
  val text: String = js.native
  
  def toCsvString(): String = js.native
  
  /**
  	 * The type of the cell's value
  	 */
  val `type`: ValueType = js.native
  
  def unmerge(): Unit = js.native
  
  /**
  	 * Value of the cell
  	 */
  var value: CellValue = js.native
  
  val workbook: Workbook = js.native
  
  val worksheet: Worksheet = js.native
}
