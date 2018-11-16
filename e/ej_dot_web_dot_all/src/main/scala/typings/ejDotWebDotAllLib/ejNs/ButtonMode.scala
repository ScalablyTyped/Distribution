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
  
  val Dropdown: Dropdown with java.lang.String = js.native
  val Split: Split with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonMode with java.lang.String] = js.native
}

