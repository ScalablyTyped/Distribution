package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BPMNFlows extends js.Object
@JSGlobal("ej.datavisualization.Diagram.BPMNFlows")
@js.native
object BPMNFlows extends js.Object {
  
  //Used to specify the Association flow in a BPMN Process
  @js.native
  sealed trait Association extends BPMNFlows
  
  //Used to specify the Message flow in a BPMN Process
  @js.native
  sealed trait Message extends BPMNFlows
  
  //Used to specify the Sequence flow in a BPMN Process
  @js.native
  sealed trait Sequence extends BPMNFlows
}
