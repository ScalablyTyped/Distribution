package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLevel
import typings.devextreme.AnonDisplayMode
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.FullStackedSplineAreaSeries */
trait dxChartSeriesTypesFullStackedSplineAreaSeries extends dxChartSeriesTypesCommonSeries {
  /** @name dxChartSeriesTypes.FullStackedSplineAreaSeries.aggregation */
  @JSName("aggregation")
  var aggregation_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesAggregation] = js.undefined
  /** @name dxChartSeriesTypes.FullStackedSplineAreaSeries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  /** @name dxChartSeriesTypes.FullStackedSplineAreaSeries.label */
  @JSName("label")
  var label_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesLabel] = js.undefined
  /** @name dxChartSeriesTypes.FullStackedSplineAreaSeries.point */
  @JSName("point")
  var point_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeriesPoint] = js.undefined
  /** @name dxChartSeriesTypes.FullStackedSplineAreaSeries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxChartSeriesTypesFullStackedSplineAreaSeries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}

object dxChartSeriesTypesFullStackedSplineAreaSeries {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesFullStackedSplineAreaSeriesAggregation = null,
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
    hoverMode: nearestPoint | includePoints | excludePoints | none = null,
    hoverStyle: dxChartSeriesTypesCommonSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesFullStackedSplineAreaSeriesLabel = null,
    lowValueField: String = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    openValueField: String = null,
    pane: String = null,
    point: dxChartSeriesTypesFullStackedSplineAreaSeriesPoint = null,
    rangeValue1Field: String = null,
    rangeValue2Field: String = null,
    reduction: AnonColorLevel = null,
    selectionMode: includePoints | excludePoints | none = null,
    selectionStyle: dxChartSeriesTypesCommonSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesFullStackedSplineAreaSeries = {
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
    __obj.asInstanceOf[dxChartSeriesTypesFullStackedSplineAreaSeries]
  }
}

