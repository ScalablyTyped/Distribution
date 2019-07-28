package typings.devexpressDashWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the Web Report Designer control.
  */
@js.native
trait ASPxClientReportDesigner extends ASPxClientControl {
  /**
    * Occurs before the Web Report Designer UI is initialized.
    */
  var BeforeRender: ASPxClientEvent[ASPxClientReportDesignerBeforeRenderEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by ASPxClientReportDesigner.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs after a component has been added to the report currently being edited in the Web Report Designer.
    */
  var ComponentAdded: ASPxClientEvent[ASPxClientReportDesignerComponentAddedEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Enables you to customize the Web Report Designer's UI elements.
    */
  var CustomizeElements: ASPxClientEvent[ASPxClientReportDesignerCustomizeElementsEventHandler[ASPxClientReportDesigner]] = js.native
  var CustomizeFieldListActions: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeFieldListActionsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Web Report Designer's localization strings.
    */
  var CustomizeLocalization: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeLocalizationEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Web Report Designer's menu actions.
    */
  var CustomizeMenuActions: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeMenuActionsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Open Report dialog of the Web Report Designer.
    */
  var CustomizeOpenDialog: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeOpenDialogEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Occurs each time a standard editor is created for a report parameter based on a parameter type.
    */
  var CustomizeParameterEditors: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeParameterEditorsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Occurs each time a look-up editor is created for a report parameter.
    */
  var CustomizeParameterLookUpSource: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeParameterLookUpSourceEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Save Report dialog of the Web Report Designer.
    */
  var CustomizeSaveAsDialog: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeSaveAsDialogEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Save dialog of the Web Report Designer.
    */
  var CustomizeSaveDialog: ASPxClientEvent[
    ASPxClientReportDesignerCustomizeSaveDialogEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the Toolbox of the Web Report Designer.
    */
  var CustomizeToolbox: ASPxClientEvent[ASPxClientReportDesignerCustomizeToolboxEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs on the client side when the Report Designer is being closed.
    */
  var ExitDesigner: ASPxClientEvent[ASPxClientReportDesignerExitDesignerEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs on the client each time a server-side error raises.
    */
  var OnServerError: ASPxClientEvent[ASPxClientReportDesignerErrorEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when the left mouse button is clicked on a report document in Print Preview.
    */
  var PreviewClick: ASPxClientEvent[ASPxClientWebDocumentViewerPreviewClickEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Enables you to customize UI elements of a Document Viewer built into a Web Report Designer.
    */
  var PreviewCustomizeElements: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeElementsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  var PreviewCustomizeExportOptions: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeExportOptionsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Enables you to customize the actions of a Document Viewer built into a Web Report Designer.
    */
  var PreviewCustomizeMenuActions: ASPxClientEvent[
    ASPxClientWebDocumentViewerCustomizeMenuActionsEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Occurs after a report has been switched to Print Preview.
    */
  var PreviewDocumentReady: ASPxClientEvent[ASPxClientWebDocumentViewerDocumentReadyEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs each time an editing field's value changes in Print Preview.
    */
  var PreviewEditingFieldChanged: ASPxClientEvent[
    ASPxClientWebDocumentViewerEditingFieldChangedEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Occurs after report parameter values are reset to their default values in Print Preview.
    */
  var PreviewParametersReset: ASPxClientEvent[ASPxClientWebDocumentViewerParametersResetEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs after report parameter values are submitted in Print Preview.
    */
  var PreviewParametersSubmitted: ASPxClientEvent[
    ASPxClientWebDocumentViewerParametersSubmittedEventHandler[ASPxClientReportDesigner]
  ] = js.native
  /**
    * Occurs when a report has been opened in the Web Report Designer.
    */
  var ReportOpened: ASPxClientEvent[ASPxClientReportDesignerReportOpenedEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a report is about to be opened in the Web Report Designer.
    */
  var ReportOpening: ASPxClientEvent[ASPxClientReportDesignerReportOpeningEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a report has been saved in the Web Report Designer.
    */
  var ReportSaved: ASPxClientEvent[ASPxClientReportDesignerReportSavedEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a report is about to be saved in the Web Report Designer.
    */
  var ReportSaving: ASPxClientEvent[ASPxClientReportDesignerReportSavingEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a report tab was closed in the Web Report Designer.
    */
  var ReportTabClosed: ASPxClientEvent[ASPxClientReportDesignerReportTabClosedEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when a report tab is about to be closed in the Web Report Designer.
    */
  var ReportTabClosing: ASPxClientEvent[ASPxClientReportDesignerReportTabClosingEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Occurs when executing the Save command on the client.
    */
  var SaveCommandExecute: ASPxClientEvent[ASPxClientReportDesignerSaveCommandExecuteEventHandler[ASPxClientReportDesigner]] = js.native
  var TabChanged: ASPxClientEvent[ASPxClientReportDesignerTabChangedEventHandler[ASPxClientReportDesigner]] = js.native
  /**
    * Adds a custom parameter type to the Web End-User Report Designer.
    * @param parameterInfo An object that provides information about a parameter type to be added.
    * @param editorOptions An object that provides information about an editor used to specify parameter values in design mode.
    */
  def AddParameterType(parameterInfo: ASPxDesignerParameterType, editorOptions: ASPxDesignerEditorOptions): Unit = js.native
  /**
    * Adds a custom property to the Properties Panel.
    * @param groupName A string that specifies the name of group to which a property should be added.
    * @param property An object that provides information required to serialize a property.
    */
  def AddToPropertyGrid(groupName: String, property: ASPxDesignerElementSerializationInfo): Unit = js.native
  /**
    * Closes the report tab currently being opened in the Web Report Designer.
    */
  def CloseCurrentTab(): Unit = js.native
  /**
    * 
    * @param tab 
    */
  def CloseTab(tab: ASPxDesignerNavigateTab): Unit = js.native
  /**
    * 
    * @param tab 
    * @param force 
    */
  def CloseTab(tab: ASPxDesignerNavigateTab, force: Boolean): Unit = js.native
  /**
    * Returns actions performed by buttons available in the menu and toolbar of the Web Report Designer.
    */
  def GetButtonStorage(): js.Object = js.native
  def GetCurrentTab(): ASPxDesignerNavigateTab = js.native
  /**
    * Provides access to a client-side model of a Web Report Designer.
    */
  def GetDesignerModel(): js.Object = js.native
  /**
    * Gets a client-side model of the currently opened report serialized to Json.
    */
  def GetJsonReportModel(): String = js.native
  /**
    * Returns a value editor associated with the specified parameter type.
    * @param parameterType A string that specifies a parameter type.
    */
  def GetParameterEditor(parameterType: String): ASPxDesignerEditorOptions = js.native
  /**
    * Returns an object that contains information on the specified parameter type.
    * @param parameterType A string that specifies a parameter type.
    */
  def GetParameterInfo(parameterType: String): ASPxDesignerParameterType = js.native
  /**
    * Provides access to the Document Viewer's client-side model.
    */
  def GetPreviewModel(): ASPxClientSidePreviewModel = js.native
  /**
    * Returns information about the specified property of the specified control.
    * @param controlType A string that specifies the control type.
    * @param path A string that specifies the path to the property.
    */
  def GetPropertyInfo(controlType: String, path: String): ASPxDesignerElementSerializationInfo = js.native
  /**
    * Returns information about the specified properties of the specified control.
    * @param controlType A string that specifies the control type.
    * @param path An array of strings that specify paths to properties.
    */
  def GetPropertyInfo(controlType: String, path: js.Array[String]): ASPxDesignerElementSerializationInfo = js.native
  def GetTabs(): js.Array[ASPxDesignerNavigateTab] = js.native
  /**
    * Indicates whether or not the current ASPxClientReportDesigner instance has been modified.
    */
  def IsModified(): Boolean = js.native
  /**
    * Opens the specified report on the Web Report Designer's client side.
    * @param url A string that specifies the URL of a report to be opened.
    */
  def OpenReport(url: String): Unit = js.native
  /**
    * Sends a callback to the server with the specified argument.
    * @param arg A String value, specifying the callback argument.
    */
  def PerformCallback(arg: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side event, passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(arg: String, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
  /**
    * Removes the specified parameter type from the Web End-User Report Designer.
    * @param parameterType A string that specifies a parameter type to be deleted.
    */
  def RemoveParameterType(parameterType: String): Unit = js.native
  /**
    * Returns the report layout stored in a report storage under the specified URL.
    * @param url A string that specifies the report URL.
    */
  def ReportStorageGetData(url: String): js.Any = js.native
  /**
    * Returns the report URLs and display names existing in a report storage.
    */
  def ReportStorageGetUrls(): js.Any = js.native
  /**
    * Stores the specified report to a report storage using the specified URL.
    * @param reportLayout A string that specifies the report layout to be saved.
    * @param url A string that specifies the URL used to save a report.
    */
  def ReportStorageSetData(reportLayout: String, url: String): js.Any = js.native
  /**
    * Stores the specified report to a report storage using a new URL.
    * @param reportLayout A string that specifies the report layout to be saved.
    * @param url A string that specifies the default report URL.
    */
  def ReportStorageSetNewData(reportLayout: String, url: String): js.Any = js.native
  /**
    * Resets the value returned by the IsModified method.
    */
  def ResetIsModified(): Unit = js.native
  /**
    * Saves the current report under a new name.
    * @param reportName A string that specifies the report name.
    */
  def SaveNewReport(reportName: String): js.Any = js.native
  /**
    * Saves the current report.
    */
  def SaveReport(): js.Any = js.native
  /**
    * Switches the Web Report Designer to the preview mode.
    */
  def ShowPreview(): Unit = js.native
  /**
    * Updates the Report Designer properties' localization settings.
    * @param localization A dictionary containing the property names, along with their localized equivalents.
    */
  def UpdateLocalization(localization: StringDictionary[String]): Unit = js.native
}

