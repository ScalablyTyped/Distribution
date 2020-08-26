package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WilliamsR class.
  */
@js.native
trait ASPxClientWilliamsR extends ASPxSeparatePaneIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double = js.native
}

object ASPxClientWilliamsR {
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    name: String,
    pane: String,
    pointsCount: Double,
    series: ASPxClientSeries
  ): ASPxClientWilliamsR = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWilliamsR]
  }
  @scala.inline
  implicit class ASPxClientWilliamsROps[Self <: ASPxClientWilliamsR] (val x: Self) extends AnyVal {
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
    def setPointsCount(value: Double): Self = this.set("pointsCount", value.asInstanceOf[js.Any])
  }
  
}

