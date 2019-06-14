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
  
  /* 12 */ val Cancel: Cancel with scala.Double = js.native
  /* 6 */ val Compensation: Compensation with scala.Double = js.native
  /* 10 */ val Conditional: Conditional with scala.Double = js.native
  /* 5 */ val Error: Error with scala.Double = js.native
  /* 3 */ val Escalation: Escalation with scala.Double = js.native
  /* 4 */ val Link: Link with scala.Double = js.native
  /* 1 */ val Message: Message with scala.Double = js.native
  /* 8 */ val Multiple: Multiple with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 9 */ val Parallel: Parallel with scala.Double = js.native
  /* 7 */ val Signal: Signal with scala.Double = js.native
  /* 11 */ val Terminate: Terminate with scala.Double = js.native
  /* 2 */ val Timer: Timer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTriggers with scala.Double
  ] = js.native
}

