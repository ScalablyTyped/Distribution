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
  
  val APIUpdate: APIUpdate with java.lang.String = js.native
  val Bridging: Bridging with java.lang.String = js.native
  val CrispEdges: CrispEdges with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val FloatElements: FloatElements with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val PageEditable: PageEditable with java.lang.String = js.native
  val Pannable: Pannable with java.lang.String = js.native
  val PannableX: PannableX with java.lang.String = js.native
  val PannableY: PannableY with java.lang.String = js.native
  val Resizable: Resizable with java.lang.String = js.native
  val Routing: Routing with java.lang.String = js.native
  val Undoable: Undoable with java.lang.String = js.native
  val UserInteraction: UserInteraction with java.lang.String = js.native
  val ZoomTextEditor: ZoomTextEditor with java.lang.String = js.native
  val Zoomable: Zoomable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints with java.lang.String
  ] = js.native
}

