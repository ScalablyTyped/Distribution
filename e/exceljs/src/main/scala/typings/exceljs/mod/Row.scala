package typings.exceljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.exceljs.anon.IncludeEmpty
import typings.exceljs.anon.PartialRowModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends Style {
  
  /**
  	 * Number of non-empty cells
  	 */
  val actualCellCount: Double = js.native
  
  def addPageBreak(): Unit = js.native
  def addPageBreak(lft: js.UndefOr[scala.Nothing], rght: Double): Unit = js.native
  def addPageBreak(lft: Double): Unit = js.native
  def addPageBreak(lft: Double, rght: Double): Unit = js.native
  
  /**
  	 * Number of cells including empty ones
  	 */
  val cellCount: Double = js.native
  
  /**
  	 * Indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: Boolean = js.native
  
  /**
  	 * Commit a completed row to stream
  	 */
  def commit(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val dimensions: Double = js.native
  
  /**
  	 * Iterate over all non-null cells in a row
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* colNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all cells in a row (including empty cells)
  	 */
  def eachCell(opt: IncludeEmpty, callback: js.Function2[/* cell */ Cell, /* colNumber */ Double, Unit]): Unit = js.native
  
  def findCell(colNumber: Double): js.UndefOr[Cell] = js.native
  
  def getCell(indexOrKey: String): Cell = js.native
  /**
  	 * Get cell by number, column letter or column key
  	 */
  def getCell(indexOrKey: Double): Cell = js.native
  
  def getCellEx(address: Address): Cell = js.native
  
  val hasValues: Boolean = js.native
  
  /**
  	 * Set a specific row height
  	 */
  var height: Double = js.native
  
  /**
  	 * Make row hidden
  	 */
  var hidden: Boolean = js.native
  
  var model: PartialRowModel | Null = js.native
  
  /**
  	 * The row number
  	 */
  val number: Double = js.native
  
  /**
  	 * Set an outline level for rows
  	 */
  var outlineLevel: js.UndefOr[Double] = js.native
  
  /**
  	 * Cut one or more cells (cells to the right are shifted left)
  	 *
  	 * Note: this operation will not affect other rows
  	 */
  def splice(start: Double, count: Double, insert: js.Any*): Unit = js.native
  
  /**
  	 * Get a row as a sparse array
  	 */
  // readonly values: CellValue[];
  var values: js.Array[CellValue] | StringDictionary[CellValue] = js.native
  
  val worksheet: Worksheet = js.native
}
