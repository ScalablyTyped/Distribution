package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait Medium
    extends ejDotWebDotAllLib.ejNs.CheckboxSize
  
  //Displays the CheckBox in small size
  @js.native
  sealed trait Small
    extends ejDotWebDotAllLib.ejNs.CheckboxSize
  
  /* 0 */ val Medium: Medium with scala.Double = js.native
  /* 1 */ val Small: Small with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.CheckboxSize with scala.Double] = js.native
}

