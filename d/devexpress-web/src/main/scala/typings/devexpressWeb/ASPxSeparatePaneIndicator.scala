package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeparatePaneIndicator class.
  */
@js.native
trait ASPxSeparatePaneIndicator extends ASPxClientIndicator {
  
  /**
    * Returns the name of the Y-axis that is used to plot the current indicator on a ASPxClientXYDiagram.
    */
  var axisY: String = js.native
  
  /**
    * Returns the name of a pane, used to plot the separate pane indicator on an XYDiagram.
    */
  var pane: String = js.native
}
object ASPxSeparatePaneIndicator {
  
  @scala.inline
  def apply(axisY: String, chart: ASPxClientWebChart, name: String, pane: String, series: ASPxClientSeries): ASPxSeparatePaneIndicator = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSeparatePaneIndicator]
  }
  
  @scala.inline
  implicit class ASPxSeparatePaneIndicatorMutableBuilder[Self <: ASPxSeparatePaneIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisY(value: String): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
