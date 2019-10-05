package typings.ejDotWebDotAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder extends js.Object

@JSGlobal("ej.ListBox.SortOrder")
@js.native
object SortOrder extends js.Object {
  ///To sort items in Ascending order.
  @js.native
  sealed trait Ascending
    extends typings.ejDotWebDotAll.ej.ListBox.SortOrder
  
  ///To sort items in Descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ej.ListBox.SortOrder
  
  ///The items are not sorted.
  @js.native
  sealed trait None
    extends typings.ejDotWebDotAll.ej.ListBox.SortOrder
  
  /* 1 */ val Ascending: typings.ejDotWebDotAll.ej.ListBox.SortOrder.Ascending with Double = js.native
  /* 2 */ val Descending: typings.ejDotWebDotAll.ej.ListBox.SortOrder.Descending with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.ListBox.SortOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.ListBox.SortOrder with Double] = js.native
}

