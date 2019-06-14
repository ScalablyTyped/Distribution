package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait End
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  //Used to set BPMN Event as Intermediate
  @js.native
  sealed trait Intermediate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  //Used to set BPMN Event as NonInterruptingIntermediate
  @js.native
  sealed trait NonInterruptingIntermediate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  //Used to set BPMN Event as NonInterruptingStart
  @js.native
  sealed trait NonInterruptingStart
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  //Used to set BPMN Event as Start
  @js.native
  sealed trait Start
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  //Used to set BPMN Event as ThrowingIntermediate
  @js.native
  sealed trait ThrowingIntermediate
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents
  
  /* 2 */ val End: End with scala.Double = js.native
  /* 1 */ val Intermediate: Intermediate with scala.Double = js.native
  /* 4 */ val NonInterruptingIntermediate: NonInterruptingIntermediate with scala.Double = js.native
  /* 3 */ val NonInterruptingStart: NonInterruptingStart with scala.Double = js.native
  /* 0 */ val Start: Start with scala.Double = js.native
  /* 5 */ val ThrowingIntermediate: ThrowingIntermediate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents with scala.Double
  ] = js.native
}

