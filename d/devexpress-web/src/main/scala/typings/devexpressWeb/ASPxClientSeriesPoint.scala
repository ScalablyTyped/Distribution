package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
trait ASPxClientSeriesPoint extends ASPxClientWebChartElement {
  /**
    * Gets the data point's argument.
    */
  var argument: js.Any
  /**
    * Gets the color of a series point.
    */
  var color: String
  /**
    * Gets the percent value of a series point.
    */
  var percentValue: Double
  /**
    * Gets the series that owns the current series point object.
    */
  var series: ASPxClientSeries
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  var toolTipHint: String
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  var toolTipText: String
  /**
    * Gets the point's data value(s).
    */
  var values: js.Array[_]
}

object ASPxClientSeriesPoint {
  @scala.inline
  def apply(
    argument: js.Any,
    chart: ASPxClientWebChart,
    color: String,
    percentValue: Double,
    series: ASPxClientSeries,
    toolTipHint: String,
    toolTipText: String,
    values: js.Array[_]
  ): ASPxClientSeriesPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], percentValue = percentValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], toolTipHint = toolTipHint.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesPoint]
  }
}

