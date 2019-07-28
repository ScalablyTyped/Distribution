package typings.ejDotWebDotAll.ejNs

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
  sealed trait Ascending extends SortOrder
  
  @js.native
  sealed trait Descending extends SortOrder
  
  /* 0 */ val Ascending: typings.ejDotWebDotAll.ejNs.SortOrder.Ascending with Double = js.native
  /* 1 */ val Descending: typings.ejDotWebDotAll.ejNs.SortOrder.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder with Double] = js.native
}

@JSGlobal("ej.sortOrder")
@js.native
object sortOrder extends js.Object {
  //Enum for Ascending sort order
  @js.native
  sealed trait Ascending extends sortOrder
  
  //Enum for Descending sort order
  @js.native
  sealed trait Descending extends sortOrder
  
  /* 0 */ val Ascending: typings.ejDotWebDotAll.ejNs.sortOrder.Ascending with Double = js.native
  /* 1 */ val Descending: typings.ejDotWebDotAll.ejNs.sortOrder.Descending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sortOrder with Double] = js.native
}

