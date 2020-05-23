package typings.googleVisualization.google.visualization

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxis extends js.Object {
  var allowContainerBoundaryTextCufoff: js.UndefOr[Boolean] = js.undefined
  var baseline: js.UndefOr[Double] = js.undefined
   // This option is only supported for a continuous axis. https://developers.google.com/chart/interactive/docs/customizing_axes#Terminology
  var baselineColor: js.UndefOr[String] = js.undefined
   // google's documentation on this is wrong, specifies it as a number. The color of the baseline for the horizontal axis. Can be any HTML color string, for example: 'red' or '#00cc00'
  var direction: js.UndefOr[Double] = js.undefined
   // The direction in which the values along the horizontal axis grow. Specify -1 to reverse the order of the values.
  var format: js.UndefOr[String] = js.undefined
   // icu pattern set http://icu-project.org/apiref/icu4c/classDecimalFormat.html#_details
  var gridlines: js.UndefOr[ChartGridlines] = js.undefined
  var logScale: js.UndefOr[Boolean] = js.undefined
  var maxAlternation: js.UndefOr[Double] = js.undefined
  var maxTextLines: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double | Date | js.Array[Double]] = js.undefined
  var minTextSpacing: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double | Date | js.Array[Double]] = js.undefined
  var minorGridlines: js.UndefOr[ChartGridlines] = js.undefined
  var showTextEvery: js.UndefOr[Double] = js.undefined
  var slantedText: js.UndefOr[Boolean] = js.undefined
  var slantedTextAngle: js.UndefOr[Double] = js.undefined
  var textPosition: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var viewWindow: js.UndefOr[ChartViewWindow] = js.undefined
  var viewWindowMode: js.UndefOr[String] = js.undefined
}

object ChartAxis {
  @scala.inline
  def apply(
    allowContainerBoundaryTextCufoff: js.UndefOr[Boolean] = js.undefined,
    baseline: js.UndefOr[Double] = js.undefined,
    baselineColor: String = null,
    direction: js.UndefOr[Double] = js.undefined,
    format: String = null,
    gridlines: ChartGridlines = null,
    logScale: js.UndefOr[Boolean] = js.undefined,
    maxAlternation: js.UndefOr[Double] = js.undefined,
    maxTextLines: js.UndefOr[Double] = js.undefined,
    maxValue: Double | Date | js.Array[Double] = null,
    minTextSpacing: js.UndefOr[Double] = js.undefined,
    minValue: Double | Date | js.Array[Double] = null,
    minorGridlines: ChartGridlines = null,
    showTextEvery: js.UndefOr[Double] = js.undefined,
    slantedText: js.UndefOr[Boolean] = js.undefined,
    slantedTextAngle: js.UndefOr[Double] = js.undefined,
    textPosition: String = null,
    textStyle: ChartTextStyle = null,
    ticks: js.Array[_] = null,
    title: String = null,
    titleTextStyle: ChartTextStyle = null,
    viewWindow: ChartViewWindow = null,
    viewWindowMode: String = null
  ): ChartAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowContainerBoundaryTextCufoff)) __obj.updateDynamic("allowContainerBoundaryTextCufoff")(allowContainerBoundaryTextCufoff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseline)) __obj.updateDynamic("baseline")(baseline.get.asInstanceOf[js.Any])
    if (baselineColor != null) __obj.updateDynamic("baselineColor")(baselineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gridlines != null) __obj.updateDynamic("gridlines")(gridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(logScale)) __obj.updateDynamic("logScale")(logScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAlternation)) __obj.updateDynamic("maxAlternation")(maxAlternation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTextLines)) __obj.updateDynamic("maxTextLines")(maxTextLines.get.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (!js.isUndefined(minTextSpacing)) __obj.updateDynamic("minTextSpacing")(minTextSpacing.get.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines.asInstanceOf[js.Any])
    if (!js.isUndefined(showTextEvery)) __obj.updateDynamic("showTextEvery")(showTextEvery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slantedText)) __obj.updateDynamic("slantedText")(slantedText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slantedTextAngle)) __obj.updateDynamic("slantedTextAngle")(slantedTextAngle.get.asInstanceOf[js.Any])
    if (textPosition != null) __obj.updateDynamic("textPosition")(textPosition.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (viewWindow != null) __obj.updateDynamic("viewWindow")(viewWindow.asInstanceOf[js.Any])
    if (viewWindowMode != null) __obj.updateDynamic("viewWindowMode")(viewWindowMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxis]
  }
}

