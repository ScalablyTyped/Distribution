package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesTitle class.
  */
trait ASPxClientSeriesTitle extends ASPxClientTitleBase {
  /**
    * Gets the series that owns the current title object.
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
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dock = dock.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesTitle]
  }
}

