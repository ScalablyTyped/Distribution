package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MovingAverageConvergenceDivergence class.
  */
@JSGlobal("ASPxClientMovingAverageConvergenceDivergence")
@js.native
class ASPxClientMovingAverageConvergenceDivergence () extends ASPxSeparatePaneIndicator {
  /**
    * Returns the long period value required to calculate the indicator.
    */
  var longPeriod: Double = js.native
  /**
    * Returns the short period value required to calculate the indicator.
    */
  var shortPeriod: Double = js.native
  /**
    * Returns the smoothing period value required to calculate the indicator.
    */
  var signalSmoothingPeriod: Double = js.native
}

