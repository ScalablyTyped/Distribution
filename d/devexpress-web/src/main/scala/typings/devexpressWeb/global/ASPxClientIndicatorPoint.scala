package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IndicatorPoint class's client-side equivalent.
  */
@JSGlobal("ASPxClientIndicatorPoint")
@js.native
class ASPxClientIndicatorPoint ()
  extends typings.devexpressWeb.ASPxClientIndicatorPoint {
  /**
    * Returns the indicator point's argument.
    */
  /* CompleteClass */
  override var argument: js.Any = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Returns the series to which the indicator and its point belong.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  /* CompleteClass */
  override var values: js.Array[_] = js.native
}

