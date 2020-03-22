package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalValue extends js.Object {
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var groupIndex: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var summaryProcess: js.UndefOr[String] = js.undefined
  var totalValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonTotalValue {
  @scala.inline
  def apply(
    component: dxDataGrid = null,
    groupIndex: Int | Double = null,
    name: String = null,
    summaryProcess: String = null,
    totalValue: js.Any = null,
    value: js.Any = null
  ): AnonTotalValue = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (summaryProcess != null) __obj.updateDynamic("summaryProcess")(summaryProcess.asInstanceOf[js.Any])
    if (totalValue != null) __obj.updateDynamic("totalValue")(totalValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalValue]
  }
}

