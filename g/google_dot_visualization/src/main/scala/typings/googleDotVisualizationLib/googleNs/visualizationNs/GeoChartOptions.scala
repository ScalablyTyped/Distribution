package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var colorAxis: js.UndefOr[ChartColorAxis] = js.undefined
  var datalessRegionColor: js.UndefOr[java.lang.String] = js.undefined
  var defaultColor: js.UndefOr[java.lang.String] = js.undefined
  var displayMode: js.UndefOr[java.lang.String] = js.undefined
  var enableRegionInteractivity: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var keepAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var legend: js.UndefOr[ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none] = js.undefined
  var magnifyingGlass: js.UndefOr[GeoChartMagnifyingGlass] = js.undefined
  var markerOpacity: js.UndefOr[scala.Double] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var resolution: js.UndefOr[java.lang.String] = js.undefined
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GeoChartOptions {
  @scala.inline
  def apply(
    backgroundColor: js.Any = null,
    colorAxis: ChartColorAxis = null,
    datalessRegionColor: java.lang.String = null,
    defaultColor: java.lang.String = null,
    displayMode: java.lang.String = null,
    enableRegionInteractivity: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    keepAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    legend: ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none = null,
    magnifyingGlass: GeoChartMagnifyingGlass = null,
    markerOpacity: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    resolution: java.lang.String = null,
    sizeAxis: ChartSizeAxis = null,
    tooltip: ChartTooltip = null,
    width: scala.Int | scala.Double = null
  ): GeoChartOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis)
    if (datalessRegionColor != null) __obj.updateDynamic("datalessRegionColor")(datalessRegionColor)
    if (defaultColor != null) __obj.updateDynamic("defaultColor")(defaultColor)
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode)
    if (!js.isUndefined(enableRegionInteractivity)) __obj.updateDynamic("enableRegionInteractivity")(enableRegionInteractivity)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (magnifyingGlass != null) __obj.updateDynamic("magnifyingGlass")(magnifyingGlass)
    if (markerOpacity != null) __obj.updateDynamic("markerOpacity")(markerOpacity.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    if (sizeAxis != null) __obj.updateDynamic("sizeAxis")(sizeAxis)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartOptions]
  }
}

