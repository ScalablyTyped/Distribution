package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.newRow
import typings.googleVisualization.googleVisualizationStrings.sameRow
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationChartOptions extends js.Object {
  var allValuesSuffix: js.UndefOr[String] = js.undefined
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var annotationsWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var displayAnnotations: js.UndefOr[Boolean] = js.undefined
  var displayAnnotationsFilter: js.UndefOr[Boolean] = js.undefined
  var displayDateBarSeparator: js.UndefOr[Boolean] = js.undefined
  var displayExactValues: js.UndefOr[Boolean] = js.undefined
  var displayLegendDots: js.UndefOr[Boolean] = js.undefined
  var displayLegendValues: js.UndefOr[Boolean] = js.undefined
  var displayRangeSelector: js.UndefOr[Boolean] = js.undefined
  var displayZoomButtons: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[sameRow | newRow] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var numberFormats: js.UndefOr[js.Any] = js.undefined
  var scaleColumns: js.UndefOr[js.Array[Double]] = js.undefined
  var scaleFormat: js.UndefOr[String] = js.undefined
  var scaleType: js.UndefOr[String] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var zoomEndTime: js.UndefOr[Date] = js.undefined
  var zoomStartTime: js.UndefOr[Date] = js.undefined
}

object AnnotationChartOptions {
  @scala.inline
  def apply(
    allValuesSuffix: String = null,
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    annotationsWidth: js.UndefOr[Double] = js.undefined,
    colors: js.Array[String] = null,
    dateFormat: String = null,
    displayAnnotations: js.UndefOr[Boolean] = js.undefined,
    displayAnnotationsFilter: js.UndefOr[Boolean] = js.undefined,
    displayDateBarSeparator: js.UndefOr[Boolean] = js.undefined,
    displayExactValues: js.UndefOr[Boolean] = js.undefined,
    displayLegendDots: js.UndefOr[Boolean] = js.undefined,
    displayLegendValues: js.UndefOr[Boolean] = js.undefined,
    displayRangeSelector: js.UndefOr[Boolean] = js.undefined,
    displayZoomButtons: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Double] = js.undefined,
    legendPosition: sameRow | newRow = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    numberFormats: js.Any = null,
    scaleColumns: js.Array[Double] = null,
    scaleFormat: String = null,
    scaleType: String = null,
    thickness: js.UndefOr[Double] = js.undefined,
    zoomEndTime: Date = null,
    zoomStartTime: Date = null
  ): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    if (allValuesSuffix != null) __obj.updateDynamic("allValuesSuffix")(allValuesSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(annotationsWidth)) __obj.updateDynamic("annotationsWidth")(annotationsWidth.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAnnotations)) __obj.updateDynamic("displayAnnotations")(displayAnnotations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAnnotationsFilter)) __obj.updateDynamic("displayAnnotationsFilter")(displayAnnotationsFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDateBarSeparator)) __obj.updateDynamic("displayDateBarSeparator")(displayDateBarSeparator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayExactValues)) __obj.updateDynamic("displayExactValues")(displayExactValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegendDots)) __obj.updateDynamic("displayLegendDots")(displayLegendDots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLegendValues)) __obj.updateDynamic("displayLegendValues")(displayLegendValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRangeSelector)) __obj.updateDynamic("displayRangeSelector")(displayRangeSelector.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayZoomButtons)) __obj.updateDynamic("displayZoomButtons")(displayZoomButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (scaleColumns != null) __obj.updateDynamic("scaleColumns")(scaleColumns.asInstanceOf[js.Any])
    if (scaleFormat != null) __obj.updateDynamic("scaleFormat")(scaleFormat.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (zoomEndTime != null) __obj.updateDynamic("zoomEndTime")(zoomEndTime.asInstanceOf[js.Any])
    if (zoomStartTime != null) __obj.updateDynamic("zoomStartTime")(zoomStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationChartOptions]
  }
}

