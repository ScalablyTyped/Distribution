package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnColumnIndexComponent extends js.Object {
  var column: js.UndefOr[this.type] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
}

object ColumnColumnIndexComponent {
  @scala.inline
  def apply(
    column: ColumnColumnIndexComponent = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    component: dxTreeList = null
  ): ColumnColumnIndexComponent = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnColumnIndexComponent]
  }
}

