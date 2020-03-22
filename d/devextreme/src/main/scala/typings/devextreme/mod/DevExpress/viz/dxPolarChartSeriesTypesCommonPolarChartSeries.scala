package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBorderColor
import typings.devextreme.AnonColorDashStyle
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

trait dxPolarChartSeriesTypesCommonPolarChartSeries extends js.Object {
  /** Specifies the data source field that provides arguments for series points. */
  var argumentField: js.UndefOr[String] = js.undefined
  /** Controls the padding and consequently the angular width of all bars in a series using relative units. Ignored if the barWidth option is set. */
  var barPadding: js.UndefOr[Double] = js.undefined
  /** Specifies a fixed angular width for all bars in a series, measured in degrees. Takes precedence over the barPadding option. */
  var barWidth: js.UndefOr[Double] = js.undefined
  /** An object defining the series border configuration options. */
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  /** Specifies whether or not to close the chart by joining the end point with the first point. */
  var closed: js.UndefOr[Boolean] = js.undefined
  /** Specifies a series color. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the dash style of the series' line. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Specifies the series elements to highlight when a series is hovered over. */
  var hoverMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint
  ] = js.undefined
  /** An object defining configuration options for a hovered series. */
  var hoverStyle: js.UndefOr[AnonBorderColor] = js.undefined
  /** Specifies whether the series should ignore null data points. */
  var ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined
  /** An object defining the label configuration options. */
  var label: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel] = js.undefined
  /** Specifies how many points are acceptable to be in a series to display all labels for these points. Otherwise, the labels will not be displayed. */
  var maxLabelCount: js.UndefOr[Double] = js.undefined
  /** Specifies the minimal length of a displayed bar in pixels. */
  var minBarSize: js.UndefOr[Double] = js.undefined
  /** Specifies opacity for a series. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** An object defining configuration options for points in line and area series. */
  var point: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint] = js.undefined
  /** Specifies the series elements to highlight when the series is selected. */
  var selectionMode: js.UndefOr[
    allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint
  ] = js.undefined
  /** An object defining configuration options for a selected series. */
  var selectionStyle: js.UndefOr[AnonBorderColor] = js.undefined
  /** Specifies whether or not to show the series in the chart's legend. */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the stack where the values of the 'stackedBar' series must be located. */
  var stack: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source field that provides data about a point. */
  var tagField: js.UndefOr[String] = js.undefined
  /** Configures error bars. */
  var valueErrorBar: js.UndefOr[AnonDisplayMode] = js.undefined
  /** Specifies the data source field that provides values for series points. */
  var valueField: js.UndefOr[String] = js.undefined
  /** Specifies the visibility of a series. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies a line width. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxPolarChartSeriesTypesCommonPolarChartSeries {
  @scala.inline
  def apply(
    argumentField: String = null,
    barPadding: Int | Double = null,
    barWidth: Int | Double = null,
    border: AnonColorDashStyle = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hoverMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint = null,
    hoverStyle: AnonBorderColor = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    point: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = null,
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: AnonBorderColor = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartSeriesTypesCommonPolarChartSeries = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (barPadding != null) __obj.updateDynamic("barPadding")(barPadding.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minBarSize != null) __obj.updateDynamic("minBarSize")(minBarSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeries]
  }
}

