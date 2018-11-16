package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnExtension extends Style {
  /**
  	 * indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: scala.Boolean = js.native
  /**
  	 * Iterate over all current cells in this column
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* rowNumber */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
  	 * Iterate over all current cells in this column including empty cells
  	 */
  def eachCell(
    opt: exceljsLib.Anon_IncludeEmpty,
    callback: js.Function2[/* cell */ Cell, /* rowNumber */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

