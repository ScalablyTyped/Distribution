package typings.ejDotWebDotAll.ejNs.ComboBoxNs

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
    extends typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder
  
  ///The data source is sorting with descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder
  
  ///The data source is not sorting.
  @js.native
  sealed trait None
    extends typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder
  
  /* 1 */ val Ascending: typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder.Ascending with Double = js.native
  /* 2 */ val Descending: typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder.Descending with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.ComboBoxNs.SortOrder with Double] = js.native
}

