package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNBoundary.Call
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNBoundary.Default
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNBoundary.Event
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNBoundary with Double] = js.native
  /* 1 */ @js.native
  object Call extends TopLevel[Call with Double]
  
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 2 */ @js.native
  object Event extends TopLevel[Event with Double]
  
}

