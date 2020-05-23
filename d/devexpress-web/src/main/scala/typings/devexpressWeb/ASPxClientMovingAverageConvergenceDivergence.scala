package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MovingAverageConvergenceDivergence class.
  */
trait ASPxClientMovingAverageConvergenceDivergence extends ASPxSeparatePaneIndicator {
  /**
    * Returns the long period value required to calculate the indicator.
    */
  var longPeriod: Double
  /**
    * Returns the short period value required to calculate the indicator.
    */
  var shortPeriod: Double
  /**
    * Returns the smoothing period value required to calculate the indicator.
    */
  var signalSmoothingPeriod: Double
}

object ASPxClientMovingAverageConvergenceDivergence {
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    longPeriod: Double,
    name: String,
    pane: String,
    series: ASPxClientSeries,
    shortPeriod: Double,
    signalSmoothingPeriod: Double
  ): ASPxClientMovingAverageConvergenceDivergence = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], longPeriod = longPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], shortPeriod = shortPeriod.asInstanceOf[js.Any], signalSmoothingPeriod = signalSmoothingPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMovingAverageConvergenceDivergence]
  }
}

