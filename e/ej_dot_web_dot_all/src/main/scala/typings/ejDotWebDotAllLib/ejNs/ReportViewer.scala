package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ReportViewer")
@js.native
class ReportViewer protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ReportViewerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ReportViewerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ReportViewerNs.Model = js.native
  @JSName("model")
  var model_ReportViewer: ejDotWebDotAllLib.ejNs.ReportViewerNs.Model = js.native
  /** Export the report to the specified format.
    * @returns {void}
    */
  def exportReport(): scala.Unit = js.native
  /** Fit the report page to the container.
    * @returns {void}
    */
  def fitToPage(): scala.Unit = js.native
  /** Fit the report page height to the container.
    * @returns {void}
    */
  def fitToPageHeight(): scala.Unit = js.native
  /** Fit the report page width to the container.
    * @returns {void}
    */
  def fitToPageWidth(): scala.Unit = js.native
  /** Get the available datasets name of the rdlc report.
    * @returns {void}
    */
  def getDataSetNames(): scala.Unit = js.native
  /** Get the available parameters of the report.
    * @returns {void}
    */
  def getParameters(): scala.Unit = js.native
  /** Navigate to first page of report.
    * @returns {void}
    */
  def gotoFirstPage(): scala.Unit = js.native
  /** Navigate to last page of the report.
    * @returns {void}
    */
  def gotoLastPage(): scala.Unit = js.native
  /** Navigate to next page from the current page.
    * @returns {void}
    */
  def gotoNextPage(): scala.Unit = js.native
  /** Go to specific page index of the report.
    * @returns {void}
    */
  def gotoPageIndex(): scala.Unit = js.native
  /** Navigate to previous page from the current page.
    * @returns {void}
    */
  def gotoPreviousPage(): scala.Unit = js.native
  /** Print the report.
    * @returns {void}
    */
  def print(): scala.Unit = js.native
  /** Apply print layout to the report.
    * @returns {void}
    */
  def printLayout(): scala.Unit = js.native
  /** Refresh the report.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.ReportViewer")
@js.native
object ReportViewer extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ReportViewer = js.native
}

