package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Tool extends js.Object
@JSGlobal("ej.datavisualization.Diagram.Tool")
@js.native
object Tool extends js.Object {
  
  //Enables/Disables ContinuousDraw tool
  @js.native
  sealed trait ContinuesDraw extends Tool
  
  //Enables/Disables DrawOnce tool
  @js.native
  sealed trait DrawOnce extends Tool
  
  //Enables/Disables MultiSelect tool
  @js.native
  sealed trait MultipleSelect extends Tool
  
  //Disables all Tools
  @js.native
  sealed trait None extends Tool
  
  //Enables/Disables SingleSelect tool
  @js.native
  sealed trait SingleSelect extends Tool
  
  //Enables/Disables ZoomPan tool
  @js.native
  sealed trait ZoomPan extends Tool
}
