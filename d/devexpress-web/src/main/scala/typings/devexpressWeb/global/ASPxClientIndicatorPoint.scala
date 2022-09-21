package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IndicatorPoint class's client-side equivalent.
  */
@JSGlobal("ASPxClientIndicatorPoint")
@js.native
open class ASPxClientIndicatorPoint ()
  extends StObject
     with typings.devexpressWeb.ASPxClientIndicatorPoint {
  
  /**
    * Returns the indicator point's argument.
    */
  /* CompleteClass */
  var argument: Any = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Returns the series to which the indicator and its point belong.
    */
  /* CompleteClass */
  var series: typings.devexpressWeb.ASPxClientSeries = js.native
  
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
