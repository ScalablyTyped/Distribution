package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
@JSGlobal("ASPxClientSeriesLabel")
@js.native
class ASPxClientSeriesLabel () extends ASPxClientWebChartElement {
  /**
    * Gets the series that owns the current series label object.
    */
  var series: ASPxClientSeries = js.native
  /** @deprecated This property is obsolete and isn't used at all. */
  /**
    * Gets the common text for all series point labels.
    */
  var text: String = js.native
}

