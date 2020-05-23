package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
@JSGlobal("ASPxClientSeriesPoint")
@js.native
class ASPxClientSeriesPoint ()
  extends typings.devexpressWeb.ASPxClientSeriesPoint {
  /**
    * Gets the data point's argument.
    */
  /* CompleteClass */
  override var argument: js.Any = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the color of a series point.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Gets the percent value of a series point.
    */
  /* CompleteClass */
  override var percentValue: Double = js.native
  /**
    * Gets the series that owns the current series point object.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  /* CompleteClass */
  override var toolTipHint: String = js.native
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  /* CompleteClass */
  override var toolTipText: String = js.native
  /**
    * Gets the point's data value(s).
    */
  /* CompleteClass */
  override var values: js.Array[_] = js.native
}

