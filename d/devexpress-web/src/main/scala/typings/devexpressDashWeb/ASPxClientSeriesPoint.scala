package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
trait ASPxClientSeriesPoint extends ASPxClientWebChartElement {
  /**
    * Gets the data point's argument.
    * Value: An object that specifies the data point's argument.
    */
  var argument: js.Object
  /**
    * Gets the color of a series point.
    * Value: A string value.
    */
  var color: String
  /**
    * Gets the percent value of a series point.
    * Value: A float value.
    */
  var percentValue: Double
  /**
    * Gets the series that owns the current series point object.
    * Value: An ASPxClientSeries object, to which the series point belongs.
    */
  var series: ASPxClientSeries
  /**
    * Gets a hint that is shown in series points tooltips.
    * Value: A string value.
    */
  var toolTipHint: String
  /**
    * Gets the text to be displayed within series points tooltips.
    * Value: A string value.
    */
  var toolTipText: String
  /**
    * Gets the point's data value(s).
    * Value: An array of objects that represent the data value(s) of the series data point.
    */
  var values: js.Array[js.Object]
}

object ASPxClientSeriesPoint {
  @scala.inline
  def apply(
    argument: js.Object,
    chart: ASPxClientWebChart,
    color: String,
    percentValue: Double,
    series: ASPxClientSeries,
    toolTipHint: String,
    toolTipText: String,
    values: js.Array[js.Object]
  ): ASPxClientSeriesPoint = {
    val __obj = js.Dynamic.literal(argument = argument, chart = chart, color = color, percentValue = percentValue, series = series, toolTipHint = toolTipHint, toolTipText = toolTipText, values = values)
  
    __obj.asInstanceOf[ASPxClientSeriesPoint]
  }
}

