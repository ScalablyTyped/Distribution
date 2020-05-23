package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnComponentRow extends js.Object {
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
}

object ColumnComponentRow {
  @scala.inline
  def apply(column: dxDataGridColumn = null, component: dxDataGrid = null, row: dxDataGridRowObject = null): ColumnComponentRow = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnComponentRow]
  }
}

