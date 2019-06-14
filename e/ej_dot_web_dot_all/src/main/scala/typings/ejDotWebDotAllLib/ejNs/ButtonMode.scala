package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonMode extends js.Object

@JSGlobal("ej.ButtonMode")
@js.native
object ButtonMode extends js.Object {
  //Displays the button in Dropdown mode
  @js.native
  sealed trait Dropdown
    extends ejDotWebDotAllLib.ejNs.ButtonMode
  
  //Displays the button in split mode
  @js.native
  sealed trait Split
    extends ejDotWebDotAllLib.ejNs.ButtonMode
  
  /* 1 */ val Dropdown: Dropdown with scala.Double = js.native
  /* 0 */ val Split: Split with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonMode with scala.Double] = js.native
}

