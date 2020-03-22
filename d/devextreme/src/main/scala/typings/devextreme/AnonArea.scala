package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import typings.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArea extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[Boolean] = js.undefined
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.undefined
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxPivotGrid] = js.undefined
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object AnonArea {
  @scala.inline
  def apply(
    area: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: dxPivotGridPivotGridCell = null,
    cellElement: dxElement = null,
    columnFields: js.Array[PivotGridDataSourceField] = null,
    columnIndex: Int | Double = null,
    component: dxPivotGrid = null,
    dataFields: js.Array[PivotGridDataSourceField] = null,
    element: dxElement = null,
    event: event = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    rowFields: js.Array[PivotGridDataSourceField] = null,
    rowIndex: Int | Double = null
  ): AnonArea = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columnFields != null) __obj.updateDynamic("columnFields")(columnFields.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataFields != null) __obj.updateDynamic("dataFields")(dataFields.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowFields != null) __obj.updateDynamic("rowFields")(rowFields.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArea]
  }
}

