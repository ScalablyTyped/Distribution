package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNSequenceFlows extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNSequenceFlows")
@js.native
object BPMNSequenceFlows extends js.Object {
  //Used to notate the conditional sequence flow in a BPMN Process
  @js.native
  sealed trait Conditional
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSequenceFlows
  
  //Used to notate the default sequence flow in a BPMN Process
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSequenceFlows
  
  //Used to notate the normal sequence flow in a BPMN Process
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSequenceFlows
  
  val Conditional: Conditional with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNSequenceFlows with java.lang.String
  ] = js.native
}

