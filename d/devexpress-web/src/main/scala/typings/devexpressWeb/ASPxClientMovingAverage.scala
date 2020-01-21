package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the MovingAverage class.
  */
@JSGlobal("ASPxClientMovingAverage")
@js.native
class ASPxClientMovingAverage () extends ASPxClientSingleLevelIndicator {
  /**
    * Gets a value specifying the Envelope percent.
    */
  var envelopePercent: Double = js.native
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  var kind: String = js.native
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  var pointsCount: Double = js.native
}

