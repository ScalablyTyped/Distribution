package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNLoops extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNLoops")
@js.native
object BPMNLoops extends js.Object {
  //Used to set BPMN Activity's Loop as None
  @js.native
  sealed trait None extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as ParallelMultiInstance
  @js.native
  sealed trait ParallelMultiInstance extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as SequenceMultiInstance
  @js.native
  sealed trait SequenceMultiInstance extends BPMNLoops
  
  //Used to set BPMN Activity's Loop as Standard
  @js.native
  sealed trait Standard extends BPMNLoops
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNLoops with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object ParallelMultiInstance extends TopLevel[ParallelMultiInstance with Double]
  
  /* 3 */ @js.native
  object SequenceMultiInstance extends TopLevel[SequenceMultiInstance with Double]
  
  /* 1 */ @js.native
  object Standard extends TopLevel[Standard with Double]
  
}

