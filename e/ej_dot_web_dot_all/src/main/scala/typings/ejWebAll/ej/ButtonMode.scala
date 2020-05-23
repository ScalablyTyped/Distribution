package typings.ejWebAll.ej

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
  
}

