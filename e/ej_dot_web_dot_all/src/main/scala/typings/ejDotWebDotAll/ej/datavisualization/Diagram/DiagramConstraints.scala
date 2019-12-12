package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.APIUpdate
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Bridging
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.CrispEdges
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Default
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.FloatElements
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.PageEditable
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Pannable
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.PannableX
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.PannableY
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Routing
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Undoable
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.UserInteraction
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.ZoomTextEditor
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Zoomable
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DiagramConstraints with Double] = js.native
  /* 1 */ @js.native
  object APIUpdate extends TopLevel[APIUpdate with Double]
  
  /* 4 */ @js.native
  object Bridging extends TopLevel[Bridging with Double]
  
  /* 10 */ @js.native
  object CrispEdges extends TopLevel[CrispEdges with Double]
  
  /* 15 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 13 */ @js.native
  object FloatElements extends TopLevel[FloatElements with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object PageEditable extends TopLevel[PageEditable with Double]
  
  /* 8 */ @js.native
  object Pannable extends TopLevel[Pannable with Double]
  
  /* 6 */ @js.native
  object PannableX extends TopLevel[PannableX with Double]
  
  /* 7 */ @js.native
  object PannableY extends TopLevel[PannableY with Double]
  
  /* 11 */ @js.native
  object Resizable
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Diagram.DiagramConstraints.Resizable with Double
        ]
  
  /* 14 */ @js.native
  object Routing extends TopLevel[Routing with Double]
  
  /* 9 */ @js.native
  object Undoable extends TopLevel[Undoable with Double]
  
  /* 2 */ @js.native
  object UserInteraction extends TopLevel[UserInteraction with Double]
  
  /* 12 */ @js.native
  object ZoomTextEditor extends TopLevel[ZoomTextEditor with Double]
  
  /* 5 */ @js.native
  object Zoomable extends TopLevel[Zoomable with Double]
  
}

