package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNLoops
  
  //Used to set BPMN Activity's Loop as ParallelMultiInstance
  @js.native
  sealed trait ParallelMultiInstance
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNLoops
  
  //Used to set BPMN Activity's Loop as SequenceMultiInstance
  @js.native
  sealed trait SequenceMultiInstance
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNLoops
  
  //Used to set BPMN Activity's Loop as Standard
  @js.native
  sealed trait Standard
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNLoops
  
  val None: None with java.lang.String = js.native
  val ParallelMultiInstance: ParallelMultiInstance with java.lang.String = js.native
  val SequenceMultiInstance: SequenceMultiInstance with java.lang.String = js.native
  val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNLoops with java.lang.String
  ] = js.native
}

