package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.PivotPager.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.PivotPager.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.PivotPager.Model = js.native
  @JSName("model")
  var model_PivotPager_ : typings.ejDotWebDotAll.ej.PivotPager.Model = js.native
  /** This function initializes the page counts and page numbers for the PivotPager.
    * @returns {void}
    */
  def initPagerProperties(): Unit = js.native
}

