package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait Cancel extends BPMNTriggers
  
  //Used to set Event Trigger as Compensation
  @js.native
  sealed trait Compensation extends BPMNTriggers
  
  //Used to set Event Trigger as Conditional
  @js.native
  sealed trait Conditional extends BPMNTriggers
  
  //Used to set Event Trigger as Error
  @js.native
  sealed trait Error extends BPMNTriggers
  
  //Used to set Event Trigger as Escalation
  @js.native
  sealed trait Escalation extends BPMNTriggers
  
  //Used to set Event Trigger as Link
  @js.native
  sealed trait Link extends BPMNTriggers
  
  //Used to set Event Trigger as Message
  @js.native
  sealed trait Message extends BPMNTriggers
  
  //Used to set Event Trigger as Multiple
  @js.native
  sealed trait Multiple extends BPMNTriggers
  
  //Used to set Event Trigger as None
  @js.native
  sealed trait None extends BPMNTriggers
  
  //Used to set Event Trigger as Parallel
  @js.native
  sealed trait Parallel extends BPMNTriggers
  
  //Used to set Event Trigger as Signal
  @js.native
  sealed trait Signal extends BPMNTriggers
  
  //Used to set Event Trigger as Terminate
  @js.native
  sealed trait Terminate extends BPMNTriggers
  
  //Used to set Event Trigger as Timer
  @js.native
  sealed trait Timer extends BPMNTriggers
  
  /* 12 */ val Cancel: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Cancel with Double = js.native
  /* 6 */ val Compensation: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Compensation with Double = js.native
  /* 10 */ val Conditional: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Conditional with Double = js.native
  /* 5 */ val Error: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Error with Double = js.native
  /* 3 */ val Escalation: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Escalation with Double = js.native
  /* 4 */ val Link: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Link with Double = js.native
  /* 1 */ val Message: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Message with Double = js.native
  /* 8 */ val Multiple: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Multiple with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.None with Double = js.native
  /* 9 */ val Parallel: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Parallel with Double = js.native
  /* 7 */ val Signal: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Signal with Double = js.native
  /* 11 */ val Terminate: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Terminate with Double = js.native
  /* 2 */ val Timer: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTriggers.Timer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNTriggers with Double] = js.native
}

