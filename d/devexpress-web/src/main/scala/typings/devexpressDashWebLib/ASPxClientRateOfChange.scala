package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the RateOfChange class.
  */
trait ASPxClientRateOfChange extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    * Value: An integer value, specifying the number of points.
    */
  var pointsCount: scala.Double
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    * Value: A string value, which indicates which series point value should be used to calculate indicator values.
    */
  var valueLevel: java.lang.String
}

object ASPxClientRateOfChange {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    name: java.lang.String,
    pane: java.lang.String,
    pointsCount: scala.Double,
    series: ASPxClientSeries,
    valueLevel: java.lang.String
  ): ASPxClientRateOfChange = {
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, name = name, pane = pane, pointsCount = pointsCount, series = series, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientRateOfChange]
  }
}

