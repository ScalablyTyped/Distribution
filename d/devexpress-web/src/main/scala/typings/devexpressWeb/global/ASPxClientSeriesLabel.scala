package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
@JSGlobal("ASPxClientSeriesLabel")
@js.native
class ASPxClientSeriesLabel ()
  extends typings.devexpressWeb.ASPxClientSeriesLabel {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the series that owns the current series label object.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
  /** @deprecated This property is obsolete and isn't used at all. */
  /**
    * Gets the common text for all series point labels.
    */
  /* CompleteClass */
  override var text: String = js.native
}

