package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder extends js.Object

@js.native
sealed trait sortOrder extends js.Object

@JSGlobal("ej.SortOrder")
@js.native
object SortOrder extends js.Object {
  @js.native
  sealed trait Ascending
    extends ejDotWebDotAllLib.ejNs.SortOrder
  
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.SortOrder
  
  val Ascending: Ascending with java.lang.String = js.native
  val Descending: Descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SortOrder with java.lang.String] = js.native
}

@JSGlobal("ej.sortOrder")
@js.native
object sortOrder extends js.Object {
  //Enum for Ascending sort order
  @js.native
  sealed trait Ascending
    extends ejDotWebDotAllLib.ejNs.sortOrder
  
  //Enum for Descending sort order
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.sortOrder
  
  val Ascending: Ascending with java.lang.String = js.native
  val Descending: Descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.sortOrder with java.lang.String] = js.native
}

