package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNMessageFlows extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNMessageFlows")
@js.native
object BPMNMessageFlows extends js.Object {
  //Used to notate the default message flow in a BPMN Process
  @js.native
  sealed trait Default extends BPMNMessageFlows
  
  //Used to notate the instantiating message flow in a BPMN Process
  @js.native
  sealed trait InitiatingMessage extends BPMNMessageFlows
  
  //Used to notate the non-instantiating message flow in a BPMN Process
  @js.native
  sealed trait NonInitiatingMessage extends BPMNMessageFlows
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNMessageFlows with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object InitiatingMessage extends TopLevel[InitiatingMessage with Double]
  
  /* 2 */ @js.native
  object NonInitiatingMessage extends TopLevel[NonInitiatingMessage with Double]
  
}

