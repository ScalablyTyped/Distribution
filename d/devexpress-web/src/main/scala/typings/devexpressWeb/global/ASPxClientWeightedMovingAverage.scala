package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the WeightedMovingAverage class.
  */
@JSGlobal("ASPxClientWeightedMovingAverage")
@js.native
class ASPxClientWeightedMovingAverage ()
  extends typings.devexpressWeb.ASPxClientMovingAverage {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets a value specifying the Envelope percent.
    */
  /* CompleteClass */
  override var envelopePercent: Double = js.native
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  /* CompleteClass */
  override var kind: String = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  /* CompleteClass */
  override var pointsCount: Double = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    */
  /* CompleteClass */
  override var valueLevel: String = js.native
}

