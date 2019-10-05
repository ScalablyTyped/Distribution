package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 4 */ val Complex: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Complex with Double = js.native
  /* 5 */ val EventBased: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.EventBased with Double = js.native
  /* 1 */ val Exclusive: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Exclusive with Double = js.native
  /* 6 */ val ExclusiveEventBased: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.ExclusiveEventBased with Double = js.native
  /* 2 */ val Inclusive: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Inclusive with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.None with Double = js.native
  /* 3 */ val Parallel: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Parallel with Double = js.native
  /* 7 */ val ParallelEventBased: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.ParallelEventBased with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNGateways with Double] = js.native
}

