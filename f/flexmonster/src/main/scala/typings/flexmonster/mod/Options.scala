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
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitiveMembers(value: Boolean): Self = StObject.set(x, "caseSensitiveMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveMembersUndefined: Self = StObject.set(x, "caseSensitiveMembers", js.undefined)
    
    @scala.inline
    def setChart(value: ActiveMeasure): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setConfiguratorActive(value: Boolean): Self = StObject.set(x, "configuratorActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguratorActiveUndefined: Self = StObject.set(x, "configuratorActive", js.undefined)
    
    @scala.inline
    def setConfiguratorButton(value: Boolean): Self = StObject.set(x, "configuratorButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguratorButtonUndefined: Self = StObject.set(x, "configuratorButton", js.undefined)
    
    @scala.inline
    def setDatePattern(value: String): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
    
    @scala.inline
    def setDateTimePattern(value: String): Self = StObject.set(x, "dateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimePatternUndefined: Self = StObject.set(x, "dateTimePattern", js.undefined)
    
    @scala.inline
    def setDateTimezoneOffset(value: Double): Self = StObject.set(x, "dateTimezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimezoneOffsetUndefined: Self = StObject.set(x, "dateTimezoneOffset", js.undefined)
    
    @scala.inline
    def setDefaultDateType(value: String): Self = StObject.set(x, "defaultDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateTypeUndefined: Self = StObject.set(x, "defaultDateType", js.undefined)
    
    @scala.inline
    def setDefaultHierarchySortName(value: String): Self = StObject.set(x, "defaultHierarchySortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHierarchySortNameUndefined: Self = StObject.set(x, "defaultHierarchySortName", js.undefined)
    
    @scala.inline
    def setDrillThrough(value: Boolean): Self = StObject.set(x, "drillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
    
    @scala.inline
    def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    @scala.inline
    def setFilter(value: DateFormat): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGrid(value: Dragging): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    @scala.inline
    def setSaveAllFormats(value: Boolean): Self = StObject.set(x, "saveAllFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAllFormatsUndefined: Self = StObject.set(x, "saveAllFormats", js.undefined)
    
    @scala.inline
    def setSelectEmptyCells(value: Boolean): Self = StObject.set(x, "selectEmptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectEmptyCellsUndefined: Self = StObject.set(x, "selectEmptyCells", js.undefined)
    
    @scala.inline
    def setShowAggregationLabels(value: Boolean): Self = StObject.set(x, "showAggregationLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAggregationLabelsUndefined: Self = StObject.set(x, "showAggregationLabels", js.undefined)
    
    @scala.inline
    def setShowAggregations(value: Boolean): Self = StObject.set(x, "showAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAggregationsUndefined: Self = StObject.set(x, "showAggregations", js.undefined)
    
    @scala.inline
    def setShowAllFieldsDrillThrough(value: Boolean): Self = StObject.set(x, "showAllFieldsDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllFieldsDrillThroughUndefined: Self = StObject.set(x, "showAllFieldsDrillThrough", js.undefined)
    
    @scala.inline
    def setShowCalculatedValuesButton(value: Boolean): Self = StObject.set(x, "showCalculatedValuesButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCalculatedValuesButtonUndefined: Self = StObject.set(x, "showCalculatedValuesButton", js.undefined)
    
    @scala.inline
    def setShowDefaultSlice(value: Boolean): Self = StObject.set(x, "showDefaultSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDefaultSliceUndefined: Self = StObject.set(x, "showDefaultSlice", js.undefined)
    
    @scala.inline
    def setShowDrillThroughConfigurator(value: Boolean): Self = StObject.set(x, "showDrillThroughConfigurator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDrillThroughConfiguratorUndefined: Self = StObject.set(x, "showDrillThroughConfigurator", js.undefined)
    
    @scala.inline
    def setShowEmptyData(value: Boolean): Self = StObject.set(x, "showEmptyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEmptyDataUndefined: Self = StObject.set(x, "showEmptyData", js.undefined)
    
    @scala.inline
    def setShowFieldListSearch(value: Boolean): Self = StObject.set(x, "showFieldListSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFieldListSearchUndefined: Self = StObject.set(x, "showFieldListSearch", js.undefined)
    
    @scala.inline
    def setShowMemberProperties(value: Boolean): Self = StObject.set(x, "showMemberProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMemberPropertiesUndefined: Self = StObject.set(x, "showMemberProperties", js.undefined)
    
    @scala.inline
    def setShowOutdatedDataAlert(value: Boolean): Self = StObject.set(x, "showOutdatedDataAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOutdatedDataAlertUndefined: Self = StObject.set(x, "showOutdatedDataAlert", js.undefined)
    
    @scala.inline
    def setSimplifyFieldListFolders(value: Boolean): Self = StObject.set(x, "simplifyFieldListFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifyFieldListFoldersUndefined: Self = StObject.set(x, "simplifyFieldListFolders", js.undefined)
    
    @scala.inline
    def setSorting(value: String): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setStrictDataTypes(value: Boolean): Self = StObject.set(x, "strictDataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictDataTypesUndefined: Self = StObject.set(x, "strictDataTypes", js.undefined)
    
    @scala.inline
    def setTimePattern(value: String): Self = StObject.set(x, "timePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePatternUndefined: Self = StObject.set(x, "timePattern", js.undefined)
    
    @scala.inline
    def setUseOlapFormatting(value: Boolean): Self = StObject.set(x, "useOlapFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOlapFormattingUndefined: Self = StObject.set(x, "useOlapFormatting", js.undefined)
    
    @scala.inline
    def setValidateFormulas(value: Boolean): Self = StObject.set(x, "validateFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateFormulasUndefined: Self = StObject.set(x, "validateFormulas", js.undefined)
    
    @scala.inline
    def setValidateReportFiles(value: Boolean): Self = StObject.set(x, "validateReportFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateReportFilesUndefined: Self = StObject.set(x, "validateReportFiles", js.undefined)
    
    @scala.inline
    def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
