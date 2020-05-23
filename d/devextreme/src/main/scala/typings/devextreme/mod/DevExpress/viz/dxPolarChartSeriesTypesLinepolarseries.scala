package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BorderColor
import typings.devextreme.anon.ColorDashStyle
import typings.devextreme.anon.DisplayMode
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

trait dxPolarChartSeriesTypesLinepolarseries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** @name dxPolarChartSeriesTypes.linepolarseries.hoverMode */
  @JSName("hoverMode")
  var hoverMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[nearestPoint | includePoints | excludePoints | none] = js.undefined
  /** @name dxPolarChartSeriesTypes.linepolarseries.selectionMode */
  @JSName("selectionMode")
  var selectionMode_dxPolarChartSeriesTypesLinepolarseries: js.UndefOr[includePoints | excludePoints | none] = js.undefined
}

object dxPolarChartSeriesTypesLinepolarseries {
  @scala.inline
  def apply(
    argumentField: String = null,
    barPadding: js.UndefOr[Double] = js.undefined,
    barWidth: js.UndefOr[Double] = js.undefined,
    border: ColorDashStyle = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    hoverMode: nearestPoint | includePoints | excludePoints | none = null,
    hoverStyle: BorderColor = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = null,
    maxLabelCount: js.UndefOr[Double] = js.undefined,
    minBarSize: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    point: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = null,
    selectionMode: includePoints | excludePoints | none = null,
    selectionStyle: BorderColor = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    tagField: String = null,
    valueErrorBar: DisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartSeriesTypesLinepolarseries = {
    val __obj = js.Dynamic.literal()
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
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
    if (!js.isUndefined(maxLabelCount)) __obj.updateDynamic("maxLabelCount")(maxLabelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBarSize)) __obj.updateDynamic("minBarSize")(minBarSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesLinepolarseries]
  }
}

