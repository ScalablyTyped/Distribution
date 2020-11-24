package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends js.Object
@JSGlobal("ej.ButtonType")
@js.native
object ButtonType extends js.Object {
  
  //Creates button with Built-in button type specified
  @js.native
  sealed trait Button extends ButtonType
  
  //Creates button with Built-in reset type specified
  @js.native
  sealed trait Reset extends ButtonType
  
  //Creates button with Built-in submit type specified
  @js.native
  sealed trait Submit extends ButtonType
}
