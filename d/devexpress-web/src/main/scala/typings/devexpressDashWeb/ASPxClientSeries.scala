package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Series class.
  */
trait ASPxClientSeries extends ASPxClientWebChartElementNamed {
  /**
    * Gets a value indicating whether a crosshair cursor is enabled.
    * Value: true if a crosshair cursor is enabled; otherwise, false.
    */
  var actualCrosshairEnabled: Boolean
  /**
    * Gets a value indicating whether a crosshair label should be shown for this series.
    * Value: true if crosshair labels are visible; otherwise, false.
    */
  var actualCrosshairLabelVisibility: Boolean
  /**
    * Gets a value that specifies the scale type for the argument data of the series' data points.
    * Value: A string object which contains the current scale type.
    */
  var argumentScaleType: String
  /**
    * Gets the X-Axis that is used to plot the current series on the XY-diagram.
    * Value: A string object, which represents the X-axis name.
    */
  var axisX: String
  /**
    * Gets the Y-Axis that is used to plot the current series on the XY-diagram.
    * Value: A string object, which represents the Y-axis name.
    */
  var axisY: String
  /**
    * Gets the color of a series.
    * Value: A string value.
    */
  var color: String
  /**
    * Gets a string which represents the pattern specifying the text to be displayed within a crosshair label for the current Series  type.
    * Value: A Empty.
    */
  var crosshairLabelPattern: String
  /**
    * Returns a collection of crosshair value items.
    * Value: An array of ASPxClientCrosshairValueItem objects.
    */
  var crosshairValueItems: js.Array[ASPxClientCrosshairValueItem]
  /**
    * Provides access to the collection of Fibonacci Indicators.
    * Value: An array of ASPxClientFibonacciIndicator objects, that represent the collection of Fibonacci Indicators.
    */
  var fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator]
  /**
    * This property is intended for internal use only.
    * Value: A String value.
    */
  var groupedElementsPattern: String
  /**
    * Gets the series' collection of indicators.
    * Value: An array of ASPxClientIndicator objects, that belong to the series.
    */
  var indicators: js.Array[ASPxClientIndicator]
  /**
    * Gets the settings of series labels.
    * Value: An ASPxClientSeriesLabel object, which provides the series label settings.
    */
  var label: ASPxClientSeriesLabel
  /**
    * Gets the pane that is used to plot the current series on the XY-diagram.
    * Value: A string object, which represents the pane's name.
    */
  var pane: String
  /**
    * Gets the series' collection of data points.
    * Value: An array of ASPxClientSeriesPoint objects, that represent the series' data points.
    */
  var points: js.Array[ASPxClientSeriesPoint]
  /**
    * Provides access to the collection of regression lines.
    * Value: An array of ASPxClientRegressionLine objects which represent regression lines available for the series.
    */
  var regressionLines: js.Array[ASPxClientRegressionLine]
  /**
    * Gets a value that defines a group for stacked series.
    * Value: A string value.
    */
  var stackedGroup: String
  /**
    * Provides access to the collection of series titles.
    * Value: An array of ASPxClientSeriesTitle objects, that represent the collection of series titles.
    */
  var titles: js.Array[ASPxClientSeriesTitle]
  /**
    * Gets a value that specifies whether or not a tooltip is enabled for a chart.
    * Value: true - a tooltip is enabled for a chart; false - a tooltip is disabled.
    */
  var toolTipEnabled: Boolean
  /**
    * Gets an image to be displayed within series tooltips.
    * Value: A string value.
    */
  var toolTipImage: String
  /**
    * Gets the text to be displayed within series tooltips.
    * Value: A string value.
    */
  var toolTipText: String
  /**
    * Provides access to the collection of trendlines.
    * Value: An array of ASPxClientTrendLine objects, that represent the collection of trendlines.
    */
  var trendLines: js.Array[ASPxClientTrendLine]
  /**
    * Gets a value that specifies the scale type for the value data of the series' data points.
    * Value: A string object which contains the current scale type.
    */
  var valueScaleType: String
  /**
    * Gets a value that specifies the view type of the series.
    * Value: A string object which contains the current view type.
    */
  var viewType: String
  /**
    * Gets a value indicating whether the series is visible.
    * Value: true if the series is visible; otherwise, false.
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
    val __obj = js.Dynamic.literal(actualCrosshairEnabled = actualCrosshairEnabled, actualCrosshairLabelVisibility = actualCrosshairLabelVisibility, argumentScaleType = argumentScaleType, axisX = axisX, axisY = axisY, chart = chart, color = color, crosshairLabelPattern = crosshairLabelPattern, crosshairValueItems = crosshairValueItems, fibonacciIndicators = fibonacciIndicators, groupedElementsPattern = groupedElementsPattern, indicators = indicators, label = label, name = name, pane = pane, points = points, regressionLines = regressionLines, stackedGroup = stackedGroup, titles = titles, toolTipEnabled = toolTipEnabled, toolTipImage = toolTipImage, toolTipText = toolTipText, trendLines = trendLines, valueScaleType = valueScaleType, viewType = viewType, visible = visible)
  
    __obj.asInstanceOf[ASPxClientSeries]
  }
}

