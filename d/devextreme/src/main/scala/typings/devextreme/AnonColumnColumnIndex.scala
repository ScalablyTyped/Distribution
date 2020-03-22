package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnIndex extends js.Object {
  var column: js.UndefOr[this.type] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
}

object AnonColumnColumnIndex {
  @scala.inline
  def apply(
    column: AnonColumnColumnIndex = null,
    columnIndex: Int | Double = null,
    component: dxDataGrid = null
  ): AnonColumnColumnIndex = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnColumnIndex]
  }
}

