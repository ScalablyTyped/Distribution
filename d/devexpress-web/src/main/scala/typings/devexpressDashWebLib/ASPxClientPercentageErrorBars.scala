package typings
package devexpressDashWebLib

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
  var percent: scala.Double
}

object ASPxClientPercentageErrorBars {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: java.lang.String, percent: scala.Double, series: ASPxClientSeries): ASPxClientPercentageErrorBars = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[ASPxClientPercentageErrorBars]
  }
}

