package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder extends js.Object

@JSGlobal("ej.Autocomplete.SortOrder")
@js.native
object SortOrder extends js.Object {
  ///Items to be displayed in the suggestion list in ascending order.
  @js.native
  sealed trait Ascending
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.SortOrder
  
  ///Items to be displayed in the suggestion list in descending order.
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.SortOrder
  
  val Ascending: Ascending with java.lang.String = js.native
  val Descending: Descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.AutocompleteNs.SortOrder with java.lang.String] = js.native
}

