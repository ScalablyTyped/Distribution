package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
