package typings
package ejDotWebDotAllLib.ejNs.ColorPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Palette extends js.Object

@JSGlobal("ej.ColorPicker.Palette")
@js.native
object Palette extends js.Object {
  ///used to show the basic palette
  @js.native
  sealed trait BasicPalette
    extends ejDotWebDotAllLib.ejNs.ColorPickerNs.Palette
  
  ///used to show the custompalette
  @js.native
  sealed trait CustomPalette
    extends ejDotWebDotAllLib.ejNs.ColorPickerNs.Palette
  
  /* 0 */ val BasicPalette: BasicPalette with scala.Double = js.native
  /* 1 */ val CustomPalette: CustomPalette with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ColorPickerNs.Palette with scala.Double] = js.native
}

