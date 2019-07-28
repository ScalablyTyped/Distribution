package typings.ejDotWebDotAll.ejNs

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
  sealed trait Dropdown extends ButtonMode
  
  //Displays the button in split mode
  @js.native
  sealed trait Split extends ButtonMode
  
  /* 1 */ val Dropdown: typings.ejDotWebDotAll.ejNs.ButtonMode.Dropdown with Double = js.native
  /* 0 */ val Split: typings.ejDotWebDotAll.ejNs.ButtonMode.Split with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonMode with Double] = js.native
}

