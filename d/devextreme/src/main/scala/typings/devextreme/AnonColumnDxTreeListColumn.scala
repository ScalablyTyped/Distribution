package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import typings.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typings.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnDxTreeListColumn extends js.Object {
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
}

object AnonColumnDxTreeListColumn {
  @scala.inline
  def apply(column: dxTreeListColumn = null, component: dxTreeList = null, row: dxTreeListRowObject = null): AnonColumnDxTreeListColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnDxTreeListColumn]
  }
}

