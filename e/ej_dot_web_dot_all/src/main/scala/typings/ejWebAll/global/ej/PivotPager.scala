package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected ()
  extends typings.ejWebAll.ej.PivotPager {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotPager.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotPager.Model) = this()
}

/* static members */
@JSGlobal("ej.PivotPager")
@js.native
object PivotPager extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.PivotPager = js.native
  @js.native
  object Mode extends js.Object {
    /* 0 */ val Both: typings.ejWebAll.ej.PivotPager.Mode.Both with Double = js.native
    /* 1 */ val Categorical: typings.ejWebAll.ej.PivotPager.Mode.Categorical with Double = js.native
    /* 2 */ val Series: typings.ejWebAll.ej.PivotPager.Mode.Series with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotPager.Mode with Double] = js.native
  }
  
}

