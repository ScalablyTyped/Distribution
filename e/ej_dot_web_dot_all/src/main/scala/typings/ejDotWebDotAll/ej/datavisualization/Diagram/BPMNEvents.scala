package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNEvents extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNEvents")
@js.native
object BPMNEvents extends js.Object {
  //Used to set BPMN Event as End
  @js.native
  sealed trait End extends BPMNEvents
  
  //Used to set BPMN Event as Intermediate
  @js.native
  sealed trait Intermediate extends BPMNEvents
  
  //Used to set BPMN Event as NonInterruptingIntermediate
  @js.native
  sealed trait NonInterruptingIntermediate extends BPMNEvents
  
  //Used to set BPMN Event as NonInterruptingStart
  @js.native
  sealed trait NonInterruptingStart extends BPMNEvents
  
  //Used to set BPMN Event as Start
  @js.native
  sealed trait Start extends BPMNEvents
  
  //Used to set BPMN Event as ThrowingIntermediate
  @js.native
  sealed trait ThrowingIntermediate extends BPMNEvents
  
  /* 2 */ val End: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.End with Double = js.native
  /* 1 */ val Intermediate: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.Intermediate with Double = js.native
  /* 4 */ val NonInterruptingIntermediate: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.NonInterruptingIntermediate with Double = js.native
  /* 3 */ val NonInterruptingStart: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.NonInterruptingStart with Double = js.native
  /* 0 */ val Start: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.Start with Double = js.native
  /* 5 */ val ThrowingIntermediate: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNEvents.ThrowingIntermediate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNEvents with Double] = js.native
}

