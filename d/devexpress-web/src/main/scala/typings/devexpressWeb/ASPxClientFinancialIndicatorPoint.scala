package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
@js.native
trait ASPxClientFinancialIndicatorPoint extends ASPxClientWebChartElement {
  
  /**
    * Gets the argument of the financial indicator's point.
    */
  var argument: js.Any = js.native
  
  /**
    * Gets the financial indicator that owns the current financial indicator point.
    */
  var financialIndicator: ASPxClientFinancialIndicator = js.native
  
  /**
    * Gets a value, indicating how the value of a financial indicator's point is obtained.
    */
  var valueLevel: String = js.native
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
  
  @scala.inline
  implicit class ASPxClientFinancialIndicatorPointOps[Self <: ASPxClientFinancialIndicatorPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgument(value: js.Any): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinancialIndicator(value: ASPxClientFinancialIndicator): Self = this.set("financialIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLevel(value: String): Self = this.set("valueLevel", value.asInstanceOf[js.Any])
  }
}
