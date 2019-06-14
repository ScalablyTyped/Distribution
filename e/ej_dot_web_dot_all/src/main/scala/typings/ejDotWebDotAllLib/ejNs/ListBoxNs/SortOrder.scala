package typings
package ejDotWebDotAllLib.ejNs.ListBoxNs

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
    extends ejDotWebDotAllLib.ejNs.ListBoxNs.SortOrder
  
  ///To sort items in Descending order.
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.ListBoxNs.SortOrder
  
  ///The items are not sorted.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.ListBoxNs.SortOrder
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 2 */ val Descending: Descending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ListBoxNs.SortOrder with scala.Double] = js.native
}

