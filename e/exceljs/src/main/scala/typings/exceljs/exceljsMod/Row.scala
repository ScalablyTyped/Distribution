package typings.exceljs.exceljsMod

import typings.exceljs.Anon_IncludeEmpty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends Style {
  /**
  	 * Number of cells including empty ones
  	 */
  val actualCellCount: Double = js.native
  /**
  	 * Number of non-empty cells
  	 */
  val cellCount: Double = js.native
  /**
  	 * Indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: Boolean = js.native
  /**
  	 * Set a specific row height
  	 */
  var height: Double = js.native
  /**
  	 * Make row hidden
  	 */
  var hidden: Boolean = js.native
  /**
  	 * The row number
  	 */
  val number: Double = js.native
  /**
  	 * Set an outline level for rows
  	 */
  var outlineLevel: js.UndefOr[Double] = js.native
  /**
  	 * Get a row as a sparse array
  	 */
  var values: js.Array[_] | js.Any = js.native
  /**
  	 * Commit a completed row to stream
  	 */
  def commit(): Unit = js.native
  /**
  	 * Iterate over all non-null cells in a row
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* colNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all cells in a row (including empty cells)
  	 */
  def eachCell(opt: Anon_IncludeEmpty, callback: js.Function2[/* cell */ Cell, /* colNumber */ Double, Unit]): Unit = js.native
  def getCell(indexOrKey: String): Cell = js.native
  /**
  	 * Get cell by number, column letter or column key
  	 */
  def getCell(indexOrKey: Double): Cell = js.native
  /**
  	 * Cut one or more cells (cells to the right are shifted left)
  	 *
  	 * Note: this operation will not affect other rows
  	 */
  def splice(start: Double, count: Double, insert: js.Any*): Unit = js.native
}

