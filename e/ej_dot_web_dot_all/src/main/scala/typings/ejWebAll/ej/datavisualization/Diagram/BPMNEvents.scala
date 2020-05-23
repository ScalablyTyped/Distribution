package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

