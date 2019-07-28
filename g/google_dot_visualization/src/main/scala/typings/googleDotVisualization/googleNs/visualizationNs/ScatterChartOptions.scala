package typings.googleDotVisualization.googleNs.visualizationNs

import typings.googleDotVisualization.googleDotVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  var axisTitlesPosition: js.UndefOr[String] = js.undefined
   // in, out, none
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var crosshair: js.UndefOr[ChartCrosshair] = js.undefined
  var curveType: js.UndefOr[String] = js.undefined
  var dataOpacity: js.UndefOr[Double] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var explorer: js.UndefOr[ChartExplorer] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ScatterChartOptions {
  @scala.inline
  def apply(
    aggregationTarget: String = null,
    animation: TransitionAnimation = null,
    annotations: ChartAnnotations = null,
    axisTitlesPosition: String = null,
    backgroundColor: js.Any = null,
    chartArea: ChartArea = null,
    colors: js.Array[String] = null,
    crosshair: ChartCrosshair = null,
    curveType: String = null,
    dataOpacity: Int | Double = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    explorer: ChartExplorer = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    hAxis: ChartAxis = null,
    height: Int | Double = null,
    legend: ChartLegend | none = null,
    lineWidth: Int | Double = null,
    pointSize: Int | Double = null,
    selectionMode: String = null,
    series: js.Any = null,
    theme: String = null,
    title: String = null,
    titlePosition: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    vAxis: ChartAxis = null,
    width: Int | Double = null
  ): ScatterChartOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationTarget != null) __obj.updateDynamic("aggregationTarget")(aggregationTarget)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (curveType != null) __obj.updateDynamic("curveType")(curveType)
    if (dataOpacity != null) __obj.updateDynamic("dataOpacity")(dataOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (explorer != null) __obj.updateDynamic("explorer")(explorer)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (series != null) __obj.updateDynamic("series")(series)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterChartOptions]
  }
}

