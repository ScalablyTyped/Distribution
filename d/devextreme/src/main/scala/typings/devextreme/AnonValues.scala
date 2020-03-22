package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var columns: js.UndefOr[js.Array[dxTreeListColumn]] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var rowElement: js.UndefOr[dxElement] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonValues {
  @scala.inline
  def apply(
    columns: js.Array[dxTreeListColumn] = null,
    component: dxTreeList = null,
    data: js.Any = null,
    element: dxElement = null,
    event: event = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    model: js.Any = null,
    rowElement: dxElement = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    values: js.Array[_] = null
  ): AnonValues = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValues]
  }
}

