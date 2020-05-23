package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicator class.
  */
trait ASPxClientFinancialIndicator extends ASPxClientIndicator {
  /**
    * Gets the first point of the financial indicator.
    */
  var point1: ASPxClientFinancialIndicatorPoint
  /**
    * Gets the second point of the financial indicator.
    */
  var point2: ASPxClientFinancialIndicatorPoint
}

object ASPxClientFinancialIndicator {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    point1: ASPxClientFinancialIndicatorPoint,
    point2: ASPxClientFinancialIndicatorPoint,
    series: ASPxClientSeries
  ): ASPxClientFinancialIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point1 = point1.asInstanceOf[js.Any], point2 = point2.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFinancialIndicator]
  }
}

