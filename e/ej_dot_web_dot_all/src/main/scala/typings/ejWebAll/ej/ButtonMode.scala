package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonMode extends StObject
@JSGlobal("ej.ButtonMode")
@js.native
object ButtonMode extends StObject {
  
  //Displays the button in Dropdown mode
  @js.native
  sealed trait Dropdown extends ButtonMode
  
  //Displays the button in split mode
  @js.native
  sealed trait Split extends ButtonMode
}
