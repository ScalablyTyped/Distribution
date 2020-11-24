package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
