package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Medium: typings.ejDotWebDotAll.ej.CheckboxSize.Medium with Double = js.native
  /* 1 */ val Small: typings.ejDotWebDotAll.ej.CheckboxSize.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxSize with Double] = js.native
}

