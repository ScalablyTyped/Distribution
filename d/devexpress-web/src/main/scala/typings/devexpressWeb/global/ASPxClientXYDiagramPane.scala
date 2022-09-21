package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
@JSGlobal("ASPxClientXYDiagramPane")
@js.native
open class ASPxClientXYDiagramPane ()
  extends StObject
     with typings.devexpressWeb.ASPxClientXYDiagramPane {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  
  /**
    * Gets the diagram that owns the current pane object.
    */
  /* CompleteClass */
  var diagram: typings.devexpressWeb.ASPxClientXYDiagram = js.native
  
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Returns the pane title's settings.
    */
  /* CompleteClass */
  var title: typings.devexpressWeb.ASPxClientPaneTitle = js.native
}
