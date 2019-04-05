package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  var rowHeight: js.UndefOr[Dimension] = js.undefined
  var tableCells: js.UndefOr[js.Array[TableCell]] = js.undefined
  var tableRowProperties: js.UndefOr[TableRowProperties] = js.undefined
}

object TableRow {
  @scala.inline
  def apply(
    rowHeight: Dimension = null,
    tableCells: js.Array[TableCell] = null,
    tableRowProperties: TableRowProperties = null
  ): TableRow = {
    val __obj = js.Dynamic.literal()
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight)
    if (tableCells != null) __obj.updateDynamic("tableCells")(tableCells)
    if (tableRowProperties != null) __obj.updateDynamic("tableRowProperties")(tableRowProperties)
    __obj.asInstanceOf[TableRow]
  }
}

