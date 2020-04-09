package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLevel
import typings.devextreme.AnonDisplayMode
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @name dxChartSeriesTypes.CommonSeries */
trait dxChartSeriesTypesCommonSeries extends js.Object {
  /** @name dxChartSeriesTypes.CommonSeries.aggregation */
  var aggregation: js.UndefOr[dxChartSeriesTypesCommonSeriesAggregation] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.argumentField */
  var argumentField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.axis */
  var axis: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.barOverlapGroup */
  var barOverlapGroup: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.barPadding */
  var barPadding: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.barWidth */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.border */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesBorder] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.closeValueField */
  var closeValueField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.cornerRadius */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.dashStyle */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.highValueField */
  var highValueField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverMode */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.hoverStyle */
  var hoverStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyle] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.ignoreEmptyPoints */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.innerColor */
  var innerColor: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.label */
  var label: js.UndefOr[dxChartSeriesTypesCommonSeriesLabel] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.lowValueField */
  var lowValueField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.maxLabelCount */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.minBarSize */
  var minBarSize: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.openValueField */
  var openValueField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.pane */
  var pane: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.point */
  var point: js.UndefOr[dxChartSeriesTypesCommonSeriesPoint] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.rangeValue1Field */
  var rangeValue1Field: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.rangeValue2Field */
  var rangeValue2Field: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.reduction */
  var reduction: js.UndefOr[AnonColorLevel] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionMode */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.selectionStyle */
  var selectionStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyle] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.showInLegend */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.sizeField */
  var sizeField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.stack */
  var stack: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.tagField */
  var tagField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.valueErrorBar */
  var valueErrorBar: js.UndefOr[AnonDisplayMode] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.valueField */
  var valueField: js.UndefOr[String] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxChartSeriesTypes.CommonSeries.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeries {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesCommonSeriesAggregation = null,
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
    hoverMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint = null,
    hoverStyle: dxChartSeriesTypesCommonSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesCommonSeriesLabel = null,
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
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: dxChartSeriesTypesCommonSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeries = {
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
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeries]
  }
}

