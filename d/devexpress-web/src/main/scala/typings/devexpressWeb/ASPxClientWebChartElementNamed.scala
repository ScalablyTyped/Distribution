package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChartElementNamed class.
  */
@js.native
trait ASPxClientWebChartElementNamed extends ASPxClientWebChartElement {
  /**
    * Gets the name of the chart element.
    */
  var name: String = js.native
}

object ASPxClientWebChartElementNamed {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String): ASPxClientWebChartElementNamed = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElementNamed]
  }
  @scala.inline
  implicit class ASPxClientWebChartElementNamedOps[Self <: ASPxClientWebChartElementNamed] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

