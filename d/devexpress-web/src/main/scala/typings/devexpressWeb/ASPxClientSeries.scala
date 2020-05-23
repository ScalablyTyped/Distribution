package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Series class.
  */
trait ASPxClientSeries extends ASPxClientWebChartElementNamed {
  /**
    * Gets a value indicating whether a crosshair cursor is enabled.
    */
  var actualCrosshairEnabled: Boolean
  /**
    * Gets a value indicating whether a crosshair label should be shown for this series.
    */
  var actualCrosshairLabelVisibility: Boolean
  /**
    * Gets a value that specifies the scale type for the argument data of the series' data points.
    */
  var argumentScaleType: String
  /**
    * Gets the X-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisX: String
  /**
    * Gets the Y-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisY: String
  /**
    * Gets the color of a series.
    */
  var color: String
  /**
    * Gets a string which represents the pattern specifying the text to be displayed within a crosshair label for the current Series  type.
    */
  var crosshairLabelPattern: String
  /**
    * Returns a collection of crosshair value items.
    */
  var crosshairValueItems: js.Array[ASPxClientCrosshairValueItem]
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of Fibonacci Indicators.
    */
  var fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator]
  /**
    * This property is intended for internal use only.
    */
  var groupedElementsPattern: String
  /**
    * Gets the series' collection of indicators.
    */
  var indicators: js.Array[ASPxClientIndicator]
  /**
    * Gets the settings of series labels.
    */
  var label: ASPxClientSeriesLabel
  /**
    * Gets the pane that is used to plot the current series on the XY-diagram.
    */
  var pane: String
  /**
    * Gets the series' collection of data points.
    */
  var points: js.Array[ASPxClientSeriesPoint]
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of regression lines.
    */
  var regressionLines: js.Array[ASPxClientRegressionLine]
  /**
    * Gets a value that defines a group for stacked series.
    */
  var stackedGroup: String
  /**
    * Provides access to the collection of series titles.
    */
  var titles: js.Array[ASPxClientSeriesTitle]
  /**
    * Gets a value that specifies whether or not a tooltip is enabled for a chart.
    */
  var toolTipEnabled: Boolean
  /**
    * Gets an image to be displayed within series tooltips.
    */
  var toolTipImage: String
  /**
    * Gets the text to be displayed within series tooltips.
    */
  var toolTipText: String
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of trendlines.
    */
  var trendLines: js.Array[ASPxClientTrendLine]
  /**
    * Gets a value that specifies the scale type for the value data of the series' data points.
    */
  var valueScaleType: String
  /**
    * Gets a value that specifies the view type of the series.
    */
  var viewType: String
  /**
    * Gets a value indicating whether the series is visible.
    */
  var visible: Boolean
}

object ASPxClientSeries {
  @scala.inline
  def apply(
    actualCrosshairEnabled: Boolean,
    actualCrosshairLabelVisibility: Boolean,
    argumentScaleType: String,
    axisX: String,
    axisY: String,
    chart: ASPxClientWebChart,
    color: String,
    crosshairLabelPattern: String,
    crosshairValueItems: js.Array[ASPxClientCrosshairValueItem],
    fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator],
    groupedElementsPattern: String,
    indicators: js.Array[ASPxClientIndicator],
    label: ASPxClientSeriesLabel,
    name: String,
    pane: String,
    points: js.Array[ASPxClientSeriesPoint],
    regressionLines: js.Array[ASPxClientRegressionLine],
    stackedGroup: String,
    titles: js.Array[ASPxClientSeriesTitle],
    toolTipEnabled: Boolean,
    toolTipImage: String,
    toolTipText: String,
    trendLines: js.Array[ASPxClientTrendLine],
    valueScaleType: String,
    viewType: String,
    visible: Boolean
  ): ASPxClientSeries = {
    val __obj = js.Dynamic.literal(actualCrosshairEnabled = actualCrosshairEnabled.asInstanceOf[js.Any], actualCrosshairLabelVisibility = actualCrosshairLabelVisibility.asInstanceOf[js.Any], argumentScaleType = argumentScaleType.asInstanceOf[js.Any], axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], crosshairLabelPattern = crosshairLabelPattern.asInstanceOf[js.Any], crosshairValueItems = crosshairValueItems.asInstanceOf[js.Any], fibonacciIndicators = fibonacciIndicators.asInstanceOf[js.Any], groupedElementsPattern = groupedElementsPattern.asInstanceOf[js.Any], indicators = indicators.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], regressionLines = regressionLines.asInstanceOf[js.Any], stackedGroup = stackedGroup.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], toolTipEnabled = toolTipEnabled.asInstanceOf[js.Any], toolTipImage = toolTipImage.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], trendLines = trendLines.asInstanceOf[js.Any], valueScaleType = valueScaleType.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeries]
  }
}

