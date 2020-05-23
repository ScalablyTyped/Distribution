package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNGateways extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNGateways")
@js.native
object BPMNGateways extends js.Object {
  //Used to set BPMN Gateway as Complex
  @js.native
  sealed trait Complex extends BPMNGateways
  
  //Used to set BPMN Gateway as EventBased
  @js.native
  sealed trait EventBased extends BPMNGateways
  
  //Used to set BPMN Gateway as Exclusive
  @js.native
  sealed trait Exclusive extends BPMNGateways
  
  //Used to set BPMN Gateway as ExclusiveEventBased
  @js.native
  sealed trait ExclusiveEventBased extends BPMNGateways
  
  //Used to set BPMN Gateway as Inclusive
  @js.native
  sealed trait Inclusive extends BPMNGateways
  
  //Used to set BPMN Gateway as None
  @js.native
  sealed trait None extends BPMNGateways
  
  //Used to set BPMN Gateway as Parallel
  @js.native
  sealed trait Parallel extends BPMNGateways
  
  //Used to set BPMN Gateway as ParallelEventBased
  @js.native
  sealed trait ParallelEventBased extends BPMNGateways
  
}

