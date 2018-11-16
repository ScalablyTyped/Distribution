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
  
  val BusinessRule: BusinessRule with java.lang.String = js.native
  val InstantiatingReceive: InstantiatingReceive with java.lang.String = js.native
  val Manual: Manual with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Parallel: Parallel with java.lang.String = js.native
  val Receive: Receive with java.lang.String = js.native
  val Script: Script with java.lang.String = js.native
  val Send: Send with java.lang.String = js.native
  val Service: Service with java.lang.String = js.native
  val User: User with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNTasks with java.lang.String
  ] = js.native
}

