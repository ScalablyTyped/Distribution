package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BorderColor
import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.DisplayMode
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.scatter
import typings.devextreme.devextremeStrings.solid
import typings.devextreme.devextremeStrings.stackedbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonSeriesSettings extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** @name dxPolarChart.Options.commonSeriesSettings.area */
  var area: js.UndefOr[js.Any] = js.undefined
  /** @name dxPolarChart.Options.commonSeriesSettings.bar */
  var bar: js.UndefOr[js.Any] = js.undefined
  /** @name dxPolarChart.Options.commonSeriesSettings.line */
  var line: js.UndefOr[js.Any] = js.undefined
  /** @name dxPolarChart.Options.commonSeriesSettings.scatter */
  var scatter: js.UndefOr[js.Any] = js.undefined
  /** @name dxPolarChart.Options.commonSeriesSettings.stackedbar */
  var stackedbar: js.UndefOr[js.Any] = js.undefined
  /** @name dxPolarChart.Options.commonSeriesSettings.type */
  var `type`: js.UndefOr[area | bar | line | scatter | stackedbar] = js.undefined
}

object dxPolarChartCommonSeriesSettings {
  @scala.inline
  def apply(
    area: js.Any = null,
    argumentField: String = null,
    bar: js.Any = null,
    barPadding: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    border: ColorDashStyle = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hoverMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint = null,
    hoverStyle: BorderColor = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = null,
    line: js.Any = null,
    maxLabelCount: js.UndefOr[Double] = js.undefined,
    minBarSize: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    point: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = null,
    scatter: js.Any = null,
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: BorderColor = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    stackedbar: js.Any = null,
    tagField: String = null,
    `type`: area | bar | line | scatter | stackedbar = null,
    valueErrorBar: DisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (!js.isUndefined(barPadding)) __obj.updateDynamic("barPadding")(barPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLabelCount)) __obj.updateDynamic("maxLabelCount")(maxLabelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBarSize)) __obj.updateDynamic("minBarSize")(minBarSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stackedbar != null) __obj.updateDynamic("stackedbar")(stackedbar.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonSeriesSettings]
  }
}

