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
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val InitiatingMessage: InitiatingMessage with scala.Double = js.native
  /* 2 */ val NonInitiatingMessage: NonInitiatingMessage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNMessageFlows with scala.Double
  ] = js.native
}

