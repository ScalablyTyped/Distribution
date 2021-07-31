package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.AllowSearch
import typings.devextreme.anon.Children
import typings.devextreme.anon.SummaryProcess
import typings.devextreme.anon.Value
import typings.devextreme.devextremeStrings.absoluteVariation
import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.column
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.date
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.dayOfWeek
import typings.devextreme.devextremeStrings.desc
import typings.devextreme.devextremeStrings.displayText
import typings.devextreme.devextremeStrings.exclude
import typings.devextreme.devextremeStrings.filter
import typings.devextreme.devextremeStrings.include
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.number
import typings.devextreme.devextremeStrings.percentOfColumnGrandTotal
import typings.devextreme.devextremeStrings.percentOfColumnTotal
import typings.devextreme.devextremeStrings.percentOfGrandTotal
import typings.devextreme.devextremeStrings.percentOfRowGrandTotal
import typings.devextreme.devextremeStrings.percentOfRowTotal
import typings.devextreme.devextremeStrings.percentVariation
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.row
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.devextremeStrings.value
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.ui.dxPivotGridSummaryCell
import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridDataSourceField extends StObject {
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowCrossGroupCalculation]
    */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowExpandAll]
    */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowFiltering]
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowSorting]
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowSortingBySummary]
    */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.area]
    */
  var area: js.UndefOr[column | typings.devextreme.devextremeStrings.data | filter | row] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.areaIndex]
    */
  var areaIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.calculateCustomSummary]
    */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ SummaryProcess, js.Any]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.calculateSummaryValue]
    */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.caption]
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ Value, String]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.dataField]
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.dataType]
    */
  var dataType: js.UndefOr[date | number | string_] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.displayFolder]
    */
  var displayFolder: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.expanded]
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.filterType]
    */
  var filterType: js.UndefOr[exclude | include] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.filterValues]
    */
  var filterValues: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.format]
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupIndex]
    */
  var groupIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupInterval]
    */
  var groupInterval: js.UndefOr[day | dayOfWeek | month | quarter | year | Double] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupName]
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.headerFilter]
    */
  var headerFilter: js.UndefOr[AllowSearch] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.isMeasure]
    */
  var isMeasure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.name]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.runningTotal]
    */
  var runningTotal: js.UndefOr[column | row] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.selector]
    */
  var selector: js.UndefOr[js.Function] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showGrandTotals]
    */
  var showGrandTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showTotals]
    */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showValues]
    */
  var showValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBy]
    */
  var sortBy: js.UndefOr[displayText | value | none] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBySummaryField]
    */
  var sortBySummaryField: js.UndefOr[String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBySummaryPath]
    */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortOrder]
    */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortingMethod]
    */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ Children, /* b */ Children, Double]] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.summaryDisplayMode]
    */
  var summaryDisplayMode: js.UndefOr[
    absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
  ] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.summaryType]
    */
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.visible]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.width]
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * [descr:PivotGridDataSource.Options.fields.wordWrapEnabled]
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}
object PivotGridDataSourceField {
  
  @scala.inline
  def apply(): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
  
  @scala.inline
  implicit class PivotGridDataSourceFieldMutableBuilder[Self <: PivotGridDataSourceField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCrossGroupCalculation(value: Boolean): Self = StObject.set(x, "allowCrossGroupCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCrossGroupCalculationUndefined: Self = StObject.set(x, "allowCrossGroupCalculation", js.undefined)
    
    @scala.inline
    def setAllowExpandAll(value: Boolean): Self = StObject.set(x, "allowExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExpandAllUndefined: Self = StObject.set(x, "allowExpandAll", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortingBySummary(value: Boolean): Self = StObject.set(x, "allowSortingBySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortingBySummaryUndefined: Self = StObject.set(x, "allowSortingBySummary", js.undefined)
    
    @scala.inline
    def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    @scala.inline
    def setArea(value: column | typings.devextreme.devextremeStrings.data | filter | row): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaIndex(value: Double): Self = StObject.set(x, "areaIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaIndexUndefined: Self = StObject.set(x, "areaIndex", js.undefined)
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setCalculateCustomSummary(value: /* options */ SummaryProcess => js.Any): Self = StObject.set(x, "calculateCustomSummary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateCustomSummaryUndefined: Self = StObject.set(x, "calculateCustomSummary", js.undefined)
    
    @scala.inline
    def setCalculateSummaryValue(value: /* e */ dxPivotGridSummaryCell => Double): Self = StObject.set(x, "calculateSummaryValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateSummaryValueUndefined: Self = StObject.set(x, "calculateSummaryValue", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* cellInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setDataType(value: date | number | string_): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDisplayFolder(value: String): Self = StObject.set(x, "displayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFolderUndefined: Self = StObject.set(x, "displayFolder", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setFilterType(value: exclude | include): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFilterValues(value: js.Array[js.Any]): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
    
    @scala.inline
    def setFilterValuesVarargs(value: js.Any*): Self = StObject.set(x, "filterValues", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    @scala.inline
    def setGroupInterval(value: day | dayOfWeek | month | quarter | year | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setHeaderFilter(value: AllowSearch): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    @scala.inline
    def setIsMeasure(value: Boolean): Self = StObject.set(x, "isMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeasureUndefined: Self = StObject.set(x, "isMeasure", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRunningTotal(value: column | row): Self = StObject.set(x, "runningTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTotalUndefined: Self = StObject.set(x, "runningTotal", js.undefined)
    
    @scala.inline
    def setSelector(value: js.Function): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setShowGrandTotals(value: Boolean): Self = StObject.set(x, "showGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGrandTotalsUndefined: Self = StObject.set(x, "showGrandTotals", js.undefined)
    
    @scala.inline
    def setShowTotals(value: Boolean): Self = StObject.set(x, "showTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTotalsUndefined: Self = StObject.set(x, "showTotals", js.undefined)
    
    @scala.inline
    def setShowValues(value: Boolean): Self = StObject.set(x, "showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValuesUndefined: Self = StObject.set(x, "showValues", js.undefined)
    
    @scala.inline
    def setSortBy(value: displayText | value | none): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBySummaryField(value: String): Self = StObject.set(x, "sortBySummaryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBySummaryFieldUndefined: Self = StObject.set(x, "sortBySummaryField", js.undefined)
    
    @scala.inline
    def setSortBySummaryPath(value: js.Array[Double | String]): Self = StObject.set(x, "sortBySummaryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortBySummaryPathUndefined: Self = StObject.set(x, "sortBySummaryPath", js.undefined)
    
    @scala.inline
    def setSortBySummaryPathVarargs(value: (Double | String)*): Self = StObject.set(x, "sortBySummaryPath", js.Array(value :_*))
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSortingMethod(value: (/* a */ Children, /* b */ Children) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
    
    @scala.inline
    def setSummaryDisplayMode(
      value: absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
    ): Self = StObject.set(x, "summaryDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryDisplayModeUndefined: Self = StObject.set(x, "summaryDisplayMode", js.undefined)
    
    @scala.inline
    def setSummaryType(value: avg | count | custom | max | min | sum | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
  }
}
