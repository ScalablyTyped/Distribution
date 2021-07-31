package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
@JSGlobal("ASPxClientFinancialIndicatorPoint")
@js.native
class ASPxClientFinancialIndicatorPoint ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFinancialIndicatorPoint {
  
  /**
    * Gets the argument of the financial indicator's point.
    */
  /* CompleteClass */
  var argument: js.Any = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the financial indicator that owns the current financial indicator point.
    */
  /* CompleteClass */
  var financialIndicator: typings.devexpressWeb.ASPxClientFinancialIndicator = js.native
  
  /**
    * Gets a value, indicating how the value of a financial indicator's point is obtained.
    */
  /* CompleteClass */
  var valueLevel: String = js.native
}
