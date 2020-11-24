package typings.ejWebAll.ej.PivotGrid

import typings.ejWebAll.ej.Pivot.AnalysisMode
import typings.ejWebAll.ej.Pivot.OperationalMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggers when it reaches client-side after the AJAX request.
    */
  var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
  
  /** Sets the mode for the PivotGrid widget to bind either OLAP or relational data source.
    * @Default {ej.Pivot.AnalysisMode.Pivot}
    */
  var analysisMode: js.UndefOr[AnalysisMode | String] = js.native
  
  /** Triggers before performing exporting in the pivot grid.
    */
  var beforeExport: js.UndefOr[js.Function1[/* e */ BeforeExportEventArgs, Unit]] = js.native
  
  /** Triggers before the pivot engine starts to populate.
    */
  var beforePivotEnginePopulate: js.UndefOr[js.Function1[/* e */ BeforePivotEnginePopulateEventArgs, Unit]] = js.native
  
  /** Triggers before any AJAX request is passed from the PivotGrid to service methods.
    */
  var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
  
  /** Triggers when click action is performed over a value cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  
  /** Triggers when right-click action is performed on a cell.
    */
  var cellContext: js.UndefOr[js.Function1[/* e */ CellContextEventArgs, Unit]] = js.native
  
  /** Triggers when double-click action is performed over a value cell.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.native
  
  /** Triggers before editing the cells.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
  
  /** Triggers when a specific range of value cells is selected.
    */
  var cellSelection: js.UndefOr[js.Function1[/* e */ CellSelectionEventArgs, Unit]] = js.native
  
  /** Allows you to collapse specified members in each field by default.
    * @Default {null}
    */
  var collapsedMembers: js.UndefOr[js.Any] = js.native
  
  /** Triggers when the hyperlink of column header is clicked.
    */
  var columnHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ ColumnHeaderHyperlinkClickEventArgs, Unit]] = js.native
  
  /** Specifies the CSS class to the PivotGrid for achieving the custom theme.
    * @Default {â€œâ€}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Object is utilized to pass additional information between the client-end and the service-end while operating the control in server mode.
    * @Default {null}
    */
  var customObject: js.UndefOr[js.Any] = js.native
  
  /** Initializes the data source for the PivotGrid widget, when it functions completely on client-side.
    * @Default {{}}
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  
  /** Triggers after performing drill operation in the PivotGrid.
    */
  var drillSuccess: js.UndefOr[js.Function1[/* e */ DrillSuccessEventArgs, Unit]] = js.native
  
  /** Triggers while clicking &quot;OK&quot; in the drill-through dialog.
    */
  var drillThrough: js.UndefOr[js.Function1[/* e */ DrillThroughEventArgs, Unit]] = js.native
  
  /** Enables the advanced filtering options such as value filtering, label filtering, and sorting for each field in the server mode.
    * @Default {false}
    */
  var enableAdvancedFilter: js.UndefOr[Boolean] = js.native
  
  /** Allows you to get cell details in JSON format by clicking the value cell.
    * @Default {false}
    */
  var enableCellClick: js.UndefOr[Boolean] = js.native
  
  /** Allows you to access each cell by right-clicking the mouse.
    * @Default {false}
    */
  var enableCellContext: js.UndefOr[Boolean] = js.native
  
  /** Allows you to get cell details in JSON format by double-clicking the value cell.
    * @Default {false}
    */
  var enableCellDoubleClick: js.UndefOr[Boolean] = js.native
  
  /** Allows you to edit value cells for write-back support in the PivotGrid. This is applicable only for the server-mode.
    * @Default {false}
    */
  var enableCellEditing: js.UndefOr[Boolean] = js.native
  
  /** Enables the cell selection for a specific range of value cells.
    * @Default {false}
    */
  var enableCellSelection: js.UndefOr[Boolean] = js.native
  
  /** Collapses the pivot items along rows and columns by default. It works only for the relational data source.
    * @Default {false}
    */
  var enableCollapseByDefault: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the display of grand total for all columns.
    * @Default {true}
    */
  var enableColumnGrandTotal: js.UndefOr[Boolean] = js.native
  
  /** Allows you to adjust the width of columns dynamically within given widget size.
    * @Default {false}
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.native
  
  /** Allows you to export entire data instead of current page data, while paging option is enabled.
    * @Default {false}
    */
  var enableCompleteDataExport: js.UndefOr[Boolean] = js.native
  
  /** Allows you to format a specific set of cells based on the condition.
    * @Default {false}
    */
  var enableConditionalFormatting: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable/disable the context menu of pivot buttons in the PivotGrid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  
  /** Allows you to refresh the control on-demand and not during every UI operation.
    * @Default {false}
    */
  var enableDeferUpdate: js.UndefOr[Boolean] = js.native
  
  /** Enables the Drill-Through feature which retrieves raw items that are used to create a specific cell in the PivotGrid.
    * @Default {false}
    */
  var enableDrillThrough: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the display of grand total for rows and columns.
    * @Default {true}
    */
  var enableGrandTotal: js.UndefOr[Boolean] = js.native
  
  /** Enables the display of GroupingBar allowing you to filter, sort, and remove fields obtained from the datasource.
    * @Default {false}
    */
  var enableGroupingBar: js.UndefOr[Boolean] = js.native
  
  /** Allows you to load the PivotGrid using the JSON data.
    * @Default {false}
    */
  var enableJSONRendering: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables paging in the member editor for viewing the large count of members in pages.
    * @Default {false}
    */
  var enableMemberEditorPaging: js.UndefOr[Boolean] = js.native
  
  /** Enables/Disables sorting option in member editor dialog for the members of the respective field.
    * @Default {false}
    */
  var enableMemberEditorSorting: js.UndefOr[Boolean] = js.native
  
  /** Allows you to view the large amount of data by applying paging.
    * @Default {false}
    */
  var enablePaging: js.UndefOr[Boolean] = js.native
  
  /** Enables rendering of the PivotGrid widget along with the PivotTable field list which allows UI operations.
    * @Default {true}
    */
  var enablePivotFieldList: js.UndefOr[Boolean] = js.native
  
  /** Allows you to view the layout of PivotGrid from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables the display of grand total for all rows.
    * @Default {true}
    */
  var enableRowGrandTotal: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable the ToolTip.
    * @Default {false}
    */
  var enableToolTip: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable the animation effects in the tooltip.
    * @Default {false}
    */
  var enableToolTipAnimation: js.UndefOr[Boolean] = js.native
  
  /** Allows you to view the large amount of data through virtual scrolling.
    * @Default {false}
    */
  var enableVirtualScrolling: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable &quot;withCredentials&quot; property inside XMLHttpRequest object for CORS(Cross-Origin Resource Sharing) request.
    * @Default {false}
    */
  var enableXHRCredentials: js.UndefOr[Boolean] = js.native
  
  /** Object that holds the settings of frozen headers.
    * @Default {{}}
    */
  var frozenHeaderSettings: js.UndefOr[FrozenHeaderSettings] = js.native
  
  /** Allows you to display the header name in the PivotGrid control.
    * @Default {{}}
    */
  var headerSettings: js.UndefOr[HeaderSettings] = js.native
  
  /** Allows you to configure the hyperlink settings of the PivotGrid control.
    * @Default {{}}
    */
  var hyperlinkSettings: js.UndefOr[HyperlinkSettings] = js.native
  
  /** Allows you to enable PivotGridâ€™s responsiveness in the browser layout.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Contains the serialized JSON string which renders the PivotGrid.
    */
  var jsonRecords: js.UndefOr[String] = js.native
  
  /** Sets the summary layout for PivotGrid.Following are the ways in which summary can be positioned: normal summary (bottom), top summary, no summary, and excel-like summary.
    * @Default {ej.PivotGrid.Layout.Normal}
    */
  var layout: js.UndefOr[Layout | String] = js.native
  
  /** Triggers when the PivotGrid loading is initiated.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Triggers before loading a report from the database.
    */
  var loadReport: js.UndefOr[js.Function1[/* e */ LoadReportEventArgs, Unit]] = js.native
  
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Allows you to set the maximum number of nodes as well as child nodes to be displayed in the member editor.
    * @Default {1000}
    */
  var maxNodeLimitInMemberEditor: js.UndefOr[Double] = js.native
  
  /** Allows you to set the number of members to be displayed in each page of member editor on applying paging in it.
    * @Default {100}
    */
  var memberEditorPageSize: js.UndefOr[Double] = js.native
  
  /** Sets the mode for PivotGrid widget for binding the data source either in the server-side or client-side.
    * @Default {ej.Pivot.OperationalMode.ClientMode}
    */
  var operationalMode: js.UndefOr[OperationalMode | String] = js.native
  
  /** Connects the PivotSchemaDesigner with specified ID to the PivotGrid control.
    * @Default {â€œâ€}
    */
  var pivotTableFieldListID: js.UndefOr[String] = js.native
  
  /** Triggers when PivotGrid widget completes all operations at client-side after any AJAX request.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.native
  
  /** Triggers when any error occurred during the AJAX request.
    */
  var renderFailure: js.UndefOr[js.Function1[/* e */ RenderFailureEventArgs, Unit]] = js.native
  
  /** Triggers when the PivotGrid successfully reaches the client-side after any AJAX request.
    */
  var renderSuccess: js.UndefOr[js.Function1[/* e */ RenderSuccessEventArgs, Unit]] = js.native
  
  /** Allows you to fit the width of the column based on its maximum text width.
    * @Default {true}
    */
  var resizeColumnsToFit: js.UndefOr[Boolean] = js.native
  
  /** Triggers when the hyperlink of row header is clicked.
    */
  var rowHeaderHyperlinkClick: js.UndefOr[js.Function1[/* e */ RowHeaderHyperlinkClickEventArgs, Unit]] = js.native
  
  /** Triggers before saving the current report to the database.
    */
  var saveReport: js.UndefOr[js.Function1[/* e */ SaveReportEventArgs, Unit]] = js.native
  
  /** Allows you to set the custom name for the methods at service-end, communicated during AJAX post.
    * @Default {{}}
    */
  var serviceMethodSettings: js.UndefOr[ServiceMethodSettings] = js.native
  
  /** Allows you to show the appropriate unique name in the pivot button.
    * @Default {false}
    */
  var showUniqueNameOnPivotButton: js.UndefOr[Boolean] = js.native
  
  /** Triggers when the hyperlink of summary cell is clicked.
    */
  var summaryCellHyperlinkClick: js.UndefOr[js.Function1[/* e */ SummaryCellHyperlinkClickEventArgs, Unit]] = js.native
  
  /** Connects the service using the specified URL for any server updates.
    * @Default {â€œâ€}
    */
  var url: js.UndefOr[String] = js.native
  
  /** Triggers when the hyperlink of value cell is clicked.
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
    def setBeforeExport(value: /* e */ BeforeExportEventArgs => Unit): Self = this.set("beforeExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeExport: Self = this.set("beforeExport", js.undefined)
    
    @scala.inline
    def setBeforePivotEnginePopulate(value: /* e */ BeforePivotEnginePopulateEventArgs => Unit): Self = this.set("beforePivotEnginePopulate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforePivotEnginePopulate: Self = this.set("beforePivotEnginePopulate", js.undefined)
    
    @scala.inline
    def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = this.set("beforeServiceInvoke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeServiceInvoke: Self = this.set("beforeServiceInvoke", js.undefined)
    
    @scala.inline
    def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = this.set("cellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    
    @scala.inline
    def setCellContext(value: /* e */ CellContextEventArgs => Unit): Self = this.set("cellContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellContext: Self = this.set("cellContext", js.undefined)
    
    @scala.inline
    def setCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = this.set("cellDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellDoubleClick: Self = this.set("cellDoubleClick", js.undefined)
    
    @scala.inline
    def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = this.set("cellEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    
    @scala.inline
    def setCellSelection(value: /* e */ CellSelectionEventArgs => Unit): Self = this.set("cellSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellSelection: Self = this.set("cellSelection", js.undefined)
    
    @scala.inline
    def setCollapsedMembers(value: js.Any): Self = this.set("collapsedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedMembers: Self = this.set("collapsedMembers", js.undefined)
    
    @scala.inline
    def setColumnHeaderHyperlinkClick(value: /* e */ ColumnHeaderHyperlinkClickEventArgs => Unit): Self = this.set("columnHeaderHyperlinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHeaderHyperlinkClick: Self = this.set("columnHeaderHyperlinkClick", js.undefined)
    
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
    def setDrillSuccess(value: /* e */ DrillSuccessEventArgs => Unit): Self = this.set("drillSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrillSuccess: Self = this.set("drillSuccess", js.undefined)
    
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
    def setEnableCellContext(value: Boolean): Self = this.set("enableCellContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellContext: Self = this.set("enableCellContext", js.undefined)
    
    @scala.inline
    def setEnableCellDoubleClick(value: Boolean): Self = this.set("enableCellDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellDoubleClick: Self = this.set("enableCellDoubleClick", js.undefined)
    
    @scala.inline
    def setEnableCellEditing(value: Boolean): Self = this.set("enableCellEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellEditing: Self = this.set("enableCellEditing", js.undefined)
    
    @scala.inline
    def setEnableCellSelection(value: Boolean): Self = this.set("enableCellSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCellSelection: Self = this.set("enableCellSelection", js.undefined)
    
    @scala.inline
    def setEnableCollapseByDefault(value: Boolean): Self = this.set("enableCollapseByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCollapseByDefault: Self = this.set("enableCollapseByDefault", js.undefined)
    
    @scala.inline
    def setEnableColumnGrandTotal(value: Boolean): Self = this.set("enableColumnGrandTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnGrandTotal: Self = this.set("enableColumnGrandTotal", js.undefined)
    
    @scala.inline
    def setEnableColumnResizing(value: Boolean): Self = this.set("enableColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnResizing: Self = this.set("enableColumnResizing", js.undefined)
    
    @scala.inline
    def setEnableCompleteDataExport(value: Boolean): Self = this.set("enableCompleteDataExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCompleteDataExport: Self = this.set("enableCompleteDataExport", js.undefined)
    
    @scala.inline
    def setEnableConditionalFormatting(value: Boolean): Self = this.set("enableConditionalFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableConditionalFormatting: Self = this.set("enableConditionalFormatting", js.undefined)
    
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    
    @scala.inline
    def setEnableDeferUpdate(value: Boolean): Self = this.set("enableDeferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeferUpdate: Self = this.set("enableDeferUpdate", js.undefined)
    
    @scala.inline
    def setEnableDrillThrough(value: Boolean): Self = this.set("enableDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDrillThrough: Self = this.set("enableDrillThrough", js.undefined)
    
    @scala.inline
    def setEnableGrandTotal(value: Boolean): Self = this.set("enableGrandTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGrandTotal: Self = this.set("enableGrandTotal", js.undefined)
    
    @scala.inline
    def setEnableGroupingBar(value: Boolean): Self = this.set("enableGroupingBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGroupingBar: Self = this.set("enableGroupingBar", js.undefined)
    
    @scala.inline
    def setEnableJSONRendering(value: Boolean): Self = this.set("enableJSONRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableJSONRendering: Self = this.set("enableJSONRendering", js.undefined)
    
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
    def setEnablePivotFieldList(value: Boolean): Self = this.set("enablePivotFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePivotFieldList: Self = this.set("enablePivotFieldList", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableRowGrandTotal(value: Boolean): Self = this.set("enableRowGrandTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowGrandTotal: Self = this.set("enableRowGrandTotal", js.undefined)
    
    @scala.inline
    def setEnableToolTip(value: Boolean): Self = this.set("enableToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableToolTip: Self = this.set("enableToolTip", js.undefined)
    
    @scala.inline
    def setEnableToolTipAnimation(value: Boolean): Self = this.set("enableToolTipAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableToolTipAnimation: Self = this.set("enableToolTipAnimation", js.undefined)
    
    @scala.inline
    def setEnableVirtualScrolling(value: Boolean): Self = this.set("enableVirtualScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVirtualScrolling: Self = this.set("enableVirtualScrolling", js.undefined)
    
    @scala.inline
    def setEnableXHRCredentials(value: Boolean): Self = this.set("enableXHRCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableXHRCredentials: Self = this.set("enableXHRCredentials", js.undefined)
    
    @scala.inline
    def setFrozenHeaderSettings(value: FrozenHeaderSettings): Self = this.set("frozenHeaderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozenHeaderSettings: Self = this.set("frozenHeaderSettings", js.undefined)
    
    @scala.inline
    def setHeaderSettings(value: HeaderSettings): Self = this.set("headerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSettings: Self = this.set("headerSettings", js.undefined)
    
    @scala.inline
    def setHyperlinkSettings(value: HyperlinkSettings): Self = this.set("hyperlinkSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlinkSettings: Self = this.set("hyperlinkSettings", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setJsonRecords(value: String): Self = this.set("jsonRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonRecords: Self = this.set("jsonRecords", js.undefined)
    
    @scala.inline
    def setLayout(value: Layout | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
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
    def setPivotTableFieldListID(value: String): Self = this.set("pivotTableFieldListID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTableFieldListID: Self = this.set("pivotTableFieldListID", js.undefined)
    
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
    def setResizeColumnsToFit(value: Boolean): Self = this.set("resizeColumnsToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeColumnsToFit: Self = this.set("resizeColumnsToFit", js.undefined)
    
    @scala.inline
    def setRowHeaderHyperlinkClick(value: /* e */ RowHeaderHyperlinkClickEventArgs => Unit): Self = this.set("rowHeaderHyperlinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowHeaderHyperlinkClick: Self = this.set("rowHeaderHyperlinkClick", js.undefined)
    
    @scala.inline
    def setSaveReport(value: /* e */ SaveReportEventArgs => Unit): Self = this.set("saveReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveReport: Self = this.set("saveReport", js.undefined)
    
    @scala.inline
    def setServiceMethodSettings(value: ServiceMethodSettings): Self = this.set("serviceMethodSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceMethodSettings: Self = this.set("serviceMethodSettings", js.undefined)
    
    @scala.inline
    def setShowUniqueNameOnPivotButton(value: Boolean): Self = this.set("showUniqueNameOnPivotButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUniqueNameOnPivotButton: Self = this.set("showUniqueNameOnPivotButton", js.undefined)
    
    @scala.inline
    def setSummaryCellHyperlinkClick(value: /* e */ SummaryCellHyperlinkClickEventArgs => Unit): Self = this.set("summaryCellHyperlinkClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSummaryCellHyperlinkClick: Self = this.set("summaryCellHyperlinkClick", js.undefined)
    
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
