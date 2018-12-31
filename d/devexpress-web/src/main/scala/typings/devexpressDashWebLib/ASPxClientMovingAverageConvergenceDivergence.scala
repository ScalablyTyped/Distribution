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

