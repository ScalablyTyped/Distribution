package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
@JSGlobal("ASPxClientMassIndex")
@js.native
class ASPxClientMassIndex () extends ASPxSeparatePaneIndicator {
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  var movingAveragePointsCount: Double = js.native
  /**
    * Returns the count of summable values.
    */
  var sumPointsCount: Double = js.native
}

