package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's ReportViewer.
  */
@JSGlobal("ASPxClientReportViewer")
@js.native
class ASPxClientReportViewer () extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientReportViewer]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by ASPxClientReportViewer.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientReportViewer]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientReportViewer]] = js.native
  /**
    * Occurs on the client side when another report page is loaded into this ASPxClientReportViewer instance.
    */
  var PageLoad: ASPxClientEvent[ASPxClientReportViewerPageLoadEventHandler[ASPxClientReportViewer]] = js.native
  /**
    * Displays a report page with the specified page index in the ReportViewer.
    * @param pageIndex An integer value which specifies the index of a page to be displayed.
    */
  def GotoPage(pageIndex: Double): Unit = js.native
  /**
    * Gets a value indicating whether or not searching text across a report is permitted in the web browser.
    */
  def IsSearchAllowed(): Boolean = js.native
  /**
    * Prints a report page with the specified page index.
    * @param pageIndex An integer value which specifies an index of the page to be printed.
    */
  def Print(): Unit = js.native
  def Print(pageIndex: Double): Unit = js.native
  /**
    * Initiates a round trip to the server so that the current page will be reloaded.
    */
  def Refresh(): Unit = js.native
  /**
    * Exports a report to a file of the specified format, and saves it to the disk.
    * @param format A string specifying the format, to which a report should be exported.
    */
  def SaveToDisk(format: String): Unit = js.native
  /**
    * Exports a report to a file of the specified format, and shows it in a new Web Browser window.
    * @param format A string specifying the format, to which a report should be exported.
    */
  def SaveToWindow(format: String): Unit = js.native
  /**
    * Invokes the Search dialog, which allows end-users to search for specific text in a report.
    */
  def Search(): Unit = js.native
  /**
    * Submits the values of the specified parameters.
    * @param parameters A dictionary containing the parameter names, along with their Object values.
    */
  def SubmitParameters(parameters: StringDictionary[js.Any]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientReportViewer")
@js.native
object ASPxClientReportViewer extends js.Object {
  /**
    * Converts the specified object to the current object's type. This method is effective when you utilize the Client API IntelliSense feature provided by DevExpress. An object of the ASPxClientReportViewer type. Represents the converted client object specified by the obj parameter.
    * @param obj The client object to be type cast. Represents an instance of a DevExpress web control's client object.
    */
  def Cast(obj: js.Any): ASPxClientReportViewer = js.native
}

