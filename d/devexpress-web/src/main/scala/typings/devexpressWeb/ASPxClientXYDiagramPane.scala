package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
trait ASPxClientXYDiagramPane
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Gets the diagram that owns the current pane object.
    */
  var diagram: ASPxClientXYDiagram
  
  /**
    * Returns the pane title's settings.
    */
  var title: ASPxClientPaneTitle
}
object ASPxClientXYDiagramPane {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, diagram: ASPxClientXYDiagram, name: String, title: ASPxClientPaneTitle): ASPxClientXYDiagramPane = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagramPane]
  }
  
  @scala.inline
  implicit class ASPxClientXYDiagramPaneMutableBuilder[Self <: ASPxClientXYDiagramPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagram(value: ASPxClientXYDiagram): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ASPxClientPaneTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
