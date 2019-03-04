package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the StandardDeviationErrorBars class.
  */
trait ASPxClientStandardDeviationErrorBars extends ASPxClientIndicator {
  /**
    * Returns the multiplier on which the standard deviation value is multiplied before display.
    * Value: A double value specifying the multiplier. Values less than 0 are not allowed.
    */
  var multiplier: scala.Double
}

object ASPxClientStandardDeviationErrorBars {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    multiplier: scala.Double,
    name: java.lang.String,
    series: ASPxClientSeries
  ): ASPxClientStandardDeviationErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart, multiplier = multiplier, name = name, series = series)
  
    __obj.asInstanceOf[ASPxClientStandardDeviationErrorBars]
  }
}

