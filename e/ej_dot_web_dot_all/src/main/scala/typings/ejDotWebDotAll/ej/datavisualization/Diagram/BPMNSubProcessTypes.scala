package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNSubProcessTypes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNSubProcessTypes")
@js.native
object BPMNSubProcessTypes extends js.Object {
  //Used to set BPMN SubProcess type as Event
  @js.native
  sealed trait Event extends BPMNSubProcessTypes
  
  //Used to set BPMN SubProcess type as None
  @js.native
  sealed trait None extends BPMNSubProcessTypes
  
  //Used to set BPMN SubProcess type as Transaction
  @js.native
  sealed trait Transaction extends BPMNSubProcessTypes
  
  /* 2 */ val Event: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Event with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.None with Double = js.native
  /* 1 */ val Transaction: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Transaction with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNSubProcessTypes with Double] = js.native
}

