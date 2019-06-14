package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

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
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.MultiSelectMode
  
  ///Each values are displayed in separate box with close button.
  @js.native
  sealed trait VisualMode
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.MultiSelectMode
  
  /* 0 */ val Delimiter: Delimiter with scala.Double = js.native
  /* 1 */ val VisualMode: VisualMode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.AutocompleteNs.MultiSelectMode with scala.Double] = js.native
}

