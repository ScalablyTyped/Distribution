package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChartOptions extends js.Object {
  var aggregationTarget: js.UndefOr[java.lang.String] = js.undefined
  var animation: js.UndefOr[TransitionAnimation] = js.undefined
  var annotations: js.UndefOr[ChartBarColumnAnnotations] = js.undefined
  var axisTitlesPosition: js.UndefOr[java.lang.String] = js.undefined
   // in, out, none
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var bar: js.UndefOr[GroupWidth] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dataOpacity: js.UndefOr[scala.Double] = js.undefined
  var enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined
  var focusTarget: js.UndefOr[java.lang.String] = js.undefined
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var hAxes: js.UndefOr[js.Any] = js.undefined
  var hAxis: js.UndefOr[ChartAxis] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var isStacked: js.UndefOr[
    scala.Boolean | googleDotVisualizationLib.googleDotVisualizationLibStrings.percent | googleDotVisualizationLib.googleDotVisualizationLibStrings.relative | googleDotVisualizationLib.googleDotVisualizationLibStrings.absolute
  ] = js.undefined
  var legend: js.UndefOr[ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none] = js.undefined
  var reverseCategories: js.UndefOr[scala.Boolean] = js.undefined
  var series: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titlePosition: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var vAxes: js.UndefOr[js.Any] = js.undefined
  var vAxis: js.UndefOr[ChartAxis] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object BarChartOptions {
  @scala.inline
  def apply(
    aggregationTarget: java.lang.String = null,
    animation: TransitionAnimation = null,
    annotations: ChartBarColumnAnnotations = null,
    axisTitlesPosition: java.lang.String = null,
    backgroundColor: js.Any = null,
    bar: GroupWidth = null,
    chartArea: ChartArea = null,
    colors: js.Array[java.lang.String] = null,
    dataOpacity: scala.Int | scala.Double = null,
    enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined,
    focusTarget: java.lang.String = null,
    fontName: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    hAxes: js.Any = null,
    hAxis: ChartAxis = null,
    height: scala.Int | scala.Double = null,
    isStacked: scala.Boolean | googleDotVisualizationLib.googleDotVisualizationLibStrings.percent | googleDotVisualizationLib.googleDotVisualizationLibStrings.relative | googleDotVisualizationLib.googleDotVisualizationLibStrings.absolute = null,
    legend: ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none = null,
    reverseCategories: js.UndefOr[scala.Boolean] = js.undefined,
    series: js.Any = null,
    theme: java.lang.String = null,
    title: java.lang.String = null,
    titlePosition: java.lang.String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    vAxes: js.Any = null,
    vAxis: ChartAxis = null,
    width: scala.Int | scala.Double = null
  ): BarChartOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationTarget != null) __obj.updateDynamic("aggregationTarget")(aggregationTarget)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (axisTitlesPosition != null) __obj.updateDynamic("axisTitlesPosition")(axisTitlesPosition)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (dataOpacity != null) __obj.updateDynamic("dataOpacity")(dataOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (focusTarget != null) __obj.updateDynamic("focusTarget")(focusTarget)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (hAxes != null) __obj.updateDynamic("hAxes")(hAxes)
    if (hAxis != null) __obj.updateDynamic("hAxis")(hAxis)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (isStacked != null) __obj.updateDynamic("isStacked")(isStacked.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories)
    if (series != null) __obj.updateDynamic("series")(series)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (vAxes != null) __obj.updateDynamic("vAxes")(vAxes)
    if (vAxis != null) __obj.updateDynamic("vAxis")(vAxis)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartOptions]
  }
}

