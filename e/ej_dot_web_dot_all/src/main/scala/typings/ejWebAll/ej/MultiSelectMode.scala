package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MultiSelectMode extends js.Object
@JSGlobal("ej.MultiSelectMode")
@js.native
object MultiSelectMode extends js.Object {
  
  //can select multiple items and it's separated by delimiterChar
  @js.native
  sealed trait Delimiter extends MultiSelectMode
  
  //can select only single item in DropDownList
  @js.native
  sealed trait None extends MultiSelectMode
  
  //can select multiple items and it's show's like visual box in textbox
  @js.native
  sealed trait VisualMode extends MultiSelectMode
}
