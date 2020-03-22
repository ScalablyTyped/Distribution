package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventType extends js.Object {
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var displayValue: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var eventType: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonEventType {
  @scala.inline
  def apply(
    cellElement: dxElement = null,
    column: dxTreeListColumn = null,
    columnIndex: Int | Double = null,
    component: dxTreeList = null,
    data: js.Any = null,
    displayValue: js.Any = null,
    element: dxElement = null,
    eventType: String = null,
    key: js.Any = null,
    model: js.Any = null,
    row: dxTreeListRowObject = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    text: String = null,
    value: js.Any = null
  ): AnonEventType = {
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
    __obj.asInstanceOf[AnonEventType]
  }
}

