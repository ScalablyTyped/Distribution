package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val Association: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNFlows.Association with Double = js.native
  /* 2 */ val Message: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNFlows.Message with Double = js.native
  /* 0 */ val Sequence: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNFlows.Sequence with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNFlows with Double] = js.native
}

