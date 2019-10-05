package typings.ejDotWebDotAll.ej.Autocomplete

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
    extends typings.ejDotWebDotAll.ej.Autocomplete.SortOrder
  
  ///Items to be displayed in the suggestion list in descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ej.Autocomplete.SortOrder
  
  /* 0 */ val Ascending: typings.ejDotWebDotAll.ej.Autocomplete.SortOrder.Ascending with Double = js.native
  /* 1 */ val Descending: typings.ejDotWebDotAll.ej.Autocomplete.SortOrder.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.SortOrder with Double] = js.native
}

