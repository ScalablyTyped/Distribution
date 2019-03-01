package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxis extends js.Object {
  var allowContainerBoundaryTextCufoff: js.UndefOr[scala.Boolean] = js.undefined
  var baseline: js.UndefOr[scala.Double] = js.undefined
   // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[java.lang.String] = js.undefined
   // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[scala.Double] = js.undefined
   // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[java.lang.String] = js.undefined
   // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.undefined
  var logScale: js.UndefOr[scala.Boolean] = js.undefined
  var maxAlternation: js.UndefOr[scala.Double] = js.undefined
  var maxTextLines: js.UndefOr[scala.Double] = js.undefined
  var maxValue: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
  var minTextSpacing: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double | stdLib.Date | js.Array[scala.Double]] = js.undefined
  var minorGridlines: js.UndefOr[ChartGridlines] = js.undefined
  var showTextEvery: js.UndefOr[scala.Double] = js.undefined
  var slantedText: js.UndefOr[scala.Boolean] = js.undefined
  var slantedTextAngle: js.UndefOr[scala.Double] = js.undefined
  var textPosition: js.UndefOr[java.lang.String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var viewWindow: js.UndefOr[ChartViewWindow] = js.undefined
  var viewWindowMode: js.UndefOr[java.lang.String] = js.undefined
}

object ChartAxis {
  @scala.inline
  def apply(
    allowContainerBoundaryTextCufoff: js.UndefOr[scala.Boolean] = js.undefined,
    baseline: scala.Int | scala.Double = null,
    baselineColor: java.lang.String = null,
    direction: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    gridlines: ChartGridlines = null,
    logScale: js.UndefOr[scala.Boolean] = js.undefined,
    maxAlternation: scala.Int | scala.Double = null,
    maxTextLines: scala.Int | scala.Double = null,
    maxValue: scala.Double | stdLib.Date | js.Array[scala.Double] = null,
    minTextSpacing: scala.Int | scala.Double = null,
    minValue: scala.Double | stdLib.Date | js.Array[scala.Double] = null,
    minorGridlines: ChartGridlines = null,
    showTextEvery: scala.Int | scala.Double = null,
    slantedText: js.UndefOr[scala.Boolean] = js.undefined,
    slantedTextAngle: scala.Int | scala.Double = null,
    textPosition: java.lang.String = null,
    textStyle: ChartTextStyle = null,
    ticks: js.Array[_] = null,
    title: java.lang.String = null,
    titleTextStyle: ChartTextStyle = null,
    viewWindow: ChartViewWindow = null,
    viewWindowMode: java.lang.String = null
  ): ChartAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowContainerBoundaryTextCufoff)) __obj.updateDynamic("allowContainerBoundaryTextCufoff")(allowContainerBoundaryTextCufoff)
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (baselineColor != null) __obj.updateDynamic("baselineColor")(baselineColor)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (gridlines != null) __obj.updateDynamic("gridlines")(gridlines)
    if (!js.isUndefined(logScale)) __obj.updateDynamic("logScale")(logScale)
    if (maxAlternation != null) __obj.updateDynamic("maxAlternation")(maxAlternation.asInstanceOf[js.Any])
    if (maxTextLines != null) __obj.updateDynamic("maxTextLines")(maxTextLines.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minTextSpacing != null) __obj.updateDynamic("minTextSpacing")(minTextSpacing.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines)
    if (showTextEvery != null) __obj.updateDynamic("showTextEvery")(showTextEvery.asInstanceOf[js.Any])
    if (!js.isUndefined(slantedText)) __obj.updateDynamic("slantedText")(slantedText)
    if (slantedTextAngle != null) __obj.updateDynamic("slantedTextAngle")(slantedTextAngle.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (viewWindow != null) __obj.updateDynamic("viewWindow")(viewWindow)
    if (viewWindowMode != null) __obj.updateDynamic("viewWindowMode")(viewWindowMode)
    __obj.asInstanceOf[ChartAxis]
  }
}

