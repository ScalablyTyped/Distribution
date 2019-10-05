package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 0 */ val Input: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNDataObjects.Input with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNDataObjects.None with Double = js.native
  /* 1 */ val Output: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNDataObjects.Output with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNDataObjects with Double] = js.native
}

