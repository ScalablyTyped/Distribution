package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotGrid")
@js.native
class PivotGrid protected ()
  extends typings.ejWebAll.ej.PivotGrid {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotGrid.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotGrid.Model) = this()
}

/* static members */
@JSGlobal("ej.PivotGrid")
@js.native
object PivotGrid extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.PivotGrid = js.native
  @js.native
  object Layout extends js.Object {
    /* 3 */ val ExcelLikeLayout: typings.ejWebAll.ej.PivotGrid.Layout.ExcelLikeLayout with Double = js.native
    /* 2 */ val NoSummaries: typings.ejWebAll.ej.PivotGrid.Layout.NoSummaries with Double = js.native
    /* 0 */ val Normal: typings.ejWebAll.ej.PivotGrid.Layout.Normal with Double = js.native
    /* 1 */ val NormalTopSummary: typings.ejWebAll.ej.PivotGrid.Layout.NormalTopSummary with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotGrid.Layout with Double] = js.native
  }
  
}

