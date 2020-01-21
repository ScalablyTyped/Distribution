package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxWebDocumentViewer class.
  */
@JSGlobal("ASPxClientWebDocumentViewer")
@js.native
class ASPxClientWebDocumentViewer () extends ASPxClientControl {
  /**
    * Occurs before the Web Document Viewer UI is initialized.
    */
  var BeforeRender: ASPxClientEvent[ASPxClientWebDocumentViewerBeforeRenderEventHandler[ASPxClientWebDocumentViewer]] = js.native
  /**
    * Allows you to customize the Web Document Viewer's UI elements.
    */
  var CustomizeElements: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeElementsEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Allows you to customize the Web Document Viewer's available export formats and corresponding export options.
    */
  var CustomizeExportOptions: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeExportOptionsEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Enables you to customize the Web Document Viewer's localization strings.
    */
  var CustomizeLocalization: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeLocalizationEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Enables you to customize the Web Document Viewer's menu actions.
    */
  var CustomizeMenuActions: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeMenuActionsEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs each time a standard editor is created for a report parameter based on a parameter type.
    */
  var CustomizeParameterEditors: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeParameterEditorsEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs each time a look-up editor is created for a report parameter.
    */
  var CustomizeParameterLookUpSource: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeParameterLookUpSourceEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs after the Web Document Viewer loads a report document.
    */
  var DocumentReady: ASPxClientEvent[
    ASPxClientWebDocumentViewerDocumentReadyEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs each time an editing field's value changes.
    */
  var EditingFieldChanged: ASPxClientEvent[
    ASPxClientWebDocumentViewerEditingFieldChangedEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs on the client each time a server-side error raises.
    */
  var OnServerError: ASPxClientEvent[ASPxClientWebDocumentViewerErrorEventHandler[ASPxClientWebDocumentViewer]] = js.native
  /**
    * Occurs after report parameter values are reset to their default values.
    */
  var ParametersReset: ASPxClientEvent[
    ASPxClientWebDocumentViewerParametersResetEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs after report parameter values are submitted.
    */
  var ParametersSubmitted: ASPxClientEvent[
    ASPxClientWebDocumentViewerParametersSubmittedEventHandler[ASPxClientWebDocumentViewer]
  ] = js.native
  /**
    * Occurs when the left mouse button is clicked on a report document.
    */
  var PreviewClick: ASPxClientEvent[ASPxClientWebDocumentViewerPreviewClickEventHandler[ASPxClientWebDocumentViewer]] = js.native
  /**
    * Closes the document which is currently opened in the Web Document Viewer.
    */
  def Close(): Unit = js.native
  /**
    * Enables navigation between drill-through reports on the client-side. A Deferred Promise object.
    * @param customData Provides access to custom client data associated with a currently previewed report.
    */
  def DrillThrough(customData: String): JQueryPromise[_] = js.native
  /**
    * Exports the document to a specified file format.
    * @param format A String value that specifies the export format. The following formats are currently supported: 'csv', 'html', 'image', 'mht', 'pdf', 'rtf', 'docx', 'txt', 'xls', and 'xlsx'.
    * @param inlineResult true, to try opening the result file in a new browser tab without a download; otherwise, false.
    */
  def ExportTo(): Unit = js.native
  def ExportTo(format: String): Unit = js.native
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
    * Provides access to the Document Viewer's client-side model.
    */
  def GetPreviewModel(): ASPxClientSidePreviewModel = js.native
  /**
    * Provides access to the report preview.
    */
  def GetReportPreview(): ASPxClientReportPreview = js.native
  /**
    * Displays the report page with the specified page index.
    * @param pageIndex A zero-based integer value that specifies the index of a page to be displayed.
    */
  def GoToPage(pageIndex: Double): Unit = js.native
  /**
    * Opens the specified report on the Web Document Viewer's client side. A Deferred Promise object.
    * @param url A string that specifies the URL of a report to be opened.
    */
  def OpenReport(url: String): JQueryPromise[_] = js.native
  /**
    * Performs a custom operation with a currently opened document on the client-side. A Deferred Promise object.
    * @param customData Provides access to custom client data associated with a target document operation.
    * @param hideMessageFromUser true, to hide a message with the operation result from a user; otherwise, false.
    */
  def PerformCustomDocumentOperation(): JQueryPromise[ASPxClientWebDocumentViewerDocumentOperationResponse] = js.native
  def PerformCustomDocumentOperation(customData: String): JQueryPromise[ASPxClientWebDocumentViewerDocumentOperationResponse] = js.native
  def PerformCustomDocumentOperation(customData: String, hideMessageFromUser: Boolean): JQueryPromise[ASPxClientWebDocumentViewerDocumentOperationResponse] = js.native
  /**
    * Prints the document's page with the specified index.
    * @param pageIndex An index of the page to be printed.
    */
  def Print(): Unit = js.native
  def Print(pageIndex: Double): Unit = js.native
  /**
    * Resets the report parameter values to the default values.
    */
  def ResetParameters(): Unit = js.native
  /**
    * Starts building a report document.
    */
  def StartBuild(): Unit = js.native
  /**
    * Updates the Web Document Viewer properties' localization settings.
    * @param localization A dictionary containing the property names, along with their localized equivalents.
    */
  def UpdateLocalization(localization: StringDictionary[String]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientWebDocumentViewer")
@js.native
object ASPxClientWebDocumentViewer extends js.Object {
  /**
    * Converts the specified object to the current object's type. This method is effective when you utilize the Client API IntelliSense feature provided by DevExpress. An ASPxClientWebDocumentViewer object.
    * @param obj The client object to be type cast. Represents an instance of a DevExpress web control's client object.
    */
  def Cast(obj: js.Any): ASPxClientWebDocumentViewer = js.native
}

