package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowCollapsing
import typings.devextreme.anon.AllowColumnDragging
import typings.devextreme.anon.AllowExportSelectedData
import typings.devextreme.anon.AutoExpandAll
import typings.devextreme.anon.CalculateCustomSummary
import typings.devextreme.anon.CancelColumn
import typings.devextreme.anon.CellElement
import typings.devextreme.anon.ColumnIndex
import typings.devextreme.anon.Columns
import typings.devextreme.anon.DataField
import typings.devextreme.anon.Disabled
import typings.devextreme.anon.DisplayValue
import typings.devextreme.anon.ElementFileName
import typings.devextreme.anon.Filtering
import typings.devextreme.anon.Format
import typings.devextreme.anon.GroupColumn
import typings.devextreme.anon.GroupIndex
import typings.devextreme.anon.IsExpanded
import typings.devextreme.anon.IsNewRow
import typings.devextreme.anon.IsSelected
import typings.devextreme.anon.Items
import typings.devextreme.anon.NewRowIndex
import typings.devextreme.anon.Row
import typings.devextreme.anon.RowElement
import typings.devextreme.anon.`0`
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridOptions extends GridBaseOptions[dxDataGrid] {
  /** @name dxDataGrid.Options.columns */
  @JSName("columns")
  var columns_dxDataGridOptions: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.native
  /** @name dxDataGrid.Options.customizeColumns */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxDataGridColumn], _]] = js.native
  /** @deprecated */
  /** @name dxDataGrid.Options.customizeExportData */
  var customizeExportData: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[dxDataGridColumn], 
      /* rows */ js.Array[dxDataGridRowObject], 
      _
    ]
  ] = js.native
  /** @name dxDataGrid.Options.editing */
  @JSName("editing")
  var editing_dxDataGridOptions: js.UndefOr[dxDataGridEditing] = js.native
  /** @name dxDataGrid.Options.export */
  var export: js.UndefOr[AllowExportSelectedData] = js.native
  /** @name dxDataGrid.Options.groupPanel */
  var groupPanel: js.UndefOr[AllowColumnDragging] = js.native
  /** @name dxDataGrid.Options.grouping */
  var grouping: js.UndefOr[AllowCollapsing] = js.native
  /** @name dxDataGrid.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.native
  /** @name dxDataGrid.Options.masterDetail */
  var masterDetail: js.UndefOr[AutoExpandAll] = js.native
  /** @name dxDataGrid.Options.onCellClick */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElement, _]) | String] = js.native
  /** @name dxDataGrid.Options.onCellDblClick */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndex, _]] = js.native
  /** @name dxDataGrid.Options.onCellHoverChanged */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ DisplayValue, _]] = js.native
  /** @name dxDataGrid.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ IsExpanded, _]] = js.native
  /** @name dxDataGrid.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Items, _]] = js.native
  /** @name dxDataGrid.Options.onEditingStart */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ CancelColumn, _]] = js.native
  /** @name dxDataGrid.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ DataField, _]] = js.native
  /** @name dxDataGrid.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ Disabled, _]] = js.native
  /** @deprecated */
  /** @name dxDataGrid.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ `0`, _]] = js.native
  /** @name dxDataGrid.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ ElementFileName, _]] = js.native
  /** @deprecated */
  /** @name dxDataGrid.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ Format, _]] = js.native
  /** @name dxDataGrid.Options.onFocusedCellChanged */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ Row, _]] = js.native
  /** @name dxDataGrid.Options.onFocusedCellChanging */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ Columns, _]] = js.native
  /** @name dxDataGrid.Options.onFocusedRowChanged */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowElement, _]] = js.native
  /** @name dxDataGrid.Options.onFocusedRowChanging */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ NewRowIndex, _]] = js.native
  /** @name dxDataGrid.Options.onRowClick */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ GroupIndex, _]) | String] = js.native
  /** @name dxDataGrid.Options.onRowDblClick */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ IsNewRow, _]] = js.native
  /** @name dxDataGrid.Options.onRowPrepared */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ IsSelected, _]] = js.native
  /** @name dxDataGrid.Options.remoteOperations */
  var remoteOperations: js.UndefOr[Boolean | Filtering | auto] = js.native
  /** @name dxDataGrid.Options.rowTemplate */
  var rowTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
  ] = js.native
  /** @name dxDataGrid.Options.scrolling */
  @JSName("scrolling")
  var scrolling_dxDataGridOptions: js.UndefOr[dxDataGridScrolling] = js.native
  /** @name dxDataGrid.Options.selectionFilter */
  var selectionFilter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** @name dxDataGrid.Options.selection */
  @JSName("selection")
  var selection_dxDataGridOptions: js.UndefOr[dxDataGridSelection] = js.native
  /** @name dxDataGrid.Options.sortByGroupSummaryInfo */
  var sortByGroupSummaryInfo: js.UndefOr[js.Array[GroupColumn]] = js.native
  /** @name dxDataGrid.Options.summary */
  var summary: js.UndefOr[CalculateCustomSummary] = js.native
}

