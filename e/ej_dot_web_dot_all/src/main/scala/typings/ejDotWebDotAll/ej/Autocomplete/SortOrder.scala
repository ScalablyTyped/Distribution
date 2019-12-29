package typings.ejDotWebDotAll.ej.Autocomplete

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Ascending extends SortOrder
  
  ///Items to be displayed in the suggestion list in descending order.
  @js.native
  sealed trait Descending extends SortOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

