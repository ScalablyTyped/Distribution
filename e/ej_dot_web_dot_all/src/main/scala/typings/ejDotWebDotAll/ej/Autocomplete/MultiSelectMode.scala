package typings.ejDotWebDotAll.ej.Autocomplete

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode.Delimiter
import typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode.VisualMode
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.MultiSelectMode with Double] = js.native
  /* 0 */ @js.native
  object Delimiter extends TopLevel[Delimiter with Double]
  
  /* 1 */ @js.native
  object VisualMode extends TopLevel[VisualMode with Double]
  
}

