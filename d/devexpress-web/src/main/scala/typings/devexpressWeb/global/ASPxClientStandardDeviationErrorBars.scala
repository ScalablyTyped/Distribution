package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the StandardDeviationErrorBars class.
  */
@JSGlobal("ASPxClientStandardDeviationErrorBars")
@js.native
class ASPxClientStandardDeviationErrorBars ()
  extends typings.devexpressWeb.ASPxClientStandardDeviationErrorBars {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Returns the multiplier on which the standard deviation value is multiplied before display.
    */
  /* CompleteClass */
  override var multiplier: Double = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}

