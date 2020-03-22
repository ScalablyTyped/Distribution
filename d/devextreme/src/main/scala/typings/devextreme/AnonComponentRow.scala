package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentRow extends js.Object {
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
}

object AnonComponentRow {
  @scala.inline
  def apply(component: dxDataGrid = null, row: dxDataGridRowObject = null): AnonComponentRow = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentRow]
  }
}

