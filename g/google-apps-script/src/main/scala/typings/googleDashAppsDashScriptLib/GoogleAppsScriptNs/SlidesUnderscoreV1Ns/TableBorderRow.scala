package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBorderRow extends js.Object {
  // Properties of each border cell. When a border's adjacent table cells are
  // merged, it is not included in the response.
  var table_border_cells: js.Array[TableBorderCell]
}

object TableBorderRow {
  @scala.inline
  def apply(table_border_cells: js.Array[TableBorderCell]): TableBorderRow = {
    val __obj = js.Dynamic.literal(table_border_cells = table_border_cells)
  
    __obj.asInstanceOf[TableBorderRow]
  }
}

