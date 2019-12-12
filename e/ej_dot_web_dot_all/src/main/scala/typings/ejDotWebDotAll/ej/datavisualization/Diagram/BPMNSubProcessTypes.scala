package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Event
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.None
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNSubProcessTypes.Transaction
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNSubProcessTypes with Double] = js.native
  /* 2 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Transaction extends TopLevel[Transaction with Double]
  
}

