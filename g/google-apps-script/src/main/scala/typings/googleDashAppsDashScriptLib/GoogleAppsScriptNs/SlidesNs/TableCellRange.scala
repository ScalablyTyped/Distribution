package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellRange extends js.Object {
  def getTableCells(): js.Array[TableCell]
}

object TableCellRange {
  @scala.inline
  def apply(getTableCells: () => js.Array[TableCell]): TableCellRange = {
    val __obj = js.Dynamic.literal(getTableCells = js.Any.fromFunction0(getTableCells))
  
    __obj.asInstanceOf[TableCellRange]
  }
}

