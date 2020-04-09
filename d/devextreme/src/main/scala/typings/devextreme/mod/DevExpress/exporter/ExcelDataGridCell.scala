package typings.devextreme.mod.DevExpress.exporter

import typings.devextreme.AnonNameValue
import typings.devextreme.mod.DevExpress.ui.dxDataGridColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelDataGridCell extends js.Object {
  /** @name ExcelDataGridCell.column */
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  /** @name ExcelDataGridCell.data */
  var data: js.UndefOr[js.Any] = js.undefined
  /** @name ExcelDataGridCell.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** @name ExcelDataGridCell.groupSummaryItems */
  var groupSummaryItems: js.UndefOr[js.Array[AnonNameValue]] = js.undefined
  /** @name ExcelDataGridCell.rowType */
  var rowType: js.UndefOr[String] = js.undefined
  /** @name ExcelDataGridCell.totalSummaryItemName */
  var totalSummaryItemName: js.UndefOr[String] = js.undefined
  /** @name ExcelDataGridCell.value */
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

