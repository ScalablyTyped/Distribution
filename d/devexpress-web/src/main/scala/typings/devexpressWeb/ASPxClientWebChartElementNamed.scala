package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChartElementNamed class.
  */
trait ASPxClientWebChartElementNamed extends ASPxClientWebChartElement {
  /**
    * Gets the name of the chart element.
    */
  var name: String
}

object ASPxClientWebChartElementNamed {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String): ASPxClientWebChartElementNamed = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElementNamed]
  }
}

