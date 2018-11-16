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
  
  val End: End with java.lang.String = js.native
  val Intermediate: Intermediate with java.lang.String = js.native
  val NonInterruptingIntermediate: NonInterruptingIntermediate with java.lang.String = js.native
  val NonInterruptingStart: NonInterruptingStart with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val ThrowingIntermediate: ThrowingIntermediate with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNEvents with java.lang.String
  ] = js.native
}

