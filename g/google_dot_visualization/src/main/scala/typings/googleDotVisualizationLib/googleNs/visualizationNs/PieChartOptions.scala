package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartOptions extends js.Object {
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
  var chartArea: js.UndefOr[ChartArea] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined
  var fontName: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var is3D: js.UndefOr[scala.Boolean] = js.undefined
  var legend: js.UndefOr[ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none] = js.undefined
  var pieHole: js.UndefOr[scala.Double] = js.undefined
  var pieResidueSliceColor: js.UndefOr[java.lang.String] = js.undefined
  var pieResidueSliceLabel: js.UndefOr[java.lang.String] = js.undefined
  var pieSliceBorderColor: js.UndefOr[java.lang.String] = js.undefined
  var pieSliceText: js.UndefOr[java.lang.String] = js.undefined
  var pieSliceTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var pieStartAngle: js.UndefOr[scala.Double] = js.undefined
  var reverseCategories: js.UndefOr[scala.Boolean] = js.undefined
  var sliceVisibilityThreshold: js.UndefOr[scala.Double] = js.undefined
  var slices: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PieChartOptions {
  @scala.inline
  def apply(
    backgroundColor: js.Any = null,
    chartArea: ChartArea = null,
    colors: js.Array[java.lang.String] = null,
    enableInteractivity: js.UndefOr[scala.Boolean] = js.undefined,
    fontName: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    is3D: js.UndefOr[scala.Boolean] = js.undefined,
    legend: ChartLegend | googleDotVisualizationLib.googleDotVisualizationLibStrings.none = null,
    pieHole: scala.Int | scala.Double = null,
    pieResidueSliceColor: java.lang.String = null,
    pieResidueSliceLabel: java.lang.String = null,
    pieSliceBorderColor: java.lang.String = null,
    pieSliceText: java.lang.String = null,
    pieSliceTextStyle: ChartTextStyle = null,
    pieStartAngle: scala.Int | scala.Double = null,
    reverseCategories: js.UndefOr[scala.Boolean] = js.undefined,
    sliceVisibilityThreshold: scala.Int | scala.Double = null,
    slices: js.Any = null,
    title: java.lang.String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    width: scala.Int | scala.Double = null
  ): PieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
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

