package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Indicator class.
  */
@js.native
trait ASPxClientIndicator extends ASPxClientWebChartElementNamed {
  /**
    * Gets the indicator's associated series.
    */
  var series: ASPxClientSeries = js.native
}

object ASPxClientIndicator {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries): ASPxClientIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicator]
  }
  @scala.inline
  implicit class ASPxClientIndicatorOps[Self <: ASPxClientIndicator] (val x: Self) extends AnyVal {
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

