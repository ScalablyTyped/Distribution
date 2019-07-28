package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait AcceptingEvent extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as Action
  @js.native
  sealed trait Action extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as Decision
  @js.native
  sealed trait Decision extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as FinalNode
  @js.native
  sealed trait FinalNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as ForkNode
  @js.native
  sealed trait ForkNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as InitialNode
  @js.native
  sealed trait InitialNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as JoinNode
  @js.native
  sealed trait JoinNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as MergeNode
  @js.native
  sealed trait MergeNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as Note
  @js.native
  sealed trait Note extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as ReceiveSignal
  @js.native
  sealed trait ReceiveSignal extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as SendSignal
  @js.native
  sealed trait SendSignal extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as StructuredNode
  @js.native
  sealed trait StructuredNode extends UMLActivityShapes
  
  //Used to set UML ActivityShapes as TimeEvent
  @js.native
  sealed trait TimeEvent extends UMLActivityShapes
  
  /* 8 */ val AcceptingEvent: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.AcceptingEvent with Double = js.native
  /* 0 */ val Action: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.Action with Double = js.native
  /* 1 */ val Decision: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.Decision with Double = js.native
  /* 4 */ val FinalNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.FinalNode with Double = js.native
  /* 5 */ val ForkNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.ForkNode with Double = js.native
  /* 3 */ val InitialNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.InitialNode with Double = js.native
  /* 6 */ val JoinNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.JoinNode with Double = js.native
  /* 2 */ val MergeNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.MergeNode with Double = js.native
  /* 12 */ val Note: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.Note with Double = js.native
  /* 10 */ val ReceiveSignal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.ReceiveSignal with Double = js.native
  /* 9 */ val SendSignal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.SendSignal with Double = js.native
  /* 11 */ val StructuredNode: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.StructuredNode with Double = js.native
  /* 7 */ val TimeEvent: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes.TimeEvent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UMLActivityShapes with Double] = js.native
}

