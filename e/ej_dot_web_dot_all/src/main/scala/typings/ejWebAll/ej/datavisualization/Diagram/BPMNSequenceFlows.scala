package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNSequenceFlows extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNSequenceFlows")
@js.native
object BPMNSequenceFlows extends js.Object {
  //Used to notate the conditional sequence flow in a BPMN Process
  @js.native
  sealed trait Conditional extends BPMNSequenceFlows
  
  //Used to notate the default sequence flow in a BPMN Process
  @js.native
  sealed trait Default extends BPMNSequenceFlows
  
  //Used to notate the normal sequence flow in a BPMN Process
  @js.native
  sealed trait Normal extends BPMNSequenceFlows
  
}

