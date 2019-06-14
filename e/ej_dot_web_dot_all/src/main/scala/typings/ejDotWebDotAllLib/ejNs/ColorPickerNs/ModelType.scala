package typings
package ejDotWebDotAllLib.ejNs.ColorPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModelType extends js.Object

@JSGlobal("ej.ColorPicker.ModelType")
@js.native
object ModelType extends js.Object {
  ///support palette type mode in color picker.
  @js.native
  sealed trait Palette
    extends ejDotWebDotAllLib.ejNs.ColorPickerNs.ModelType
  
  ///support palette type mode in color picker.
  @js.native
  sealed trait Picker
    extends ejDotWebDotAllLib.ejNs.ColorPickerNs.ModelType
  
  /* 0 */ val Palette: Palette with scala.Double = js.native
  /* 1 */ val Picker: Picker with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ColorPickerNs.ModelType with scala.Double] = js.native
}

