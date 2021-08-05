package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
trait ASPxClientFinancialIndicatorPoint
  extends StObject
     with ASPxClientWebChartElement {
  
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
  
  inline def apply(
    argument: js.Any,
    chart: ASPxClientWebChart,
    financialIndicator: ASPxClientFinancialIndicator,
    valueLevel: String
  ): ASPxClientFinancialIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], financialIndicator = financialIndicator.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFinancialIndicatorPoint]
  }
  
  extension [Self <: ASPxClientFinancialIndicatorPoint](x: Self) {
    
    inline def setArgument(value: js.Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setFinancialIndicator(value: ASPxClientFinancialIndicator): Self = StObject.set(x, "financialIndicator", value.asInstanceOf[js.Any])
    
    inline def setValueLevel(value: String): Self = StObject.set(x, "valueLevel", value.asInstanceOf[js.Any])
  }
}
