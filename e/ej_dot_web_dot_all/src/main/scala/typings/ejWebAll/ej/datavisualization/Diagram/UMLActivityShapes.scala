package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UMLActivityShapes with Double] = js.native
  /* 8 */ @js.native
  object AcceptingEvent extends TopLevel[AcceptingEvent with Double]
  
  /* 0 */ @js.native
  object Action extends TopLevel[Action with Double]
  
  /* 1 */ @js.native
  object Decision extends TopLevel[Decision with Double]
  
  /* 4 */ @js.native
  object FinalNode extends TopLevel[FinalNode with Double]
  
  /* 5 */ @js.native
  object ForkNode extends TopLevel[ForkNode with Double]
  
  /* 3 */ @js.native
  object InitialNode extends TopLevel[InitialNode with Double]
  
  /* 6 */ @js.native
  object JoinNode extends TopLevel[JoinNode with Double]
  
  /* 2 */ @js.native
  object MergeNode extends TopLevel[MergeNode with Double]
  
  /* 12 */ @js.native
  object Note extends TopLevel[Note with Double]
  
  /* 10 */ @js.native
  object ReceiveSignal extends TopLevel[ReceiveSignal with Double]
  
  /* 9 */ @js.native
  object SendSignal extends TopLevel[SendSignal with Double]
  
  /* 11 */ @js.native
  object StructuredNode extends TopLevel[StructuredNode with Double]
  
  /* 7 */ @js.native
  object TimeEvent extends TopLevel[TimeEvent with Double]
  
}

