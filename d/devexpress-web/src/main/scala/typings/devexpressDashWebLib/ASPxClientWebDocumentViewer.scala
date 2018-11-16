package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxWebDocumentViewer class.
 */
@js.native
trait ASPxClientWebDocumentViewer extends ASPxClientControl {
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
  def Close(): scala.Unit = js.native
  /**
       * Enables navigation between drill-through reports on the client-side.
       * @param customData Provides access to custom client data associated with a currently previewed report.
       */
  def DrillThrough(customData: java.lang.String): js.Any = js.native
  /**
       * Exports the document to a PDF file.
       */
  def ExportTo(): scala.Unit = js.native
  /**
       * Exports the document to a specified file format.
       * @param format A String value, specifying the export format. The following formats are currently supported: 'csv', 'html', 'image', 'mht', 'pdf', 'rtf', 'docx', 'txt', 'xls', and 'xlsx'.
       */
  def ExportTo(format: java.lang.String): scala.Unit = js.native
  /**
       * Exports the document to a specified file format.
       * @param format A String value that specifies the export format. The following formats are currently supported: 'csv', 'html', 'image', 'mht', 'pdf', 'rtf', 'docx', 'txt', 'xls', and 'xlsx'.
       * @param inlineResult true, to try opening the result file in a new browser tab without a download; otherwise, false.
       */
  def ExportTo(format: java.lang.String, inlineResult: scala.Boolean): scala.Unit = js.native
  /**
       * Returns the current page's zero-based index.
       */
  def GetCurrentPageIndex(): scala.Double = js.native
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
  def GoToPage(pageIndex: scala.Double): scala.Unit = js.native
  /**
       * Opens the specified report on the Web Document Viewer's client side.
       * @param url A string that specifies the URL of a report to be opened.
       */
  def OpenReport(url: java.lang.String): js.Any = js.native
  /**
       * Performs a custom operation with a currently opened document on the client side.
       */
  def PerformCustomDocumentOperation(): js.Any = js.native
  /**
       * Performs a custom operation with a currently opened document on the client-side.
       * @param customData Provides access to custom client data associated with a target document operation.
       */
  def PerformCustomDocumentOperation(customData: java.lang.String): js.Any = js.native
  /**
       * Performs a custom operation with a currently opened document on the client-side.
       * @param customData Provides access to custom client data associated with a target document operation.
       * @param hideMessageFromUser true, to hide a message with the operation result from a user; otherwise, false.
       */
  def PerformCustomDocumentOperation(customData: java.lang.String, hideMessageFromUser: scala.Boolean): js.Any = js.native
  /**
       * Prints the current document.
       */
  def Print(): scala.Unit = js.native
  /**
       * Prints the document's page with the specified index.
       * @param pageIndex An index of the page to be printed.
       */
  def Print(pageIndex: scala.Double): scala.Unit = js.native
  /**
       * Resets the report parameter values to the default values.
       */
  def ResetParameters(): scala.Unit = js.native
  /**
       * Starts building a report document.
       */
  def StartBuild(): scala.Unit = js.native
  /**
       * Updates the Web Document Viewer properties' localization settings.
       * @param localization A dictionary containing the property names, along with their localized equivalents.
       */
  def UpdateLocalization(localization: ScalablyTyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

