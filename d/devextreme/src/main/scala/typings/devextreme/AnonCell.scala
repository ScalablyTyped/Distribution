package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCell extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.undefined
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxPivotGrid] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object AnonCell {
  @scala.inline
  def apply(
    area: String = null,
    cell: dxPivotGridPivotGridCell = null,
    cellElement: dxElement = null,
    columnIndex: Int | Double = null,
    component: dxPivotGrid = null,
    element: dxElement = null,
    model: js.Any = null,
    rowIndex: Int | Double = null
  ): AnonCell = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCell]
  }
}

