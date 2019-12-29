package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNFlows with Double] = js.native
  /* 1 */ @js.native
  object Association extends TopLevel[Association with Double]
  
  /* 2 */ @js.native
  object Message extends TopLevel[Message with Double]
  
  /* 0 */ @js.native
  object Sequence extends TopLevel[Sequence with Double]
  
}

