package typings.ejWebAll.ej.ColorPicker

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Palette with Double] = js.native
  /* 0 */ @js.native
  object BasicPalette extends TopLevel[BasicPalette with Double]
  
  /* 1 */ @js.native
  object CustomPalette extends TopLevel[CustomPalette with Double]
  
}

