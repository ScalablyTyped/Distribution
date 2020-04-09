package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBorderColor
import typings.devextreme.AnonColorDashStyle
import typings.devextreme.AnonDisplayMode
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

trait PolarChartSeries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  /** @name PolarChartSeries.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name PolarChartSeries.tag */
  var tag: js.UndefOr[js.Any] = js.undefined
  /** @name PolarChartSeries.type */
  var `type`: js.UndefOr[area | bar | line | scatter | stackedbar] = js.undefined
}

object PolarChartSeries {
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
    name: String = null,
    opacity: Int | Double = null,
    point: dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = null,
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: AnonBorderColor = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    tag: js.Any = null,
    tagField: String = null,
    `type`: area | bar | line | scatter | stackedbar = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): PolarChartSeries = {
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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarChartSeries]
  }
}

