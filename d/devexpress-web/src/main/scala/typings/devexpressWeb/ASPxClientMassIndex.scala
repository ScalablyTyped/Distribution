package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
trait ASPxClientMassIndex extends ASPxSeparatePaneIndicator {
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  var movingAveragePointsCount: Double
  /**
    * Returns the count of summable values.
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
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], movingAveragePointsCount = movingAveragePointsCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], sumPointsCount = sumPointsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMassIndex]
  }
}

