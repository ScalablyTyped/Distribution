package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.undefined
  var columns: js.UndefOr[js.Array[js.Object]] = js.undefined
  var escapedLabel: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hierarchy: js.UndefOr[Hierarchy] = js.undefined
  var isClassicTotalRow: js.UndefOr[Boolean] = js.undefined
  var isDrillThrough: js.UndefOr[Boolean] = js.undefined
  var isGrandTotal: js.UndefOr[Boolean] = js.undefined
  var isGrandTotalColumn: js.UndefOr[Boolean] = js.undefined
  var isGrandTotalRow: js.UndefOr[Boolean] = js.undefined
  var isTotal: js.UndefOr[Boolean] = js.undefined
  var isTotalColumn: js.UndefOr[Boolean] = js.undefined
  var isTotalRow: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var member: js.UndefOr[Member] = js.undefined
  var recordId: js.UndefOr[String | js.Array[String]] = js.undefined
  var rowData: js.UndefOr[js.Array[CellData]] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object CellData {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    columns: js.Array[js.Object] = null,
    escapedLabel: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hierarchy: Hierarchy = null,
    isClassicTotalRow: js.UndefOr[Boolean] = js.undefined,
    isDrillThrough: js.UndefOr[Boolean] = js.undefined,
    isGrandTotal: js.UndefOr[Boolean] = js.undefined,
    isGrandTotalColumn: js.UndefOr[Boolean] = js.undefined,
    isGrandTotalRow: js.UndefOr[Boolean] = js.undefined,
    isTotal: js.UndefOr[Boolean] = js.undefined,
    isTotalColumn: js.UndefOr[Boolean] = js.undefined,
    isTotalRow: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    level: js.UndefOr[Double] = js.undefined,
    measure: MeasureObject = null,
    member: Member = null,
    recordId: String | js.Array[String] = null,
    rowData: js.Array[CellData] = null,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rows: js.Array[js.Object] = null,
    `type`: String = null,
    value: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CellData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (escapedLabel != null) __obj.updateDynamic("escapedLabel")(escapedLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy.asInstanceOf[js.Any])
    if (!js.isUndefined(isClassicTotalRow)) __obj.updateDynamic("isClassicTotalRow")(isClassicTotalRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDrillThrough)) __obj.updateDynamic("isDrillThrough")(isDrillThrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGrandTotal)) __obj.updateDynamic("isGrandTotal")(isGrandTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGrandTotalColumn)) __obj.updateDynamic("isGrandTotalColumn")(isGrandTotalColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isGrandTotalRow)) __obj.updateDynamic("isGrandTotalRow")(isGrandTotalRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTotal)) __obj.updateDynamic("isTotal")(isTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTotalColumn)) __obj.updateDynamic("isTotalColumn")(isTotalColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTotalRow)) __obj.updateDynamic("isTotalRow")(isTotalRow.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (measure != null) __obj.updateDynamic("measure")(measure.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (recordId != null) __obj.updateDynamic("recordId")(recordId.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellData]
  }
}

