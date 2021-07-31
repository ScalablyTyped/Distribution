package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FinancialIndicator class.
  */
@JSGlobal("ASPxClientFinancialIndicator")
@js.native
class ASPxClientFinancialIndicator ()
  extends StObject
     with typings.devexpressWeb.ASPxClientFinancialIndicator {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the first point of the financial indicator.
    */
  /* CompleteClass */
  var point1: typings.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  
  /**
    * Gets the second point of the financial indicator.
    */
  /* CompleteClass */
  var point2: typings.devexpressWeb.ASPxClientFinancialIndicatorPoint = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typings.devexpressWeb.ASPxClientSeries = js.native
}
