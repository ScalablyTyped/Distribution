package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 6 */ val BusinessRule: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.BusinessRule with Double = js.native
  /* 4 */ val InstantiatingReceive: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.InstantiatingReceive with Double = js.native
  /* 5 */ val Manual: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Manual with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.None with Double = js.native
  /* 9 */ val Parallel: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Parallel with Double = js.native
  /* 2 */ val Receive: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Receive with Double = js.native
  /* 8 */ val Script: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Script with Double = js.native
  /* 3 */ val Send: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Send with Double = js.native
  /* 1 */ val Service: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.Service with Double = js.native
  /* 7 */ val User: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNTasks.User with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNTasks with Double] = js.native
}

