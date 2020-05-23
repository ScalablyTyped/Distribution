package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var columns: js.UndefOr[js.Array[dxDataGridColumn]] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var isHighlighted: js.UndefOr[Boolean] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var newColumnIndex: js.UndefOr[Double] = js.undefined
  var newRowIndex: js.UndefOr[Double] = js.undefined
  var prevColumnIndex: js.UndefOr[Double] = js.undefined
  var prevRowIndex: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[js.Array[dxDataGridRowObject]] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellElement: dxElement = null,
    columns: js.Array[dxDataGridColumn] = null,
    component: dxDataGrid = null,
    element: dxElement = null,
    event: event = null,
    isHighlighted: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    newColumnIndex: js.UndefOr[Double] = js.undefined,
    newRowIndex: js.UndefOr[Double] = js.undefined,
    prevColumnIndex: js.UndefOr[Double] = js.undefined,
    prevRowIndex: js.UndefOr[Double] = js.undefined,
    rows: js.Array[dxDataGridRowObject] = null
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlighted)) __obj.updateDynamic("isHighlighted")(isHighlighted.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(newColumnIndex)) __obj.updateDynamic("newColumnIndex")(newColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newRowIndex)) __obj.updateDynamic("newRowIndex")(newRowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevColumnIndex)) __obj.updateDynamic("prevColumnIndex")(prevColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevRowIndex)) __obj.updateDynamic("prevRowIndex")(prevRowIndex.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

