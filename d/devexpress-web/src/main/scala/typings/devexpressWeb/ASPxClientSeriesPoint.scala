package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
@JSGlobal("ASPxClientSeriesPoint")
@js.native
class ASPxClientSeriesPoint () extends ASPxClientWebChartElement {
  /**
    * Gets the data point's argument.
    */
  var argument: js.Any = js.native
  /**
    * Gets the color of a series point.
    */
  var color: String = js.native
  /**
    * Gets the percent value of a series point.
    */
  var percentValue: Double = js.native
  /**
    * Gets the series that owns the current series point object.
    */
  var series: ASPxClientSeries = js.native
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  var toolTipHint: String = js.native
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  var toolTipText: String = js.native
  /**
    * Gets the point's data value(s).
    */
  var values: js.Array[_] = js.native
}

