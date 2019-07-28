package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait APIUpdate extends DiagramConstraints
  
  //Enables/Disables Bridging
  @js.native
  sealed trait Bridging extends DiagramConstraints
  
  //Enables/Disables the sharp edges
  @js.native
  sealed trait CrispEdges extends DiagramConstraints
  
  //Enables all Constraints
  @js.native
  sealed trait Default extends DiagramConstraints
  
  //Enables/Disables the drag and drop of element from one diagram to the other
  @js.native
  sealed trait FloatElements extends DiagramConstraints
  
  //Disables all DiagramConstraints
  @js.native
  sealed trait None extends DiagramConstraints
  
  //Enables/Disables PageEditing
  @js.native
  sealed trait PageEditable extends DiagramConstraints
  
  //Enables/Disables Panning
  @js.native
  sealed trait Pannable extends DiagramConstraints
  
  //Enables/Disables panning on horizontal axis
  @js.native
  sealed trait PannableX extends DiagramConstraints
  
  //Enables/Disables panning on vertical axis
  @js.native
  sealed trait PannableY extends DiagramConstraints
  
  //Enables/Disables the Diagram size updation on the window resize function
  @js.native
  sealed trait Resizable extends DiagramConstraints
  
  //Enables the routing for an connector in diagram
  @js.native
  sealed trait Routing extends DiagramConstraints
  
  //Enables/Disables undo actions
  @js.native
  sealed trait Undoable extends DiagramConstraints
  
  //Enables/Disables UserInteraction
  @js.native
  sealed trait UserInteraction extends DiagramConstraints
  
  //Enables/Disables the Zooming of labels text editor
  @js.native
  sealed trait ZoomTextEditor extends DiagramConstraints
  
  //Enables/Disables Zooming
  @js.native
  sealed trait Zoomable extends DiagramConstraints
  
  /* 1 */ val APIUpdate: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.APIUpdate with Double = js.native
  /* 4 */ val Bridging: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Bridging with Double = js.native
  /* 10 */ val CrispEdges: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.CrispEdges with Double = js.native
  /* 15 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Default with Double = js.native
  /* 13 */ val FloatElements: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.FloatElements with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.None with Double = js.native
  /* 3 */ val PageEditable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.PageEditable with Double = js.native
  /* 8 */ val Pannable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Pannable with Double = js.native
  /* 6 */ val PannableX: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.PannableX with Double = js.native
  /* 7 */ val PannableY: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.PannableY with Double = js.native
  /* 11 */ val Resizable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Resizable with Double = js.native
  /* 14 */ val Routing: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Routing with Double = js.native
  /* 9 */ val Undoable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Undoable with Double = js.native
  /* 2 */ val UserInteraction: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.UserInteraction with Double = js.native
  /* 12 */ val ZoomTextEditor: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.ZoomTextEditor with Double = js.native
  /* 5 */ val Zoomable: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.DiagramConstraints.Zoomable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagramConstraints with Double] = js.native
}

