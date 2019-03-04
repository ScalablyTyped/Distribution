package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Indicator class.
  */
trait ASPxClientIndicator extends ASPxClientWebChartElementNamed {
  /**
    * Gets the indicator's associated series.
    * Value: An ASPxClientSeries object.
    */
  var series: ASPxClientSeries
}

object ASPxClientIndicator {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: java.lang.String, series: ASPxClientSeries): ASPxClientIndicator = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, series = series)
  
    __obj.asInstanceOf[ASPxClientIndicator]
  }
}

