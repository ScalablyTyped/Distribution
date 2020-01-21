package typings.ejWebAll.ej.PivotClient

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import typings.ejWebAll.ej.PivotChart.ChartTypes
import typings.ejWebAll.ej.PivotGrid.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.undefined
  /** Sets the mode for the pivot client widget for binding the OLAP or relational data sources.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.undefined
  /** Triggers before the chart label is rendered in the pivot chart.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, Unit]] = js.undefined
  /** Triggers before exporting the control.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from the client-side to the service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.undefined
  /** Triggers when click action is performed over a grid value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Triggers before rendering the pivot chart.
    */
  var chartLoad: js.UndefOr[js.Function1[/* e */ ChartLoadEventArgs, Unit]] = js.undefined
  /** Allows you to set the specific chart type for the pivot chart in the pivot client widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var chartType: js.UndefOr[ChartTypes | String] = js.undefined
  /** Allows you to set the content for exporting the pivot client widget.
    * @Default {ej.PivotClient.ClientExportMode.ChartAndGrid}
    */
  var clientExportMode: js.UndefOr[ClientExportMode | String] = js.undefined
  /** Allows you to hide the cube browser and the axis element builder of the pivot client while initiating the widget.
    * @Default {false}
    */
  var collapseCubeBrowserByDefault: js.UndefOr[Boolean] = js.undefined
  /** Specifies the CSS class to the pivot client for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** An object is utilized to pass the additional information between the client-end and the service-end when the control functions are present in the server-mode.
    * @Default {{}}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the pivot client widget, when it functions completely on the client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Allows you to customize the layout and appearance of the widget.
    * @Default {{}}
    */
  var displaySettings: js.UndefOr[DisplaySettings] = js.undefined
  /** Triggers while clicking the value cells in the pivot grid.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.undefined
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each dimensions when binding the OLAP data in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[Boolean] = js.undefined
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[Boolean] = js.undefined
  /** Allows you to refresh the control on-demand and not during the every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.undefined
  /** Enables the drill-through feature which retrieves the raw items that are used to create a specific cell in the pivot grid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the KPI elements in tree-view of the pivot client's cube browser.
    * @Default {false}
    */
  var enableKPI: js.UndefOr[Boolean] = js.undefined
  /** Allows to save and load the reports in a customized way with the help of events.
    * @Default {false}
    */
  var enableLocalStorage: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the visibility of measure group selector drop-down in the cube browser.
    * @Default {false}
    */
  var enableMeasureGroups: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables paging in the member editor for viewing the large count of members in the pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[Boolean] = js.undefined
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable the paging for both the pivot chart and the pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[Boolean] = js.undefined
  /** Allows you to include the pivot tree map component as one of the chart types.
    * @Default {false}
    */
  var enablePivotTreeMap: js.UndefOr[Boolean] = js.undefined
  /** Allows you to view the layout of the pivot client from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Enables the splitter option for resizing the elements in the control.
    * @Default {false}
    */
  var enableSplitter: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable the virtual scrolling for both the pivot chart and pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.undefined
  /** Triggers before fetching the report collection from the storage.
    */
  var fetchReport: js.UndefOr[js.Function1[/* e */ FetchReportEventArgs, Unit]] = js.undefined
  /** Sets the summary layout for the pivot grid. Following are the ways in which the summary can be positioned: normal summary (bottom), top summary, no summary, and Microsoft Excel
    * summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var gridLayout: js.UndefOr[Layout | String] = js.undefined
  /** Allows you to enable the pivot clientâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers while initiating the loading of the widget.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Triggers before loading the saved collection of reports.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.undefined
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.undefined
  /** Allows you to set the number of members to be displayed in each page of the member editor on applying the paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[Double] = js.undefined
  /** Sets the mode for the pivot client widget to bind the data source in the server-side or the client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.undefined
  /** Triggers when clicking on any chart series points in the pivot chart.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.undefined
  /** Triggers when the pivot client widget completes all operations at client-end after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Triggers when any error is occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.undefined
  /** Triggers when the pivot client is completely rendered.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.undefined
  /** Triggers before saving the current collection of reports.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.undefined
  /** Triggers before rendering the pivot schema designer.
    */
  var schemaLoad: js.UndefOr[js.Function1[/* e */ SchemaLoadEventArgs, Unit]] = js.undefined
  /** Allows you to set the custom name for methods at service-end, and it is communicated during the AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Allows you to load the saved report collection from the database.
    * @Default {false}
    */
  var showReportCollection: js.UndefOr[Boolean] = js.undefined
  /** Allows you to show a unique name on the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.undefined
  /** Options to customize the size of the pivot client control.
    * @Default {Example:}
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /** Sets the title for the pivot client widget.
    */
  var title: js.UndefOr[String] = js.undefined
  /** Allows you to set the visibility of icons in the toolbar panel.
    * @Default {{}}
    */
  var toolbarIconSettings: js.UndefOr[ToolbarIconSettings] = js.undefined
  /** Triggers before rendering the pivot tree map.
    */
  var treeMapLoad: js.UndefOr[js.Function1[/* e */ TreeMapLoadEventArgs, Unit]] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    */
  var url: js.UndefOr[String] = js.undefined
  /** Triggers when clicking any value cell in the pivot grid.
    */
  var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, Unit]] = js.undefined
  /** Holds the necessary properties for value sorting.
    * @Default {{}}
    */
  var valueSortSettings: js.UndefOr[ValueSortSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => Unit = null,
    analysisMode: AnalysisMode | String = null,
    axesLabelRendering: /* e */ AxesLabelRenderingEventArgs => Unit = null,
    beforeExport: /* e */ BeforeExportEventArgs => Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => Unit = null,
    cellClick: /* e */ CellClickEventArgs => Unit = null,
    chartLoad: /* e */ ChartLoadEventArgs => Unit = null,
    chartType: ChartTypes | String = null,
    clientExportMode: ClientExportMode | String = null,
    collapseCubeBrowserByDefault: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    displaySettings: DisplaySettings = null,
    drillThrough: /* e */ DrillThroughEventArgs => Unit = null,
    enableAdvancedFilter: js.UndefOr[Boolean] = js.undefined,
    enableCellClick: js.UndefOr[Boolean] = js.undefined,
    enableCellDoubleClick: js.UndefOr[Boolean] = js.undefined,
    enableCompleteDataExport: js.UndefOr[Boolean] = js.undefined,
    enableDeferUpdate: js.UndefOr[Boolean] = js.undefined,
    enableDrillThrough: js.UndefOr[Boolean] = js.undefined,
    enableKPI: js.UndefOr[Boolean] = js.undefined,
    enableLocalStorage: js.UndefOr[Boolean] = js.undefined,
    enableMeasureGroups: js.UndefOr[Boolean] = js.undefined,
    enableMemberEditorPaging: js.UndefOr[Boolean] = js.undefined,
    enableMemberEditorSorting: js.UndefOr[Boolean] = js.undefined,
    enablePaging: js.UndefOr[Boolean] = js.undefined,
    enablePivotTreeMap: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableSplitter: js.UndefOr[Boolean] = js.undefined,
    enableVirtualScrolling: js.UndefOr[Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[Boolean] = js.undefined,
    fetchReport: /* e */ FetchReportEventArgs => Unit = null,
    gridLayout: Layout | String = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Unit = null,
    loadReport: /* e */ LoadReportEventArgs => Unit = null,
    locale: String = null,
    maxNodeLimitInMemberEditor: Int | Double = null,
    memberEditorPageSize: Int | Double = null,
    operationalMode: OperationalMode | String = null,
    pointRegionClick: /* e */ PointRegionClickEventArgs => Unit = null,
    renderComplete: /* e */ RenderCompleteEventArgs => Unit = null,
    renderFailure: /* e */ RenderFailureEventArgs => Unit = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => Unit = null,
    saveReport: /* e */ SaveReportEventArgs => Unit = null,
    schemaLoad: /* e */ SchemaLoadEventArgs => Unit = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showReportCollection: js.UndefOr[Boolean] = js.undefined,
    showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.undefined,
    size: js.Any = null,
    title: String = null,
    toolbarIconSettings: ToolbarIconSettings = null,
    treeMapLoad: /* e */ TreeMapLoadEventArgs => Unit = null,
    url: String = null,
    valueCellHyperlinkClick: /* e */ ValueCellHyperlinkClickEventArgs => Unit = null,
    valueSortSettings: ValueSortSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(js.Any.fromFunction1(afterServiceInvoke))
    if (analysisMode != null) __obj.updateDynamic("analysisMode")(analysisMode.asInstanceOf[js.Any])
    if (axesLabelRendering != null) __obj.updateDynamic("axesLabelRendering")(js.Any.fromFunction1(axesLabelRendering))
    if (beforeExport != null) __obj.updateDynamic("beforeExport")(js.Any.fromFunction1(beforeExport))
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(js.Any.fromFunction1(beforeServiceInvoke))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1(cellClick))
    if (chartLoad != null) __obj.updateDynamic("chartLoad")(js.Any.fromFunction1(chartLoad))
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (clientExportMode != null) __obj.updateDynamic("clientExportMode")(clientExportMode.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseCubeBrowserByDefault)) __obj.updateDynamic("collapseCubeBrowserByDefault")(collapseCubeBrowserByDefault.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customObject != null) __obj.updateDynamic("customObject")(customObject.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displaySettings != null) __obj.updateDynamic("displaySettings")(displaySettings.asInstanceOf[js.Any])
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(js.Any.fromFunction1(drillThrough))
    if (!js.isUndefined(enableAdvancedFilter)) __obj.updateDynamic("enableAdvancedFilter")(enableAdvancedFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellClick)) __obj.updateDynamic("enableCellClick")(enableCellClick.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellDoubleClick)) __obj.updateDynamic("enableCellDoubleClick")(enableCellDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCompleteDataExport)) __obj.updateDynamic("enableCompleteDataExport")(enableCompleteDataExport.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeferUpdate)) __obj.updateDynamic("enableDeferUpdate")(enableDeferUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDrillThrough)) __obj.updateDynamic("enableDrillThrough")(enableDrillThrough.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKPI)) __obj.updateDynamic("enableKPI")(enableKPI.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLocalStorage)) __obj.updateDynamic("enableLocalStorage")(enableLocalStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMeasureGroups)) __obj.updateDynamic("enableMeasureGroups")(enableMeasureGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMemberEditorPaging)) __obj.updateDynamic("enableMemberEditorPaging")(enableMemberEditorPaging.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMemberEditorSorting)) __obj.updateDynamic("enableMemberEditorSorting")(enableMemberEditorSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePivotTreeMap)) __obj.updateDynamic("enablePivotTreeMap")(enablePivotTreeMap.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSplitter)) __obj.updateDynamic("enableSplitter")(enableSplitter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVirtualScrolling)) __obj.updateDynamic("enableVirtualScrolling")(enableVirtualScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials.asInstanceOf[js.Any])
    if (fetchReport != null) __obj.updateDynamic("fetchReport")(js.Any.fromFunction1(fetchReport))
    if (gridLayout != null) __obj.updateDynamic("gridLayout")(gridLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadReport != null) __obj.updateDynamic("loadReport")(js.Any.fromFunction1(loadReport))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxNodeLimitInMemberEditor != null) __obj.updateDynamic("maxNodeLimitInMemberEditor")(maxNodeLimitInMemberEditor.asInstanceOf[js.Any])
    if (memberEditorPageSize != null) __obj.updateDynamic("memberEditorPageSize")(memberEditorPageSize.asInstanceOf[js.Any])
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (pointRegionClick != null) __obj.updateDynamic("pointRegionClick")(js.Any.fromFunction1(pointRegionClick))
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1(renderFailure))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1(renderSuccess))
    if (saveReport != null) __obj.updateDynamic("saveReport")(js.Any.fromFunction1(saveReport))
    if (schemaLoad != null) __obj.updateDynamic("schemaLoad")(js.Any.fromFunction1(schemaLoad))
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(showReportCollection)) __obj.updateDynamic("showReportCollection")(showReportCollection.asInstanceOf[js.Any])
    if (!js.isUndefined(showUniqueNameOnPivotButton)) __obj.updateDynamic("showUniqueNameOnPivotButton")(showUniqueNameOnPivotButton.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbarIconSettings != null) __obj.updateDynamic("toolbarIconSettings")(toolbarIconSettings.asInstanceOf[js.Any])
    if (treeMapLoad != null) __obj.updateDynamic("treeMapLoad")(js.Any.fromFunction1(treeMapLoad))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (valueCellHyperlinkClick != null) __obj.updateDynamic("valueCellHyperlinkClick")(js.Any.fromFunction1(valueCellHyperlinkClick))
    if (valueSortSettings != null) __obj.updateDynamic("valueSortSettings")(valueSortSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

