package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the PercentageErrorBars class.
  */
trait ASPxClientPercentageErrorBars extends ASPxClientIndicator {
  /**
    * Returns the value specifying the percentage of error values of series point values.
    */
  var percent: Double
}

object ASPxClientPercentageErrorBars {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, percent: Double, series: ASPxClientSeries): ASPxClientPercentageErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPercentageErrorBars]
  }
}

