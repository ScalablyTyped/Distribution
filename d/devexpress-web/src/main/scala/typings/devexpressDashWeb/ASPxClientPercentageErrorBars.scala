package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the PercentageErrorBars class.
  */
trait ASPxClientPercentageErrorBars extends ASPxClientIndicator {
  /**
    * Returns the value specifying the percentage of error values of series point values.
    * Value: A double value specifying the percentage. Values less than or equal to 0 are not allowed.
    */
  var percent: Double
}

object ASPxClientPercentageErrorBars {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, percent: Double, series: ASPxClientSeries): ASPxClientPercentageErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, percent = percent, series = series)
  
    __obj.asInstanceOf[ASPxClientPercentageErrorBars]
  }
}