object dxDataGridOptions {
  @scala.inline
  def apply(): dxDataGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridOptions]
  }
  @scala.inline
  implicit class dxDataGridOptionsOps[Self <: dxDataGridOptions] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: (dxDataGridColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[dxDataGridColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCustomizeColumns(value: /* columns */ js.Array[dxDataGridColumn] => _): Self = this.set("customizeColumns", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeColumns: Self = this.set("customizeColumns", js.undefined)
    @scala.inline
    def setCustomizeExportData(value: (/* columns */ js.Array[dxDataGridColumn], /* rows */ js.Array[dxDataGridRowObject]) => _): Self = this.set("customizeExportData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomizeExportData: Self = this.set("customizeExportData", js.undefined)
    @scala.inline
    def setEditing(value: dxDataGridEditing): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    @scala.inline
    def setExport(value: AllowExportSelectedData): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    @scala.inline
    def setGroupPanel(value: AllowColumnDragging): Self = this.set("groupPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupPanel: Self = this.set("groupPanel", js.undefined)
    @scala.inline
    def setGrouping(value: AllowCollapsing): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setKeyExprVarargs(value: String*): Self = this.set("keyExpr", js.Array(value :_*))
    @scala.inline
    def setKeyExpr(value: String | js.Array[String]): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    @scala.inline
    def setMasterDetail(value: AutoExpandAll): Self = this.set("masterDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterDetail: Self = this.set("masterDetail", js.undefined)
    @scala.inline
    def setOnCellClickFunction1(value: /* e */ CellElement => _): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnCellClick(value: (js.Function1[/* e */ CellElement, _]) | String): Self = this.set("onCellClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    @scala.inline
    def setOnCellDblClick(value: /* e */ ColumnIndex => _): Self = this.set("onCellDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellDblClick: Self = this.set("onCellDblClick", js.undefined)
    @scala.inline
    def setOnCellHoverChanged(value: /* e */ DisplayValue => _): Self = this.set("onCellHoverChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellHoverChanged: Self = this.set("onCellHoverChanged", js.undefined)
    @scala.inline
    def setOnCellPrepared(value: /* e */ IsExpanded => _): Self = this.set("onCellPrepared", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellPrepared: Self = this.set("onCellPrepared", js.undefined)
    @scala.inline
    def setOnContextMenuPreparing(value: /* e */ Items => _): Self = this.set("onContextMenuPreparing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuPreparing: Self = this.set("onContextMenuPreparing", js.undefined)
    @scala.inline
    def setOnEditingStart(value: /* e */ CancelColumn => _): Self = this.set("onEditingStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEditingStart: Self = this.set("onEditingStart", js.undefined)
    @scala.inline
    def setOnEditorPrepared(value: /* options */ DataField => _): Self = this.set("onEditorPrepared", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEditorPrepared: Self = this.set("onEditorPrepared", js.undefined)
    @scala.inline
    def setOnEditorPreparing(value: /* e */ Disabled => _): Self = this.set("onEditorPreparing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEditorPreparing: Self = this.set("onEditorPreparing", js.undefined)
    @scala.inline
    def setOnExported(value: /* e */ `0` => _): Self = this.set("onExported", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    @scala.inline
    def setOnExporting(value: /* e */ ElementFileName => _): Self = this.set("onExporting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    @scala.inline
    def setOnFileSaving(value: /* e */ Format => _): Self = this.set("onFileSaving", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    @scala.inline
    def setOnFocusedCellChanged(value: /* e */ Row => _): Self = this.set("onFocusedCellChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedCellChanged: Self = this.set("onFocusedCellChanged", js.undefined)
    @scala.inline
    def setOnFocusedCellChanging(value: /* e */ Columns => _): Self = this.set("onFocusedCellChanging", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedCellChanging: Self = this.set("onFocusedCellChanging", js.undefined)
    @scala.inline
    def setOnFocusedRowChanged(value: /* e */ RowElement => _): Self = this.set("onFocusedRowChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedRowChanged: Self = this.set("onFocusedRowChanged", js.undefined)
    @scala.inline
    def setOnFocusedRowChanging(value: /* e */ NewRowIndex => _): Self = this.set("onFocusedRowChanging", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedRowChanging: Self = this.set("onFocusedRowChanging", js.undefined)
    @scala.inline
    def setOnRowClickFunction1(value: /* e */ GroupIndex => _): Self = this.set("onRowClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRowClick(value: (js.Function1[/* e */ GroupIndex, _]) | String): Self = this.set("onRowClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    @scala.inline
    def setOnRowDblClick(value: /* e */ IsNewRow => _): Self = this.set("onRowDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowDblClick: Self = this.set("onRowDblClick", js.undefined)
    @scala.inline
    def setOnRowPrepared(value: /* e */ IsSelected => _): Self = this.set("onRowPrepared", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowPrepared: Self = this.set("onRowPrepared", js.undefined)
    @scala.inline
    def setRemoteOperations(value: Boolean | Filtering | auto): Self = this.set("remoteOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteOperations: Self = this.set("remoteOperations", js.undefined)
    @scala.inline
    def setRowTemplateFunction2(value: (/* rowElement */ dxElement, /* rowInfo */ js.Any) => _): Self = this.set("rowTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setRowTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
    ): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    @scala.inline
    def setScrolling(value: dxDataGridScrolling): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSelection(value: dxDataGridSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionFilterVarargs(value: js.Any*): Self = this.set("selectionFilter", js.Array(value :_*))
    @scala.inline
    def setSelectionFilter(value: String | js.Array[_] | js.Function): Self = this.set("selectionFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionFilter: Self = this.set("selectionFilter", js.undefined)
    @scala.inline
    def setSortByGroupSummaryInfoVarargs(value: GroupColumn*): Self = this.set("sortByGroupSummaryInfo", js.Array(value :_*))
    @scala.inline
    def setSortByGroupSummaryInfo(value: js.Array[GroupColumn]): Self = this.set("sortByGroupSummaryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortByGroupSummaryInfo: Self = this.set("sortByGroupSummaryInfo", js.undefined)
    @scala.inline
    def setSummary(value: CalculateCustomSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

