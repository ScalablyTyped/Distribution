package typings.exceljs.exceljsMod

import typings.exceljs.Anon_IncludeEmpty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof exceljs.exceljs.Style ]:? exceljs.exceljs.Style[P]} */ @js.native
trait ColumnExtension extends js.Object {
  /**
  	 * indicate the collapsed state based on outlineLevel
  	 */
  val collapsed: Boolean = js.native
  /**
  	 * Iterate over all current cells in this column
  	 */
  def eachCell(callback: js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all current cells in this column including empty cells
  	 */
  def eachCell(opt: Anon_IncludeEmpty, callback: js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit]): Unit = js.native
}

