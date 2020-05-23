package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.none
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
    fontSize: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    is3D: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegend | none = null,
    pieHole: js.UndefOr[Double] = js.undefined,
    pieResidueSliceColor: String = null,
    pieResidueSliceLabel: String = null,
    pieSliceBorderColor: String = null,
    pieSliceText: String = null,
    pieSliceTextStyle: ChartTextStyle = null,
    pieStartAngle: js.UndefOr[Double] = js.undefined,
    reverseCategories: js.UndefOr[Boolean] = js.undefined,
    sliceVisibilityThreshold: js.UndefOr[Double] = js.undefined,
    slices: js.Any = null,
    title: String = null,
    titleTextStyle: ChartTextStyle = null,
    tooltip: ChartTooltip = null,
    width: js.UndefOr[Double] = js.undefined
  ): PieChartOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableInteractivity)) __obj.updateDynamic("enableInteractivity")(enableInteractivity.get.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is3D)) __obj.updateDynamic("is3D")(is3D.get.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(pieHole)) __obj.updateDynamic("pieHole")(pieHole.get.asInstanceOf[js.Any])
    if (pieResidueSliceColor != null) __obj.updateDynamic("pieResidueSliceColor")(pieResidueSliceColor.asInstanceOf[js.Any])
    if (pieResidueSliceLabel != null) __obj.updateDynamic("pieResidueSliceLabel")(pieResidueSliceLabel.asInstanceOf[js.Any])
    if (pieSliceBorderColor != null) __obj.updateDynamic("pieSliceBorderColor")(pieSliceBorderColor.asInstanceOf[js.Any])
    if (pieSliceText != null) __obj.updateDynamic("pieSliceText")(pieSliceText.asInstanceOf[js.Any])
    if (pieSliceTextStyle != null) __obj.updateDynamic("pieSliceTextStyle")(pieSliceTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pieStartAngle)) __obj.updateDynamic("pieStartAngle")(pieStartAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseCategories)) __obj.updateDynamic("reverseCategories")(reverseCategories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliceVisibilityThreshold)) __obj.updateDynamic("sliceVisibilityThreshold")(sliceVisibilityThreshold.get.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartOptions]
  }
}

