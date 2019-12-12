package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.ButtonMode.Dropdown
import typings.ejDotWebDotAll.ej.ButtonMode.Split
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonMode with Double] = js.native
  /* 1 */ @js.native
  object Dropdown extends TopLevel[Dropdown with Double]
  
  /* 0 */ @js.native
  object Split extends TopLevel[Split with Double]
  
}

