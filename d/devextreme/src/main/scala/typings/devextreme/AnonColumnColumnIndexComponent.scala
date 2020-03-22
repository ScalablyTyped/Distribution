package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnColumnIndexComponent extends js.Object {
  var column: js.UndefOr[this.type] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
}

object AnonColumnColumnIndexComponent {
  @scala.inline
  def apply(
    column: AnonColumnColumnIndexComponent = null,
    columnIndex: Int | Double = null,
    component: dxTreeList = null
  ): AnonColumnColumnIndexComponent = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnColumnIndexComponent]
  }
}

