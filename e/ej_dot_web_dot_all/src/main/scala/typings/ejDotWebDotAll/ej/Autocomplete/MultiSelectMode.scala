package typings.ejDotWebDotAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MultiSelectMode extends js.Object

@JSGlobal("ej.Autocomplete.MultiSelectMode")
@js.native
object MultiSelectMode extends js.Object {
  ///Multiple values are separated using a given special character.
  @js.native
  sealed trait Delimiter
    extends typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode
  
  ///Each values are displayed in separate box with close button.
  @js.native
  sealed trait VisualMode
    extends typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode
  
  /* 0 */ val Delimiter: typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode.Delimiter with Double = js.native
  /* 1 */ val VisualMode: typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode.VisualMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode with Double] = js.native
}

