package typings
package ejDotWebDotAllLib.ejNs.ComboBoxNs

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
    extends ejDotWebDotAllLib.ejNs.ComboBoxNs.SortOrder
  
  ///The data source is sorting with descending order.
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.ComboBoxNs.SortOrder
  
  ///The data source is not sorting.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.ComboBoxNs.SortOrder
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 2 */ val Descending: Descending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ComboBoxNs.SortOrder with scala.Double] = js.native
}

