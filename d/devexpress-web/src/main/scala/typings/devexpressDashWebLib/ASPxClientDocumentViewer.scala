package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The client-side equivalent of the ASPxDocumentViewer control.
 */
@js.native
trait ASPxClientDocumentViewer extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by ASPxClientDocumentViewer.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Occurs on the client after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Occurs on the client side when a report page is loaded into this ASPxClientDocumentViewer instance.
       */
  var PageLoad: ASPxClientEvent[ASPxClientReportViewerPageLoadEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Occurs when an item within the Document Viewer's report toolbar is clicked.
       */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Occurs when the value of an item within the Document Viewer's report toolbar is changed.
       */
  var ToolbarItemValueChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDocumentViewer]] = js.native
  /**
       * Provides access to the document of the ASPxClientDocumentViewer.
       */
  def GetDocumentMap(): ASPxClientReportDocumentMap = js.native
  /**
       * Provides access to the parameters panel of the ASPxClientDocumentViewer.
       */
  def GetParametersPanel(): ASPxClientReportParametersPanel = js.native
  /**
       * Provides access to the Ribbon of the ASPxClientDocumentViewer.
       */
  def GetRibbonToolbar(): ASPxClientRibbon = js.native
  /**
       * Provides access to the Splitter of the ASPxClientDocumentViewer.
       */
  def GetSplitter(): ASPxClientSplitter = js.native
  /**
       * Provides access to the Document Viewer toolbar on the client.
       */
  def GetToolbar(): ASPxClientReportToolbar = js.native
  /**
       * Provides access to the ASPxClientDocumentViewer's preview that exposes methods to print and export the document.
       */
  def GetViewer(): ASPxClientReportViewer = js.native
  /**
       * Sets focus on the report control specified by its bookmark.
       * @param pageIndex An integer value, specifying the page index.
       * @param bookmarkPath A String value, specifying the path to the bookmark.
       */
  def GotoBookmark(pageIndex: scala.Double, bookmarkPath: java.lang.String): scala.Unit = js.native
  /**
       * Displays the specified report page.
       * @param pageIndex An integer value, identifying the report page.
       */
  def GotoPage(pageIndex: scala.Double): scala.Unit = js.native
  /**
       * Gets a value indicating whether or not searching text across a report is permitted in the web browser.
       */
  def IsSearchAllowed(): scala.Boolean = js.native
  /**
       * Prints the current document.
       */
  def Print(): scala.Unit = js.native
  /**
       * Prints the document's page with the specified page index.
       * @param pageIndex A Int32 representing the index of the page to be printed.
       */
  def Print(pageIndex: scala.Double): scala.Unit = js.native
  /**
       * Initiates a round trip to the server so that the current page will be reloaded.
       */
  def Refresh(): scala.Unit = js.native
  /**
       * Exports a report to a file of the specified format, and saves it to the disk.
       * @param format A string specifying the format to which a report should be exported.
       */
  def SaveToDisk(format: java.lang.String): scala.Unit = js.native
  /**
       * Exports a report to a file of the specified format, and shows it in a new Web Browser window.
       * @param format A string specifying the format to which a report should be exported.
       */
  def SaveToWindow(format: java.lang.String): scala.Unit = js.native
  /**
       * Invokes the Search dialog, which allows end-users to search for specific text in a report.
       */
  def Search(): scala.Unit = js.native
}

