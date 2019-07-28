package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait Call extends BPMNBoundary
  
  //Used to set BPMN SubProcess's Boundary as Default
  @js.native
  sealed trait Default extends BPMNBoundary
  
  //Used to set BPMN SubProcess's Boundary as Event
  @js.native
  sealed trait Event extends BPMNBoundary
  
  /* 1 */ val Call: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary.Call with Double = js.native
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary.Default with Double = js.native
  /* 2 */ val Event: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.BPMNBoundary.Event with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNBoundary with Double] = js.native
}

