package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns extends js.Object {
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

object AnonColumns {
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
    newColumnIndex: Int | Double = null,
    newRowIndex: Int | Double = null,
    prevColumnIndex: Int | Double = null,
    prevRowIndex: Int | Double = null,
    rows: js.Array[dxDataGridRowObject] = null
  ): AnonColumns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isHighlighted)) __obj.updateDynamic("isHighlighted")(isHighlighted.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newColumnIndex != null) __obj.updateDynamic("newColumnIndex")(newColumnIndex.asInstanceOf[js.Any])
    if (newRowIndex != null) __obj.updateDynamic("newRowIndex")(newRowIndex.asInstanceOf[js.Any])
    if (prevColumnIndex != null) __obj.updateDynamic("prevColumnIndex")(prevColumnIndex.asInstanceOf[js.Any])
    if (prevRowIndex != null) __obj.updateDynamic("prevRowIndex")(prevRowIndex.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumns]
  }
}

