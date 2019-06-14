package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DiagramConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.DiagramConstraints")
@js.native
object DiagramConstraints extends js.Object {
  //Enables/Disables interaction done with the help of API methods
  @js.native
  sealed trait APIUpdate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables Bridging
  @js.native
  sealed trait Bridging
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables the sharp edges
  @js.native
  sealed trait CrispEdges
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables all Constraints
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables the drag and drop of element from one diagram to the other
  @js.native
  sealed trait FloatElements
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Disables all DiagramConstraints
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables PageEditing
  @js.native
  sealed trait PageEditable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables Panning
  @js.native
  sealed trait Pannable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables panning on horizontal axis
  @js.native
  sealed trait PannableX
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables panning on vertical axis
  @js.native
  sealed trait PannableY
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables the Diagram size updation on the window resize function
  @js.native
  sealed trait Resizable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables the routing for an connector in diagram
  @js.native
  sealed trait Routing
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables undo actions
  @js.native
  sealed trait Undoable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables UserInteraction
  @js.native
  sealed trait UserInteraction
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables the Zooming of labels text editor
  @js.native
  sealed trait ZoomTextEditor
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  //Enables/Disables Zooming
  @js.native
  sealed trait Zoomable
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints
  
  /* 1 */ val APIUpdate: APIUpdate with scala.Double = js.native
  /* 4 */ val Bridging: Bridging with scala.Double = js.native
  /* 10 */ val CrispEdges: CrispEdges with scala.Double = js.native
  /* 15 */ val Default: Default with scala.Double = js.native
  /* 13 */ val FloatElements: FloatElements with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val PageEditable: PageEditable with scala.Double = js.native
  /* 8 */ val Pannable: Pannable with scala.Double = js.native
  /* 6 */ val PannableX: PannableX with scala.Double = js.native
  /* 7 */ val PannableY: PannableY with scala.Double = js.native
  /* 11 */ val Resizable: Resizable with scala.Double = js.native
  /* 14 */ val Routing: Routing with scala.Double = js.native
  /* 9 */ val Undoable: Undoable with scala.Double = js.native
  /* 2 */ val UserInteraction: UserInteraction with scala.Double = js.native
  /* 12 */ val ZoomTextEditor: ZoomTextEditor with scala.Double = js.native
  /* 5 */ val Zoomable: Zoomable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints with scala.Double
  ] = js.native
}

