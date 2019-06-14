package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UMLActivityShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.UMLActivityShapes")
@js.native
object UMLActivityShapes extends js.Object {
  //Used to set UML ActivityShapes as AcceptingEvent
  @js.native
  sealed trait AcceptingEvent
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as Action
  @js.native
  sealed trait Action
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as Decision
  @js.native
  sealed trait Decision
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as FinalNode
  @js.native
  sealed trait FinalNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as ForkNode
  @js.native
  sealed trait ForkNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as InitialNode
  @js.native
  sealed trait InitialNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as JoinNode
  @js.native
  sealed trait JoinNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as MergeNode
  @js.native
  sealed trait MergeNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as Note
  @js.native
  sealed trait Note
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as ReceiveSignal
  @js.native
  sealed trait ReceiveSignal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as SendSignal
  @js.native
  sealed trait SendSignal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as StructuredNode
  @js.native
  sealed trait StructuredNode
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  //Used to set UML ActivityShapes as TimeEvent
  @js.native
  sealed trait TimeEvent
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes
  
  /* 8 */ val AcceptingEvent: AcceptingEvent with scala.Double = js.native
  /* 0 */ val Action: Action with scala.Double = js.native
  /* 1 */ val Decision: Decision with scala.Double = js.native
  /* 4 */ val FinalNode: FinalNode with scala.Double = js.native
  /* 5 */ val ForkNode: ForkNode with scala.Double = js.native
  /* 3 */ val InitialNode: InitialNode with scala.Double = js.native
  /* 6 */ val JoinNode: JoinNode with scala.Double = js.native
  /* 2 */ val MergeNode: MergeNode with scala.Double = js.native
  /* 12 */ val Note: Note with scala.Double = js.native
  /* 10 */ val ReceiveSignal: ReceiveSignal with scala.Double = js.native
  /* 9 */ val SendSignal: SendSignal with scala.Double = js.native
  /* 11 */ val StructuredNode: StructuredNode with scala.Double = js.native
  /* 7 */ val TimeEvent: TimeEvent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes with scala.Double
  ] = js.native
}

