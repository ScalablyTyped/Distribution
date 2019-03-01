package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ChartElementNamed class.
  */
trait ASPxClientWebChartElementNamed extends ASPxClientWebChartElement {
  /**
    * Gets the name of the chart element.
    * Value: A string object representing the name of the chart element.
    */
  var name: java.lang.String
}

object ASPxClientWebChartElementNamed {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: java.lang.String): ASPxClientWebChartElementNamed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientWebChartElementNamed]
  }
}

