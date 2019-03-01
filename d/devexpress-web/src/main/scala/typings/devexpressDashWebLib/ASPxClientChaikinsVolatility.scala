package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChaikinsVolatility class.
  */
trait ASPxClientChaikinsVolatility extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    * Value: An integer value, specifying the number of points.
    */
  var pointsCount: scala.Double
}

object ASPxClientChaikinsVolatility {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    name: java.lang.String,
    pane: java.lang.String,
    pointsCount: scala.Double,
    series: ASPxClientSeries
  ): ASPxClientChaikinsVolatility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("pointsCount")(pointsCount)
    __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[ASPxClientChaikinsVolatility]
  }
}

