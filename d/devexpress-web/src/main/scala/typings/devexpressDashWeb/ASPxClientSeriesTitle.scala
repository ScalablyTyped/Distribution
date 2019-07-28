package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesTitle class.
  */
trait ASPxClientSeriesTitle extends ASPxClientTitleBase {
  /**
    * Gets the series that owns the current title object.
    * Value: An ASPxClientSeries object, to which the series title belongs.
    */
  var series: ASPxClientSeries
}

object ASPxClientSeriesTitle {
  @scala.inline
  def apply(
    alignment: String,
    chart: ASPxClientWebChart,
    dock: String,
    lines: js.Array[String],
    series: ASPxClientSeries
  ): ASPxClientSeriesTitle = {
    val __obj = js.Dynamic.literal(alignment = alignment, chart = chart, dock = dock, lines = lines, series = series)
  
    __obj.asInstanceOf[ASPxClientSeriesTitle]
  }
}

