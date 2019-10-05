package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandlestickChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var axisTitlesPosition: js.UndefOr[String] = js.undefined
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var bar: js.UndefOr[GroupWidth] = js.undefined
  var candlestick: js.UndefOr[Candlestick] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var focusTarget: js.UndefOr[String] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  // single / multiple
  var series: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePosition: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var vAxes: js.UndefOr[js.Any] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CandlestickChartOptions {
  @scala.inline
  def apply(
    aggregationTarget: String = null,
    animation: TransitionAnimation = null,
    axisTitlesPosition: String = null,
    backgroundColor: js.Any = null,
    bar: GroupWidth = null,
    candlestick: Candlestick = null,
    chartArea: ChartArea = null,
    colors: js.Array[String] = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    focusTarget: String = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    hAxis: ChartAxis = null,
    height: Int | Double = null,
    legend: ChartLegend | none = null,
    orientation: String = null,
    reverseCategories: js.UndefOr[Boolean] = js.undefined,
    selectionMode: String = null,
    series: js.Any = null,
    theme: String = null,
    title: String = null,
    titlePosition: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    vAxes: js.Any = null,
    vAxis: ChartAxis = null,
    width: Int | Double = null
  ): CandlestickChartOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationTarget != null) __obj.updateDynamic("aggregationTarget")(aggregationTarget)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (focusTarget != null) __obj.updateDynamic("focusTarget")(focusTarget)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (series != null) __obj.updateDynamic("series")(series)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (vAxes != null) __obj.updateDynamic("vAxes")(vAxes)
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandlestickChartOptions]
  }
}

