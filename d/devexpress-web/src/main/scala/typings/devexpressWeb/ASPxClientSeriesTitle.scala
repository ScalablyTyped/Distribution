package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesTitle class.
  */
@js.native
trait ASPxClientSeriesTitle extends ASPxClientTitleBase {
  /**
    * Gets the series that owns the current title object.
    */
  var series: ASPxClientSeries = js.native
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
  @scala.inline
  implicit class ASPxClientSeriesTitleOps[Self <: ASPxClientSeriesTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = this.set("series", value.asInstanceOf[js.Any])
  }
  
}

