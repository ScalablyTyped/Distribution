package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Indicator class.
  */
trait ASPxClientIndicator extends ASPxClientWebChartElementNamed {
  /**
    * Gets the indicator's associated series.
    */
  var series: ASPxClientSeries
}

object ASPxClientIndicator {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries): ASPxClientIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicator]
  }
}

