package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sortOrder with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

