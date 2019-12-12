package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Complex
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.EventBased
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Exclusive
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.ExclusiveEventBased
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Inclusive
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.Parallel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNGateways.ParallelEventBased
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNGateways with Double] = js.native
  /* 4 */ @js.native
  object Complex extends TopLevel[Complex with Double]
  
  /* 5 */ @js.native
  object EventBased extends TopLevel[EventBased with Double]
  
  /* 1 */ @js.native
  object Exclusive extends TopLevel[Exclusive with Double]
  
  /* 6 */ @js.native
  object ExclusiveEventBased extends TopLevel[ExclusiveEventBased with Double]
  
  /* 2 */ @js.native
  object Inclusive extends TopLevel[Inclusive with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Parallel extends TopLevel[Parallel with Double]
  
  /* 7 */ @js.native
  object ParallelEventBased extends TopLevel[ParallelEventBased with Double]
  
}

