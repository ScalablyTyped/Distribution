package typings.ejDotWebDotAll.ej.ComboBox

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Ascending extends SortOrder
  
  ///The data source is sorting with descending order.
  @js.native
  sealed trait Descending extends SortOrder
  
  ///The data source is not sorting.
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

