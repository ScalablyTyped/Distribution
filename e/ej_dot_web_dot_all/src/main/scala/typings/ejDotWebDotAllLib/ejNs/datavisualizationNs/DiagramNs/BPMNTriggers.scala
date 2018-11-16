package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNTriggers extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNTriggers")
@js.native
object BPMNTriggers extends js.Object {
  //Used to set Event Trigger as Cancel
  @js.native
  sealed trait Cancel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Compensation
  @js.native
  sealed trait Compensation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Conditional
  @js.native
  sealed trait Conditional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Error
  @js.native
  sealed trait Error
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Escalation
  @js.native
  sealed trait Escalation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Link
  @js.native
  sealed trait Link
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Message
  @js.native
  sealed trait Message
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Multiple
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Parallel
  @js.native
  sealed trait Parallel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Signal
  @js.native
  sealed trait Signal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Terminate
  @js.native
  sealed trait Terminate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  //Used to set Event Trigger as Timer
  @js.native
  sealed trait Timer
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers
  
  val Cancel: Cancel with java.lang.String = js.native
  val Compensation: Compensation with java.lang.String = js.native
  val Conditional: Conditional with java.lang.String = js.native
  val Error: Error with java.lang.String = js.native
  val Escalation: Escalation with java.lang.String = js.native
  val Link: Link with java.lang.String = js.native
  val Message: Message with java.lang.String = js.native
  val Multiple: Multiple with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Parallel: Parallel with java.lang.String = js.native
  val Signal: Signal with java.lang.String = js.native
  val Terminate: Terminate with java.lang.String = js.native
  val Timer: Timer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers with java.lang.String
  ] = js.native
}

