package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait BusinessRule
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as InstantiatingReceive
  @js.native
  sealed trait InstantiatingReceive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Manual
  @js.native
  sealed trait Manual
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Parallel
  @js.native
  sealed trait Parallel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Receive
  @js.native
  sealed trait Receive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Script
  @js.native
  sealed trait Script
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Send
  @js.native
  sealed trait Send
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as Service
  @js.native
  sealed trait Service
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  //Used to set BPMN Task Type as User
  @js.native
  sealed trait User
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks
  
  /* 6 */ val BusinessRule: BusinessRule with scala.Double = js.native
  /* 4 */ val InstantiatingReceive: InstantiatingReceive with scala.Double = js.native
  /* 5 */ val Manual: Manual with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 9 */ val Parallel: Parallel with scala.Double = js.native
  /* 2 */ val Receive: Receive with scala.Double = js.native
  /* 8 */ val Script: Script with scala.Double = js.native
  /* 3 */ val Send: Send with scala.Double = js.native
  /* 1 */ val Service: Service with scala.Double = js.native
  /* 7 */ val User: User with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks with scala.Double] = js.native
}

