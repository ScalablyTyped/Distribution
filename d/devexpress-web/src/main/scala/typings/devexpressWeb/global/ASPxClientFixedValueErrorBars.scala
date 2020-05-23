package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
@JSGlobal("ASPxClientFixedValueErrorBars")
@js.native
class ASPxClientFixedValueErrorBars ()
  extends typings.devexpressWeb.ASPxClientFixedValueErrorBars {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the fixed negative error value.
    */
  /* CompleteClass */
  override var negativeError: Double = js.native
  /**
    * Gets or sets the fixed positive error value.
    */
  /* CompleteClass */
  override var positiveError: Double = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}

