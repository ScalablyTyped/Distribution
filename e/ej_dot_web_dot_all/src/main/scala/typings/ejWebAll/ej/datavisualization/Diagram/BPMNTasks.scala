package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNTasks extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNTasks")
@js.native
object BPMNTasks extends js.Object {
  //Used to set BPMN Task Type as BusinessRule
  @js.native
  sealed trait BusinessRule extends BPMNTasks
  
  //Used to set BPMN Task Type as InstantiatingReceive
  @js.native
  sealed trait InstantiatingReceive extends BPMNTasks
  
  //Used to set BPMN Task Type as Manual
  @js.native
  sealed trait Manual extends BPMNTasks
  
  //Used to set BPMN Task Type as None
  @js.native
  sealed trait None extends BPMNTasks
  
  //Used to set BPMN Task Type as Parallel
  @js.native
  sealed trait Parallel extends BPMNTasks
  
  //Used to set BPMN Task Type as Receive
  @js.native
  sealed trait Receive extends BPMNTasks
  
  //Used to set BPMN Task Type as Script
  @js.native
  sealed trait Script extends BPMNTasks
  
  //Used to set BPMN Task Type as Send
  @js.native
  sealed trait Send extends BPMNTasks
  
  //Used to set BPMN Task Type as Service
  @js.native
  sealed trait Service extends BPMNTasks
  
  //Used to set BPMN Task Type as User
  @js.native
  sealed trait User extends BPMNTasks
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNTasks with Double] = js.native
  /* 6 */ @js.native
  object BusinessRule extends TopLevel[BusinessRule with Double]
  
  /* 4 */ @js.native
  object InstantiatingReceive extends TopLevel[InstantiatingReceive with Double]
  
  /* 5 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 9 */ @js.native
  object Parallel extends TopLevel[Parallel with Double]
  
  /* 2 */ @js.native
  object Receive extends TopLevel[Receive with Double]
  
  /* 8 */ @js.native
  object Script extends TopLevel[Script with Double]
  
  /* 3 */ @js.native
  object Send extends TopLevel[Send with Double]
  
  /* 1 */ @js.native
  object Service extends TopLevel[Service with Double]
  
  /* 7 */ @js.native
  object User extends TopLevel[User with Double]
  
}

