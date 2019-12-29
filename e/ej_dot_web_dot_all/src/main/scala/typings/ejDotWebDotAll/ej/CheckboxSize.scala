package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxSize with Double] = js.native
  /* 0 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 1 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}

