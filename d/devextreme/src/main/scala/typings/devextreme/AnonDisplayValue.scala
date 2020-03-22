package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayValue extends js.Object {
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var displayValue: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var eventType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonDisplayValue {
  @scala.inline
  def apply(
    cellElement: dxElement = null,
    column: dxDataGridColumn = null,
    columnIndex: Int | Double = null,
    component: dxDataGrid = null,
    data: js.Any = null,
    displayValue: js.Any = null,
    element: dxElement = null,
    eventType: String = null,
    key: js.Any = null,
    model: js.Any = null,
    row: dxDataGridRowObject = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    text: String = null,
    value: js.Any = null
  ): AnonDisplayValue = {
    val __obj = js.Dynamic.literal()
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayValue]
  }
}

