package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IndicatorPoint class's client-side equivalent.
  */
@JSGlobal("ASPxClientIndicatorPoint")
@js.native
class ASPxClientIndicatorPoint () extends ASPxClientWebChartElement {
  /**
    * Returns the indicator point's argument.
    */
  var argument: js.Any = js.native
  /**
    * Returns the series to which the indicator and its point belong.
    */
  var series: ASPxClientSeries = js.native
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  var values: js.Array[_] = js.native
}

