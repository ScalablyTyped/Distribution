package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Event
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSubProcessTypes
  
  //Used to set BPMN SubProcess type as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSubProcessTypes
  
  //Used to set BPMN SubProcess type as Transaction
  @js.native
  sealed trait Transaction
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSubProcessTypes
  
  /* 2 */ val Event: Event with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Transaction: Transaction with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSubProcessTypes with scala.Double
  ] = js.native
}

