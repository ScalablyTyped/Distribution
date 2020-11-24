package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
