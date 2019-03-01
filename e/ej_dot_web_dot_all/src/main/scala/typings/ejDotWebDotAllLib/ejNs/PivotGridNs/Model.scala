package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers when it reaches client-side after the AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Sets the mode for the PivotGrid widget to bind either OLAP or relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String] = js.undefined
  /** Triggers before performing exporting in the pivot grid.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, scala.Unit]] = js.undefined
  /** Triggers before the pivot engine starts to populate.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, scala.Unit]] = js.undefined
  /** Triggers before any AJAX request is passed from the PivotGrid to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when click action is performed over a value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers when right-click action is performed on a cell.
    */
  var cellContext: js.UndefOr[js.Function1[/* e */ CellContextEventArgs, scala.Unit]] = js.undefined
  /** Triggers when double-click action is performed over a value cell.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers before editing the cells.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a specific range of value cells is selected.
    */
  var cellSelection: js.UndefOr[js.Function1[/* e */ CellSelectionEventArgs, scala.Unit]] = js.undefined
  /** Allows you to collapse specified members in each field by default.
    * @Default {null}
    */
  var collapsedMembers: js.UndefOr[js.Any] = js.undefined
  /** Triggers when the hyperlink of column header is clicked.
    */
  var columnHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ ColumnHeaderHyperlinkClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the CSS class to the PivotGrid for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in server mode.
    * @Default {null}
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** Initializes the data source for the PivotGrid widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /** Triggers after performing drill operation in the PivotGrid.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, scala.Unit]] = js.undefined
  /** Triggers while clicking &quot;OK&quot; in the drill-through dialog.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, scala.Unit]] = js.undefined
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each field in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to access each cell by right-clicking the mouse.
    * @Default {false}
    */
  var enableCellContext: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to edit value cells for write-back support in the PivotGrid. This is applicable only for the server-mode.
    * @Default {false}
    */
  var enableCellEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the cell selection for a specific range of value cells.
    * @Default {false}
    */
  var enableCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Collapses the pivot items along rows and columns by default. It works only for the relational data source.
    * @Default {false}
    */
  var enableCollapseByDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the display of grand total for all columns.
    * @Default {true}
    */
  var enableColumnGrandTotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to adjust the width of columns dynamically within given widget size.
    * @Default {false}
    */
  var enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to format a specific set of cells based on the condition.
    * @Default {false}
    */
  var enableConditionalFormatting: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable/disable the context menu of pivot buttons in the PivotGrid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to refresh the control on-demand and not during every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the Drill-Through feature which retrieves raw items that are used to create a specific cell in the PivotGrid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the display of grand total for rows and columns.
    * @Default {true}
    */
  var enableGrandTotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the display of GroupingBar allowing you to filter, sort, and remove fields obtained from the datasource.
    * @Default {false}
    */
  var enableGroupingBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to load the PivotGrid using the JSON data.
    * @Default {false}
    */
  var enableJSONRendering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables paging in the member editor for viewing the large count of members in pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to view the large amount of data by applying paging.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables rendering of the PivotGrid widget along with the PivotTable field list which allows UI operations.
    * @Default {true}
    */
  var enablePivotFieldList: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to view the layout of PivotGrid from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the display of grand total for all rows.
    * @Default {true}
    */
  var enableRowGrandTotal: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable the ToolTip.
    * @Default {false}
    */
  var enableToolTip: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable the animation effects in the tooltip.
    * @Default {false}
    */
  var enableToolTipAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to view the large amount of data through virtual scrolling.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined
  /** Object that holds the settings of frozen headers.
    * @Default {{}}
    */
  var frozenHeaderSettings: js.UndefOr[FrozenHeaderSettings] = js.undefined
  /** Allows you to display the header name in the PivotGrid control.
    * @Default {{}}
    */
  var headerSettings: js.UndefOr[HeaderSettings] = js.undefined
  /** Allows you to configure the hyperlink settings of the PivotGrid control.
    * @Default {{}}
    */
  var hyperlinkSettings: js.UndefOr[HyperlinkSettings] = js.undefined
  /** Allows you to enable PivotGridâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains the serialized JSON string which renders the PivotGrid.
    */
  var jsonRecords: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the summary layout for PivotGrid.Following are the ways in which summary can be positioned: normal summary (bottom), top summary, no summary, and excel-like summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var layout: js.UndefOr[Layout | java.lang.String] = js.undefined
  /** Triggers when the PivotGrid loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Triggers before loading a report from the database.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, scala.Unit]] = js.undefined
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[scala.Double] = js.undefined
  /** Allows you to set the number of members to be displayed in each page of member editor on applying paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[scala.Double] = js.undefined
  /** Sets the mode for PivotGrid widget for binding the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String] = js.undefined
  /** Connects the PivotSchemaDesigner with specified ID to the PivotGrid control.
    * @Default {â€œâ€}
    */
  var pivotTableFieldListID: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when PivotGrid widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when any error occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the PivotGrid successfully reaches the client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit]] = js.undefined
  /** Allows you to fit the width of the column based on its maximum text width.
    * @Default {true}
    */
  var resizeColumnsToFit: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the hyperlink of row header is clicked.
    */
  var rowHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ RowHeaderHyperlinkClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers before saving the current report to the database.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, scala.Unit]] = js.undefined
  /** Allows you to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.undefined
  /** Allows you to show the appropriate unique name in the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the hyperlink of summary cell is clicked.
    */
  var summaryCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ SummaryCellHyperlinkClickEventArgs, scala.Unit]] = js.undefined
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the hyperlink of value cell is clicked.
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
    afterServiceInvoke: js.Function1[/* e */ AfterServiceInvokeEventArgs, scala.Unit] = null,
    analysisMode: ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode | java.lang.String = null,
    beforeExport: js.Function1[/* e */ BeforeExportEventArgs, scala.Unit] = null,
    beforePivotEnginePopulate: js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, scala.Unit] = null,
    beforeServiceInvoke: js.Function1[/* e */ BeforeServiceInvokeEventArgs, scala.Unit] = null,
    cellClick: js.Function1[/* e */ CellClickEventArgs, scala.Unit] = null,
    cellContext: js.Function1[/* e */ CellContextEventArgs, scala.Unit] = null,
    cellDoubleClick: js.Function1[/* e */ CellDoubleClickEventArgs, scala.Unit] = null,
    cellEdit: js.Function1[/* e */ CellEditEventArgs, scala.Unit] = null,
    cellSelection: js.Function1[/* e */ CellSelectionEventArgs, scala.Unit] = null,
    collapsedMembers: js.Any = null,
    columnHeaderHyperlinkClick: js.Function1[/* e */ ColumnHeaderHyperlinkClickEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    customObject: js.Any = null,
    dataSource: DataSource = null,
    drillSuccess: js.Function1[/* e */ DrillSuccessEventArgs, scala.Unit] = null,
    drillThrough: js.Function1[/* e */ DrillThroughEventArgs, scala.Unit] = null,
    enableAdvancedFilter: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellClick: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellContext: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellEditing: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableCollapseByDefault: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnGrandTotal: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined,
    enableCompleteDataExport: js.UndefOr[scala.Boolean] = js.undefined,
    enableConditionalFormatting: js.UndefOr[scala.Boolean] = js.undefined,
    enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enableDeferUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    enableDrillThrough: js.UndefOr[scala.Boolean] = js.undefined,
    enableGrandTotal: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupingBar: js.UndefOr[scala.Boolean] = js.undefined,
    enableJSONRendering: js.UndefOr[scala.Boolean] = js.undefined,
    enableMemberEditorPaging: js.UndefOr[scala.Boolean] = js.undefined,
    enableMemberEditorSorting: js.UndefOr[scala.Boolean] = js.undefined,
    enablePaging: js.UndefOr[scala.Boolean] = js.undefined,
    enablePivotFieldList: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowGrandTotal: js.UndefOr[scala.Boolean] = js.undefined,
    enableToolTip: js.UndefOr[scala.Boolean] = js.undefined,
    enableToolTipAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableVirtualScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    enableXHRCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    frozenHeaderSettings: FrozenHeaderSettings = null,
    headerSettings: HeaderSettings = null,
    hyperlinkSettings: HyperlinkSettings = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    jsonRecords: java.lang.String = null,
    layout: Layout | java.lang.String = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    loadReport: js.Function1[/* e */ LoadReportEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    maxNodeLimitInMemberEditor: scala.Int | scala.Double = null,
    memberEditorPageSize: scala.Int | scala.Double = null,
    operationalMode: ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode | java.lang.String = null,
    pivotTableFieldListID: java.lang.String = null,
    renderComplete: js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit] = null,
    renderFailure: js.Function1[/* e */ RenderFailureEventArgs, scala.Unit] = null,
    renderSuccess: js.Function1[/* e */ RenderSuccessEventArgs, scala.Unit] = null,
    resizeColumnsToFit: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeaderHyperlinkClick: js.Function1[/* e */ RowHeaderHyperlinkClickEventArgs, scala.Unit] = null,
    saveReport: js.Function1[/* e */ SaveReportEventArgs, scala.Unit] = null,
    serviceMethodSettings: ServiceMethodSettings = null,
    showUniqueNameOnPivotButton: js.UndefOr[scala.Boolean] = js.undefined,
    summaryCellHyperlinkClick: js.Function1[/* e */ SummaryCellHyperlinkClickEventArgs, scala.Unit] = null,
    url: java.lang.String = null,
    valueCellHyperlinkClick: js.Function1[/* e */ ValueCellHyperlinkClickEventArgs, scala.Unit] = null,
    valueSortSettings: ValueSortSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterServiceInvoke != null) __obj.updateDynamic("afterServiceInvoke")(afterServiceInvoke)
    if (analysisMode != null) __obj.updateDynamic("analysisMode")(analysisMode.asInstanceOf[js.Any])
    if (beforeExport != null) __obj.updateDynamic("beforeExport")(beforeExport)
    if (beforePivotEnginePopulate != null) __obj.updateDynamic("beforePivotEnginePopulate")(beforePivotEnginePopulate)
    if (beforeServiceInvoke != null) __obj.updateDynamic("beforeServiceInvoke")(beforeServiceInvoke)
    if (cellClick != null) __obj.updateDynamic("cellClick")(cellClick)
    if (cellContext != null) __obj.updateDynamic("cellContext")(cellContext)
    if (cellDoubleClick != null) __obj.updateDynamic("cellDoubleClick")(cellDoubleClick)
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit)
    if (cellSelection != null) __obj.updateDynamic("cellSelection")(cellSelection)
    if (collapsedMembers != null) __obj.updateDynamic("collapsedMembers")(collapsedMembers)
    if (columnHeaderHyperlinkClick != null) __obj.updateDynamic("columnHeaderHyperlinkClick")(columnHeaderHyperlinkClick)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (drillSuccess != null) __obj.updateDynamic("drillSuccess")(drillSuccess)
    if (drillThrough != null) __obj.updateDynamic("drillThrough")(drillThrough)
    if (!js.isUndefined(enableAdvancedFilter)) __obj.updateDynamic("enableAdvancedFilter")(enableAdvancedFilter)
    if (!js.isUndefined(enableCellClick)) __obj.updateDynamic("enableCellClick")(enableCellClick)
    if (!js.isUndefined(enableCellContext)) __obj.updateDynamic("enableCellContext")(enableCellContext)
    if (!js.isUndefined(enableCellDoubleClick)) __obj.updateDynamic("enableCellDoubleClick")(enableCellDoubleClick)
    if (!js.isUndefined(enableCellEditing)) __obj.updateDynamic("enableCellEditing")(enableCellEditing)
    if (!js.isUndefined(enableCellSelection)) __obj.updateDynamic("enableCellSelection")(enableCellSelection)
    if (!js.isUndefined(enableCollapseByDefault)) __obj.updateDynamic("enableCollapseByDefault")(enableCollapseByDefault)
    if (!js.isUndefined(enableColumnGrandTotal)) __obj.updateDynamic("enableColumnGrandTotal")(enableColumnGrandTotal)
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing)
    if (!js.isUndefined(enableCompleteDataExport)) __obj.updateDynamic("enableCompleteDataExport")(enableCompleteDataExport)
    if (!js.isUndefined(enableConditionalFormatting)) __obj.updateDynamic("enableConditionalFormatting")(enableConditionalFormatting)
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu)
    if (!js.isUndefined(enableDeferUpdate)) __obj.updateDynamic("enableDeferUpdate")(enableDeferUpdate)
    if (!js.isUndefined(enableDrillThrough)) __obj.updateDynamic("enableDrillThrough")(enableDrillThrough)
    if (!js.isUndefined(enableGrandTotal)) __obj.updateDynamic("enableGrandTotal")(enableGrandTotal)
    if (!js.isUndefined(enableGroupingBar)) __obj.updateDynamic("enableGroupingBar")(enableGroupingBar)
    if (!js.isUndefined(enableJSONRendering)) __obj.updateDynamic("enableJSONRendering")(enableJSONRendering)
    if (!js.isUndefined(enableMemberEditorPaging)) __obj.updateDynamic("enableMemberEditorPaging")(enableMemberEditorPaging)
    if (!js.isUndefined(enableMemberEditorSorting)) __obj.updateDynamic("enableMemberEditorSorting")(enableMemberEditorSorting)
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging)
    if (!js.isUndefined(enablePivotFieldList)) __obj.updateDynamic("enablePivotFieldList")(enablePivotFieldList)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableRowGrandTotal)) __obj.updateDynamic("enableRowGrandTotal")(enableRowGrandTotal)
    if (!js.isUndefined(enableToolTip)) __obj.updateDynamic("enableToolTip")(enableToolTip)
    if (!js.isUndefined(enableToolTipAnimation)) __obj.updateDynamic("enableToolTipAnimation")(enableToolTipAnimation)
    if (!js.isUndefined(enableVirtualScrolling)) __obj.updateDynamic("enableVirtualScrolling")(enableVirtualScrolling)
    if (!js.isUndefined(enableXHRCredentials)) __obj.updateDynamic("enableXHRCredentials")(enableXHRCredentials)
    if (frozenHeaderSettings != null) __obj.updateDynamic("frozenHeaderSettings")(frozenHeaderSettings)
    if (headerSettings != null) __obj.updateDynamic("headerSettings")(headerSettings)
    if (hyperlinkSettings != null) __obj.updateDynamic("hyperlinkSettings")(hyperlinkSettings)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (jsonRecords != null) __obj.updateDynamic("jsonRecords")(jsonRecords)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadReport != null) __obj.updateDynamic("loadReport")(loadReport)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxNodeLimitInMemberEditor != null) __obj.updateDynamic("maxNodeLimitInMemberEditor")(maxNodeLimitInMemberEditor.asInstanceOf[js.Any])
    if (memberEditorPageSize != null) __obj.updateDynamic("memberEditorPageSize")(memberEditorPageSize.asInstanceOf[js.Any])
    if (operationalMode != null) __obj.updateDynamic("operationalMode")(operationalMode.asInstanceOf[js.Any])
    if (pivotTableFieldListID != null) __obj.updateDynamic("pivotTableFieldListID")(pivotTableFieldListID)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(renderComplete)
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(renderFailure)
    if (renderSuccess != null) __obj.updateDynamic("renderSuccess")(renderSuccess)
    if (!js.isUndefined(resizeColumnsToFit)) __obj.updateDynamic("resizeColumnsToFit")(resizeColumnsToFit)
    if (rowHeaderHyperlinkClick != null) __obj.updateDynamic("rowHeaderHyperlinkClick")(rowHeaderHyperlinkClick)
    if (saveReport != null) __obj.updateDynamic("saveReport")(saveReport)
    if (serviceMethodSettings != null) __obj.updateDynamic("serviceMethodSettings")(serviceMethodSettings)
    if (!js.isUndefined(showUniqueNameOnPivotButton)) __obj.updateDynamic("showUniqueNameOnPivotButton")(showUniqueNameOnPivotButton)
    if (summaryCellHyperlinkClick != null) __obj.updateDynamic("summaryCellHyperlinkClick")(summaryCellHyperlinkClick)
    if (url != null) __obj.updateDynamic("url")(url)
    if (valueCellHyperlinkClick != null) __obj.updateDynamic("valueCellHyperlinkClick")(valueCellHyperlinkClick)
    if (valueSortSettings != null) __obj.updateDynamic("valueSortSettings")(valueSortSettings)
    __obj.asInstanceOf[Model]
  }
}

