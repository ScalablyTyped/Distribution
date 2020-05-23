package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

