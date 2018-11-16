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
  
  val Event: Event with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Transaction: Transaction with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSubProcessTypes with java.lang.String
  ] = js.native
}

