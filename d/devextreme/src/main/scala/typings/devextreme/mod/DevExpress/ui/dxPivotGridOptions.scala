package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowFieldDragging
import typings.devextreme.anon.ApplyChangesMode
import typings.devextreme.anon.CollapseAll
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.Enabled
import typings.devextreme.anon.IndicatorSrc
import typings.devextreme.anon.Mode
import typings.devextreme.anon.SearchTimeout
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.Options
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.CellClickEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.CellPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.ContextMenuPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.ExportedEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.ExportingEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.FileSavingEvent
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.PivotGridDataFieldArea
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.PivotGridRowHeaderLayout
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid.PivotGridTotalDisplayMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPivotGridOptions
  extends StObject
     with WidgetOptions[dxPivotGrid] {
  
  /**
    * Allows users to expand/collapse all header items within the same header level. Ignored if the PivotGridDataSource&apos;s paginate property is true.
    */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows a user to filter fields by selecting or deselecting values in the popup menu.
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows an end-user to change sorting properties.
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows users to sort the pivot grid by summary values instead of field values. Ignored if the PivotGridDataSource&apos;s paginate property is true.
    */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the area to which data field headers must belong.
    */
  var dataFieldArea: js.UndefOr[PivotGridDataFieldArea] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[js.Array[Any] | PivotGridDataSource | Options | Null] = js.undefined
  
  /**
    * Specifies whether HTML tags are displayed as plain text or applied to cell values.
    */
  var encodeHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures client-side exporting.
    */
  var `export`: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The Field Chooser configuration properties.
    */
  var fieldChooser: js.UndefOr[ApplyChangesMode] = js.undefined
  
  /**
    * Configures the field panel.
    */
  var fieldPanel: js.UndefOr[AllowFieldDragging] = js.undefined
  
  /**
    * Configures the header filter feature.
    */
  var headerFilter: js.UndefOr[SearchTimeout] = js.undefined
  
  /**
    * Specifies whether or not to hide rows and columns with no data.
    */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies properties configuring the load panel.
    */
  var loadPanel: js.UndefOr[IndicatorSrc] = js.undefined
  
  /**
    * A function that is executed when a pivot grid cell is clicked or tapped.
    */
  var onCellClick: js.UndefOr[js.Function1[/* e */ CellClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after a pivot grid cell is created.
    */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ CellPreparedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before the context menu is rendered.
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after data is exported.
    * @deprecated Since v20.2, we recommend ExcelJS-based export which does not use this property.
    */
  var onExported: js.UndefOr[js.Function1[/* e */ ExportedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before data is exported.
    */
  var onExporting: js.UndefOr[js.Function1[/* e */ ExportingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before a file with exported data is saved to the user&apos;s local storage.
    * @deprecated Since v20.2, we recommend ExcelJS-based export which does not use this property.
    */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileSavingEvent, Unit]] = js.undefined
  
  /**
    * Specifies the layout of items in the row header.
    */
  var rowHeaderLayout: js.UndefOr[PivotGridRowHeaderLayout] = js.undefined
  
  /**
    * A configuration object specifying scrolling properties.
    */
  var scrolling: js.UndefOr[Mode] = js.undefined
  
  /**
    * Specifies whether the outer borders of the grid are visible or not.
    */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Grand Total column.
    */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Total columns.
    */
  var showColumnTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Grand Total row.
    */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the Total rows. Applies only if rowHeaderLayout is &apos;standard&apos;.
    */
  var showRowTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies where to show the total rows or columns.
    */
  var showTotalsPrior: js.UndefOr[PivotGridTotalDisplayMode] = js.undefined
  
  /**
    * A configuration object specifying properties related to state storing.
    */
  var stateStoring: js.UndefOr[CustomLoad] = js.undefined
  
  /**
    * Strings that can be changed or localized in the PivotGrid UI component.
    */
  var texts: js.UndefOr[CollapseAll] = js.undefined
  
  /**
    * Specifies whether long text in header items should be wrapped.
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}
object dxPivotGridOptions {
  
  inline def apply(): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPivotGridOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowExpandAll(value: Boolean): Self = StObject.set(x, "allowExpandAll", value.asInstanceOf[js.Any])
    
    inline def setAllowExpandAllUndefined: Self = StObject.set(x, "allowExpandAll", js.undefined)
    
    inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingBySummary(value: Boolean): Self = StObject.set(x, "allowSortingBySummary", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingBySummaryUndefined: Self = StObject.set(x, "allowSortingBySummary", js.undefined)
    
    inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    inline def setDataFieldArea(value: PivotGridDataFieldArea): Self = StObject.set(x, "dataFieldArea", value.asInstanceOf[js.Any])
    
    inline def setDataFieldAreaUndefined: Self = StObject.set(x, "dataFieldArea", js.undefined)
    
    inline def setDataSource(value: js.Array[Any] | PivotGridDataSource | Options): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setEncodeHtml(value: Boolean): Self = StObject.set(x, "encodeHtml", value.asInstanceOf[js.Any])
    
    inline def setEncodeHtmlUndefined: Self = StObject.set(x, "encodeHtml", js.undefined)
    
    inline def setExport(value: Enabled): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setFieldChooser(value: ApplyChangesMode): Self = StObject.set(x, "fieldChooser", value.asInstanceOf[js.Any])
    
    inline def setFieldChooserUndefined: Self = StObject.set(x, "fieldChooser", js.undefined)
    
    inline def setFieldPanel(value: AllowFieldDragging): Self = StObject.set(x, "fieldPanel", value.asInstanceOf[js.Any])
    
    inline def setFieldPanelUndefined: Self = StObject.set(x, "fieldPanel", js.undefined)
    
    inline def setHeaderFilter(value: SearchTimeout): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setHideEmptySummaryCells(value: Boolean): Self = StObject.set(x, "hideEmptySummaryCells", value.asInstanceOf[js.Any])
    
    inline def setHideEmptySummaryCellsUndefined: Self = StObject.set(x, "hideEmptySummaryCells", js.undefined)
    
    inline def setLoadPanel(value: IndicatorSrc): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
    
    inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
    
    inline def setOnCellClick(value: /* e */ CellClickEvent => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellPrepared(value: /* e */ CellPreparedEvent => Unit): Self = StObject.set(x, "onCellPrepared", js.Any.fromFunction1(value))
    
    inline def setOnCellPreparedUndefined: Self = StObject.set(x, "onCellPrepared", js.undefined)
    
    inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
    
    inline def setOnExported(value: /* e */ ExportedEvent => Unit): Self = StObject.set(x, "onExported", js.Any.fromFunction1(value))
    
    inline def setOnExportedUndefined: Self = StObject.set(x, "onExported", js.undefined)
    
    inline def setOnExporting(value: /* e */ ExportingEvent => Unit): Self = StObject.set(x, "onExporting", js.Any.fromFunction1(value))
    
    inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
    
    inline def setOnFileSaving(value: /* e */ FileSavingEvent => Unit): Self = StObject.set(x, "onFileSaving", js.Any.fromFunction1(value))
    
    inline def setOnFileSavingUndefined: Self = StObject.set(x, "onFileSaving", js.undefined)
    
    inline def setRowHeaderLayout(value: PivotGridRowHeaderLayout): Self = StObject.set(x, "rowHeaderLayout", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderLayoutUndefined: Self = StObject.set(x, "rowHeaderLayout", js.undefined)
    
    inline def setScrolling(value: Mode): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
    
    inline def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
    
    inline def setShowColumnGrandTotals(value: Boolean): Self = StObject.set(x, "showColumnGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowColumnGrandTotalsUndefined: Self = StObject.set(x, "showColumnGrandTotals", js.undefined)
    
    inline def setShowColumnTotals(value: Boolean): Self = StObject.set(x, "showColumnTotals", value.asInstanceOf[js.Any])
    
    inline def setShowColumnTotalsUndefined: Self = StObject.set(x, "showColumnTotals", js.undefined)
    
    inline def setShowRowGrandTotals(value: Boolean): Self = StObject.set(x, "showRowGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowRowGrandTotalsUndefined: Self = StObject.set(x, "showRowGrandTotals", js.undefined)
    
    inline def setShowRowTotals(value: Boolean): Self = StObject.set(x, "showRowTotals", value.asInstanceOf[js.Any])
    
    inline def setShowRowTotalsUndefined: Self = StObject.set(x, "showRowTotals", js.undefined)
    
    inline def setShowTotalsPrior(value: PivotGridTotalDisplayMode): Self = StObject.set(x, "showTotalsPrior", value.asInstanceOf[js.Any])
    
    inline def setShowTotalsPriorUndefined: Self = StObject.set(x, "showTotalsPrior", js.undefined)
    
    inline def setStateStoring(value: CustomLoad): Self = StObject.set(x, "stateStoring", value.asInstanceOf[js.Any])
    
    inline def setStateStoringUndefined: Self = StObject.set(x, "stateStoring", js.undefined)
    
    inline def setTexts(value: CollapseAll): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
    
    inline def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
  }
}
