package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
trait ASPxClientSeriesLabel extends ASPxClientWebChartElement {
  /**
    * Gets the series that owns the current series label object.
    */
  var series: ASPxClientSeries
  /** @deprecated This property is obsolete and isn't used at all. */
  /**
    * Gets the common text for all series point labels.
    */
  var text: String
}

object ASPxClientSeriesLabel {
  @scala.inline
  def apply(chart: ASPxClientWebChart, series: ASPxClientSeries, text: String): ASPxClientSeriesLabel = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesLabel]
  }
}

