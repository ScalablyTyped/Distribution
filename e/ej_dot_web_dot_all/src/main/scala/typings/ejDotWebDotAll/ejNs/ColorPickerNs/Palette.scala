package typings.ejDotWebDotAll.ejNs.ColorPickerNs

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
  sealed trait BasicPalette extends Palette
  
  ///used to show the custompalette
  @js.native
  sealed trait CustomPalette extends Palette
  
  /* 0 */ val BasicPalette: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Palette.BasicPalette with Double = js.native
  /* 1 */ val CustomPalette: typings.ejDotWebDotAll.ejNs.ColorPickerNs.Palette.CustomPalette with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Palette with Double] = js.native
}

