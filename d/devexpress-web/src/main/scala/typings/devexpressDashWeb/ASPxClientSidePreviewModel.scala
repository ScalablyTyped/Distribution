package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information a client-side Document Preview model.
  */
@js.native
trait ASPxClientSidePreviewModel extends js.Object {
  /**
    * Provides access to the report preview.
    * Value: An object that specifies the report preview.
    */
  var reportPreview: ASPxClientReportPreview = js.native
  /**
    * Provides access to a panel at the right of the Document Viewer.
    * Value: An object that specifies the panel at the right of the Document Viewer.
    */
  var tabPanel: ASPxClientDocumentPreviewTabPanel = js.native
  /**
    * Closes the document which is currently opened in the Web Document Viewer.
    */
  def Close(): Unit = js.native
  /**
    * Exports the document to a PDF file.
    */
  def ExportTo(): Unit = js.native
  /**
    * Exports the document to a specified file format.
    * @param format A String value, specifying the export format. The following formats are currently supported: 'csv', 'html', 'image', 'mht', 'pdf', 'rtf', 'docx', 'txt', 'xls', and 'xlsx'.
    */
  def ExportTo(format: String): Unit = js.native
  /**
    * Exports the document to a specified file format.
    * @param format A String value that specifies the export format. The following formats are currently supported: 'csv', 'html', 'image', 'mht', 'pdf', 'rtf', 'docx', 'txt', 'xls', and 'xlsx'.
    * @param inlineResult true, to try opening the result file in a new browser tab without a download; otherwise, false.
    */
  def ExportTo(format: String, inlineResult: Boolean): Unit = js.native
  /**
    * Returns the current page's zero-based index.
    */
  def GetCurrentPageIndex(): Double = js.native
  /**
    * Provide access to the report parameters' client-side model.
    */
  def GetParametersModel(): ASPxClientSideParametersModel = js.native
  /**
    * Displays the report page with the specified page index.
    * @param pageIndex A zero-based integer value that specifies the index of a page to be displayed.
    */
  def GoToPage(pageIndex: Double): Unit = js.native
  /**
    * Opens the specified report on the Web Document Viewer's client side.
    * @param url A string that specifies the URL of a report to be opened.
    */
  def OpenReport(url: String): js.Any = js.native
  /**
    * Prints the current document.
    */
  def Print(): Unit = js.native
  /**
    * Prints the document's page with the specified index.
    * @param pageIndex An index of the page to be printed.
    */
  def Print(pageIndex: Double): Unit = js.native
  /**
    * Resets the report parameter values to the default values.
    */
  def ResetParameters(): Unit = js.native
  /**
    * Starts building a report document.
    */
  def StartBuild(): Unit = js.native
}

