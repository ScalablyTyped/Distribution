package typings.ejDotWebDotAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder extends js.Object

@JSGlobal("ej.ComboBox.SortOrder")
@js.native
object SortOrder extends js.Object {
  ///The data source is sorting with ascending order.
  @js.native
  sealed trait Ascending
    extends typings.ejDotWebDotAll.ej.ComboBox.SortOrder
  
  ///The data source is sorting with descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ej.ComboBox.SortOrder
  
  ///The data source is not sorting.
  @js.native
  sealed trait None
    extends typings.ejDotWebDotAll.ej.ComboBox.SortOrder
  
  /* 1 */ val Ascending: typings.ejDotWebDotAll.ej.ComboBox.SortOrder.Ascending with Double = js.native
  /* 2 */ val Descending: typings.ejDotWebDotAll.ej.ComboBox.SortOrder.Descending with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.ComboBox.SortOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.ComboBox.SortOrder with Double] = js.native
}

