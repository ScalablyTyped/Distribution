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
  
  val AcceptingEvent: AcceptingEvent with java.lang.String = js.native
  val Action: Action with java.lang.String = js.native
  val Decision: Decision with java.lang.String = js.native
  val FinalNode: FinalNode with java.lang.String = js.native
  val ForkNode: ForkNode with java.lang.String = js.native
  val InitialNode: InitialNode with java.lang.String = js.native
  val JoinNode: JoinNode with java.lang.String = js.native
  val MergeNode: MergeNode with java.lang.String = js.native
  val Note: Note with java.lang.String = js.native
  val ReceiveSignal: ReceiveSignal with java.lang.String = js.native
  val SendSignal: SendSignal with java.lang.String = js.native
  val StructuredNode: StructuredNode with java.lang.String = js.native
  val TimeEvent: TimeEvent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.UMLActivityShapes with java.lang.String
  ] = js.native
}

