package typings.flexmonster.mod

import typings.flexmonster.anon.ActiveMeasure
import typings.flexmonster.anon.DateFormat
import typings.flexmonster.anon.Dragging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var caseSensitiveMembers: js.UndefOr[Boolean] = js.undefined
  
  var chart: js.UndefOr[ActiveMeasure] = js.undefined
  
  var configuratorActive: js.UndefOr[Boolean] = js.undefined
  
  var configuratorButton: js.UndefOr[Boolean] = js.undefined
  
  var datePattern: js.UndefOr[String] = js.undefined
  
  var dateTimePattern: js.UndefOr[String] = js.undefined
  
  var dateTimezoneOffset: js.UndefOr[Double] = js.undefined
  
  var defaultDateType: js.UndefOr[String] = js.undefined
  
  var defaultHierarchySortName: js.UndefOr[String] = js.undefined
  
  var drillThrough: js.UndefOr[Boolean] = js.undefined
  
  var editing: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[DateFormat] = js.undefined
  
  var grid: js.UndefOr[Dragging] = js.undefined
  
  var grouping: js.UndefOr[Boolean] = js.undefined
  
  var saveAllFormats: js.UndefOr[Boolean] = js.undefined
  
  var selectEmptyCells: js.UndefOr[Boolean] = js.undefined
  
  var showAggregationLabels: js.UndefOr[Boolean] = js.undefined
  
  var showAggregations: js.UndefOr[Boolean] = js.undefined
  
  var showAllFieldsDrillThrough: js.UndefOr[Boolean] = js.undefined
  
  var showCalculatedValuesButton: js.UndefOr[Boolean] = js.undefined
  
  var showDefaultSlice: js.UndefOr[Boolean] = js.undefined
  
  var showDrillThroughConfigurator: js.UndefOr[Boolean] = js.undefined
  
  var showEmptyData: js.UndefOr[Boolean] = js.undefined
  
  var showFieldListSearch: js.UndefOr[Boolean] = js.undefined
  
  var showMemberProperties: js.UndefOr[Boolean] = js.undefined
  
  var showOutdatedDataAlert: js.UndefOr[Boolean] = js.undefined
  
  var simplifyFieldListFolders: js.UndefOr[Boolean] = js.undefined
  
  var sorting: js.UndefOr[String] = js.undefined
  
  var strictDataTypes: js.UndefOr[Boolean] = js.undefined
  
  var timePattern: js.UndefOr[String] = js.undefined
  
  var useOlapFormatting: js.UndefOr[Boolean] = js.undefined
  
  var validateFormulas: js.UndefOr[Boolean] = js.undefined
  
  var validateReportFiles: js.UndefOr[Boolean] = js.undefined
  
  var viewType: js.UndefOr[String] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitiveMembers(value: Boolean): Self = StObject.set(x, "caseSensitiveMembers", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveMembersUndefined: Self = StObject.set(x, "caseSensitiveMembers", js.undefined)
    
    inline def setChart(value: ActiveMeasure): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setConfiguratorActive(value: Boolean): Self = StObject.set(x, "configuratorActive", value.asInstanceOf[js.Any])
    
    inline def setConfiguratorActiveUndefined: Self = StObject.set(x, "configuratorActive", js.undefined)
    
    inline def setConfiguratorButton(value: Boolean): Self = StObject.set(x, "configuratorButton", value.asInstanceOf[js.Any])
    
    inline def setConfiguratorButtonUndefined: Self = StObject.set(x, "configuratorButton", js.undefined)
    
    inline def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
    
    inline def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
    
    inline def setDateTimePattern(value: String): Self = StObject.set(x, "dateTimePattern", value.asInstanceOf[js.Any])
    
    inline def setDateTimePatternUndefined: Self = StObject.set(x, "dateTimePattern", js.undefined)
    
    inline def setDateTimezoneOffset(value: Double): Self = StObject.set(x, "dateTimezoneOffset", value.asInstanceOf[js.Any])
    
    inline def setDateTimezoneOffsetUndefined: Self = StObject.set(x, "dateTimezoneOffset", js.undefined)
    
    inline def setDefaultDateType(value: String): Self = StObject.set(x, "defaultDateType", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateTypeUndefined: Self = StObject.set(x, "defaultDateType", js.undefined)
    
    inline def setDefaultHierarchySortName(value: String): Self = StObject.set(x, "defaultHierarchySortName", value.asInstanceOf[js.Any])
    
    inline def setDefaultHierarchySortNameUndefined: Self = StObject.set(x, "defaultHierarchySortName", js.undefined)
    
    inline def setDrillThrough(value: Boolean): Self = StObject.set(x, "drillThrough", value.asInstanceOf[js.Any])
    
    inline def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
    
    inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setFilter(value: DateFormat): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGrid(value: Dragging): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setSaveAllFormats(value: Boolean): Self = StObject.set(x, "saveAllFormats", value.asInstanceOf[js.Any])
    
    inline def setSaveAllFormatsUndefined: Self = StObject.set(x, "saveAllFormats", js.undefined)
    
    inline def setSelectEmptyCells(value: Boolean): Self = StObject.set(x, "selectEmptyCells", value.asInstanceOf[js.Any])
    
    inline def setSelectEmptyCellsUndefined: Self = StObject.set(x, "selectEmptyCells", js.undefined)
    
    inline def setShowAggregationLabels(value: Boolean): Self = StObject.set(x, "showAggregationLabels", value.asInstanceOf[js.Any])
    
    inline def setShowAggregationLabelsUndefined: Self = StObject.set(x, "showAggregationLabels", js.undefined)
    
    inline def setShowAggregations(value: Boolean): Self = StObject.set(x, "showAggregations", value.asInstanceOf[js.Any])
    
    inline def setShowAggregationsUndefined: Self = StObject.set(x, "showAggregations", js.undefined)
    
    inline def setShowAllFieldsDrillThrough(value: Boolean): Self = StObject.set(x, "showAllFieldsDrillThrough", value.asInstanceOf[js.Any])
    
    inline def setShowAllFieldsDrillThroughUndefined: Self = StObject.set(x, "showAllFieldsDrillThrough", js.undefined)
    
    inline def setShowCalculatedValuesButton(value: Boolean): Self = StObject.set(x, "showCalculatedValuesButton", value.asInstanceOf[js.Any])
    
    inline def setShowCalculatedValuesButtonUndefined: Self = StObject.set(x, "showCalculatedValuesButton", js.undefined)
    
    inline def setShowDefaultSlice(value: Boolean): Self = StObject.set(x, "showDefaultSlice", value.asInstanceOf[js.Any])
    
    inline def setShowDefaultSliceUndefined: Self = StObject.set(x, "showDefaultSlice", js.undefined)
    
    inline def setShowDrillThroughConfigurator(value: Boolean): Self = StObject.set(x, "showDrillThroughConfigurator", value.asInstanceOf[js.Any])
    
    inline def setShowDrillThroughConfiguratorUndefined: Self = StObject.set(x, "showDrillThroughConfigurator", js.undefined)
    
    inline def setShowEmptyData(value: Boolean): Self = StObject.set(x, "showEmptyData", value.asInstanceOf[js.Any])
    
    inline def setShowEmptyDataUndefined: Self = StObject.set(x, "showEmptyData", js.undefined)
    
    inline def setShowFieldListSearch(value: Boolean): Self = StObject.set(x, "showFieldListSearch", value.asInstanceOf[js.Any])
    
    inline def setShowFieldListSearchUndefined: Self = StObject.set(x, "showFieldListSearch", js.undefined)
    
    inline def setShowMemberProperties(value: Boolean): Self = StObject.set(x, "showMemberProperties", value.asInstanceOf[js.Any])
    
    inline def setShowMemberPropertiesUndefined: Self = StObject.set(x, "showMemberProperties", js.undefined)
    
    inline def setShowOutdatedDataAlert(value: Boolean): Self = StObject.set(x, "showOutdatedDataAlert", value.asInstanceOf[js.Any])
    
    inline def setShowOutdatedDataAlertUndefined: Self = StObject.set(x, "showOutdatedDataAlert", js.undefined)
    
    inline def setSimplifyFieldListFolders(value: Boolean): Self = StObject.set(x, "simplifyFieldListFolders", value.asInstanceOf[js.Any])
    
    inline def setSimplifyFieldListFoldersUndefined: Self = StObject.set(x, "simplifyFieldListFolders", js.undefined)
    
    inline def setSorting(value: String): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setStrictDataTypes(value: Boolean): Self = StObject.set(x, "strictDataTypes", value.asInstanceOf[js.Any])
    
    inline def setStrictDataTypesUndefined: Self = StObject.set(x, "strictDataTypes", js.undefined)
    
    inline def setTimePattern(value: String): Self = StObject.set(x, "timePattern", value.asInstanceOf[js.Any])
    
    inline def setTimePatternUndefined: Self = StObject.set(x, "timePattern", js.undefined)
    
    inline def setUseOlapFormatting(value: Boolean): Self = StObject.set(x, "useOlapFormatting", value.asInstanceOf[js.Any])
    
    inline def setUseOlapFormattingUndefined: Self = StObject.set(x, "useOlapFormatting", js.undefined)
    
    inline def setValidateFormulas(value: Boolean): Self = StObject.set(x, "validateFormulas", value.asInstanceOf[js.Any])
    
    inline def setValidateFormulasUndefined: Self = StObject.set(x, "validateFormulas", js.undefined)
    
    inline def setValidateReportFiles(value: Boolean): Self = StObject.set(x, "validateReportFiles", value.asInstanceOf[js.Any])
    
    inline def setValidateReportFilesUndefined: Self = StObject.set(x, "validateReportFiles", js.undefined)
    
    inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
