package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupContinuedMessage extends js.Object {
  var column: js.UndefOr[this.type] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var displayValue: js.UndefOr[js.Any] = js.undefined
  var groupContinuedMessage: js.UndefOr[String] = js.undefined
  var groupContinuesMessage: js.UndefOr[String] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var summaryItems: js.UndefOr[js.Array[_]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GroupContinuedMessage {
  @scala.inline
  def apply(
    column: GroupContinuedMessage = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    component: dxDataGrid = null,
    data: js.Any = null,
    displayValue: js.Any = null,
    groupContinuedMessage: String = null,
    groupContinuesMessage: String = null,
    row: dxDataGridRowObject = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    summaryItems: js.Array[_] = null,
    text: String = null,
    value: js.Any = null
  ): GroupContinuedMessage = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (groupContinuedMessage != null) __obj.updateDynamic("groupContinuedMessage")(groupContinuedMessage.asInstanceOf[js.Any])
    if (groupContinuesMessage != null) __obj.updateDynamic("groupContinuesMessage")(groupContinuesMessage.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (summaryItems != null) __obj.updateDynamic("summaryItems")(summaryItems.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContinuedMessage]
  }
}

