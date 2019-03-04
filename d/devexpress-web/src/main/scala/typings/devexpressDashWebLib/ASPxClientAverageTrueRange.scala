package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AverageTrueRange class.
  */
trait ASPxClientAverageTrueRange extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    * Value: An integer value, specifying the number of points.
    */
  var pointsCount: scala.Double
}

object ASPxClientAverageTrueRange {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    name: java.lang.String,
    pane: java.lang.String,
    pointsCount: scala.Double,
    series: ASPxClientSeries
  ): ASPxClientAverageTrueRange = {
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, name = name, pane = pane, pointsCount = pointsCount, series = series)
  
    __obj.asInstanceOf[ASPxClientAverageTrueRange]
  }
}

