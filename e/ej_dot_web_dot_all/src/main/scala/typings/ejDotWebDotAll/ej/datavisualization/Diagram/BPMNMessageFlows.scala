package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNMessageFlows.Default with Double = js.native
  /* 1 */ val InitiatingMessage: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNMessageFlows.InitiatingMessage with Double = js.native
  /* 2 */ val NonInitiatingMessage: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNMessageFlows.NonInitiatingMessage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNMessageFlows with Double] = js.native
}

