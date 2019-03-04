package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesLabelBase class.
  */
trait ASPxClientSeriesLabel extends ASPxClientWebChartElement {
  /**
    * Gets the series that owns the current series label object.
    * Value: An ASPxClientSeries object, to which the series label belongs.
    */
  var series: ASPxClientSeries
  /**
    * Gets the common text for all series point labels.
    * Value: Returns an empty string object.
    */
  var text: java.lang.String
}

object ASPxClientSeriesLabel {
  @scala.inline
  def apply(chart: ASPxClientWebChart, series: ASPxClientSeries, text: java.lang.String): ASPxClientSeriesLabel = {
    val __obj = js.Dynamic.literal(chart = chart, series = series, text = text)
  
    __obj.asInstanceOf[ASPxClientSeriesLabel]
  }
}

