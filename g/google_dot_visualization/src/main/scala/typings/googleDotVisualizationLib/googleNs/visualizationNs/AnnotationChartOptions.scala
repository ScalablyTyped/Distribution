package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationChartOptions extends js.Object {
  var allValuesSuffix: js.UndefOr[java.lang.String] = js.undefined
  var allowHtml: js.UndefOr[scala.Boolean] = js.undefined
  var annotationsWidth: js.UndefOr[scala.Double] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var displayAnnotations: js.UndefOr[scala.Boolean] = js.undefined
  var displayAnnotationsFilter: js.UndefOr[scala.Boolean] = js.undefined
  var displayDateBarSeparator: js.UndefOr[scala.Boolean] = js.undefined
  var displayExactValues: js.UndefOr[scala.Boolean] = js.undefined
  var displayLegendDots: js.UndefOr[scala.Boolean] = js.undefined
  var displayLegendValues: js.UndefOr[scala.Boolean] = js.undefined
  var displayRangeSelector: js.UndefOr[scala.Boolean] = js.undefined
  var displayZoomButtons: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[scala.Double] = js.undefined
  var legendPosition: js.UndefOr[
    googleDotVisualizationLib.googleDotVisualizationLibStrings.sameRow | googleDotVisualizationLib.googleDotVisualizationLibStrings.newRow
  ] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var numberFormats: js.UndefOr[js.Any] = js.undefined
  var scaleColumns: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scaleFormat: js.UndefOr[java.lang.String] = js.undefined
  var scaleType: js.UndefOr[java.lang.String] = js.undefined
  var thickness: js.UndefOr[scala.Double] = js.undefined
  var zoomEndTime: js.UndefOr[stdLib.Date] = js.undefined
  var zoomStartTime: js.UndefOr[stdLib.Date] = js.undefined
}

object AnnotationChartOptions {
  @scala.inline
  def apply(
    allValuesSuffix: java.lang.String = null,
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    annotationsWidth: scala.Int | scala.Double = null,
    colors: js.Array[java.lang.String] = null,
    dateFormat: java.lang.String = null,
    displayAnnotations: js.UndefOr[scala.Boolean] = js.undefined,
    displayAnnotationsFilter: js.UndefOr[scala.Boolean] = js.undefined,
    displayDateBarSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    displayExactValues: js.UndefOr[scala.Boolean] = js.undefined,
    displayLegendDots: js.UndefOr[scala.Boolean] = js.undefined,
    displayLegendValues: js.UndefOr[scala.Boolean] = js.undefined,
    displayRangeSelector: js.UndefOr[scala.Boolean] = js.undefined,
    displayZoomButtons: js.UndefOr[scala.Boolean] = js.undefined,
    fill: scala.Int | scala.Double = null,
    legendPosition: googleDotVisualizationLib.googleDotVisualizationLibStrings.sameRow | googleDotVisualizationLib.googleDotVisualizationLibStrings.newRow = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    numberFormats: js.Any = null,
    scaleColumns: js.Array[scala.Double] = null,
    scaleFormat: java.lang.String = null,
    scaleType: java.lang.String = null,
    thickness: scala.Int | scala.Double = null,
    zoomEndTime: stdLib.Date = null,
    zoomStartTime: stdLib.Date = null
  ): AnnotationChartOptions = {
    val __obj = js.Dynamic.literal()
    if (allValuesSuffix != null) __obj.updateDynamic("allValuesSuffix")(allValuesSuffix)
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (annotationsWidth != null) __obj.updateDynamic("annotationsWidth")(annotationsWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (!js.isUndefined(displayAnnotations)) __obj.updateDynamic("displayAnnotations")(displayAnnotations)
    if (!js.isUndefined(displayAnnotationsFilter)) __obj.updateDynamic("displayAnnotationsFilter")(displayAnnotationsFilter)
    if (!js.isUndefined(displayDateBarSeparator)) __obj.updateDynamic("displayDateBarSeparator")(displayDateBarSeparator)
    if (!js.isUndefined(displayExactValues)) __obj.updateDynamic("displayExactValues")(displayExactValues)
    if (!js.isUndefined(displayLegendDots)) __obj.updateDynamic("displayLegendDots")(displayLegendDots)
    if (!js.isUndefined(displayLegendValues)) __obj.updateDynamic("displayLegendValues")(displayLegendValues)
    if (!js.isUndefined(displayRangeSelector)) __obj.updateDynamic("displayRangeSelector")(displayRangeSelector)
    if (!js.isUndefined(displayZoomButtons)) __obj.updateDynamic("displayZoomButtons")(displayZoomButtons)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats)
    if (scaleColumns != null) __obj.updateDynamic("scaleColumns")(scaleColumns)
    if (scaleFormat != null) __obj.updateDynamic("scaleFormat")(scaleFormat)
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (zoomEndTime != null) __obj.updateDynamic("zoomEndTime")(zoomEndTime)
    if (zoomStartTime != null) __obj.updateDynamic("zoomStartTime")(zoomStartTime)
    __obj.asInstanceOf[AnnotationChartOptions]
  }
}

