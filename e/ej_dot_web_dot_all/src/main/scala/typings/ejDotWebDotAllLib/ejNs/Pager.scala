package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Pager")
@js.native
class Pager protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.PagerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.PagerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.PagerNs.Model = js.native
  @JSName("model")
  var model_Pager: ejDotWebDotAllLib.ejNs.PagerNs.Model = js.native
  /** goToFirstPage() helps to navigate to the first page of the pager.
           * @returns {void}
           */
  def goToFirstPage(): scala.Unit = js.native
  /** goToLastPage() helps to navigate to the Last page of the pager.
           * @returns {void}
           */
  def goToLastPage(): scala.Unit = js.native
  /** goToNextPage() helps to navigate to the next page to the current page of the pager.
           * @returns {void}
           */
  def goToNextPage(): scala.Unit = js.native
  /** goToPrevPage() helps to navigate to the previous page to the current page of the pager.
           * @returns {void}
           */
  def goToPrevPage(): scala.Unit = js.native
  /** Send a paging request to specified page through the pager control.
           * @param {number} Specifies the index to be navigated
           * @returns {void}
           */
  def gotoPage(pageIndex: scala.Double): scala.Unit = js.native
  /** refreshPager() helps to refresh the model value of pager control.
           * @returns {void}
           */
  def refreshPager(): scala.Unit = js.native
}

@JSGlobal("ej.Pager")
@js.native
object Pager extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Pager = js.native
}

