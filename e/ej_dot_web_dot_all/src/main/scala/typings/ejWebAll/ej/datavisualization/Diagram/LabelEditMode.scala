package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelEditMode extends js.Object
@JSGlobal("ej.datavisualization.Diagram.LabelEditMode")
@js.native
object LabelEditMode extends js.Object {
  
  //Used to set label edit mode as edit
  @js.native
  sealed trait Edit extends LabelEditMode
  
  //Used to set label edit mode as view
  @js.native
  sealed trait View extends LabelEditMode
}
