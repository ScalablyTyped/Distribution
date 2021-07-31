package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDashboard control.
  */
@js.native
trait ASPxClientDashboard
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs after the available interactivity actions have changed for the specific dashboard item.
    */
  var ActionAvailabilityChanged: ASPxClientEvent[ASPxClientActionAvailabilityChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs before any element in the Web Dashboard control has been rendered.
    */
  var BeforeRender: ASPxClientEvent[ASPxClientDashboardBeforeRenderEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Returns whether the specified master filter can be cleared in the current state. true, if the specified master filter can be cleared in the current state; otherwise, false.
    * @param itemName A string that specifies the component name of the master filter item.
    */
  def CanClearMasterFilter(itemName: String): Boolean = js.native
  
  /**
    * Returns whether drill down is possible in the current state of the specified dashboard item. true, if drill down is possible in the current state of the specified dashboard item; otherwise, false.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def CanPerformDrillDown(itemName: String): Boolean = js.native
  
  /**
    * Returns whether drill up is possible in the current state of the specified dashboard item. true, if drill up is possible in the current state of the specified dashboard item; otherwise, false.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def CanPerformDrillUp(itemName: String): Boolean = js.native
  
  /**
    * Returns whether master filtering  can be applied in the current state of the specified master filter item. true, if master filtering can be applied in the current state of the specified master filter item; otherwise, false.
    * @param itemName A string that specifies the component name of the master filter item.
    */
  def CanSetMasterFilter(itemName: String): Boolean = js.native
  
  /**
    * Clears the specified master filter item.
    * @param itemName A String that specifies the component name of the master filter item.
    */
  def ClearMasterFilter(itemName: String): Unit = js.native
  
  /**
    * Fires when a round trip to the server has been initiated by a call to the client ASPxClientDashboard.PerformDataCallback method.
    */
  var CustomDataCallback: ASPxClientEvent[ASPxClientCustomDataCallbackEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to customize the Dashboard Data Source Wizard.
    */
  var CustomizeDataSourceWizard: ASPxClientEvent[ASPxClientCustomizeDataSourceWizardEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when a dashboard update is initiated.
    */
  var DashboardBeginUpdate: ASPxClientEvent[ASPxClientDashboardBeginUpdateEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * The DashboardChanged client-side event is obsolete. Use the DashboardInitialized event instead.
    */
  var DashboardChanged: ASPxClientEvent[ASPxClientDashboardChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after the dashboard update is performed.
    */
  var DashboardEndUpdate: ASPxClientEvent[ASPxClientDashboardEndUpdateEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after the dashboard displayed in the control has been initialized.
    */
  var DashboardInitialized: ASPxClientEvent[ASPxClientDashboardInitializedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs before the dashboard displayed in the control has been initialized.
    */
  var DashboardInitializing: ASPxClientEvent[ASPxClientDashboardInitializingEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after the current dashboard state in the ASPxClientDashboard is changed.
    */
  var DashboardStateChanged: ASPxClientEvent[ASPxClientDashboardStateChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to customize a dashboard title (for instance, add custom buttons, menus, etc.).
    */
  var DashboardTitleToolbarUpdated: ASPxClientEvent[ASPxClientDashboardTitleToolbarUpdatedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after parameter values provided using a Dynamic List are loaded.
    */
  var DynamicLookUpValuesLoaded: ASPxClientEvent[ASPxClientDynamicLookUpValuesLoadedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Exports a dashboard item to an Excel file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToExcel(itemName: String): Unit = js.native
  def ExportDashboardItemToExcel(itemName: String, options: Unit, fileName: String): Unit = js.native
  def ExportDashboardItemToExcel(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  def ExportDashboardItemToExcel(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  def ExportDashboardItemToExcel(itemName: String, options: DashboardExcelExportOptions): Unit = js.native
  def ExportDashboardItemToExcel(itemName: String, options: DashboardExcelExportOptions, fileName: String): Unit = js.native
  
  /**
    * Exports a dashboard item to an Image file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToImage(itemName: String): Unit = js.native
  def ExportDashboardItemToImage(itemName: String, options: Unit, fileName: String): Unit = js.native
  def ExportDashboardItemToImage(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  def ExportDashboardItemToImage(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  def ExportDashboardItemToImage(itemName: String, options: DashboardImageExportOptions): Unit = js.native
  def ExportDashboardItemToImage(itemName: String, options: DashboardImageExportOptions, fileName: String): Unit = js.native
  
  /**
    * Exports a dashboard item to a PDF file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToPdf(itemName: String): Unit = js.native
  def ExportDashboardItemToPdf(itemName: String, options: Unit, fileName: String): Unit = js.native
  def ExportDashboardItemToPdf(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  def ExportDashboardItemToPdf(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  def ExportDashboardItemToPdf(itemName: String, options: DashboardPdfExportOptions): Unit = js.native
  def ExportDashboardItemToPdf(itemName: String, options: DashboardPdfExportOptions, fileName: String): Unit = js.native
  
  /**
    * Exports dashboard data to the specified file in Excel format.
    */
  def ExportToExcel(): Unit = js.native
  def ExportToExcel(options: Unit, fileName: String): Unit = js.native
  def ExportToExcel(options: DashboardExcelExportOptions): Unit = js.native
  def ExportToExcel(options: DashboardExcelExportOptions, fileName: String): Unit = js.native
  
  /**
    * Exports a dashboard to an Image file and writes it to the Response.
    */
  def ExportToImage(): Unit = js.native
  def ExportToImage(options: Unit, fileName: String): Unit = js.native
  def ExportToImage(options: ASPxClientDashboardExportOptions): Unit = js.native
  def ExportToImage(options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  def ExportToImage(options: DashboardImageExportOptions): Unit = js.native
  def ExportToImage(options: DashboardImageExportOptions, fileName: String): Unit = js.native
  
  /**
    * Exports a dashboard to a PDF file and writes it to the Response.
    */
  def ExportToPdf(): Unit = js.native
  def ExportToPdf(options: Unit, fileName: String): Unit = js.native
  def ExportToPdf(options: ASPxClientDashboardExportOptions): Unit = js.native
  def ExportToPdf(options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  def ExportToPdf(options: DashboardPdfExportOptions): Unit = js.native
  def ExportToPdf(options: DashboardPdfExportOptions, fileName: String): Unit = js.native
  
  /**
    * Returns axis point tuples identifying elements that can be used to perform drill-down in the specified dashboard item. An array of ASPxClientDashboardItemDataAxisPointTuple objects identifying elements that can be used to perform drill-down in the specified dashboard item.
    * @param itemName A String that is the component name of the dashboard item.
    */
  def GetAvailableDrillDownValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Returns axis point tuples identifying elements that can be selected in the current state of the master filter item. An array of ASPxClientDashboardItemDataAxisPointTuple objects identifying elements that can be selected in the current state of the master filter item.
    * @param itemName A String that is the component name of the master filter item.
    */
  def GetAvailableFilterValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Returns names of the predefined ranges available for the specified Range Filter. An array of string values that are names of the available predefined ranges.
    * @param itemName A string value that specifies the component name of the Range Filter dashboard item.
    */
  def GetAvailablePredefinedRanges(itemName: String): js.Array[String] = js.native
  
  /**
    * Returns the axis point tuple identifying the current drill-down state. An ASPxClientDashboardItemDataAxisPointTuple object representing a set of axis points.
    * @param itemName A String that is the component name of the dashboard item.
    */
  def GetCurrentDrillDownValues(itemName: String): ASPxClientDashboardItemDataAxisPointTuple = js.native
  
  /**
    * Returns axis point tuples identifying currently selected elements in the master filter item. An array of ASPxClientDashboardItemDataAxisPointTuple objects identifying elements that can be selected in the current state of the master filter item.
    * @param itemName A String that is the component name of the master filter item.
    */
  def GetCurrentFilterValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Returns the name of the currently selected predefined range. A string value that is the name of the currently selected predefined range.
    * @param itemName A string value that specifies the component name of the Range Filter or Date Filter dashboard item.
    */
  def GetCurrentPredefinedRange(itemName: String): String = js.native
  
  /**
    * Returns the currently selected range in the specified Range Filter or Date Filter dashboard item. A ASPxClientDashboardRangeFilterSelection object that is the selected range.
    * @param itemName A String value that specifies the component name of the Range Filter or Date Filter dashboard item.
    */
  def GetCurrentRange(itemName: String): ASPxClientDashboardRangeFilterSelection = js.native
  
  /**
    * Returns currently selected elements in the master filter item. An array of ASPxClientDashboardItemDataAxisPointTuple objects that identify currently selected elements.
    * @param itemName A String that specifies a component name of the master filter item.
    */
  def GetCurrentSelection(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Gets the DashboardControl object that is the client-side part of the Web Dashboard.
    */
  def GetDashboardControl(): js.Any = js.native
  
  /**
    * Gets the identifier of the dashboard that is displayed in the ASPxClientDashboard.
    */
  def GetDashboardId(): String = js.native
  
  /**
    * Gets the current dashboard state.
    */
  def GetDashboardState(): String = js.native
  
  /**
    * Returns the visible range for the specified Range Filter or Date Filter dashboard item. A ASPxClientDashboardRangeFilterSelection object that is the visible range.
    * @param itemName A String value that specifies the component name of the Range Filter or Date Filter dashboard item.
    */
  def GetEntireRange(itemName: String): ASPxClientDashboardRangeFilterSelection = js.native
  
  /**
    * Allows you to obtain options related to exporting a dashboard/dashboard item to the Excel format.
    */
  def GetExcelExportOptions(): DashboardExcelExportOptions = js.native
  
  /** @deprecated This method is obsolete now. Use the ASPxClientDashboard.GetPdfExportOptions(), ASPxClientDashboard.GetImageExportOptions() and ASPxClientDashboard.GetExcelExportOptions() methods instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Returns settings that specify parameters affecting how the dashboard is exported.
    */
  def GetExportOptions(): ASPxClientDashboardExportOptions = js.native
  
  /**
    * Allows you to obtain options related to exporting a dashboard/dashboard item to an image.
    */
  def GetImageExportOptions(): DashboardImageExportOptions = js.native
  
  /**
    * Returns the client data for the specified dashboard item. An ASPxClientDashboardItemData object that represents multidimensional data visualized in the dashboard item.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def GetItemData(itemName: String): ASPxClientDashboardItemData = js.native
  
  /**
    * Returns the name of the maximized dashboard item.
    */
  def GetMaximizedDashboardItemName(): String = js.native
  
  /**
    * Returns dashboard parameter settings and metadata.
    */
  def GetParameters(): ASPxClientDashboardParameters = js.native
  
  /**
    * Allows you to obtain options related to exporting a dashboard/dashboard item to the PDF format.
    */
  def GetPdfExportOptions(): DashboardPdfExportOptions = js.native
  
  /**
    * Gets the selected page in the specified tab container. A String object that is the tab page's componentName property value.
    * @param tabContainerName A String object that is the tab container's componentName property value.
    */
  def GetSelectedTabPage(tabContainerName: String): String = js.native
  
  /**
    * Gets the index of the selected page in the specified tab container. A Int32 object that is the tab page's index.
    * @param tabContainerName A String object that is the tab container's componentName property value.
    */
  def GetSelectedTabPageIndex(tabContainerName: String): Double = js.native
  
  /**
    * Gets the current working mode of the Web Dashboard.
    */
  def GetWorkingMode(): String = js.native
  
  /**
    * Hides the invoked Data Inspector dialog.
    */
  def HideDataInspector(): Unit = js.native
  
  /**
    * Hides the dialog that allows end-users to export the dashboard/dashboard item.
    */
  def HideExportDialog(): Unit = js.native
  
  /**
    * Closes the Dashboard Parameters dialog.
    */
  def HideParametersDialog(): Unit = js.native
  
  /**
    * Gets a value that indicates whether the Web Dashboard works in the Designer mode.
    */
  def IsDesignMode(): Boolean = js.native
  
  /**
    * Allows you to access underlying UI/Data Visualization widgets.
    */
  var ItemBeforeWidgetDisposed: ASPxClientEvent[ASPxClientDashboardItemBeforeWidgetDisposedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when a dashboard item update is initiated.
    */
  var ItemBeginUpdate: ASPxClientEvent[ASPxClientItemBeginUpdateEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to customize a dashboard item's caption (for instance, add custom buttons, menus, etc.).
    */
  var ItemCaptionToolbarUpdated: ASPxClientEvent[ASPxClientDashboardItemCaptionToolbarUpdatedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when an end-user clicks a dashboard item.
    */
  var ItemClick: ASPxClientEvent[ASPxClientDashboardItemClickEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when a drill-down/drill-up is performed.
    */
  var ItemDrillDownStateChanged: ASPxClientEvent[ASPxClientDashboardItemDrillDownStateChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to color the required dashboard item elements using the specified colors.
    */
  var ItemElementCustomColor: ASPxClientEvent[ASPxClientDashboardItemElementCustomColorEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after the dashboard item update is performed.
    */
  var ItemEndUpdate: ASPxClientEvent[ASPxClientItemEndUpdateEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs when a master filter state is changed.
    */
  var ItemMasterFilterStateChanged: ASPxClientEvent[ASPxClientDashboardItemMasterFilterStateChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Occurs after the selection within the dashboard item is changed.
    */
  var ItemSelectionChanged: ASPxClientEvent[ASPxClientDashboardItemSelectionChangedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to provide custom visual interactivity for data-bound dashboard items that support element selection and highlighting.
    */
  var ItemVisualInteractivity: ASPxClientEvent[ASPxClientDashboardItemVisualInteractivityEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to access underlying UI/Data Visualization widgets.
    */
  var ItemWidgetCreated: ASPxClientEvent[ASPxClientDashboardItemWidgetCreatedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to access underlying UI/Data Visualization widgets.
    */
  var ItemWidgetUpdated: ASPxClientEvent[ASPxClientDashboardItemWidgetUpdatedEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Allows you to access underlying UI/Data Visualization widgets.
    */
  var ItemWidgetUpdating: ASPxClientEvent[ASPxClientDashboardItemWidgetUpdatingEventHandler[ASPxClientDashboard]] = js.native
  
  /**
    * Loads a dashboard with the specified identifier from the dashboard storage.
    * @param dashboardId A string value that specifies the dashboard identifier.
    */
  def LoadDashboard(dashboardId: String): Unit = js.native
  
  /**
    * Expands the specified dashboard item to the entire dashboard size to examine data in greater detail.
    * @param itemName A String object that is the dashboard item component name.
    */
  def MaximizeDashboardItem(itemName: String): Unit = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxDashboard.CustomDataCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxDashboard.CustomDataCallback event.
    * @param onCallback An ASPxClientDataCallback object that represents the JavaScript function which receives the callback data as a parameter.
    */
  def PerformDataCallback(parameter: String, onCallback: ASPxClientDataCallback): Unit = js.native
  
  /**
    * Performs a drill-down into the required element by its value.
    * @param itemName A String that species the component name of the dashboard item.
    * @param value A value that will be used to perform a drill-down for the required element.
    */
  def PerformDrillDown(itemName: String, value: js.Any): Unit = js.native
  def PerformDrillDown(itemName: String, value: ASPxClientDashboardItemDataAxisPointTuple): Unit = js.native
  
  /**
    * Performs a drill-up for the specified dashboard item.
    * @param itemName A String that specifies the component name of the dashboard item.
    */
  def PerformDrillUp(itemName: String): Unit = js.native
  
  /**
    * Refreshes an entire dashboard displayed in the Web Dashboard control.
    */
  def Refresh(): Unit = js.native
  def Refresh(itemName: String): Unit = js.native
  def Refresh(itemName: js.Array[String]): Unit = js.native
  
  /**
    * Reloads data in the data sources.
    */
  def ReloadData(): Unit = js.native
  
  /**
    * Requests underlying data for the specified dashboard item.
    * @param itemName A string that specifies the component name of the dashboard item.
    * @param args A ASPxClientDashboardItemRequestUnderlyingDataParameters object containing parameters used to obtain the underlying data.
    * @param onCompleted A ASPxClientDashboardItemRequestUnderlyingDataCompleted object that references a method executed after the request is completed.
    */
  def RequestUnderlyingData(
    itemName: String,
    args: ASPxClientDashboardItemRequestUnderlyingDataParameters,
    onCompleted: ASPxClientDashboardItemRequestUnderlyingDataCompleted
  ): Unit = js.native
  
  /**
    * Restores the item size if an item is expanded to the entire dashboard size (maximized).
    */
  def RestoreDashboardItem(): Unit = js.native
  
  /**
    * Saves a current dashboard to the dashboard storage.
    */
  def SaveDashboard(): Unit = js.native
  
  /**
    * Occurs when the selected tab page is changed.
    */
  var SelectedTabPageChanged: ASPxClientEvent[ASPxClientSelectedTabPageChangedEventHandler[ASPxClientDashboard]] = js.native
  
  def SetDashboardState(dashboardState: String): Unit = js.native
  /**
    * Applies the dashboard state to the loaded dashboard.
    * @param dashboardState A JSON object that specifies the dashboard state.
    */
  def SetDashboardState(dashboardState: js.Any): Unit = js.native
  
  /**
    * Allows you to specify options related to exporting a dashboard/dashboard item to the Excel format.
    * @param options A DashboardExcelExportOptions object containing options related to exporting a dashboard item to the Excel format.
    */
  def SetExcelExportOptions(options: DashboardExcelExportOptions): Unit = js.native
  
  /** @deprecated This method is obsolete now. Use the ASPxClientDashboard.SetPdfExportOptions(), ASPxClientDashboard.SetImageExportOptions() and ASPxClientDashboard.SetExcelExportOptions() methods instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Specifies settings that configures dashboard export parameters.
    * @param options A ASPxClientDashboardExportOptions object containing settings that specify parameters affecting how the dashboard is exported.
    */
  def SetExportOptions(options: ASPxClientDashboardExportOptions): Unit = js.native
  
  /**
    * Allows you to specify options related to exporting a dashboard/dashboard item to an image.
    * @param options A DashboardImageExportOptions object containing options related to exporting a dashboard/dashboard item to an image.
    */
  def SetImageExportOptions(options: DashboardImageExportOptions): Unit = js.native
  
  /**
    * Selects required elements by their values in the specified master filter item.
    * @param itemName A String that specifies the component name of the master filter item.
    * @param values Values that will be used to select elements in the master filter item.
    */
  def SetMasterFilter(
    itemName: String,
    values: js.Array[ASPxClientDashboardItemDataAxisPointTuple | js.Array[js.Object]]
  ): Unit = js.native
  
  /**
    * Allows you to specify options related to exporting a dashboard/dashboard item to the PDF format.
    * @param options A DashboardPdfExportOptions object containing options related to exporting a dashboard/dashboard item to the PDF format.
    */
  def SetPdfExportOptions(options: DashboardPdfExportOptions): Unit = js.native
  
  /**
    * Selects a predefined range in the Range Filter or Date Filter dashboard item.
    * @param itemName A String value that specifies the component name of the Range Filter or Date Filter.
    * @param dateTimePeriodName A String value that specifies the predefined range name.
    */
  def SetPredefinedRange(itemName: String, dateTimePeriodName: String): Unit = js.native
  
  /**
    * Selects the required range in the specified Range Filter or Date Filter dashboard item.
    * @param itemName A String that specifies the component name of the Range Filter or Date Filter dashboard item.
    * @param range A ASPxClientDashboardRangeFilterSelection object that specifies a range to be selected.
    */
  def SetRange(itemName: String, range: ASPxClientDashboardRangeFilterSelection): Unit = js.native
  
  /**
    * Selects the specified tab page by its component name.
    * @param tabPageName A String object that is the tab page's componentName property value.
    */
  def SetSelectedTabPage(tabPageName: String): Unit = js.native
  
  /**
    * Selects the specified tab page by its index in the specified tab container.
    * @param tabContainerName A String object that is the tab container's componentName property value.
    * @param index A Int32 object that is the tab page's index.
    */
  def SetSelectedTabPageIndex(tabContainerName: String, index: Double): Unit = js.native
  
  /**
    * Invokes the Data Inspector dialog with a defined data type for the specified dashboard item.
    * @param itemName A string that specifies a component name of the dashboard item for which the Data Inspector displays data.
    * @param inspectedType A InspectedType object that defines the displayed underlying data.
    */
  def ShowDataInspector(itemName: String, inspectedType: String): Unit = js.native
  
  /**
    * Invokes the dialog that allows end-users to export the entire dashboard to the specified format.
    * @param format A string value that specifies the format. For instance, you can use 'PDF', 'Image', or 'Excel'.
    */
  def ShowExportDashboardDialog(format: String): Unit = js.native
  
  /**
    * Invokes the dialog that allows end-users to export the dashboard item to the specified format.
    * @param itemComponentName A string value that specifies the component name of the dashboard item to export.
    * @param format A string value that specifies the format. For instance, you can use 'PDF, 'Image' or 'Excel'. Note that some items (i.e., TextBoxDashboardItem or ImageDashboardItem) do not support exporting to the 'Excel' format.
    */
  def ShowExportDashboardItemDialog(itemComponentName: String, format: String): Unit = js.native
  
  /**
    * Invokes the Dashboard Parameters dialog.
    */
  def ShowParametersDialog(): Unit = js.native
  
  /**
    * Switches the ASPxClientDashboard to Designer mode.
    */
  def SwitchToDesigner(): Unit = js.native
  
  /**
    * Switches the ASPxClientDashboard to the viewer mode.
    */
  def SwitchToViewer(): Unit = js.native
  
  /**
    * Fires the DashboardTitleToolbarUpdated event.
    */
  def UpdateDashboardTitleToolbar(): Unit = js.native
  
  /**
    * Fires the ItemCaptionToolbarUpdated event for the specified item.
    * @param itemName A dashboard item name for which the event is fired.
    */
  def UpdateItemCaptionToolbar(itemName: String): Unit = js.native
}
