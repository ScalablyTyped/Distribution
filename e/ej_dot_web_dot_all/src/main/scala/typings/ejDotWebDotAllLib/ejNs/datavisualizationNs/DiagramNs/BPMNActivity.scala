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
  
  val None: None with java.lang.String = js.native
  val SubProcess: SubProcess with java.lang.String = js.native
  val Task: Task with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNActivity with java.lang.String
  ] = js.native
}

