package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.AllowSearch
import typings.devextreme.anon.Children
import typings.devextreme.anon.SummaryProcess
import typings.devextreme.anon.Value
import typings.devextreme.mod.DevExpress.common.SortOrder
import typings.devextreme.mod.DevExpress.common.charts.FilterType
import typings.devextreme.mod.DevExpress.common.charts.SummaryType
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridArea
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridDataType
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridGroupInterval
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridRunningTotalMode
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridSortBy
import typings.devextreme.mod.DevExpress.data.PivotGridDataSource.PivotGridSummaryDisplayMode
import typings.devextreme.mod.DevExpress.ui.Format
import typings.devextreme.mod.DevExpress.ui.dxPivotGridSummaryCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridDataSourceField extends StObject {
  
  /**
    * Specifies whether to take neighboring groups&apos; summary values into account when calculating a running total and absolute or percent variation.
    */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows users to expand/collapse all header items within the same header level. Ignored if the PivotGridDataSource&apos;s paginate property is true.
    */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can filter the field&apos;s values.
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user can change the field&apos;s sorting.
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows users to sort the pivot grid by summary values instead of field values. Ignored if the PivotGridDataSource&apos;s paginate property is true.
    */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field&apos;s area.
    */
  var area: js.UndefOr[PivotGridArea] = js.undefined
  
  /**
    * Specifies the field&apos;s order among the other fields in the same area. Corresponds to the field&apos;s order in the fields array by default.
    */
  var areaIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom aggregate function. Applies only if the summaryType is &apos;custom&apos; and the remoteOperations is false. Cannot be used with an XmlaStore.
    */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ SummaryProcess, Unit]] = js.undefined
  
  /**
    * Specifies a custom post-processing function for summary values.
    */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.undefined
  
  /**
    * Specifies the field&apos;s caption to be displayed in the field chooser and on the field panel.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * Customizes the text displayed in summary cells.
    */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ Value, String]] = js.undefined
  
  /**
    * Specifies which data source field provides data for the pivot grid field.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * Casts field values to a specific data type.
    */
  var dataType: js.UndefOr[PivotGridDataType] = js.undefined
  
  /**
    * Specifies the name of the directory in which the field is located when displayed in the field chooser.
    */
  var displayFolder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to expand all items within the field&apos;s header level.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values.
    */
  var filterType: js.UndefOr[FilterType] = js.undefined
  
  /**
    * Specifies the values by which the field is filtered.
    */
  var filterValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Formats field values before they are displayed.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Specifies the field&apos;s index within its group.
    */
  var groupIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how the field&apos;s values are combined into groups for the headers. Cannot be used with an XmlaStore.
    */
  var groupInterval: js.UndefOr[PivotGridGroupInterval | Double] = js.undefined
  
  /**
    * Specifies the name of the field&apos;s group.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the field&apos;s header filter.
    */
  var headerFilter: js.UndefOr[AllowSearch] = js.undefined
  
  /**
    * Specifies whether the field should be treated as a measure (a field providing data for calculation).
    */
  var isMeasure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field&apos;s identifier.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to calculate the running total by rows or by columns.
    */
  var runningTotal: js.UndefOr[PivotGridRunningTotalMode] = js.undefined
  
  /**
    * Specifies a function that combines the field&apos;s values into groups for the headers. Cannot be used with an XmlaStore or remote operations.
    */
  var selector: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Specifies whether to display the field&apos;s grand totals. Applies only if the field is in the data area.
    */
  var showGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the field&apos;s totals.
    */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the field&apos;s summary values. Applies only if the field is in the data area. Inherits the showTotals&apos; value by default.
    */
  var showValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the field&apos;s values in the headers should be sorted.
    */
  var sortBy: js.UndefOr[PivotGridSortBy] = js.undefined
  
  /**
    * Sorts the field&apos;s values in the headers by the specified measure&apos;s summary values. Accepts the measure&apos;s name, caption, dataField, or index in the fields array.
    */
  var sortBySummaryField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a path to the column or row whose summary values should be used to sort the field&apos;s values in the headers.
    */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * Specifies the field values&apos; sorting order.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  
  /**
    * Specifies a custom comparison function that sorts the field&apos;s values in the headers.
    */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ Children, /* b */ Children, Double]] = js.undefined
  
  /**
    * Specifies a predefined post-processing function. Does not apply when the calculateSummaryValue property is set.
    */
  var summaryDisplayMode: js.UndefOr[PivotGridSummaryDisplayMode] = js.undefined
  
  /**
    * Specifies how to aggregate the field&apos;s data. Cannot be used with an XmlaStore.
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.undefined
  
  /**
    * Specifies whether the field is visible in the pivot grid and field chooser.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field&apos;s width in pixels when the field is displayed in the pivot grid.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether text that does not fit into a header item should be wrapped.
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}
object PivotGridDataSourceField {
  
  inline def apply(): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
  
  extension [Self <: PivotGridDataSourceField](x: Self) {
    
    inline def setAllowCrossGroupCalculation(value: Boolean): Self = StObject.set(x, "allowCrossGroupCalculation", value.asInstanceOf[js.Any])
    
    inline def setAllowCrossGroupCalculationUndefined: Self = StObject.set(x, "allowCrossGroupCalculation", js.undefined)
    
    inline def setAllowExpandAll(value: Boolean): Self = StObject.set(x, "allowExpandAll", value.asInstanceOf[js.Any])
    
    inline def setAllowExpandAllUndefined: Self = StObject.set(x, "allowExpandAll", js.undefined)
    
    inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingBySummary(value: Boolean): Self = StObject.set(x, "allowSortingBySummary", value.asInstanceOf[js.Any])
    
    inline def setAllowSortingBySummaryUndefined: Self = StObject.set(x, "allowSortingBySummary", js.undefined)
    
    inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    inline def setArea(value: PivotGridArea): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaIndex(value: Double): Self = StObject.set(x, "areaIndex", value.asInstanceOf[js.Any])
    
    inline def setAreaIndexUndefined: Self = StObject.set(x, "areaIndex", js.undefined)
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setCalculateCustomSummary(value: /* options */ SummaryProcess => Unit): Self = StObject.set(x, "calculateCustomSummary", js.Any.fromFunction1(value))
    
    inline def setCalculateCustomSummaryUndefined: Self = StObject.set(x, "calculateCustomSummary", js.undefined)
    
    inline def setCalculateSummaryValue(value: /* e */ dxPivotGridSummaryCell => Double): Self = StObject.set(x, "calculateSummaryValue", js.Any.fromFunction1(value))
    
    inline def setCalculateSummaryValueUndefined: Self = StObject.set(x, "calculateSummaryValue", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCustomizeText(value: /* cellInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataType(value: PivotGridDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDisplayFolder(value: String): Self = StObject.set(x, "displayFolder", value.asInstanceOf[js.Any])
    
    inline def setDisplayFolderUndefined: Self = StObject.set(x, "displayFolder", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterValues(value: js.Array[Any]): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
    
    inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
    
    inline def setFilterValuesVarargs(value: Any*): Self = StObject.set(x, "filterValues", js.Array(value*))
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    inline def setGroupInterval(value: PivotGridGroupInterval | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setHeaderFilter(value: AllowSearch): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setIsMeasure(value: Boolean): Self = StObject.set(x, "isMeasure", value.asInstanceOf[js.Any])
    
    inline def setIsMeasureUndefined: Self = StObject.set(x, "isMeasure", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRunningTotal(value: PivotGridRunningTotalMode): Self = StObject.set(x, "runningTotal", value.asInstanceOf[js.Any])
    
    inline def setRunningTotalUndefined: Self = StObject.set(x, "runningTotal", js.undefined)
    
    inline def setSelector(value: js.Function): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setShowGrandTotals(value: Boolean): Self = StObject.set(x, "showGrandTotals", value.asInstanceOf[js.Any])
    
    inline def setShowGrandTotalsUndefined: Self = StObject.set(x, "showGrandTotals", js.undefined)
    
    inline def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
    
    inline def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
    
    inline def setShowValues(value: Boolean): Self = StObject.set(x, "showValues", value.asInstanceOf[js.Any])
    
    inline def setShowValuesUndefined: Self = StObject.set(x, "showValues", js.undefined)
    
    inline def setSortBy(value: PivotGridSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortBySummaryField(value: String): Self = StObject.set(x, "sortBySummaryField", value.asInstanceOf[js.Any])
    
    inline def setSortBySummaryFieldUndefined: Self = StObject.set(x, "sortBySummaryField", js.undefined)
    
    inline def setSortBySummaryPath(value: js.Array[Double | String]): Self = StObject.set(x, "sortBySummaryPath", value.asInstanceOf[js.Any])
    
    inline def setSortBySummaryPathUndefined: Self = StObject.set(x, "sortBySummaryPath", js.undefined)
    
    inline def setSortBySummaryPathVarargs(value: (Double | String)*): Self = StObject.set(x, "sortBySummaryPath", js.Array(value*))
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortingMethod(value: (/* a */ Children, /* b */ Children) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
    
    inline def setSummaryDisplayMode(value: PivotGridSummaryDisplayMode): Self = StObject.set(x, "summaryDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setSummaryDisplayModeUndefined: Self = StObject.set(x, "summaryDisplayMode", js.undefined)
    
    inline def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
    
    inline def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
  }
}
