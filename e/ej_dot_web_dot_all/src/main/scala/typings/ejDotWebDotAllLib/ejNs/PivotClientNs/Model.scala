package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches the client-side after any AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Sets the mode for the pivot client widget for binding the OLAP or relational data sources.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String] = js.undefined
  /** Triggers before the chart label is rendered in the pivot chart.
    */
  var axesLabelRendering: js.UndefOr[js.Function1[/* e */ AxesLabelRenderingEventArgs, scala.Unit]] = js.undefined
  /** Triggers before exporting the control.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, scala.Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from the client-side to the service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when click action is performed over a grid value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers before rendering the pivot chart.
    */
  var chartLoad: js.UndefOr[js.Function1[/* e */ ChartLoadEventArgs, scala.Unit]] = js.undefined
  /** Allows you to set the specific chart type for the pivot chart in the pivot client widget.
    * @Default {ej.PivotChart.ChartTypes.Column}
    */
  var chartType: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotChartNs.ChartTypes | java.lang.String] = js.undefined
  /** Allows you to set the content for exporting the pivot client widget.
    * @Default {ej.PivotClient.ClientExportMode.ChartAndGrid}
    */
  var clientExportMode: js.UndefOr[ClientExportMode | java.lang.String] = js.undefined
  /** Allows you to hide the cube browser and the axis element builder of the pivot client while initiating the widget.
    * @Default {false}
    */
  var collapseCubeBrowserByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the CSS class to the pivot client for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
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
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, scala.Unit]] = js.undefined
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each dimensions when binding the OLAP data in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to refresh the control on-demand and not during the every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the drill-through feature which retrieves the raw items that are used to create a specific cell in the pivot grid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to view the KPI elements in tree-view of the pivot client's cube browser.
    * @Default {false}
    */
  var enableKPI: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows to save and load the reports in a customized way with the help of events.
    * @Default {false}
    */
  var enableLocalStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the visibility of measure group selector drop-down in the cube browser.
    * @Default {false}
    */
  var enableMeasureGroups: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables paging in the member editor for viewing the large count of members in the pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable the paging for both the pivot chart and the pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to include the pivot tree map component as one of the chart types.
    * @Default {false}
    */
  var enablePivotTreeMap: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to view the layout of the pivot client from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the splitter option for resizing the elements in the control.
    * @Default {false}
    */
  var enableSplitter: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable the virtual scrolling for both the pivot chart and pivot grid components for viewing the large data.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers before fetching the report collection from the storage.
    */
  var fetchReport: js.UndefOr[js.Function1[/* e */ FetchReportEventArgs, scala.Unit]] = js.undefined
  /** Sets the summary layout for the pivot grid. Following are the ways in which the summary can be positioned: normal summary (bottom), top summary, no summary, and Microsoft Excel
    * summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var gridLayout: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotGridNs.Layout | java.lang.String] = js.undefined
  /** Allows you to enable the pivot clientâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers while initiating the loading of the widget.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Triggers before loading the saved collection of reports.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, scala.Unit]] = js.undefined
  /** Allows you to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[scala.Double] = js.undefined
  /** Allows you to set the number of members to be displayed in each page of the member editor on applying the paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[scala.Double] = js.undefined
  /** Sets the mode for the pivot client widget to bind the data source in the server-side or the client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String] = js.undefined
  /** Triggers when clicking on any chart series points in the pivot chart.
    */
  var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the pivot client widget completes all operations at client-end after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when any error is occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the pivot client is completely rendered.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit]] = js.undefined
  /** Triggers before saving the current collection of reports.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, scala.Unit]] = js.undefined
  /** Triggers before rendering the pivot schema designer.
    */
  var schemaLoad: js.UndefOr[js.Function1[/* e */ SchemaLoadEventArgs, scala.Unit]] = js.undefined
  /** Allows you to set the custom name for methods at service-end, and it is communicated during the AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Allows you to load the saved report collection from the database.
    * @Default {false}
    */
  var showReportCollection: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to show a unique name on the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to customize the size of the pivot client control.
    * @Default {Example:}
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /** Sets the title for the pivot client widget.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the visibility of icons in the toolbar panel.
    * @Default {{}}
    */
  var toolbarIconSettings: js.UndefOr[ToolbarIconSettings] = js.undefined
  /** Triggers before rendering the pivot tree map.
    */
  var treeMapLoad: js.UndefOr[js.Function1[/* e */ TreeMapLoadEventArgs, scala.Unit]] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when clicking any value cell in the pivot grid.
    */
  var valueCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, scala.Unit]] = js.undefined
  /** Holds the necessary properties for value sorting.
    * @Default {{}}
    */
  var valueSortSettings: js.UndefOr[ValueSortSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterServiceInvoke: /* e */ AfterServiceInvokeEventArgs => scala.Unit = null,
    analysisMode: ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String = null,
    axesLabelRendering: /* e */ AxesLabelRenderingEventArgs => scala.Unit = null,
    beforeExport: /* e */ BeforeExportEventArgs => scala.Unit = null,
    beforeServiceInvoke: /* e */ BeforeServiceInvokeEventArgs => scala.Unit = null,
    cellClick: /* e */ CellClickEventArgs => scala.Unit = null,
    chartLoad: /* e */ ChartLoadEventArgs => scala.Unit = null,
    chartType: ejDotWebDotAllLib.ejNs.PivotChartNs.ChartTypes | java.lang.String = null,
    clientExportMode: ClientExportMode | java.lang.String = null,
    collapseCubeBrowserByDefault: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    displaySettings: DisplaySettings = null,
    drillThrough: /* e */ DrillThroughEventArgs => scala.Unit = null,
    enableAdvancedFilter: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellClick: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    enableCompleteDataExport: js.UndefOr[scala.Boolean] = js.undefined,
    enableDeferUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    enableDrillThrough: js.UndefOr[scala.Boolean] = js.undefined,
    enableKPI: js.UndefOr[scala.Boolean] = js.undefined,
    enableLocalStorage: js.UndefOr[scala.Boolean] = js.undefined,
    enableMeasureGroups: js.UndefOr[scala.Boolean] = js.undefined,
    enableMemberEditorPaging: js.UndefOr[scala.Boolean] = js.undefined,
    enableMemberEditorSorting: js.UndefOr[scala.Boolean] = js.undefined,
    enablePaging: js.UndefOr[scala.Boolean] = js.undefined,
    enablePivotTreeMap: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableSplitter: js.UndefOr[scala.Boolean] = js.undefined,
    enableVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    fetchReport: /* e */ FetchReportEventArgs => scala.Unit = null,
    gridLayout: ejDotWebDotAllLib.ejNs.PivotGridNs.Layout | java.lang.String = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    loadReport: /* e */ LoadReportEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    maxNodeLimitInMemberEditor: scala.Int | scala.Double = null,
    memberEditorPageSize: scala.Int | scala.Double = null,
    operationalMode: ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String = null,
    pointRegionClick: /* e */ PointRegionClickEventArgs => scala.Unit = null,
    renderComplete: /* e */ RenderCompleteEventArgs => scala.Unit = null,
    renderFailure: /* e */ RenderFailureEventArgs => scala.Unit = null,
    renderSuccess: /* e */ RenderSuccessEventArgs => scala.Unit = null,
    saveReport: /* e */ SaveReportEventArgs => scala.Unit = null,
    schemaLoad: /* e */ SchemaLoadEventArgs => scala.Unit = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showReportCollection: js.UndefOr[scala.Boolean] = js.undefined,
    showUniqueNameOnPivotButton: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.Any = null,
    title: java.lang.String = null,
    toolbarIconSettings: ToolbarIconSettings = null,
    treeMapLoad: /* e */ TreeMapLoadEventArgs => scala.Unit = null,
    url: java.lang.String = null,
    valueCellHyperlinkClick: /* e */ ValueCellHyperlinkClickEventArgs => scala.Unit = null,
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
    if (!js.isUndefined(collapseCubeBrowserByDefault)) __obj.updateDynamic("collapseCubeBrowserByDefault")(collapseCubeBrowserByDefault)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (displaySettings != null) __obj.updateDynamic("displaySettings")(displaySettings)
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(js.Any.fromFunction1(drillThrough))
    if (!js.isUndefined(enableAdvancedFilter)) __obj.updateDynamic("enableAdvancedFilter")(enableAdvancedFilter)
    if (!js.isUndefined(enableCellClick)) __obj.updateDynamic("enableCellClick")(enableCellClick)
    if (!js.isUndefined(enableCellDoubleClick)) __obj.updateDynamic("enableCellDoubleClick")(enableCellDoubleClick)
    if (!js.isUndefined(enableCompleteDataExport)) __obj.updateDynamic("enableCompleteDataExport")(enableCompleteDataExport)
    if (!js.isUndefined(enableDeferUpdate)) __obj.updateDynamic("enableDeferUpdate")(enableDeferUpdate)
    if (!js.isUndefined(enableDrillThrough)) __obj.updateDynamic("enableDrillThrough")(enableDrillThrough)
    if (!js.isUndefined(enableKPI)) __obj.updateDynamic("enableKPI")(enableKPI)
    if (!js.isUndefined(enableLocalStorage)) __obj.updateDynamic("enableLocalStorage")(enableLocalStorage)
    if (!js.isUndefined(enableMeasureGroups)) __obj.updateDynamic("enableMeasureGroups")(enableMeasureGroups)
    if (!js.isUndefined(enableMemberEditorPaging)) __obj.updateDynamic("enableMemberEditorPaging")(enableMemberEditorPaging)
    if (!js.isUndefined(enableMemberEditorSorting)) __obj.updateDynamic("enableMemberEditorSorting")(enableMemberEditorSorting)
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging)
    if (!js.isUndefined(enablePivotTreeMap)) __obj.updateDynamic("enablePivotTreeMap")(enablePivotTreeMap)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableSplitter)) __obj.updateDynamic("enableSplitter")(enableSplitter)
    if (!js.isUndefined(enableVirtualScrolling)) __obj.updateDynamic("enableVirtualScrolling")(enableVirtualScrolling)
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials)
    if (fetchReport != null) __obj.updateDynamic("fetchReport")(js.Any.fromFunction1(fetchReport))
    if (gridLayout != null) __obj.updateDynamic("gridLayout")(gridLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadReport != null) __obj.updateDynamic("loadReport")(js.Any.fromFunction1(loadReport))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxNodeLimitInMemberEditor != null) __obj.updateDynamic("maxNodeLimitInMemberEditor")(maxNodeLimitInMemberEditor.asInstanceOf[js.Any])
    if (memberEditorPageSize != null) __obj.updateDynamic("memberEditorPageSize")(memberEditorPageSize.asInstanceOf[js.Any])
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (pointRegionClick != null) __obj.updateDynamic("pointRegionClick")(js.Any.fromFunction1(pointRegionClick))
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(js.Any.fromFunction1(renderFailure))
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(js.Any.fromFunction1(renderSuccess))
    if (saveReport != null) __obj.updateDynamic("saveReport")(js.Any.fromFunction1(saveReport))
    if (schemaLoad != null) __obj.updateDynamic("schemaLoad")(js.Any.fromFunction1(schemaLoad))
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings)
    if (!js.isUndefined(showReportCollection)) __obj.updateDynamic("showReportCollection")(showReportCollection)
    if (!js.isUndefined(showUniqueNameOnPivotButton)) __obj.updateDynamic("showUniqueNameOnPivotButton")(showUniqueNameOnPivotButton)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    if (toolbarIconSettings != null) __obj.updateDynamic("toolbarIconSettings")(toolbarIconSettings)
    if (treeMapLoad != null) __obj.updateDynamic("treeMapLoad")(js.Any.fromFunction1(treeMapLoad))
    if (url != null) __obj.updateDynamic("url")(url)
    if (valueCellHyperlinkClick != null) __obj.updateDynamic("valueCellHyperlinkClick")(js.Any.fromFunction1(valueCellHyperlinkClick))
    if (valueSortSettings != null) __obj.updateDynamic("valueSortSettings")(valueSortSettings)
    __obj.asInstanceOf[Model]
  }
}

