package typings.ejDotWebDotAll.ej.ListBox

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Ascending extends SortOrder
  
  ///To sort items in Descending order.
  @js.native
  sealed trait Descending extends SortOrder
  
  ///The items are not sorted.
  @js.native
  sealed trait None extends SortOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder with Double] = js.native
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

