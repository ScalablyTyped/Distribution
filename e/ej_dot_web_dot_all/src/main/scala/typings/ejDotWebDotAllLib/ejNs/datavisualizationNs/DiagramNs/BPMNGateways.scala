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
  
  val Complex: Complex with java.lang.String = js.native
  val EventBased: EventBased with java.lang.String = js.native
  val Exclusive: Exclusive with java.lang.String = js.native
  val ExclusiveEventBased: ExclusiveEventBased with java.lang.String = js.native
  val Inclusive: Inclusive with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Parallel: Parallel with java.lang.String = js.native
  val ParallelEventBased: ParallelEventBased with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNGateways with java.lang.String
  ] = js.native
}

