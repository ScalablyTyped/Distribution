package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the StandardDeviationErrorBars class.
  */
trait ASPxClientStandardDeviationErrorBars extends ASPxClientIndicator {
  /**
    * Returns the multiplier on which the standard deviation value is multiplied before display.
    */
  var multiplier: Double
}

object ASPxClientStandardDeviationErrorBars {
  @scala.inline
  def apply(chart: ASPxClientWebChart, multiplier: Double, name: String, series: ASPxClientSeries): ASPxClientStandardDeviationErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStandardDeviationErrorBars]
  }
}

