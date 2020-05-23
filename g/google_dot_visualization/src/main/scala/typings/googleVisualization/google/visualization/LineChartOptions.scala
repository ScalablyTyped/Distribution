package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.NumberDictionary
import typings.googleVisualization.anon.Style
import typings.googleVisualization.anon.Type
import typings.googleVisualization.googleVisualizationStrings.function
import typings.googleVisualization.googleVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var annotations: js.UndefOr[ChartAnnotations] = js.undefined
  var axisTitlesPosition: js.UndefOr[ChartAxisTitlesPosition] = js.undefined
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var crosshair: js.UndefOr[ChartCrosshair] = js.undefined
  var curveType: js.UndefOr[none | function] = js.undefined
  var dataOpacity: js.UndefOr[Double] = js.undefined
  var domainAxis: js.UndefOr[Type] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var explorer: js.UndefOr[ChartExplorer] = js.undefined
  var focusTarget: js.UndefOr[String] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[js.Any] = js.undefined
  var intervals: js.UndefOr[Style] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[ChartOrientation] = js.undefined
  var pointShape: js.UndefOr[ChartPointShape] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  var selectionMode: js.UndefOr[ChartSelectionMode] = js.undefined
  var series: js.UndefOr[js.Array[LineChartSeriesOptions] | NumberDictionary[LineChartSeriesOptions]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var trendlines: js.UndefOr[NumberDictionary[ChartTrendlineOptions]] = js.undefined
  var vAxes: js.UndefOr[js.Any] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LineChartOptions {
  @scala.inline
  def apply(
    aggregationTarget: String = null,
    animation: TransitionAnimation = null,
    annotations: ChartAnnotations = null,
    axisTitlesPosition: ChartAxisTitlesPosition = null,
    backgroundColor: String | ChartStrokeFill = null,
    chartArea: ChartArea = null,
    colors: js.Array[String] = null,
    crosshair: ChartCrosshair = null,
    curveType: none | function = null,
    dataOpacity: js.UndefOr[Double] = js.undefined,
    domainAxis: Type = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    explorer: ChartExplorer = null,
    focusTarget: String = null,
    fontName: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    hAxis: ChartAxis = null,
    height: js.UndefOr[Double] = js.undefined,
    interpolateNulls: js.UndefOr[Boolean] = js.undefined,
    interval: js.Any = null,
    intervals: Style = null,
    legend: ChartLegend | none = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orientation: ChartOrientation = null,
    pointShape: ChartPointShape = null,
    pointSize: js.UndefOr[Double] = js.undefined,
    pointsVisible: js.UndefOr[Boolean] = js.undefined,
    reverseCategories: js.UndefOr[Boolean] = js.undefined,
    selectionMode: ChartSelectionMode = null,
    series: js.Array[LineChartSeriesOptions] | NumberDictionary[LineChartSeriesOptions] = null,
    theme: String = null,
    title: String = null,
    titlePosition: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    trendlines: NumberDictionary[ChartTrendlineOptions] = null,
    vAxes: js.Any = null,
    vAxis: ChartAxis = null,
    width: js.UndefOr[Double] = js.undefined
  ): LineChartOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationTarget != null) __obj.updateDynamic("aggregationTarget")(aggregationTarget.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshair != null) __obj.updateDynamic("crosshair")(crosshair.asInstanceOf[js.Any])
    if (curveType != null) __obj.updateDynamic("curveType")(curveType.asInstanceOf[js.Any])
    if (!js.isUndefined(dataOpacity)) __obj.updateDynamic("dataOpacity")(dataOpacity.get.asInstanceOf[js.Any])
    if (domainAxis != null) __obj.updateDynamic("domainAxis")(domainAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity.get.asInstanceOf[js.Any])
    if (explorer != null) __obj.updateDynamic("explorer")(explorer.asInstanceOf[js.Any])
    if (focusTarget != null) __obj.updateDynamic("focusTarget")(focusTarget.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervals != null) __obj.updateDynamic("intervals")(intervals.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pointShape != null) __obj.updateDynamic("pointShape")(pointShape.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsVisible)) __obj.updateDynamic("pointsVisible")(pointsVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories.get.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trendlines != null) __obj.updateDynamic("trendlines")(trendlines.asInstanceOf[js.Any])
    if (vAxes != null) __obj.updateDynamic("vAxes")(vAxes.asInstanceOf[js.Any])
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineChartOptions]
  }
}

