package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Legend class.
  */
@JSGlobal("ASPxClientLegend")
@js.native
class ASPxClientLegend ()
  extends StObject
     with typings.devexpressWeb.ASPxClientLegend {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Returns a collection of custom legend items of the legend.
    */
  /* CompleteClass */
  var customItems: js.Array[typings.devexpressWeb.ASPxClientCustomLegendItem] = js.native
  
  /**
    * Returns the name of the legend.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Returns a value which determines whether to use checkboxes instead of markers on a chart legend for all legend items.
    */
  /* CompleteClass */
  var useCheckBoxes: Boolean = js.native
}
