package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNActivity with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object SubProcess extends TopLevel[SubProcess with Double]
  
  /* 1 */ @js.native
  object Task extends TopLevel[Task with Double]
  
}

