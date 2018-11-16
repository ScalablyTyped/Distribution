package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNBoundary extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNBoundary")
@js.native
object BPMNBoundary extends js.Object {
  //Used to set BPMN SubProcess's Boundary as Call
  @js.native
  sealed trait Call
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary
  
  //Used to set BPMN SubProcess's Boundary as Default
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary
  
  //Used to set BPMN SubProcess's Boundary as Event
  @js.native
  sealed trait Event
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary
  
  val Call: Call with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Event: Event with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary with java.lang.String
  ] = js.native
}

