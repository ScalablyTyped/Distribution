package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSGlobal("ej.Ribbon.Type")
@js.native
object Type extends js.Object {
  
  ///Specifies the button control
  @js.native
  sealed trait Button extends Type
  
  ///To append external element's
  @js.native
  sealed trait Custom extends Type
  
  ///Specifies the dropDown
  @js.native
  sealed trait DropDownList extends Type
  
  ///Specifies the ribbon gallery
  @js.native
  sealed trait Gallery extends Type
  
  ///Specifies the split button
  @js.native
  sealed trait SplitButton extends Type
  
  ///Specifies the toggle button
  @js.native
  sealed trait ToggleButton extends Type
}
