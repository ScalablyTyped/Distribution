package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

