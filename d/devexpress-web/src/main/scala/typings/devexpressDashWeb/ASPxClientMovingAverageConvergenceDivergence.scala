package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MovingAverageConvergenceDivergence class.
  */
trait ASPxClientMovingAverageConvergenceDivergence extends ASPxSeparatePaneIndicator {
  /**
    * Returns the long period value required to calculate the indicator.
    * Value: An integer value specifying the long period.
    */
  var longPeriod: Double
  /**
    * Returns the short period value required to calculate the indicator.
    * Value: An integer value specifying the short period value.
    */
  var shortPeriod: Double
  /**
    * Returns the smoothing period value required to calculate the indicator.
    * Value: An integer value specifying the smoothing period value.
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
    val __obj = js.Dynamic.literal(axisY = axisY, chart = chart, longPeriod = longPeriod, name = name, pane = pane, series = series, shortPeriod = shortPeriod, signalSmoothingPeriod = signalSmoothingPeriod)
  
    __obj.asInstanceOf[ASPxClientMovingAverageConvergenceDivergence]
  }
}

