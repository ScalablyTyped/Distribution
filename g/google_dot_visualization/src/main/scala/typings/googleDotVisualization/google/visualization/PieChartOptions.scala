package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var enableInteractivity: js.UndefOr[Boolean] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var is3D: js.UndefOr[Boolean] = js.undefined
  var legend: js.UndefOr[ChartLegend | none] = js.undefined
  var pieHole: js.UndefOr[Double] = js.undefined
  var pieResidueSliceColor: js.UndefOr[String] = js.undefined
  var pieResidueSliceLabel: js.UndefOr[String] = js.undefined
  var pieSliceBorderColor: js.UndefOr[String] = js.undefined
  var pieSliceText: js.UndefOr[String] = js.undefined
  var pieSliceTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var pieStartAngle: js.UndefOr[Double] = js.undefined
  var reverseCategories: js.UndefOr[Boolean] = js.undefined
  var sliceVisibilityThreshold: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PieChartOptions {
  @scala.inline
  def apply(
    backgroundColor: String | ChartStrokeFill = null,
    chartArea: ChartArea = null,
    colors: js.Array[String] = null,
    enableInteractivity: js.UndefOr[Boolean] = js.undefined,
    fontName: String = null,
    fontSize: Int | Double = null,
    height: Int | Double = null,
    is3D: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegend | none = null,
    pieHole: Int | Double = null,
    pieResidueSliceColor: String = null,
    pieResidueSliceLabel: String = null,
    pieSliceBorderColor: String = null,
    pieSliceText: String = null,
    pieSliceTextStyle: ChartTextStyle = null,
    pieStartAngle: Int | Double = null,
    reverseCategories: js.UndefOr[Boolean] = js.undefined,
    sliceVisibilityThreshold: Int | Double = null,
    slices: js.Any = null,
    title: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    width: Int | Double = null
  ): PieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(is3D)) __obj.updateDynamic("is3D")(is3D)
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (pieHole != null) __obj.updateDynamic("pieHole")(pieHole.asInstanceOf[js.Any])
    if (pieResidueSliceColor != null) __obj.updateDynamic("pieResidueSliceColor")(pieResidueSliceColor)
    if (pieResidueSliceLabel != null) __obj.updateDynamic("pieResidueSliceLabel")(pieResidueSliceLabel)
    if (pieSliceBorderColor != null) __obj.updateDynamic("pieSliceBorderColor")(pieSliceBorderColor)
    if (pieSliceText != null) __obj.updateDynamic("pieSliceText")(pieSliceText)
    if (pieSliceTextStyle != null) __obj.updateDynamic("pieSliceTextStyle")(pieSliceTextStyle)
    if (pieStartAngle != null) __obj.updateDynamic("pieStartAngle")(pieStartAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories)
    if (sliceVisibilityThreshold != null) __obj.updateDynamic("sliceVisibilityThreshold")(sliceVisibilityThreshold.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartOptions]
  }
}

