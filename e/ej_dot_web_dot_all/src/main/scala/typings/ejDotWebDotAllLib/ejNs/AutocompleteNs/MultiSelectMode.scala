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
  
  val Delimiter: Delimiter with java.lang.String = js.native
  val VisualMode: VisualMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.AutocompleteNs.MultiSelectMode with java.lang.String] = js.native
}

