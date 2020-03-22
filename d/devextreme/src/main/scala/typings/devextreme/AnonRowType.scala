package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowType extends js.Object {
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
}

object AnonRowType {
  @scala.inline
  def apply(
    column: dxDataGridColumn = null,
    columnIndex: Int | Double = null,
    component: dxDataGrid = null,
    data: js.Any = null,
    key: js.Any = null,
    row: dxDataGridRowObject = null,
    rowIndex: Int | Double = null,
    rowType: String = null
  ): AnonRowType = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowType]
  }
}

