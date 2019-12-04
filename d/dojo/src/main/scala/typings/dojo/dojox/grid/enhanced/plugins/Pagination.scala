package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.EnhancedGrid
import typings.dojo.dojox.grid.enhanced._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Pagination.html
  *
  * The typical pagination way to deal with huge dataset
  * an alternative for the default virtual scrolling manner.
  *
  * @param inGrid The grid to plug in to.
  * @param option
  */
@JSGlobal("dojox.grid.enhanced.plugins.Pagination")
@js.native
class Pagination protected () extends _Plugin {
  def this(inGrid: EnhancedGrid, option: js.Any) = this()
  /**
    * Which page will be displayed initially, 1st page by default.
    *
    */
  var defaultPage: Double = js.native
  /**
    * Number of rows in a page, 25 by default.
    *
    */
  var defaultPageSize: Double = js.native
  /**
    * Whether the description information will be displayed, true by default.
    *
    */
  var description: Boolean = js.native
  /**
    * Whether the goto page button will be displayed, false by default.
    *
    */
  var gotoButton: Boolean = js.native
  /**
    * The max number of page sizes to be displayed, 7 by default.
    *
    */
  var maxPageStep: Double = js.native
  /**
    * Array of page sizes for switching, e.g. [10, 25, 50, 100, Infinity] by default,
    * Infinity or any NaN value will be treated as "all".
    *
    */
  var pageSizes: js.Array[_] = js.native
  /**
    * Whether the page switch options will be displayed, true by default.
    *
    */
  var pageStepper: Boolean = js.native
  /**
    * The position of the pagination bar - "top"|"bottom", "bottom" by default.
    *
    */
  var position: js.Object = js.native
  /**
    * Whether the page size switch options will be displayed, true by default.
    *
    */
  var sizeSwitch: Boolean = js.native
  /**
    *
    * @param size
    */
  def changePageSize(size: js.Any): Unit = js.native
  /**
    * Shift to the given page, return current page number. If there
    * is no valid page was passed in, just return current page num.
    *
    * @param page The page to go to, starting at 1.
    */
  def currentPage(page: Double): js.Any = js.native
  /**
    * Change the size of current page or return the current page size.
    *
    * @param size An integer identifying the number of rows per page. If the sizeis an Infinity, all rows will be displayed; if an invalid value passedin, the current page size will be returned.
    */
  def currentPageSize(size: js.Any): js.Any = js.native
  /**
    * Change the size of current page or return the current page size.
    *
    * @param size An integer identifying the number of rows per page. If the sizeis an Infinity, all rows will be displayed; if an invalid value passedin, the current page size will be returned.
    */
  def currentPageSize(size: Double): js.Any = js.native
  /**
    * Go to the first page
    *
    */
  def firstPage(): Unit = js.native
  /**
    * Get total page number
    *
    */
  def getTotalPageNum(): js.Any = js.native
  /**
    * Function for get total row count
    *
    */
  def getTotalRowCount(): js.Any = js.native
  /**
    *
    */
  def gotoFirstPage(): Unit = js.native
  /**
    *
    */
  def gotoLastPage(): Unit = js.native
  /**
    *
    * @param page
    */
  def gotoPage(page: js.Any): Unit = js.native
  /**
    * Go to the last page
    *
    */
  def lastPage(): Unit = js.native
  /**
    * Go to the next page.
    *
    */
  def nextPage(): Unit = js.native
  /**
    * Go to the previous page.
    *
    */
  def prevPage(): Unit = js.native
  /**
    *
    */
  def removeSelectedRows(): Unit = js.native
  /**
    * Override the grid.scrollToRow(), could jump to the right page
    * and scroll to the specific row
    *
    * @param inRowIndex The row index
    */
  def scrollToRow(inRowIndex: Double): js.Any = js.native
  /**
    * For show/hide the go to page button dynamically
    *
    * @param flag Show the go to page button when flag is true, otherwise hide it
    */
  def showGotoPageButton(flag: Boolean): Unit = js.native
}

