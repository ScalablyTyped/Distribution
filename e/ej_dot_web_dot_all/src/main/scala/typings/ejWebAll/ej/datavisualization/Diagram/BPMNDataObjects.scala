package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
