package typings.ejDotWebDotAll.ejNs.AutocompleteNs

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
    extends typings.ejDotWebDotAll.ejNs.AutocompleteNs.SortOrder
  
  ///Items to be displayed in the suggestion list in descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ejNs.AutocompleteNs.SortOrder
  
  /* 0 */ val Ascending: typings.ejDotWebDotAll.ejNs.AutocompleteNs.SortOrder.Ascending with Double = js.native
  /* 1 */ val Descending: typings.ejDotWebDotAll.ejNs.AutocompleteNs.SortOrder.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.AutocompleteNs.SortOrder with Double] = js.native
}

