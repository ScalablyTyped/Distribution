package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Complex
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as EventBased
  @js.native
  sealed trait EventBased
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as Exclusive
  @js.native
  sealed trait Exclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as ExclusiveEventBased
  @js.native
  sealed trait ExclusiveEventBased
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as Inclusive
  @js.native
  sealed trait Inclusive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as Parallel
  @js.native
  sealed trait Parallel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  //Used to set BPMN Gateway as ParallelEventBased
  @js.native
  sealed trait ParallelEventBased
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways
  
  /* 4 */ val Complex: Complex with scala.Double = js.native
  /* 5 */ val EventBased: EventBased with scala.Double = js.native
  /* 1 */ val Exclusive: Exclusive with scala.Double = js.native
  /* 6 */ val ExclusiveEventBased: ExclusiveEventBased with scala.Double = js.native
  /* 2 */ val Inclusive: Inclusive with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val Parallel: Parallel with scala.Double = js.native
  /* 7 */ val ParallelEventBased: ParallelEventBased with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways with scala.Double
  ] = js.native
}

