package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
trait ASPxClientMassIndex extends ASPxSeparatePaneIndicator {
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    * Value: An integer value, specifying the count of points used to calculate EMA.
    */
  var movingAveragePointsCount: scala.Double
  /**
    * Returns the count of summable values.
    * Value: An integer value specifying the count of summable ratios.
    */
  var sumPointsCount: scala.Double
}

object ASPxClientMassIndex {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    movingAveragePointsCount: scala.Double,
    name: java.lang.String,
    pane: java.lang.String,
    series: ASPxClientSeries,
    sumPointsCount: scala.Double
  ): ASPxClientMassIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("movingAveragePointsCount")(movingAveragePointsCount)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("sumPointsCount")(sumPointsCount)
    __obj.asInstanceOf[ASPxClientMassIndex]
  }
}

