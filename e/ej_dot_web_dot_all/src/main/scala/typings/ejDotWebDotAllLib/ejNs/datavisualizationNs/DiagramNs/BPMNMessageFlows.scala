package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNMessageFlows
  
  //Used to notate the instantiating message flow in a BPMN Process
  @js.native
  sealed trait InitiatingMessage
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNMessageFlows
  
  //Used to notate the non-instantiating message flow in a BPMN Process
  @js.native
  sealed trait NonInitiatingMessage
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNMessageFlows
  
  val Default: Default with java.lang.String = js.native
  val InitiatingMessage: InitiatingMessage with java.lang.String = js.native
  val NonInitiatingMessage: NonInitiatingMessage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNMessageFlows with java.lang.String
  ] = js.native
}

