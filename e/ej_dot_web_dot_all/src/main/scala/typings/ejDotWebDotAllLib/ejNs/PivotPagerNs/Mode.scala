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
  
  val Both: Both with java.lang.String = js.native
  val Categorical: Categorical with java.lang.String = js.native
  val Series: Series with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotPagerNs.Mode with java.lang.String] = js.native
}

