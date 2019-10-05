package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleChartOptions extends js.Object {
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var axisTitlesPosition: js.UndefOr[String] = js.undefined
   // in, out, none
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var bubble: js.UndefOr[ChartBubble] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colorAxis: js.UndefOr[ChartColorAxis] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var explorer: js.UndefOr[ChartExplorer] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var sizeAxis: js.UndefOr[ChartSizeAxis] = js.undefined
  var sortBubblesBySize: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BubbleChartOptions {
  @scala.inline
  def apply(
    animation: TransitionAnimation = null,
    axisTitlesPosition: String = null,
    backgroundColor: js.Any = null,
    bubble: ChartBubble = null,
    chartArea: ChartArea = null,
    colorAxis: ChartColorAxis = null,
    colors: js.Array[String] = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    explorer: ChartExplorer = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    hAxis: ChartAxis = null,
    height: Int | Double = null,
    legend: ChartLegend | none = null,
    selectionMode: String = null,
    series: js.Any = null,
    sizeAxis: ChartSizeAxis = null,
    sortBubblesBySize: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    title: String = null,
    titlePosition: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    vAxis: ChartAxis = null,
    width: Int | Double = null
  ): BubbleChartOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bubble != null) __obj.updateDynamic("bubble")(bubble)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (explorer != null) __obj.updateDynamic("explorer")(explorer)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (series != null) __obj.updateDynamic("series")(series)
    if (sizeAxis != null) __obj.updateDynamic("sizeAxis")(sizeAxis)
    if (!js.isUndefined(sortBubblesBySize)) __obj.updateDynamic("sortBubblesBySize")(sortBubblesBySize)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleChartOptions]
  }
}

