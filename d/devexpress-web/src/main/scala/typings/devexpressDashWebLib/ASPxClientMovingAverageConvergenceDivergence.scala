package typings
package devexpressDashWebLib

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
  var longPeriod: scala.Double
  /**
    * Returns the short period value required to calculate the indicator.
    * Value: An integer value specifying the short period value.
    */
  var shortPeriod: scala.Double
  /**
    * Returns the smoothing period value required to calculate the indicator.
    * Value: An integer value specifying the smoothing period value.
    */
  var signalSmoothingPeriod: scala.Double
}

object ASPxClientMovingAverageConvergenceDivergence {
  @scala.inline
  def apply(
    axisY: java.lang.String,
    chart: ASPxClientWebChart,
    longPeriod: scala.Double,
    name: java.lang.String,
    pane: java.lang.String,
    series: ASPxClientSeries,
    shortPeriod: scala.Double,
    signalSmoothingPeriod: scala.Double
  ): ASPxClientMovingAverageConvergenceDivergence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisY")(axisY)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("longPeriod")(longPeriod)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pane")(pane)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("shortPeriod")(shortPeriod)
    __obj.updateDynamic("signalSmoothingPeriod")(signalSmoothingPeriod)
    __obj.asInstanceOf[ASPxClientMovingAverageConvergenceDivergence]
  }
}

