package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ejNs.PdfViewerNs.AnnotationType
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PdfViewer")
@js.native
class PdfViewer protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.PdfViewerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.PdfViewerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.PdfViewerNs.Model = js.native
  @JSName("model")
  var model_PdfViewer: typings.ejDotWebDotAll.ejNs.PdfViewerNs.Model = js.native
  /** Aborts the download operation.
    * @returns {void}
    */
  def abortDownload(): Unit = js.native
  /** Abort the printing function and restores the PDF viewer.
    * @returns {void}
    */
  def abortPrint(): Unit = js.native
  /** Adds annotations to the PDF document.
    * @param {ej.PdfViewer.AnnotationType} type of the annotation to be added in the PDF document.
    * @returns {void}
    */
  def addAnnotation(annotationType: AnnotationType): Unit = js.native
  /** Cancels the text search and removes the highlighted occurrences from the PDF viewer.
    * @returns {void}
    */
  def cancelSearchText(): Unit = js.native
  /** Downloads the PDF document being loaded in the ejPdfViewer control.
    * @returns {void}
    */
  def download(): Unit = js.native
  /** Scales the page to fit the page in the container in the control.
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  /** Scales the page to fit the page width to the width of the container in the control.
    * @returns {void}
    */
  def fitToWidth(): Unit = js.native
  /** Navigates to the first page of PDF document.
    * @returns {void}
    */
  def goToFirstPage(): Unit = js.native
  /** Navigates to the last page of the PDF document.
    * @returns {void}
    */
  def goToLastPage(): Unit = js.native
  /** Navigates to the next page of the PDF document.
    * @returns {void}
    */
  def goToNextPage(): Unit = js.native
  /** Navigates to the specific page in the PDF document. If the page is not available for the given pageNumber, PDF viewer retains the existing page in view.
    * @param {number} navigates to the page number in the PDF document
    * @returns {void}
    */
  def goToPage(pageNumber: Double): Unit = js.native
  /** Navigates to the previous page of the PDF document.
    * @returns {void}
    */
  def goToPreviousPage(): Unit = js.native
  /** Loads the document with the filename and displays it in PDF viewer.
    * @param {string} File name to be loaded
    * @returns {void}
    */
  def load(fileName: String): Unit = js.native
  /** Searches the target text with its casing.
    * @param {boolean} Specifies whether the text search must be performed with match case or not.
    * @returns {void}
    */
  def matchCase(enableMatchCase: Boolean): Unit = js.native
  /** Prints the PDF document.
    * @returns {void}
    */
  def print(): Unit = js.native
  /** Performs redo function for the included annotations in the PDF document.
    * @returns {void}
    */
  def redo(): Unit = js.native
  /** Searches the next occurrence of the searched text from the current occurrence in the PDF viewer control.
    * @returns {void}
    */
  def searchNext(): Unit = js.native
  /** Searches the previous occurrence of the searched text from the current occurrence in the PDF viewer control.
    * @returns {void}
    */
  def searchPrevious(): Unit = js.native
  /** Searches the target text in the PDF document and highlights the occurrences in the pages.
    * @param {string} The text to be searched in the pages in the PDF viewer.
    * @returns {void}
    */
  def searchText(targetText: String): Unit = js.native
  /** Set the JSON data that are formed for rendering the document content in PDF viewer.
    * @param {any} Set the JSON data that are formed for rendering the document content.
    * @returns {void}
    */
  def setJSONData(jsonData: js.Any): Unit = js.native
  /** Shows/hides the download tool in the toolbar.
    * @param {boolean} shows/hides download button in the toolbar
    * @returns {void}
    */
  def showDownloadTool(show: Boolean): Unit = js.native
  /** Shows/hides the zoom tools in the toolbar.
    * @param {boolean} shows/hides zoom tools in the toolbar
    * @returns {void}
    */
  def showMagnificationTools(show: Boolean): Unit = js.native
  /** Shows/hides the page navigation tools in the toolbar
    * @param {boolean} shows/hides navigation tools in the toolbar
    * @returns {void}
    */
  def showPageNavigationTools(show: Boolean): Unit = js.native
  /** Shows/hides the print icon in the toolbar.
    * @param {boolean} shows/hides print button in the toolbar
    * @returns {void}
    */
  def showPrintTools(show: Boolean): Unit = js.native
  /** Shows/hides the selection tool in the toolbar.
    * @param {boolean} shows/hides selection tool in the toolbar
    * @returns {void}
    */
  def showSelectionTool(show: Boolean): Unit = js.native
  /** Shows/hides the signature tool in the toolbar.
    * @param {boolean} shows/hides signature tool in the toolbar
    * @returns {void}
    */
  def showSignatureTool(show: Boolean): Unit = js.native
  /** Shows/hides the text markup annotation tools in the toolbar.
    * @param {boolean} shows/hides text markup annotation tools in the toolbar
    * @returns {void}
    */
  def showTextMarkupAnnotationTools(show: Boolean): Unit = js.native
  /** Shows/hides the search tool in the toolbar.
    * @param {boolean} shows/hides search tool in the toolbar
    * @returns {void}
    */
  def showTextSearchTool(show: Boolean): Unit = js.native
  /** Shows/hides the toolbar in the PDF viewer.
    * @param {boolean} shows/hides the toolbar
    * @returns {void}
    */
  def showToolbar(show: Boolean): Unit = js.native
  /** Performs undo function for the included annotations in the PDF document.
    * @returns {void}
    */
  def undo(): Unit = js.native
  /** Unloads the PDF document being displayed in the PDF viewer.
    * @returns {void}
    */
  def unload(): Unit = js.native
  /** Resize the viewer based on the parent element height.
    * @returns {void}
    */
  def updateViewerSize(): Unit = js.native
  /** Magnifies the page to the next value in the zoom drop down list.
    * @returns {void}
    */
  def zoomIn(): Unit = js.native
  /** Shrinks the page to the previous value in the magnification in the drop down list.
    * @returns {void}
    */
  def zoomOut(): Unit = js.native
  /** Scales the page to the specified percentage ranging from 50 to 400. If the given zoomValue is less than 50 or greater than 400; the PDF viewer scales the page to 50 and 400
    * respectively.
    * @param {number} zoom value for scaling the pages in the PDF Viewer
    * @returns {void}
    */
  def zoomTo(zoomValue: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.PdfViewer")
@js.native
object PdfViewer extends js.Object {
  var Locale: js.Any = js.native
  var fn: PdfViewer = js.native
}

