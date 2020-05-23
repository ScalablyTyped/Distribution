package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowFieldDragging
import typings.devextreme.anon.ApplyChangesMode
import typings.devextreme.anon.Area
import typings.devextreme.anon.Cell
import typings.devextreme.anon.CollapseAll
import typings.devextreme.anon.ColumnFields
import typings.devextreme.anon.ComponentDxPivotGrid
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.Element
import typings.devextreme.anon.FileNameFormat
import typings.devextreme.anon.FileNameModel
import typings.devextreme.anon.IgnoreExcelErrors
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.anon.SearchTimeout
import typings.devextreme.anon.ShowIndicator
import typings.devextreme.anon.UseNative
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

trait dxPivotGridOptions extends WidgetOptions[dxPivotGrid] {
  /** @name dxPivotGrid.Options.allowExpandAll */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.allowFiltering */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.allowSorting */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.allowSortingBySummary */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.dataFieldArea */
  var dataFieldArea: js.UndefOr[column | row] = js.undefined
  /** @name dxPivotGrid.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions] = js.undefined
  /** @name dxPivotGrid.Options.export */
  var export: js.UndefOr[IgnoreExcelErrors] = js.undefined
  /** @name dxPivotGrid.Options.fieldChooser */
  var fieldChooser: js.UndefOr[ApplyChangesMode] = js.undefined
  /** @name dxPivotGrid.Options.fieldPanel */
  var fieldPanel: js.UndefOr[AllowFieldDragging] = js.undefined
  /** @name dxPivotGrid.Options.headerFilter */
  var headerFilter: js.UndefOr[SearchTimeout] = js.undefined
  /** @name dxPivotGrid.Options.hideEmptySummaryCells */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.loadPanel */
  var loadPanel: js.UndefOr[ShowIndicator] = js.undefined
  /** @name dxPivotGrid.Options.onCellClick */
  var onCellClick: js.UndefOr[js.Function1[/* e */ Area, _]] = js.undefined
  /** @name dxPivotGrid.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ Cell, _]] = js.undefined
  /** @name dxPivotGrid.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ColumnFields, _]] = js.undefined
  /** @name dxPivotGrid.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentDxPivotGrid, _]] = js.undefined
  /** @name dxPivotGrid.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ FileNameModel, _]] = js.undefined
  /** @name dxPivotGrid.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileNameFormat, _]] = js.undefined
  /** @name dxPivotGrid.Options.rowHeaderLayout */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.undefined
  /** @name dxPivotGrid.Options.scrolling */
  var scrolling: js.UndefOr[UseNative] = js.undefined
  /** @name dxPivotGrid.Options.showBorders */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.showColumnGrandTotals */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.showColumnTotals */
  var showColumnTotals: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.showRowGrandTotals */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.showRowTotals */
  var showRowTotals: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.showTotalsPrior */
  var showTotalsPrior: js.UndefOr[both | columns | none | rows] = js.undefined
  /** @name dxPivotGrid.Options.stateStoring */
  var stateStoring: js.UndefOr[CustomLoad] = js.undefined
  /** @name dxPivotGrid.Options.texts */
  var texts: js.UndefOr[CollapseAll] = js.undefined
  /** @name dxPivotGrid.Options.wordWrapEnabled */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object dxPivotGridOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowExpandAll: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowSortingBySummary: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    dataFieldArea: column | row = null,
    dataSource: js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    export: IgnoreExcelErrors = null,
    fieldChooser: ApplyChangesMode = null,
    fieldPanel: AllowFieldDragging = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    headerFilter: SearchTimeout = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    loadPanel: ShowIndicator = null,
    onCellClick: /* e */ Area => _ = null,
    onCellPrepared: /* e */ Cell => _ = null,
    onContentReady: /* e */ ComponentElement[dxPivotGrid] => _ = null,
    onContextMenuPreparing: /* e */ ColumnFields => _ = null,
    onDisposing: /* e */ Model[dxPivotGrid] => _ = null,
    onExported: /* e */ ComponentDxPivotGrid => _ = null,
    onExporting: /* e */ FileNameModel => _ = null,
    onFileSaving: /* e */ FileNameFormat => _ = null,
    onInitialized: /* e */ Element[dxPivotGrid] => _ = null,
    onOptionChanged: /* e */ Name[dxPivotGrid] => _ = null,
    rowHeaderLayout: standard | tree = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: UseNative = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showColumnTotals: js.UndefOr[Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showRowTotals: js.UndefOr[Boolean] = js.undefined,
    showTotalsPrior: both | columns | none | rows = null,
    stateStoring: CustomLoad = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    texts: CollapseAll = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpandAll)) __obj.updateDynamic("allowExpandAll")(allowExpandAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSortingBySummary)) __obj.updateDynamic("allowSortingBySummary")(allowSortingBySummary.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataFieldArea != null) __obj.updateDynamic("dataFieldArea")(dataFieldArea.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (fieldChooser != null) __obj.updateDynamic("fieldChooser")(fieldChooser.asInstanceOf[js.Any])
    if (fieldPanel != null) __obj.updateDynamic("fieldPanel")(fieldPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEmptySummaryCells)) __obj.updateDynamic("hideEmptySummaryCells")(hideEmptySummaryCells.get.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction1(onCellClick))
    if (onCellPrepared != null) __obj.updateDynamic("onCellPrepared")(js.Any.fromFunction1(onCellPrepared))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(onContextMenuPreparing))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (rowHeaderLayout != null) __obj.updateDynamic("rowHeaderLayout")(rowHeaderLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnTotals)) __obj.updateDynamic("showColumnTotals")(showColumnTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowTotals)) __obj.updateDynamic("showRowTotals")(showRowTotals.get.asInstanceOf[js.Any])
    if (showTotalsPrior != null) __obj.updateDynamic("showTotalsPrior")(showTotalsPrior.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridOptions]
  }
}

