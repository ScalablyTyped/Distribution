package typings.ejWebAll.ej.ColorPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelType extends js.Object
@JSGlobal("ej.ColorPicker.ModelType")
@js.native
object ModelType extends js.Object {
  
  ///support palette type mode in color picker.
  @js.native
  sealed trait Palette extends ModelType
  
  ///support palette type mode in color picker.
  @js.native
  sealed trait Picker extends ModelType
}
