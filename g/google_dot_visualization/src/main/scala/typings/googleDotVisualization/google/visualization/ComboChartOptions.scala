package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  var areaOpacity: js.UndefOr[Double] = js.undefined
  var axisTitlesPosition: js.UndefOr[String] = js.undefined
   // in, out, none
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var bar: js.UndefOr[GroupWidth] = js.undefined
  var candlestick: js.UndefOr[Candlestick] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var crosshair: js.UndefOr[ChartCrosshair] = js.undefined
  var curveType: js.UndefOr[String] = js.undefined
  var dataOpacity: js.UndefOr[Double] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var focusTarget: js.UndefOr[String] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  var isStacked: js.UndefOr[Boolean] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var lineDashStyle: js.UndefOr[js.Array[Double]] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var pointShape: js.UndefOr[String] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  // single / multiple
  var series: js.UndefOr[js.Any] = js.undefined
  var seriesType: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var vAxes: js.UndefOr[js.Any] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ComboChartOptions {
  @scala.inline
  def apply(
    aggregationTarget: String = null,
    animation: TransitionAnimation = null,
    annotations: ChartAnnotations = null,
    areaOpacity: Int | Double = null,
    axisTitlesPosition: String = null,
    backgroundColor: js.Any = null,
    bar: GroupWidth = null,
    candlestick: Candlestick = null,
    chartArea: ChartArea = null,
    colors: js.Array[String] = null,
    crosshair: ChartCrosshair = null,
    curveType: String = null,
    dataOpacity: Int | Double = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    focusTarget: String = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    hAxis: ChartAxis = null,
    height: Int | Double = null,
    interpolateNulls: js.UndefOr[Boolean] = js.undefined,
    isStacked: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegend | none = null,
    lineDashStyle: js.Array[Double] = null,
    lineWidth: Int | Double = null,
    orientation: String = null,
    pointShape: String = null,
    pointSize: Int | Double = null,
    pointsVisible: js.UndefOr[Boolean] = js.undefined,
    reverseCategories: js.UndefOr[Boolean] = js.undefined,
    selectionMode: String = null,
    series: js.Any = null,
    seriesType: String = null,
    theme: String = null,
    title: String = null,
    titlePosition: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    vAxes: js.Any = null,
    vAxis: ChartAxis = null,
    width: Int | Double = null
  ): ComboChartOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationTarget != null) __obj.updateDynamic("aggregationTarget")(aggregationTarget)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair)
    if (curveType != null) __obj.updateDynamic("curveType")(curveType)
    if (dataOpacity != null) __obj.updateDynamic("dataOpacity")(dataOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (focusTarget != null) __obj.updateDynamic("focusTarget")(focusTarget)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls)
    if (!js.isUndefined(isStacked)) __obj.updateDynamic("isStacked")(isStacked)
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (lineDashStyle != null) __obj.updateDynamic("lineDashStyle")(lineDashStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (pointShape != null) __obj.updateDynamic("pointShape")(pointShape)
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsVisible)) __obj.updateDynamic("pointsVisible")(pointsVisible)
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (series != null) __obj.updateDynamic("series")(series)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (vAxes != null) __obj.updateDynamic("vAxes")(vAxes)
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboChartOptions]
  }
}

