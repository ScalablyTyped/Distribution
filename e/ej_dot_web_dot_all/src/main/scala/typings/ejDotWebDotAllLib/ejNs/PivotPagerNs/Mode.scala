package typings
package ejDotWebDotAllLib.ejNs.PivotPagerNs

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
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.PivotPagerNs.Mode
  
  ///To set only categorical pager for paging.
  @js.native
  sealed trait Categorical
    extends ejDotWebDotAllLib.ejNs.PivotPagerNs.Mode
  
  ///To set only series pager for paging.
  @js.native
  sealed trait Series
    extends ejDotWebDotAllLib.ejNs.PivotPagerNs.Mode
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 1 */ val Categorical: Categorical with scala.Double = js.native
  /* 2 */ val Series: Series with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotPagerNs.Mode with scala.Double] = js.native
}

