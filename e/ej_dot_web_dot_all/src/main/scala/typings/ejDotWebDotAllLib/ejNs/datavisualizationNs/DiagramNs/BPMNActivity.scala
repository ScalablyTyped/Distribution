package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNActivity extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNActivity")
@js.native
object BPMNActivity extends js.Object {
  //Used to set BPMN Activity as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNActivity
  
  //Used to set BPMN Activity as SubProcess
  @js.native
  sealed trait SubProcess
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNActivity
  
  //Used to set BPMN Activity as Task
  @js.native
  sealed trait Task
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNActivity
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val SubProcess: SubProcess with scala.Double = js.native
  /* 1 */ val Task: Task with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNActivity with scala.Double
  ] = js.native
}

