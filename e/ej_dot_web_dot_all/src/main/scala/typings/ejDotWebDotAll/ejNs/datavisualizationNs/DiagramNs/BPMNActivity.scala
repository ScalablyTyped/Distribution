package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait None extends BPMNActivity
  
  //Used to set BPMN Activity as SubProcess
  @js.native
  sealed trait SubProcess extends BPMNActivity
  
  //Used to set BPMN Activity as Task
  @js.native
  sealed trait Task extends BPMNActivity
  
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNActivity.None with Double = js.native
  /* 2 */ val SubProcess: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNActivity.SubProcess with Double = js.native
  /* 1 */ val Task: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNActivity.Task with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNActivity with Double] = js.native
}

