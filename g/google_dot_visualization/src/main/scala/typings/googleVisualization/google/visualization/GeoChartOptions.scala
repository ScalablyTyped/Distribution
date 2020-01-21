package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  var colorAxis: js.UndefOr[ChartColorAxis] = js.undefined
  var datalessRegionColor: js.UndefOr[String] = js.undefined
  var defaultColor: js.UndefOr[String] = js.undefined
  var displayMode: js.UndefOr[String] = js.undefined
  var enableRegionInteractivity: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var magnifyingGlass: js.UndefOr[GeoChartMagnifyingGlass] = js.undefined
  var markerOpacity: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GeoChartOptions {
  @scala.inline
  def apply(
    backgroundColor: String | ChartStrokeFill = null,
    colorAxis: ChartColorAxis = null,
    datalessRegionColor: String = null,
    defaultColor: String = null,
    displayMode: String = null,
    enableRegionInteractivity: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    keepAspectRatio: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegend | none = null,
    magnifyingGlass: GeoChartMagnifyingGlass = null,
    markerOpacity: Int | Double = null,
    region: String = null,
    resolution: String = null,
    sizeAxis: ChartSizeAxis = null,
    tooltip: ChartTooltip = null,
    width: Int | Double = null
  ): GeoChartOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (datalessRegionColor != null) __obj.updateDynamic("datalessRegionColor")(datalessRegionColor.asInstanceOf[js.Any])
    if (defaultColor != null) __obj.updateDynamic("defaultColor")(defaultColor.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRegionInteractivity)) __obj.updateDynamic("enableRegionInteractivity")(enableRegionInteractivity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (magnifyingGlass != null) __obj.updateDynamic("magnifyingGlass")(magnifyingGlass.asInstanceOf[js.Any])
    if (markerOpacity != null) __obj.updateDynamic("markerOpacity")(markerOpacity.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (sizeAxis != null) __obj.updateDynamic("sizeAxis")(sizeAxis.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChartOptions]
  }
}

