package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the PercentageErrorBars class.
  */
@JSGlobal("ASPxClientPercentageErrorBars")
@js.native
class ASPxClientPercentageErrorBars ()
  extends typings.devexpressWeb.ASPxClientPercentageErrorBars {
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
    * Returns the value specifying the percentage of error values of series point values.
    */
  /* CompleteClass */
  override var percent: Double = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}

