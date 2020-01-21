package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNTriggers with Double] = js.native
  /* 12 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 6 */ @js.native
  object Compensation extends TopLevel[Compensation with Double]
  
  /* 10 */ @js.native
  object Conditional extends TopLevel[Conditional with Double]
  
  /* 5 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 3 */ @js.native
  object Escalation extends TopLevel[Escalation with Double]
  
  /* 4 */ @js.native
  object Link extends TopLevel[Link with Double]
  
  /* 1 */ @js.native
  object Message extends TopLevel[Message with Double]
  
  /* 8 */ @js.native
  object Multiple extends TopLevel[Multiple with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 9 */ @js.native
  object Parallel extends TopLevel[Parallel with Double]
  
  /* 7 */ @js.native
  object Signal extends TopLevel[Signal with Double]
  
  /* 11 */ @js.native
  object Terminate extends TopLevel[Terminate with Double]
  
  /* 2 */ @js.native
  object Timer extends TopLevel[Timer with Double]
  
}

