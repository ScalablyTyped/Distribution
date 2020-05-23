package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
trait ASPxClientFinancialIndicatorPoint extends ASPxClientWebChartElement {
  /**
    * Gets the argument of the financial indicator's point.
    */
  var argument: js.Any
  /**
    * Gets the financial indicator that owns the current financial indicator point.
    */
  var financialIndicator: ASPxClientFinancialIndicator
  /**
    * Gets a value, indicating how the value of a financial indicator's point is obtained.
    */
  var valueLevel: String
}

object ASPxClientFinancialIndicatorPoint {
  @scala.inline
  def apply(
    argument: js.Any,
    chart: ASPxClientWebChart,
    financialIndicator: ASPxClientFinancialIndicator,
    valueLevel: String
  ): ASPxClientFinancialIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], financialIndicator = financialIndicator.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFinancialIndicatorPoint]
  }
}

