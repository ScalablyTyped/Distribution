package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNDataObjects extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNDataObjects")
@js.native
object BPMNDataObjects extends js.Object {
  //Used to notate the Input type BPMN data object
  @js.native
  sealed trait Input extends BPMNDataObjects
  
  //Used to set BPMN data object type as None
  @js.native
  sealed trait None extends BPMNDataObjects
  
  //Used to notate the Output type BPMN data object
  @js.native
  sealed trait Output extends BPMNDataObjects
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNDataObjects with Double] = js.native
  /* 0 */ @js.native
  object Input extends TopLevel[Input with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Output extends TopLevel[Output with Double]
  
}

