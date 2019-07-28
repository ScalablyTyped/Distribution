package typings.ejDotWebDotAll.ejNs.PivotPagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.PivotPager.Mode")
@js.native
object Mode extends js.Object {
  ///To set both categorical and series pager for paging.
  @js.native
  sealed trait Both extends Mode
  
  ///To set only categorical pager for paging.
  @js.native
  sealed trait Categorical extends Mode
  
  ///To set only series pager for paging.
  @js.native
  sealed trait Series extends Mode
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Mode.Both with Double = js.native
  /* 1 */ val Categorical: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Mode.Categorical with Double = js.native
  /* 2 */ val Series: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Mode.Series with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
}

