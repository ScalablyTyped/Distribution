package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Association
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNFlows
  
  //Used to specify the Message flow in a BPMN Process
  @js.native
  sealed trait Message
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNFlows
  
  //Used to specify the Sequence flow in a BPMN Process
  @js.native
  sealed trait Sequence
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNFlows
  
  val Association: Association with java.lang.String = js.native
  val Message: Message with java.lang.String = js.native
  val Sequence: Sequence with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNFlows with java.lang.String
  ] = js.native
}

