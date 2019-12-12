package typings.ejDotWebDotAll.ej.Autocomplete

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Autocomplete.SortOrder.Ascending
import typings.ejDotWebDotAll.ej.Autocomplete.SortOrder.Descending
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.SortOrder with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

