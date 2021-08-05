package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeparatePaneIndicator class.
  */
trait ASPxSeparatePaneIndicator
  extends StObject
     with ASPxClientIndicator {
  
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  var axisY: String
  
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  var pane: String
}
object ASPxSeparatePaneIndicator {
  
  inline def apply(axisY: String, chart: ASPxClientWebChart, name: String, pane: String, series: ASPxClientSeries): ASPxSeparatePaneIndicator = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSeparatePaneIndicator]
  }
  
  extension [Self <: ASPxSeparatePaneIndicator](x: Self) {
    
    inline def setAxisY(value: String): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
