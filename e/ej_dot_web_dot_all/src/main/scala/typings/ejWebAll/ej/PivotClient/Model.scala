package typings.ejWebAll.ej.PivotClient

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import typings.ejWebAll.ej.PivotChart.ChartTypes
import typings.ejWebAll.ej.PivotGrid.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  
  /** Sets the mode for the pivot client widget for binding the OLAP or relational data sources.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  
  /** Triggers before the chart label is rendered in the pivot chart.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, Unit]] = js.native
  
  /** Triggers before exporting the control.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
  
  /** Triggers before any AJAX request is passed from the client-side to the service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  
  /** Triggers when click action is performed over a grid value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  
  /** Triggers before rendering the pivot chart.
    */
  var chartLoad: js.UndefOr[js.Function1[/* e */ ChartLoadEventArgs, Unit]] = js.native
  
  /** Allows you to set the specific chart type for the pivot chart in the pivot client widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var chartType: js.UndefOr[ChartTypes | String] = js.native
  
  /** Allows you to set the content for exporting the pivot client widget.
    * @Default {ej.PivotClient.ClientExportMode.ChartAndGrid}
    */
  var clientExportMode: js.UndefOr[ClientExportMode | String] = js.native
  
  /** Allows you to hide the cube browser and the axis element builder of the pivot client while initiating the widget.
    * @Default {false}
    */
  var collapseCubeBrowserByDefault: js.UndefOr[Boolean] = js.native
  
  /** Specifies the CSS class to the pivot client for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** An object is utilized to pass the additional information between the client-end and the service-end when the control functions are present in the server-mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  
  /** Initializes the data source for the pivot client widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  
  /** Allows you to customize the layout and appearance of the widget.
    * @Default {{}}
    */
  var displaySettings: js.UndefOr[DisplaySettings] = js.native
  
  /** Triggers while clicking the value cells in the pivot grid.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
  
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each dimensions when binding the OLAP data in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
  
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[Boolean] = js.native
  
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[Boolean] = js.native
  
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to refresh the control on-demand and not during the every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.native
  
  /** Enables the drill-through feature which retrieves the raw items that are used to create a specific cell in the pivot grid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[Boolean] = js.native
  
  /** Allows you to view the KPI elements in tree-view of the pivot client's cube browser.
    * @Default {false}
    */
  var enableKPI: js.UndefOr[Boolean] = js.native
  
  /** Allows to save and load the reports in a customized way with the help of events.
    * @Default {false}
    */
  var enableLocalStorage: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the visibility of measure group selector drop-down in the cube browser.
    * @Default {false}
    */
  var enableMeasureGroups: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables paging in the member editor for viewing the large count of members in the pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[Boolean] = js.native
  
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable the paging for both the pivot chart and the pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[Boolean] = js.native
  
  /** Allows you to include the pivot tree map component as one of the chart types.
    * @Default {false}
    */
  var enablePivotTreeMap: js.UndefOr[Boolean] = js.native
  
  /** Allows you to view the layout of the pivot client from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables the splitter option for resizing the elements in the control.
    * @Default {false}
    */
  var enableSplitter: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable the virtual scrolling for both the pivot chart and pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  
  /** Triggers before fetching the report collection from the storage.
    */
  var fetchReport: js.UndefOr[js.Function1[/* e */ FetchReportEventArgs, Unit]] = js.native
  
  /** Sets the summary layout for the pivot grid. Following are the ways in which the summary can be positioned: normal summary (bottom), top summary, no summary, and Microsoft Excel
    * summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var gridLayout: js.UndefOr[Layout | String] = js.native
  
  /** Allows you to enable the pivot clientâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Triggers while initiating the loading of the widget.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Triggers before loading the saved collection of reports.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.native
  
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.native
  
  /** Allows you to set the number of members to be displayed in each page of the member editor on applying the paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[Double] = js.native
  
  /** Sets the mode for the pivot client widget to bind the data source in the server-side or the client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  
  /** Triggers when clicking on any chart series points in the pivot chart.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.native
  
  /** Triggers when the pivot client widget completes all operations at client-end after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  
  /** Triggers when any error is occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  
  /** Triggers when the pivot client is completely rendered.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  
  /** Triggers before saving the current collection of reports.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.native
  
  /** Triggers before rendering the pivot schema designer.
    */
  var schemaLoad: js.UndefOr[js.Function1[/* e */ SchemaLoadEventArgs, Unit]] = js.native
  
  /** Allows you to set the custom name for methods at service-end, and it is communicated during the AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  
  /** Allows you to load the saved report collection from the database.
    * @Default {false}
    */
  var showReportCollection: js.UndefOr[Boolean] = js.native
  
  /** Allows you to show a unique name on the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.native
  
  /** Options to customize the size of the pivot client control.
    * @Default {Example:}
    */
  var size: js.UndefOr[js.Any] = js.native
  
  /** Sets the title for the pivot client widget.
    */
  var title: js.UndefOr[String] = js.native
  
  /** Allows you to set the visibility of icons in the toolbar panel.
    * @Default {{}}
    */
  var toolbarIconSettings: js.UndefOr[ToolbarIconSettings] = js.native
  
  /** Triggers before rendering the pivot tree map.
    */
  var treeMapLoad: js.UndefOr[js.Function1[/* e */ TreeMapLoadEventArgs, Unit]] = js.native
  
  /** Connects the service using the specified URL for any server updates.
    */
  var url: js.UndefOr[String] = js.native
  
  /** Triggers when clicking any value cell in the pivot grid.
    */
  var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.native
  
  /** Holds the necessary properties for value sorting.
    * @Default {{}}
    */
  var valueSortSettings: js.UndefOr[ValueSortSettings] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = this.set("afterServiceInvoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterServiceInvoke: Self = this.set("afterServiceInvoke", js.undefined)
    
    @scala.inline
    def setAnalysisMode(value: AnalysisMode | String): Self = this.set("analysisMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisMode: Self = this.set("analysisMode", js.undefined)
    
    @scala.inline
    def setAxesLabelRendering(value: /* e */ AxesLabelRenderingEventArgs => Unit): Self = this.set("axesLabelRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAxesLabelRendering: Self = this.set("axesLabelRendering", js.undefined)
    
    @scala.inline
    def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = this.set("beforeExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeExport: Self = this.set("beforeExport", js.undefined)
    
    @scala.inline
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
    
    @scala.inline
    def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = this.set("cellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    
    @scala.inline
    def setChartLoad(value: /* e */ ChartLoadEventArgs => Unit): Self = this.set("chartLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChartLoad: Self = this.set("chartLoad", js.undefined)
    
    @scala.inline
    def setChartType(value: ChartTypes | String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    
    @scala.inline
    def setClientExportMode(value: ClientExportMode | String): Self = this.set("clientExportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientExportMode: Self = this.set("clientExportMode", js.undefined)
    
    @scala.inline
    def setCollapseCubeBrowserByDefault(value: Boolean): Self = this.set("collapseCubeBrowserByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseCubeBrowserByDefault: Self = this.set("collapseCubeBrowserByDefault", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCustomObject(value: js.Any): Self = this.set("customObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomObject: Self = this.set("customObject", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDisplaySettings(value: DisplaySettings): Self = this.set("displaySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplaySettings: Self = this.set("displaySettings", js.undefined)
    
    @scala.inline
    def setDrillThrough(value: /* e */ DrillThroughEventArgs => Unit): Self = this.set("drillThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillThrough: Self = this.set("drillThrough", js.undefined)
    
    @scala.inline
    def setEnableAdvancedFilter(value: Boolean): Self = this.set("enableAdvancedFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdvancedFilter: Self = this.set("enableAdvancedFilter", js.undefined)
    
    @scala.inline
    def setEnableCellClick(value: Boolean): Self = this.set("enableCellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellClick: Self = this.set("enableCellClick", js.undefined)
    
    @scala.inline
    def setEnableCellDoubleClick(value: Boolean): Self = this.set("enableCellDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellDoubleClick: Self = this.set("enableCellDoubleClick", js.undefined)
    
    @scala.inline
    def setEnableCompleteDataExport(value: Boolean): Self = this.set("enableCompleteDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCompleteDataExport: Self = this.set("enableCompleteDataExport", js.undefined)
    
    @scala.inline
    def setEnableDeferUpdate(value: Boolean): Self = this.set("enableDeferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeferUpdate: Self = this.set("enableDeferUpdate", js.undefined)
    
    @scala.inline
    def setEnableDrillThrough(value: Boolean): Self = this.set("enableDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDrillThrough: Self = this.set("enableDrillThrough", js.undefined)
    
    @scala.inline
    def setEnableKPI(value: Boolean): Self = this.set("enableKPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableKPI: Self = this.set("enableKPI", js.undefined)
    
    @scala.inline
    def setEnableLocalStorage(value: Boolean): Self = this.set("enableLocalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLocalStorage: Self = this.set("enableLocalStorage", js.undefined)
    
    @scala.inline
    def setEnableMeasureGroups(value: Boolean): Self = this.set("enableMeasureGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMeasureGroups: Self = this.set("enableMeasureGroups", js.undefined)
    
    @scala.inline
    def setEnableMemberEditorPaging(value: Boolean): Self = this.set("enableMemberEditorPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMemberEditorPaging: Self = this.set("enableMemberEditorPaging", js.undefined)
    
    @scala.inline
    def setEnableMemberEditorSorting(value: Boolean): Self = this.set("enableMemberEditorSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMemberEditorSorting: Self = this.set("enableMemberEditorSorting", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = this.set("enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaging: Self = this.set("enablePaging", js.undefined)
    
    @scala.inline
    def setEnablePivotTreeMap(value: Boolean): Self = this.set("enablePivotTreeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePivotTreeMap: Self = this.set("enablePivotTreeMap", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableSplitter(value: Boolean): Self = this.set("enableSplitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSplitter: Self = this.set("enableSplitter", js.undefined)
    
    @scala.inline
    def setEnableVirtualScrolling(value: Boolean): Self = this.set("enableVirtualScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVirtualScrolling: Self = this.set("enableVirtualScrolling", js.undefined)
    
    @scala.inline
    def setEnableXHRCredentials(value: Boolean): Self = this.set("enableXHRCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableXHRCredentials: Self = this.set("enableXHRCredentials", js.undefined)
    
    @scala.inline
    def setFetchReport(value: /* e */ FetchReportEventArgs => Unit): Self = this.set("fetchReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFetchReport: Self = this.set("fetchReport", js.undefined)
    
    @scala.inline
    def setGridLayout(value: Layout | String): Self = this.set("gridLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLayout: Self = this.set("gridLayout", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadReport(value: /* e */ LoadReportEventArgs => Unit): Self = this.set("loadReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadReport: Self = this.set("loadReport", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxNodeLimitInMemberEditor(value: Double): Self = this.set("maxNodeLimitInMemberEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNodeLimitInMemberEditor: Self = this.set("maxNodeLimitInMemberEditor", js.undefined)
    
    @scala.inline
    def setMemberEditorPageSize(value: Double): Self = this.set("memberEditorPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberEditorPageSize: Self = this.set("memberEditorPageSize", js.undefined)
    
    @scala.inline
    def setOperationalMode(value: OperationalMode | String): Self = this.set("operationalMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationalMode: Self = this.set("operationalMode", js.undefined)
    
    @scala.inline
    def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = this.set("pointRegionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointRegionClick: Self = this.set("pointRegionClick", js.undefined)
    
    @scala.inline
    def setRenderComplete(value: /* e */ RenderCompleteEventArgs => Unit): Self = this.set("renderComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderComplete: Self = this.set("renderComplete", js.undefined)
    
    @scala.inline
    def setRenderFailure(value: /* e */ RenderFailureEventArgs => Unit): Self = this.set("renderFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderFailure: Self = this.set("renderFailure", js.undefined)
    
    @scala.inline
    def setRenderSuccess(value: /* e */ RenderSuccessEventArgs => Unit): Self = this.set("renderSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSuccess: Self = this.set("renderSuccess", js.undefined)
    
    @scala.inline
    def setSaveReport(value: /* e */ SaveReportEventArgs => Unit): Self = this.set("saveReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveReport: Self = this.set("saveReport", js.undefined)
    
    @scala.inline
    def setSchemaLoad(value: /* e */ SchemaLoadEventArgs => Unit): Self = this.set("schemaLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSchemaLoad: Self = this.set("schemaLoad", js.undefined)
    
    @scala.inline
    def setServiceMethodSettings(value: ServiceMethodSettings): Self = this.set("serviceMethodSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceMethodSettings: Self = this.set("serviceMethodSettings", js.undefined)
    
    @scala.inline
    def setShowReportCollection(value: Boolean): Self = this.set("showReportCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowReportCollection: Self = this.set("showReportCollection", js.undefined)
    
    @scala.inline
    def setShowUniqueNameOnPivotButton(value: Boolean): Self = this.set("showUniqueNameOnPivotButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUniqueNameOnPivotButton: Self = this.set("showUniqueNameOnPivotButton", js.undefined)
    
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToolbarIconSettings(value: ToolbarIconSettings): Self = this.set("toolbarIconSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarIconSettings: Self = this.set("toolbarIconSettings", js.undefined)
    
    @scala.inline
    def setTreeMapLoad(value: /* e */ TreeMapLoadEventArgs => Unit): Self = this.set("treeMapLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTreeMapLoad: Self = this.set("treeMapLoad", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setValueCellHyperlinkClick(value: /* e */ ValueCellHyperlinkClickEventArgs => Unit): Self = this.set("valueCellHyperlinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueCellHyperlinkClick: Self = this.set("valueCellHyperlinkClick", js.undefined)
    
    @scala.inline
    def setValueSortSettings(value: ValueSortSettings): Self = this.set("valueSortSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueSortSettings: Self = this.set("valueSortSettings", js.undefined)
  }
}
