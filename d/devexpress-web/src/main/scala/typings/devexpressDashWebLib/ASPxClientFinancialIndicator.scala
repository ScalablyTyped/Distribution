package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicator class.
  */
trait ASPxClientFinancialIndicator extends ASPxClientIndicator {
  /**
    * Gets the first point of the financial indicator.
    * Value: An ASPxClientFinancialIndicatorPoint object, which represents a financial indicator's first point.
    */
  var point1: ASPxClientFinancialIndicatorPoint
  /**
    * Gets the second point of the financial indicator.
    * Value: An ASPxClientFinancialIndicatorPoint object, which represents a financial indicator's second point.
    */
  var point2: ASPxClientFinancialIndicatorPoint
}

object ASPxClientFinancialIndicator {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: java.lang.String,
    point1: ASPxClientFinancialIndicatorPoint,
    point2: ASPxClientFinancialIndicatorPoint,
    series: ASPxClientSeries
  ): ASPxClientFinancialIndicator = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, point1 = point1, point2 = point2, series = series)
  
    __obj.asInstanceOf[ASPxClientFinancialIndicator]
  }
}

