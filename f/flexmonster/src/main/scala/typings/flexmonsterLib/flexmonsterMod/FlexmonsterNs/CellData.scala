package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellData extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var columns: js.UndefOr[js.Array[js.Object]] = js.undefined
  var escapedLabel: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hierarchy: js.UndefOr[Hierarchy] = js.undefined
  var isClassicTotalRow: js.UndefOr[scala.Boolean] = js.undefined
  var isDrillThrough: js.UndefOr[scala.Boolean] = js.undefined
  var isGrandTotal: js.UndefOr[scala.Boolean] = js.undefined
  var isGrandTotalColumn: js.UndefOr[scala.Boolean] = js.undefined
  var isGrandTotalRow: js.UndefOr[scala.Boolean] = js.undefined
  var isTotal: js.UndefOr[scala.Boolean] = js.undefined
  var isTotalColumn: js.UndefOr[scala.Boolean] = js.undefined
  var isTotalRow: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var measure: js.UndefOr[MeasureObject] = js.undefined
  var member: js.UndefOr[Member] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object CellData {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columns: js.Array[js.Object] = null,
    escapedLabel: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hierarchy: Hierarchy = null,
    isClassicTotalRow: js.UndefOr[scala.Boolean] = js.undefined,
    isDrillThrough: js.UndefOr[scala.Boolean] = js.undefined,
    isGrandTotal: js.UndefOr[scala.Boolean] = js.undefined,
    isGrandTotalColumn: js.UndefOr[scala.Boolean] = js.undefined,
    isGrandTotalRow: js.UndefOr[scala.Boolean] = js.undefined,
    isTotal: js.UndefOr[scala.Boolean] = js.undefined,
    isTotalColumn: js.UndefOr[scala.Boolean] = js.undefined,
    isTotalRow: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    measure: MeasureObject = null,
    member: Member = null,
    rowIndex: scala.Int | scala.Double = null,
    rows: js.Array[js.Object] = null,
    `type`: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): CellData = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (escapedLabel != null) __obj.updateDynamic("escapedLabel")(escapedLabel)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hierarchy != null) __obj.updateDynamic("hierarchy")(hierarchy)
    if (!js.isUndefined(isClassicTotalRow)) __obj.updateDynamic("isClassicTotalRow")(isClassicTotalRow)
    if (!js.isUndefined(isDrillThrough)) __obj.updateDynamic("isDrillThrough")(isDrillThrough)
    if (!js.isUndefined(isGrandTotal)) __obj.updateDynamic("isGrandTotal")(isGrandTotal)
    if (!js.isUndefined(isGrandTotalColumn)) __obj.updateDynamic("isGrandTotalColumn")(isGrandTotalColumn)
    if (!js.isUndefined(isGrandTotalRow)) __obj.updateDynamic("isGrandTotalRow")(isGrandTotalRow)
    if (!js.isUndefined(isTotal)) __obj.updateDynamic("isTotal")(isTotal)
    if (!js.isUndefined(isTotalColumn)) __obj.updateDynamic("isTotalColumn")(isTotalColumn)
    if (!js.isUndefined(isTotalRow)) __obj.updateDynamic("isTotalRow")(isTotalRow)
    if (label != null) __obj.updateDynamic("label")(label)
    if (measure != null) __obj.updateDynamic("measure")(measure)
    if (member != null) __obj.updateDynamic("member")(member)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellData]
  }
}

