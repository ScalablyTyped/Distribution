package typings.ejDotWebDotAll.ej.ColorPicker

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Palette extends ModelType
  
  ///support palette type mode in color picker.
  @js.native
  sealed trait Picker extends ModelType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModelType with Double] = js.native
  /* 0 */ @js.native
  object Palette
    extends TopLevel[typings.ejDotWebDotAll.ej.ColorPicker.ModelType.Palette with Double]
  
  /* 1 */ @js.native
  object Picker extends TopLevel[Picker with Double]
  
}

