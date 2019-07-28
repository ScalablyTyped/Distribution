package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxDashboard control.
  */
@js.native
trait ASPxClientDashboard extends ASPxClientControl {
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
    * Fires when a round trip to the server has been initiated by a call to the client PerformDataCallback method.
    */
  var CustomDataCallback: ASPxClientEvent[ASPxClientCustomDataCallbackEventHandler[ASPxClientDashboard]] = js.native
  /**
    * Occurs when a dashboard update is initiated.
    */
  var DashboardBeginUpdate: ASPxClientEvent[ASPxClientDashboardBeginUpdateEventHandler[ASPxClientDashboard]] = js.native
  /**
    * Occurs after a new dashboard is displayed in the ASPxClientDashboard.
    */
  var DashboardChanged: ASPxClientEvent[ASPxClientDashboardChangedEventHandler[ASPxClientDashboard]] = js.native
  /**
    * Occurs after the dashboard update is performed.
    */
  var DashboardEndUpdate: ASPxClientEvent[ASPxClientDashboardEndUpdateEventHandler[ASPxClientDashboard]] = js.native
  var DashboardInitialized: ASPxClientEvent[ASPxClientDashboardInitializedEventHandler[ASPxClientDashboard]] = js.native
  /**
    * Occurs after the state of the dashboard displayed in the ASPxClientDashboard is changed.
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
  var SelectedTabPageChanged: ASPxClientEvent[ASPxClientSelectedTabPageChangedEventHandler[ASPxClientDashboard]] = js.native
  /**
    * Returns whether or not the specified master filter can be cleared in the current state.
    * @param itemName A string that specifies the component name of the master filter item.
    */
  def CanClearMasterFilter(itemName: String): Boolean = js.native
  /**
    * Returns whether or not drill down is possible in the current state of the specified dashboard item.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def CanPerformDrillDown(itemName: String): Boolean = js.native
  /**
    * Returns whether or not drill up is possible in the current state of the specified dashboard item.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def CanPerformDrillUp(itemName: String): Boolean = js.native
  /**
    * Returns whether or not master filtering  can be applied in the current state of the specified master filter item.
    * @param itemName A string that specifies the component name of the master filter item.
    */
  def CanSetMasterFilter(itemName: String): Boolean = js.native
  /**
    * Clears the specified master filter item.
    * @param itemName A string that specifies the component name of the master filter item.
    */
  def ClearMasterFilter(itemName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Excel file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToExcel(itemName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Excel file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    */
  def ExportDashboardItemToExcel(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to an Excel file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    * @param fileName A string that specifies the name of the exported Excel file.
    */
  def ExportDashboardItemToExcel(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Excel file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardExcelExportOptions object containing Excel export options.
    */
  def ExportDashboardItemToExcel(itemName: String, options: DashboardExcelExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to an Excel file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardExcelExportOptions object containing Excel export options.
    * @param fileName A string that specifies the name of the exported Excel file.
    */
  def ExportDashboardItemToExcel(itemName: String, options: DashboardExcelExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Image file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToImage(itemName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Image file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    */
  def ExportDashboardItemToImage(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to an Image file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    * @param fileName A string value that specifies the name of the exported file.
    */
  def ExportDashboardItemToImage(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard item to an Image file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardImageExportOptions object containing image-specific export options.
    */
  def ExportDashboardItemToImage(itemName: String, options: DashboardImageExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to an Image file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardImageExportOptions object containing image-specific export options.
    * @param fileName A string value that specifies the name of the exported file.
    */
  def ExportDashboardItemToImage(itemName: String, options: DashboardImageExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard item to a PDF file and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    */
  def ExportDashboardItemToPdf(itemName: String): Unit = js.native
  /**
    * Exports a dashboard item to a PDF file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    */
  def ExportDashboardItemToPdf(itemName: String, options: ASPxClientDashboardExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to a PDF file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options An ASPxClientDashboardExportOptions object containing export options to be applied to the exported dashboard item.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportDashboardItemToPdf(itemName: String, options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard item to a PDF file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardPdfExportOptions object containing PDF-specific export options.
    */
  def ExportDashboardItemToPdf(itemName: String, options: DashboardPdfExportOptions): Unit = js.native
  /**
    * Exports a dashboard item to a PDF file with the specified export options and writes it to the Response.
    * @param itemName A string that is the component name of the dashboard item to be exported.
    * @param options A DashboardPdfExportOptions object containing PDF-specific export options.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportDashboardItemToPdf(itemName: String, options: DashboardPdfExportOptions, fileName: String): Unit = js.native
  /**
    * Exports dashboard data to the specified file in Excel format.
    */
  def ExportToExcel(): Unit = js.native
  /**
    * Exports dashboard data to the specified file in Excel format.
    * @param options A DashboardExcelExportOptions object containing Excel-specific options.
    */
  def ExportToExcel(options: DashboardExcelExportOptions): Unit = js.native
  /**
    * Exports dashboard data to the specified file in Excel format.
    * @param options A DashboardExcelExportOptions object containing Excel-specific options.
    * @param fileName A string value that specifies the name of the exported file.
    */
  def ExportToExcel(options: DashboardExcelExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard to an Image file and writes it to the Response.
    */
  def ExportToImage(): Unit = js.native
  /**
    * Exports a dashboard to an Image file with the specified export options and writes it to the Response.
    * @param options A ASPxClientDashboardExportOptions object containing settings that specify parameters affecting how the dashboard is exported.
    */
  def ExportToImage(options: ASPxClientDashboardExportOptions): Unit = js.native
  /**
    * Exports a dashboard to an Image file with the specified export options and writes it to the Response.
    * @param options A ASPxClientDashboardExportOptions object containing settings that specify parameters affecting how the dashboard is exported.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportToImage(options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard to an Image file with the specified export options and writes it to the Response.
    * @param options A DashboardImageExportOptions object containing image-specific export options.
    */
  def ExportToImage(options: DashboardImageExportOptions): Unit = js.native
  /**
    * Exports a dashboard to an Image file with the specified export options and writes it to the Response.
    * @param options A DashboardImageExportOptions object containing image-specific export options.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportToImage(options: DashboardImageExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard to a PDF file and writes it to the Response.
    */
  def ExportToPdf(): Unit = js.native
  /**
    * Exports a dashboard to a PDF file with the specified export options and writes it to the Response.
    * @param options A ASPxClientDashboardExportOptions object containing settings that specify parameters affecting how the dashboard is exported.
    */
  def ExportToPdf(options: ASPxClientDashboardExportOptions): Unit = js.native
  /**
    * Exports a dashboard to a PDF file with the specified export options and writes it to the Response.
    * @param options A ASPxClientDashboardExportOptions object containing settings that specify parameters affecting how the dashboard is exported.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportToPdf(options: ASPxClientDashboardExportOptions, fileName: String): Unit = js.native
  /**
    * Exports a dashboard to a PDF file with the specified export options and writes it to the Response.
    * @param options A DashboardPdfExportOptions object containing PDF-specific export options.
    */
  def ExportToPdf(options: DashboardPdfExportOptions): Unit = js.native
  /**
    * Exports a dashboard to a PDF file with the specified export options and writes it to the Response.
    * @param options A DashboardPdfExportOptions object containing PDF-specific export options.
    * @param fileName A string that specifies the name of the exported file.
    */
  def ExportToPdf(options: DashboardPdfExportOptions, fileName: String): Unit = js.native
  /**
    * Returns axis point tuples identifying elements that can be used to perform drill-down in the specified dashboard item.
    * @param itemName A String that is the component name of the dashboard item.
    */
  def GetAvailableDrillDownValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  /**
    * Returns axis point tuples identifying elements that can be selected in the current state of the master filter item.
    * @param itemName A String that is the component name of the master filter item.
    */
  def GetAvailableFilterValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  /**
    * Returns names of the predefined ranges available for the specified Range Filter.
    * @param itemName A string value that specifies the component name of the Range Filter dashboard item.
    */
  def GetAvailablePredefinedRanges(itemName: String): js.Array[String] = js.native
  /**
    * Returns the axis point tuple identifying the current drill-down state.
    * @param itemName A String that is the component name of the dashboard item.
    */
  def GetCurrentDrillDownValues(itemName: String): ASPxClientDashboardItemDataAxisPointTuple = js.native
  /**
    * Returns axis point tuples identifying currently selected elements in the master filter item.
    * @param itemName A String that is the component name of the master filter item.
    */
  def GetCurrentFilterValues(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  /**
    * Returns the name of the currently selected predefined range.
    * @param itemName A string value that specifies the component name of the Range Filter dashboard item.
    */
  def GetCurrentPredefinedRange(itemName: String): String = js.native
  /**
    * Returns the currently selected range in the specified Range Filter dashboard item.
    * @param itemName A String value that specifies the component name of the Range Filter dashboard item.
    */
  def GetCurrentRange(itemName: String): ASPxClientDashboardRangeFilterSelection = js.native
  /**
    * Returns currently selected elements in the master filter item.
    * @param itemName A String that specifies a component name of the master filter item.
    */
  def GetCurrentSelection(itemName: String): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  def GetDashboardControl(): js.Object = js.native
  /**
    * Gets the identifier of the dashboard that is displayed in the ASPxClientDashboard.
    */
  def GetDashboardId(): String = js.native
  /**
    * Gets the state of the dashboard displayed in the ASPxClientDashboard.
    */
  def GetDashboardState(): String = js.native
  /**
    * Returns the visible range for the specified Range Filter dashboard item.
    * @param itemName A String value that specifies the component name of the Range Filter dashboard item.
    */
  def GetEntireRange(itemName: String): ASPxClientDashboardRangeFilterSelection = js.native
  /**
    * Allows you to obtain options related to exporting a dashboard/dashboard item to the Excel format.
    */
  def GetExcelExportOptions(): DashboardExcelExportOptions = js.native
  /**
    * Returns settings that specify parameters affecting how the dashboard is exported.
    */
  def GetExportOptions(): ASPxClientDashboardExportOptions = js.native
  /**
    * Allows you to obtain options related to exporting a dashboard/dashboard item to an image.
    */
  def GetImageExportOptions(): DashboardImageExportOptions = js.native
  /**
    * Returns the client data for the specified dashboard item.
    * @param itemName A string that specifies the component name of the dashboard item.
    */
  def GetItemData(itemName: String): ASPxClientDashboardItemData = js.native
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
    * 
    * @param tabContainerName 
    */
  def GetSelectedTabPage(tabContainerName: String): String = js.native
  /**
    * 
    * @param tabContainerName 
    */
  def GetSelectedTabPageIndex(tabContainerName: String): Double = js.native
  /**
    * Gets the current working mode of the Web Dashboard.
    */
  def GetWorkingMode(): String = js.native
  /**
    * Hides the dialog that allows end-users to export the dashboard/dashboard item.
    */
  def HideExportDialog(): Unit = js.native
  /**
    * Closes the Dashboard Parameters dialog.
    */
  def HideParametersDialog(): Unit = js.native
  def IsDesignMode(): Boolean = js.native
  /**
    * Loads a dashboard with the specified identifier from the dashboard storage.
    * @param dashboardId A string value that specifies the dashboard identifier.
    */
  def LoadDashboard(dashboardId: String): Unit = js.native
  /**
    * 
    * @param itemName 
    */
  def MaximizeDashboardItem(itemName: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomDataCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side CustomDataCallback event.
    * @param onCallback A ASPxClientDataCallback object that represents the JavaScript function which receives the callback data as a parameter.
    */
  def PerformDataCallback(parameter: String, onCallback: ASPxClientDataCallback): Unit = js.native
  /**
    * Performs a drill-down into the required element.
    * @param itemName A String that specifies the component name of the dashboard item.
    * @param axisPointTuple A ASPxClientDashboardItemDataAxisPointTuple object representing a set of axis points.
    */
  def PerformDrillDown(itemName: String, axisPointTuple: ASPxClientDashboardItemDataAxisPointTuple): Unit = js.native
  /**
    * Performs a drill-down into the required element by its value.
    * @param itemName A String that species the component name of the dashboard item.
    * @param value A value that will be used to perform a drill-down for the required element.
    */
  def PerformDrillDown(itemName: String, value: js.Object): Unit = js.native
  /**
    * Performs a drill-up for the specified dashboard item.
    * @param itemName A String that specifies the component name of the dashboard item.
    */
  def PerformDrillUp(itemName: String): Unit = js.native
  /**
    * Refreshes an entire dashboard displayed in the Web Dashboard control.
    */
  def Refresh(): Unit = js.native
  /**
    * Refreshes the specific item from the dashboard displayed in the Web Dashboard control.
    * @param itemName A string value that specifies the component name of the dashboard item to be refreshed.
    */
  def Refresh(itemName: String): Unit = js.native
  /**
    * Refreshes specific items from the dashboard displayed in the Web Dashboard control.
    * @param itemName An array of string values that specify the component names of the dashboard items to be refreshed.
    */
  def Refresh(itemName: js.Array[String]): Unit = js.native
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
  def RestoreDashboardItem(): Unit = js.native
  /**
    * Saves a current dashboard to the dashboard storage.
    */
  def SaveDashboard(): Unit = js.native
  /**
    * Sets the state of the dashboard displayed in the ASPxClientDashboard.
    * @param dashboardStateString A string value that specifies the state of the dashboard displayed in the ASPxClientDashboard.
    */
  def SetDashboardState(dashboardStateString: String): Unit = js.native
  /**
    * Sets the state of the dashboard displayed in the ASPxClientDashboard.
    * @param dashboardState A JSON object that specifies the dashboard state.
    */
  def SetDashboardState(dashboardState: js.Object): Unit = js.native
  /**
    * Allows you to specify options related to exporting a dashboard/dashboard item to the Excel format.
    * @param options A DashboardExcelExportOptions object containing options related to exporting a dashboard item to the Excel format.
    */
  def SetExcelExportOptions(options: DashboardExcelExportOptions): Unit = js.native
  /**
    * Specifies settings that specify parameters affecting how the dashboard is exported.
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
  /**
    * Selects the required elements in the specified master filter item.
    * @param itemName A String that species the component name of the master filter item.
    * @param axisPointTuples An array of ASPxClientDashboardItemDataAxisPointTuple objects used to identify master filter elements.
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
    * Selects a predefined range in the Range Filter dashboard item.
    * @param itemName A String value that specifies the component name of the Range Filter.
    * @param dateTimePeriodName A String value that specifies the predefined range name.
    */
  def SetPredefinedRange(itemName: String, dateTimePeriodName: String): Unit = js.native
  /**
    * Selects the required range in the specified Range Filter dashboard item.
    * @param itemName A String that specifies the component name of the Range Filter dashboard item.
    * @param range A ASPxClientDashboardRangeFilterSelection object that specifies a range to be selected.
    */
  def SetRange(itemName: String, range: ASPxClientDashboardRangeFilterSelection): Unit = js.native
  /**
    * 
    * @param tabPageName 
    */
  def SetSelectedTabPage(tabPageName: String): Unit = js.native
  /**
    * 
    * @param tabContainerName 
    * @param index 
    */
  def SetSelectedTabPageIndex(tabContainerName: String, index: Double): Unit = js.native
  /**
    * Invokes the dialog that allows end-users to export the entire dashboard to the specified format.
    * @param format A string value that specifies the format. For instance, you can use 'PDF', 'Image', or 'Excel'.
    */
  def ShowExportDashboardDialog(format: String): Unit = js.native
  /**
    * Invokes the dialog that allows end-users to export the dashboard item to the specified format.
    * @param itemComponentName A string value that specifies the component name of the dashboard item to export.
    * @param format A string value that specifies the format. For instance, you can use 'PDF, 'Image' or 'Excel'. Note that some items (i.e., ImageDashboardItem) do not support exporting to the 'Excel' format.
    */
  def ShowExportDashboardItemDialog(itemComponentName: String, format: String): Unit = js.native
  /**
    * Invokes the Dashboard Parameters dialog.
    */
  def ShowParametersDialog(): Unit = js.native
  /**
    * Switches the ASPxClientDashboard to the designer mode.
    */
  def SwitchToDesigner(): Unit = js.native
  /**
    * Switches the ASPxClientDashboard to the viewer mode.
    */
  def SwitchToViewer(): Unit = js.native
  def UpdateDashboardTitleToolbar(): Unit = js.native
  /**
    * 
    * @param itemName 
    */
  def UpdateItemCaptionToolbar(itemName: String): Unit = js.native
}

