package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pager_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.Pager.Model = js.native
  @JSName("model")
  var model_Pager_ : typings.ejWebAll.ej.Pager.Model = js.native
  /** goToFirstPage() helps to navigate to the first page of the pager.
    * @returns {void}
    */
  def goToFirstPage(): Unit = js.native
  /** goToLastPage() helps to navigate to the Last page of the pager.
    * @returns {void}
    */
  def goToLastPage(): Unit = js.native
  /** goToNextPage() helps to navigate to the next page to the current page of the pager.
    * @returns {void}
    */
  def goToNextPage(): Unit = js.native
  /** goToPrevPage() helps to navigate to the previous page to the current page of the pager.
    * @returns {void}
    */
  def goToPrevPage(): Unit = js.native
  /** Send a paging request to specified page through the pager control.
    * @param {number} Specifies the index to be navigated
    * @returns {void}
    */
  def gotoPage(pageIndex: Double): Unit = js.native
  /** refreshPager() helps to refresh the model value of pager control.
    * @returns {void}
    */
  def refreshPager(): Unit = js.native
}

