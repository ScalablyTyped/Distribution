package typings.devexpressDashWeb

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
  var movingAveragePointsCount: Double
  /**
    * Returns the count of summable values.
    * Value: An integer value specifying the count of summable ratios.
    */
  var sumPointsCount: Double
}

object ASPxClientMassIndex {
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    movingAveragePointsCount: Double,
    name: String,
    pane: String,
    series: ASPxClientSeries,
    sumPointsCount: Double
  ): ASPxClientMassIndex = {
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, movingAveragePointsCount = movingAveragePointsCount, name = name, pane = pane, series = series, sumPointsCount = sumPointsCount)
  
    __obj.asInstanceOf[ASPxClientMassIndex]
  }
}

