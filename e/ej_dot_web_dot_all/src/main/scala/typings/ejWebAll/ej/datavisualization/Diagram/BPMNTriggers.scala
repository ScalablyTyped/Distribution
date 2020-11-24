package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
