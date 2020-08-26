package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowFieldDragging
import typings.devextreme.anon.ApplyChangesMode
import typings.devextreme.anon.Area
import typings.devextreme.anon.Cell
import typings.devextreme.anon.CollapseAll
import typings.devextreme.anon.ColumnFields
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.FileNameFormat
import typings.devextreme.anon.FileNameModel
import typings.devextreme.anon.IgnoreExcelErrors
import typings.devextreme.anon.Mode
import typings.devextreme.anon.SearchTimeout
import typings.devextreme.anon.ShowIndicator
import typings.devextreme.anon.`7`
import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.column
import typings.devextreme.devextremeStrings.columns
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.rows
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridOptions extends WidgetOptions[dxPivotGrid] {
  /** @name dxPivotGrid.Options.allowExpandAll */
  var allowExpandAll: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.allowFiltering */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.allowSorting */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.allowSortingBySummary */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.dataFieldArea */
  var dataFieldArea: js.UndefOr[column | row] = js.native
  /** @name dxPivotGrid.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions] = js.native
  /** @name dxPivotGrid.Options.export */
  var export: js.UndefOr[IgnoreExcelErrors] = js.native
  /** @name dxPivotGrid.Options.fieldChooser */
  var fieldChooser: js.UndefOr[ApplyChangesMode] = js.native
  /** @name dxPivotGrid.Options.fieldPanel */
  var fieldPanel: js.UndefOr[AllowFieldDragging] = js.native
  /** @name dxPivotGrid.Options.headerFilter */
  var headerFilter: js.UndefOr[SearchTimeout] = js.native
  /** @name dxPivotGrid.Options.hideEmptySummaryCells */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.loadPanel */
  var loadPanel: js.UndefOr[ShowIndicator] = js.native
  /** @name dxPivotGrid.Options.onCellClick */
  var onCellClick: js.UndefOr[js.Function1[/* e */ Area, _]] = js.native
  /** @name dxPivotGrid.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ Cell, _]] = js.native
  /** @name dxPivotGrid.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ColumnFields, _]] = js.native
  /** @name dxPivotGrid.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ `7`, _]] = js.native
  /** @name dxPivotGrid.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ FileNameModel, _]] = js.native
  /** @name dxPivotGrid.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileNameFormat, _]] = js.native
  /** @name dxPivotGrid.Options.rowHeaderLayout */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.native
  /** @name dxPivotGrid.Options.scrolling */
  var scrolling: js.UndefOr[Mode] = js.native
  /** @name dxPivotGrid.Options.showBorders */
  var showBorders: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.showColumnGrandTotals */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.showColumnTotals */
  var showColumnTotals: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.showRowGrandTotals */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.showRowTotals */
  var showRowTotals: js.UndefOr[Boolean] = js.native
  /** @name dxPivotGrid.Options.showTotalsPrior */
  var showTotalsPrior: js.UndefOr[both | columns | none | rows] = js.native
  /** @name dxPivotGrid.Options.stateStoring */
  var stateStoring: js.UndefOr[CustomLoad] = js.native
  /** @name dxPivotGrid.Options.texts */
  var texts: js.UndefOr[CollapseAll] = js.native
  /** @name dxPivotGrid.Options.wordWrapEnabled */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}

object dxPivotGridOptions {
  @scala.inline
  def apply(): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridOptions]
  }
  @scala.inline
  implicit class dxPivotGridOptionsOps[Self <: dxPivotGridOptions] (val x: Self) extends AnyVal {
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
    def setAllowExpandAll(value: Boolean): Self = this.set("allowExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExpandAll: Self = this.set("allowExpandAll", js.undefined)
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setAllowSortingBySummary(value: Boolean): Self = this.set("allowSortingBySummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSortingBySummary: Self = this.set("allowSortingBySummary", js.undefined)
    @scala.inline
    def setDataFieldArea(value: column | row): Self = this.set("dataFieldArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFieldArea: Self = this.set("dataFieldArea", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setExport(value: IgnoreExcelErrors): Self = this.set("export", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    @scala.inline
    def setFieldChooser(value: ApplyChangesMode): Self = this.set("fieldChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldChooser: Self = this.set("fieldChooser", js.undefined)
    @scala.inline
    def setFieldPanel(value: AllowFieldDragging): Self = this.set("fieldPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldPanel: Self = this.set("fieldPanel", js.undefined)
    @scala.inline
    def setHeaderFilter(value: SearchTimeout): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    @scala.inline
    def setHideEmptySummaryCells(value: Boolean): Self = this.set("hideEmptySummaryCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEmptySummaryCells: Self = this.set("hideEmptySummaryCells", js.undefined)
    @scala.inline
    def setLoadPanel(value: ShowIndicator): Self = this.set("loadPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadPanel: Self = this.set("loadPanel", js.undefined)
    @scala.inline
    def setOnCellClick(value: /* e */ Area => _): Self = this.set("onCellClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    @scala.inline
    def setOnCellPrepared(value: /* e */ Cell => _): Self = this.set("onCellPrepared", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCellPrepared: Self = this.set("onCellPrepared", js.undefined)
    @scala.inline
    def setOnContextMenuPreparing(value: /* e */ ColumnFields => _): Self = this.set("onContextMenuPreparing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuPreparing: Self = this.set("onContextMenuPreparing", js.undefined)
    @scala.inline
    def setOnExported(value: /* e */ `7` => _): Self = this.set("onExported", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    @scala.inline
    def setOnExporting(value: /* e */ FileNameModel => _): Self = this.set("onExporting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    @scala.inline
    def setOnFileSaving(value: /* e */ FileNameFormat => _): Self = this.set("onFileSaving", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    @scala.inline
    def setRowHeaderLayout(value: standard | tree): Self = this.set("rowHeaderLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeaderLayout: Self = this.set("rowHeaderLayout", js.undefined)
    @scala.inline
    def setScrolling(value: Mode): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setShowBorders(value: Boolean): Self = this.set("showBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBorders: Self = this.set("showBorders", js.undefined)
    @scala.inline
    def setShowColumnGrandTotals(value: Boolean): Self = this.set("showColumnGrandTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnGrandTotals: Self = this.set("showColumnGrandTotals", js.undefined)
    @scala.inline
    def setShowColumnTotals(value: Boolean): Self = this.set("showColumnTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnTotals: Self = this.set("showColumnTotals", js.undefined)
    @scala.inline
    def setShowRowGrandTotals(value: Boolean): Self = this.set("showRowGrandTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowGrandTotals: Self = this.set("showRowGrandTotals", js.undefined)
    @scala.inline
    def setShowRowTotals(value: Boolean): Self = this.set("showRowTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowTotals: Self = this.set("showRowTotals", js.undefined)
    @scala.inline
    def setShowTotalsPrior(value: both | columns | none | rows): Self = this.set("showTotalsPrior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotalsPrior: Self = this.set("showTotalsPrior", js.undefined)
    @scala.inline
    def setStateStoring(value: CustomLoad): Self = this.set("stateStoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateStoring: Self = this.set("stateStoring", js.undefined)
    @scala.inline
    def setTexts(value: CollapseAll): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = this.set("wordWrapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrapEnabled: Self = this.set("wordWrapEnabled", js.undefined)
  }
  
}

