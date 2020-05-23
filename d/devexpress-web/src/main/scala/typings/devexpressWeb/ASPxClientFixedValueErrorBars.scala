package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
trait ASPxClientFixedValueErrorBars extends ASPxClientIndicator {
  /**
    * Returns the fixed negative error value.
    */
  var negativeError: Double
  /**
    * Gets or sets the fixed positive error value.
    */
  var positiveError: Double
}

object ASPxClientFixedValueErrorBars {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    negativeError: Double,
    positiveError: Double,
    series: ASPxClientSeries
  ): ASPxClientFixedValueErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negativeError = negativeError.asInstanceOf[js.Any], positiveError = positiveError.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFixedValueErrorBars]
  }
}

