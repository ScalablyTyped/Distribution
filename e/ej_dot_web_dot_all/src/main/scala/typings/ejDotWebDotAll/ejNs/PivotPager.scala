package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Model = js.native
  @JSName("model")
  var model_PivotPager: typings.ejDotWebDotAll.ejNs.PivotPagerNs.Model = js.native
  /** This function initializes the page counts and page numbers for the PivotPager.
    * @returns {void}
    */
  def initPagerProperties(): Unit = js.native
}

/* static members */
@JSGlobal("ej.PivotPager")
@js.native
object PivotPager extends js.Object {
  var Locale: js.Any = js.native
  var fn: PivotPager = js.native
}

