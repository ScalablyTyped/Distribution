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

