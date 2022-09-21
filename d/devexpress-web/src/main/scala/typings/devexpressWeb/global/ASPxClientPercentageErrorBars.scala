package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the PercentageErrorBars class.
  */
@JSGlobal("ASPxClientPercentageErrorBars")
@js.native
open class ASPxClientPercentageErrorBars ()
  extends StObject
     with typings.devexpressWeb.ASPxClientPercentageErrorBars {
  
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
    * Returns the value specifying the percentage of error values of series point values.
    */
  /* CompleteClass */
  var percent: Double = js.native
  
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  var series: typings.devexpressWeb.ASPxClientSeries = js.native
}
