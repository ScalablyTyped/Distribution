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

/** An object that defines configuration options for chart series. */
trait dxChartSeriesTypesCommonSeries extends js.Object {
  /** Configures data aggregation for the series. */
  var aggregation: js.UndefOr[dxChartSeriesTypesCommonSeriesAggregation] = js.undefined
  /** Specifies which data source field provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Binds the series to a value axis. */
  var axis: js.UndefOr[String] = js.undefined
  /** Allows you to group bar series so that bars with the same argument overlap. */
  var barOverlapGroup: js.UndefOr[String] = js.undefined
  /** Controls the padding and consequently the width of all bars in a series using relative units. Ignored if the barWidth option is set. */
  var barPadding: js.UndefOr[Double] = js.undefined
  /** Specifies a fixed width for all bars in a series, measured in pixels. Takes precedence over the barPadding option. */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesBorder] = js.undefined
  /** Specifies which data source field provides close values for points of a financial series. */
  var closeValueField: js.UndefOr[String] = js.undefined
  /** Specifies the color of the series. */
  var color: js.UndefOr[String] = js.undefined
  /** Makes bars look rounded. Applies only to bar-like series. */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /** Specifies the dash style of the series line. Applies only to line-like series. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Specifies which data source field provides high values for points of a financial series. */
  var highValueField: js.UndefOr[String] = js.undefined
  /** Specifies series elements to be highlighted when a user points to a series. */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.undefined
  /** Configures the appearance adopted by the series when a user points to it. */
  var hoverStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyle] = js.undefined
  /** Specifies whether the series should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** Specifies a filling color for the body of a series point that visualizes a non-reduced value. Applies only to candlestick series. */
  var innerColor: js.UndefOr[String] = js.undefined
  /** Configures point labels. */
  var label: js.UndefOr[dxChartSeriesTypesCommonSeriesLabel] = js.undefined
  /** Specifies which data source field provides low values for points of a financial series. */
  var lowValueField: js.UndefOr[String] = js.undefined
  /** Specifies a limit for the number of point labels. */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  /** Specifies the minimal possible height (or length if the chart is rotated) of a bar in pixels. Applies only to bar-like series. */
  var minBarSize: js.UndefOr[Double] = js.undefined
  /** Specifies how transparent the series should be. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies which data source field provides open values for points of a financial series. */
  var openValueField: js.UndefOr[String] = js.undefined
  /** Specifies which pane the series should belong to. Accepts the name of the pane. */
  var pane: js.UndefOr[String] = js.undefined
  /** Configures series points in scatter, line- and area-like series. */
  var point: js.UndefOr[dxChartSeriesTypesCommonSeriesPoint] = js.undefined
  /** Coupled with the rangeValue2Field option, specifies which data source field provides values for a range-like series. */
  var rangeValue1Field: js.UndefOr[String] = js.undefined
  /** Coupled with the rangeValue1Field option, specifies which data source field provides values for a range-like series. */
  var rangeValue2Field: js.UndefOr[String] = js.undefined
  /** Specifies reduction options for financial series. */
  var reduction: js.UndefOr[AnonColorLevel] = js.undefined
  /** Specifies series elements to be highlighted when a user selects a series. */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.undefined
  /** Configures the appearance adopted by the series when a user selects it. */
  var selectionStyle: js.UndefOr[dxChartSeriesTypesCommonSeriesSelectionStyle] = js.undefined
  /** Specifies whether to show the series in the legend or not. */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /** Specifies which data source field provides size values for bubbles. Required by and applies only to bubble series. */
  var sizeField: js.UndefOr[String] = js.undefined
  /** Specifies which stack the series should belongs to. Applies only to stacked bar and full-stacked bar series. */
  var stack: js.UndefOr[String] = js.undefined
  /** Specifies which data source field provides auxiliary data for series points. */
  var tagField: js.UndefOr[String] = js.undefined
  /** Configures error bars. */
  var valueErrorBar: js.UndefOr[AnonDisplayMode] = js.undefined
  /** Specifies which data source field provides values for series points. */
  var valueField: js.UndefOr[String] = js.undefined
  /** Specifies whether the series is visible or not. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the series line in pixels. Applies only to line-like series. */
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

