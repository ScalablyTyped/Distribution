package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyRow extends js.Object {
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
}

object AnonKeyRow {
  @scala.inline
  def apply(
    column: dxTreeListColumn = null,
    columnIndex: Int | Double = null,
    component: dxTreeList = null,
    data: js.Any = null,
    key: js.Any = null,
    row: dxTreeListRowObject = null,
    rowIndex: Int | Double = null,
    rowType: String = null
  ): AnonKeyRow = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyRow]
  }
}

