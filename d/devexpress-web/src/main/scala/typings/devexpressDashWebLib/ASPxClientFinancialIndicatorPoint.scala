package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
trait ASPxClientFinancialIndicatorPoint extends ASPxClientWebChartElement {
  /**
    * Gets the argument of the financial indicator's point.
    * Value: An object that specifies the point argument.
    */
  var argument: js.Object
  /**
    * Gets the financial indicator that owns the current financial indicator point.
    * Value: An ASPxClientFinancialIndicator object, to which the point belongs.
    */
  var financialIndicator: ASPxClientFinancialIndicator
  /**
    * Gets a value, indicating how the value of a financial indicator's point is obtained.
    * Value: A string value, which indicates how to obtain a financial indicator point's value.
    */
  var valueLevel: java.lang.String
}

object ASPxClientFinancialIndicatorPoint {
  @scala.inline
  def apply(
    argument: js.Object,
    chart: ASPxClientWebChart,
    financialIndicator: ASPxClientFinancialIndicator,
    valueLevel: java.lang.String
  ): ASPxClientFinancialIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument, chart = chart, financialIndicator = financialIndicator, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientFinancialIndicatorPoint]
  }
}

