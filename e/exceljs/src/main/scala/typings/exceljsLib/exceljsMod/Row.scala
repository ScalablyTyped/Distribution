package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends Style {
  /**
  	 * Number of cells including empty ones
  	 */
  val actualCellCount: scala.Double = js.native
  /**
  	 * Number of non-empty cells
  	 */
  val cellCount: scala.Double = js.native
  /**
  	 * Indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: scala.Boolean = js.native
  /**
  	 * Set a specific row height
  	 */
  var height: scala.Double = js.native
  /**
  	 * Make row hidden
  	 */
  var hidden: scala.Boolean = js.native
  /**
  	 * The row number
  	 */
  val number: scala.Double = js.native
  /**
  	 * Set an outline level for rows
  	 */
  var outlineLevel: js.UndefOr[scala.Double] = js.native
  /**
  	 * Get a row as a sparse array
  	 */
  var values: js.Array[_] | js.Any = js.native
  /**
  	 * Commit a completed row to stream
  	 */
  def commit(): scala.Unit = js.native
  /**
  	 * Iterate over all non-null cells in a row
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* colNumber */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
  	 * Iterate over all cells in a row (including empty cells)
  	 */
  def eachCell(
    opt: exceljsLib.Anon_IncludeEmpty,
    callback: js.Function2[/* cell */ Cell, /* colNumber */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
  	 * Get cell by number, column letter or column key
  	 */
  def getCell(indexOrKey: java.lang.String): Cell = js.native
  /**
  	 * Get cell by number, column letter or column key
  	 */
  def getCell(indexOrKey: scala.Double): Cell = js.native
  /**
  	 * Cut one or more cells (cells to the right are shifted left)
  	 *
  	 * Note: this operation will not affect other rows
  	 */
  def splice(start: scala.Double, count: scala.Double, insert: js.Any*): scala.Unit = js.native
}

