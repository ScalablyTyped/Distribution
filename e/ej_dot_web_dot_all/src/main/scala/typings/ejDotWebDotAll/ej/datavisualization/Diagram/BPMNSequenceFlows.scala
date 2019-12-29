package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Conditional extends BPMNSequenceFlows
  
  //Used to notate the default sequence flow in a BPMN Process
  @js.native
  sealed trait Default extends BPMNSequenceFlows
  
  //Used to notate the normal sequence flow in a BPMN Process
  @js.native
  sealed trait Normal extends BPMNSequenceFlows
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNSequenceFlows with Double] = js.native
  /* 1 */ @js.native
  object Conditional extends TopLevel[Conditional with Double]
  
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

