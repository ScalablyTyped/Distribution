package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChartElement class.
  */
trait ASPxClientWebChartElement extends js.Object {
  /**
    * Gets the chart that owns the current chart element.
    */
  var chart: ASPxClientWebChart
}

object ASPxClientWebChartElement {
  @scala.inline
  def apply(chart: ASPxClientWebChart): ASPxClientWebChartElement = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElement]
  }
}

