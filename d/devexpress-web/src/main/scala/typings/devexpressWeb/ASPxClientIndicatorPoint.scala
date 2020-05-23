package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IndicatorPoint class's client-side equivalent.
  */
trait ASPxClientIndicatorPoint extends ASPxClientWebChartElement {
  /**
    * Returns the indicator point's argument.
    */
  var argument: js.Any
  /**
    * Returns the series to which the indicator and its point belong.
    */
  var series: ASPxClientSeries
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  var values: js.Array[_]
}

object ASPxClientIndicatorPoint {
  @scala.inline
  def apply(argument: js.Any, chart: ASPxClientWebChart, series: ASPxClientSeries, values: js.Array[_]): ASPxClientIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicatorPoint]
  }
}

