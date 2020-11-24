package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckboxSize extends js.Object
@JSGlobal("ej.CheckboxSize")
@js.native
object CheckboxSize extends js.Object {
  
  //Displays the CheckBox in medium size
  @js.native
  sealed trait Medium extends CheckboxSize
  
  //Displays the CheckBox in small size
  @js.native
  sealed trait Small extends CheckboxSize
}
