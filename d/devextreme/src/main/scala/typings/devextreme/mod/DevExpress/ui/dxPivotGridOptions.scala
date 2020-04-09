package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowFieldDragging
import typings.devextreme.AnonApplyChangesMode
import typings.devextreme.AnonArea
import typings.devextreme.AnonCell
import typings.devextreme.AnonCollapseAll
import typings.devextreme.AnonColumnFields
import typings.devextreme.AnonComponentDxPivotGrid
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonCustomLoad
import typings.devextreme.AnonElement
import typings.devextreme.AnonFileNameFormat
import typings.devextreme.AnonFileNameModel
import typings.devextreme.AnonIgnoreExcelErrors
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonSearchTimeout
import typings.devextreme.AnonShowIndicator
import typings.devextreme.AnonUseNative
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
  var export: js.UndefOr[AnonIgnoreExcelErrors] = js.undefined
  /** @name dxPivotGrid.Options.fieldChooser */
  var fieldChooser: js.UndefOr[AnonApplyChangesMode] = js.undefined
  /** @name dxPivotGrid.Options.fieldPanel */
  var fieldPanel: js.UndefOr[AnonAllowFieldDragging] = js.undefined
  /** @name dxPivotGrid.Options.headerFilter */
  var headerFilter: js.UndefOr[AnonSearchTimeout] = js.undefined
  /** @name dxPivotGrid.Options.hideEmptySummaryCells */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined
  /** @name dxPivotGrid.Options.loadPanel */
  var loadPanel: js.UndefOr[AnonShowIndicator] = js.undefined
  /** @name dxPivotGrid.Options.onCellClick */
  var onCellClick: js.UndefOr[js.Function1[/* e */ AnonArea, _]] = js.undefined
  /** @name dxPivotGrid.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ AnonCell, _]] = js.undefined
  /** @name dxPivotGrid.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonColumnFields, _]] = js.undefined
  /** @name dxPivotGrid.Options.onExported */
  var onExported: js.UndefOr[js.Function1[/* e */ AnonComponentDxPivotGrid, _]] = js.undefined
  /** @name dxPivotGrid.Options.onExporting */
  var onExporting: js.UndefOr[js.Function1[/* e */ AnonFileNameModel, _]] = js.undefined
  /** @name dxPivotGrid.Options.onFileSaving */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ AnonFileNameFormat, _]] = js.undefined
  /** @name dxPivotGrid.Options.rowHeaderLayout */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.undefined
  /** @name dxPivotGrid.Options.scrolling */
  var scrolling: js.UndefOr[AnonUseNative] = js.undefined
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
  var stateStoring: js.UndefOr[AnonCustomLoad] = js.undefined
  /** @name dxPivotGrid.Options.texts */
  var texts: js.UndefOr[AnonCollapseAll] = js.undefined
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
    export: AnonIgnoreExcelErrors = null,
    fieldChooser: AnonApplyChangesMode = null,
    fieldPanel: AnonAllowFieldDragging = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    headerFilter: AnonSearchTimeout = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    loadPanel: AnonShowIndicator = null,
    onCellClick: /* e */ AnonArea => _ = null,
    onCellPrepared: /* e */ AnonCell => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxPivotGrid] => _ = null,
    onContextMenuPreparing: /* e */ AnonColumnFields => _ = null,
    onDisposing: /* e */ AnonModel[dxPivotGrid] => _ = null,
    onExported: /* e */ AnonComponentDxPivotGrid => _ = null,
    onExporting: /* e */ AnonFileNameModel => _ = null,
    onFileSaving: /* e */ AnonFileNameFormat => _ = null,
    onInitialized: /* e */ AnonElement[dxPivotGrid] => _ = null,
    onOptionChanged: /* e */ AnonName[dxPivotGrid] => _ = null,
    rowHeaderLayout: standard | tree = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: AnonUseNative = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showColumnTotals: js.UndefOr[Boolean] = js.undefined,
    showRowGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showRowTotals: js.UndefOr[Boolean] = js.undefined,
    showTotalsPrior: both | columns | none | rows = null,
    stateStoring: AnonCustomLoad = null,
    tabIndex: Int | Double = null,
    texts: AnonCollapseAll = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpandAll)) __obj.updateDynamic("allowExpandAll")(allowExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSortingBySummary)) __obj.updateDynamic("allowSortingBySummary")(allowSortingBySummary.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (dataFieldArea != null) __obj.updateDynamic("dataFieldArea")(dataFieldArea.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (fieldChooser != null) __obj.updateDynamic("fieldChooser")(fieldChooser.asInstanceOf[js.Any])
    if (fieldPanel != null) __obj.updateDynamic("fieldPanel")(fieldPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEmptySummaryCells)) __obj.updateDynamic("hideEmptySummaryCells")(hideEmptySummaryCells.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnGrandTotals)) __obj.updateDynamic("showColumnGrandTotals")(showColumnGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnTotals)) __obj.updateDynamic("showColumnTotals")(showColumnTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowGrandTotals)) __obj.updateDynamic("showRowGrandTotals")(showRowGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowTotals)) __obj.updateDynamic("showRowTotals")(showRowTotals.asInstanceOf[js.Any])
    if (showTotalsPrior != null) __obj.updateDynamic("showTotalsPrior")(showTotalsPrior.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPivotGridOptions]
  }
}

