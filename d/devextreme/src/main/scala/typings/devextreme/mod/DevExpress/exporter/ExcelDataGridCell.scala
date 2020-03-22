package typings.devextreme.mod.DevExpress.exporter

import typings.devextreme.AnonNameValue
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelDataGridCell extends js.Object {
  /** The configuration of the cell's column. */
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  /** The data object of the cell's row. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** The group index of the cell's row. Available when the rowType is "group". */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** Information about group summary items the cell represents. */
  var groupSummaryItems: js.UndefOr[js.Array[AnonNameValue]] = js.undefined
  /** The type of the cell's row. */
  var rowType: js.UndefOr[String] = js.undefined
  /** The identifier of the total summary item that the cell represents. */
  var totalSummaryItemName: js.UndefOr[String] = js.undefined
  /** The cell's raw value. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ExcelDataGridCell {
  @scala.inline
  def apply(
    column: dxDataGridColumn = null,
    data: js.Any = null,
    groupIndex: Int | Double = null,
    groupSummaryItems: js.Array[AnonNameValue] = null,
    rowType: String = null,
    totalSummaryItemName: String = null,
    value: js.Any = null
  ): ExcelDataGridCell = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupSummaryItems != null) __obj.updateDynamic("groupSummaryItems")(groupSummaryItems.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (totalSummaryItemName != null) __obj.updateDynamic("totalSummaryItemName")(totalSummaryItemName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelDataGridCell]
  }
}

