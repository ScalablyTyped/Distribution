package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNEvents with Double] = js.native
  /* 2 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 1 */ @js.native
  object Intermediate extends TopLevel[Intermediate with Double]
  
  /* 4 */ @js.native
  object NonInterruptingIntermediate extends TopLevel[NonInterruptingIntermediate with Double]
  
  /* 3 */ @js.native
  object NonInterruptingStart extends TopLevel[NonInterruptingStart with Double]
  
  /* 0 */ @js.native
  object Start extends TopLevel[Start with Double]
  
  /* 5 */ @js.native
  object ThrowingIntermediate extends TopLevel[ThrowingIntermediate with Double]
  
}

