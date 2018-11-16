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
  
  val BasicPalette: BasicPalette with java.lang.String = js.native
  val CustomPalette: CustomPalette with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ColorPickerNs.Palette with java.lang.String] = js.native
}

