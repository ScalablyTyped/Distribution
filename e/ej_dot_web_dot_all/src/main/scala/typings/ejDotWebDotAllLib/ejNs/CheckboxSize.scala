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
  
  val Medium: Medium with java.lang.String = js.native
  val Small: Small with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.CheckboxSize with java.lang.String] = js.native
}

