package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportViewer")
@js.native
class ReportViewer_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ReportViewer.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ReportViewer.Model) = this()
  var defaults: typings.ejWebAll.ej.ReportViewer.Model = js.native
  @JSName("model")
  var model_ReportViewer_ : typings.ejWebAll.ej.ReportViewer.Model = js.native
  /** Export the report to the specified format.
    * @returns {void}
    */
  def exportReport(): Unit = js.native
  /** Fit the report page to the container.
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  /** Fit the report page height to the container.
    * @returns {void}
    */
  def fitToPageHeight(): Unit = js.native
  /** Fit the report page width to the container.
    * @returns {void}
    */
  def fitToPageWidth(): Unit = js.native
  /** Get the available datasets name of the rdlc report.
    * @returns {void}
    */
  def getDataSetNames(): Unit = js.native
  /** Get the available parameters of the report.
    * @returns {void}
    */
  def getParameters(): Unit = js.native
  /** Navigate to first page of report.
    * @returns {void}
    */
  def gotoFirstPage(): Unit = js.native
  /** Navigate to last page of the report.
    * @returns {void}
    */
  def gotoLastPage(): Unit = js.native
  /** Navigate to next page from the current page.
    * @returns {void}
    */
  def gotoNextPage(): Unit = js.native
  /** Go to specific page index of the report.
    * @returns {void}
    */
  def gotoPageIndex(): Unit = js.native
  /** Navigate to previous page from the current page.
    * @returns {void}
    */
  def gotoPreviousPage(): Unit = js.native
  /** Print the report.
    * @returns {void}
    */
  def print(): Unit = js.native
  /** Apply print layout to the report.
    * @returns {void}
    */
  def printLayout(): Unit = js.native
  /** Refresh the report.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}

