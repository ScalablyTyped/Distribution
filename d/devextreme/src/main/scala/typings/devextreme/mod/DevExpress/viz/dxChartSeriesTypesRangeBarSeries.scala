package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLevel
import typings.devextreme.AnonDisplayMode
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.RangeBarSeries */
trait dxChartSeriesTypesRangeBarSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.RangeBarSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesAggregation] = js.undefined
  /** @name dxChartSeriesTypes.RangeBarSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
  /** @name dxChartSeriesTypes.RangeBarSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesRangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeriesLabel] = js.undefined
  /** @name dxChartSeriesTypes.RangeBarSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesRangeBarSeries: js.UndefOr[onlyPoint | allSeriesPoints | allArgumentPoints | none] = js.undefined
}

object dxChartSeriesTypesRangeBarSeries {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesRangeBarSeriesAggregation = null,
    argumentField: String = null,
    axis: String = null,
    barOverlapGroup: String = null,
    barPadding: Int | Double = null,
    barWidth: Int | Double = null,
    border: dxChartSeriesTypesCommonSeriesBorder = null,
    closeValueField: String = null,
    color: String = null,
    cornerRadius: Int | Double = null,
    dashStyle: dash | dot | longDash | solid = null,
    highValueField: String = null,
    hoverMode: onlyPoint | allSeriesPoints | allArgumentPoints | none = null,
    hoverStyle: dxChartSeriesTypesCommonSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesRangeBarSeriesLabel = null,
    lowValueField: String = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    openValueField: String = null,
    pane: String = null,
    point: dxChartSeriesTypesCommonSeriesPoint = null,
    rangeValue1Field: String = null,
    rangeValue2Field: String = null,
    reduction: AnonColorLevel = null,
    selectionMode: onlyPoint | allSeriesPoints | allArgumentPoints | none = null,
    selectionStyle: dxChartSeriesTypesCommonSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesRangeBarSeries = {
    val __obj = js.Dynamic.literal()
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (barOverlapGroup != null) __obj.updateDynamic("barOverlapGroup")(barOverlapGroup.asInstanceOf[js.Any])
    if (barPadding != null) __obj.updateDynamic("barPadding")(barPadding.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (closeValueField != null) __obj.updateDynamic("closeValueField")(closeValueField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minBarSize != null) __obj.updateDynamic("minBarSize")(minBarSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openValueField != null) __obj.updateDynamic("openValueField")(openValueField.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (rangeValue1Field != null) __obj.updateDynamic("rangeValue1Field")(rangeValue1Field.asInstanceOf[js.Any])
    if (rangeValue2Field != null) __obj.updateDynamic("rangeValue2Field")(rangeValue2Field.asInstanceOf[js.Any])
    if (reduction != null) __obj.updateDynamic("reduction")(reduction.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesRangeBarSeries]
  }
}

