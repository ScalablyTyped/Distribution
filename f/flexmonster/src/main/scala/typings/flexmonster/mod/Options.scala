package typings.flexmonster.mod

import typings.flexmonster.anon.ActiveMeasure
import typings.flexmonster.anon.DateFormat
import typings.flexmonster.anon.Dragging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var caseSensitiveMembers: js.UndefOr[Boolean] = js.native
  
  var chart: js.UndefOr[ActiveMeasure] = js.native
  
  var configuratorActive: js.UndefOr[Boolean] = js.native
  
  var configuratorButton: js.UndefOr[Boolean] = js.native
  
  var datePattern: js.UndefOr[String] = js.native
  
  var dateTimePattern: js.UndefOr[String] = js.native
  
  var dateTimezoneOffset: js.UndefOr[Double] = js.native
  
  var defaultDateType: js.UndefOr[String] = js.native
  
  var defaultHierarchySortName: js.UndefOr[String] = js.native
  
  var drillThrough: js.UndefOr[Boolean] = js.native
  
  var editing: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[DateFormat] = js.native
  
  var grid: js.UndefOr[Dragging] = js.native
  
  var grouping: js.UndefOr[Boolean] = js.native
  
  var saveAllFormats: js.UndefOr[Boolean] = js.native
  
  var selectEmptyCells: js.UndefOr[Boolean] = js.native
  
  var showAggregationLabels: js.UndefOr[Boolean] = js.native
  
  var showAggregations: js.UndefOr[Boolean] = js.native
  
  var showAllFieldsDrillThrough: js.UndefOr[Boolean] = js.native
  
  var showCalculatedValuesButton: js.UndefOr[Boolean] = js.native
  
  var showDefaultSlice: js.UndefOr[Boolean] = js.native
  
  var showDrillThroughConfigurator: js.UndefOr[Boolean] = js.native
  
  var showEmptyData: js.UndefOr[Boolean] = js.native
  
  var showFieldListSearch: js.UndefOr[Boolean] = js.native
  
  var showMemberProperties: js.UndefOr[Boolean] = js.native
  
  var showOutdatedDataAlert: js.UndefOr[Boolean] = js.native
  
  var simplifyFieldListFolders: js.UndefOr[Boolean] = js.native
  
  var sorting: js.UndefOr[String] = js.native
  
  var strictDataTypes: js.UndefOr[Boolean] = js.native
  
  var timePattern: js.UndefOr[String] = js.native
  
  var useOlapFormatting: js.UndefOr[Boolean] = js.native
  
  var validateFormulas: js.UndefOr[Boolean] = js.native
  
  var validateReportFiles: js.UndefOr[Boolean] = js.native
  
  var viewType: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitiveMembers(value: Boolean): Self = this.set("caseSensitiveMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveMembers: Self = this.set("caseSensitiveMembers", js.undefined)
    
    @scala.inline
    def setChart(value: ActiveMeasure): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setConfiguratorActive(value: Boolean): Self = this.set("configuratorActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguratorActive: Self = this.set("configuratorActive", js.undefined)
    
    @scala.inline
    def setConfiguratorButton(value: Boolean): Self = this.set("configuratorButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguratorButton: Self = this.set("configuratorButton", js.undefined)
    
    @scala.inline
    def setDatePattern(value: String): Self = this.set("datePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePattern: Self = this.set("datePattern", js.undefined)
    
    @scala.inline
    def setDateTimePattern(value: String): Self = this.set("dateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimePattern: Self = this.set("dateTimePattern", js.undefined)
    
    @scala.inline
    def setDateTimezoneOffset(value: Double): Self = this.set("dateTimezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimezoneOffset: Self = this.set("dateTimezoneOffset", js.undefined)
    
    @scala.inline
    def setDefaultDateType(value: String): Self = this.set("defaultDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDateType: Self = this.set("defaultDateType", js.undefined)
    
    @scala.inline
    def setDefaultHierarchySortName(value: String): Self = this.set("defaultHierarchySortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHierarchySortName: Self = this.set("defaultHierarchySortName", js.undefined)
    
    @scala.inline
    def setDrillThrough(value: Boolean): Self = this.set("drillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillThrough: Self = this.set("drillThrough", js.undefined)
    
    @scala.inline
    def setEditing(value: Boolean): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    
    @scala.inline
    def setFilter(value: DateFormat): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGrid(value: Dragging): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setGrouping(value: Boolean): Self = this.set("grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    
    @scala.inline
    def setSaveAllFormats(value: Boolean): Self = this.set("saveAllFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAllFormats: Self = this.set("saveAllFormats", js.undefined)
    
    @scala.inline
    def setSelectEmptyCells(value: Boolean): Self = this.set("selectEmptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectEmptyCells: Self = this.set("selectEmptyCells", js.undefined)
    
    @scala.inline
    def setShowAggregationLabels(value: Boolean): Self = this.set("showAggregationLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAggregationLabels: Self = this.set("showAggregationLabels", js.undefined)
    
    @scala.inline
    def setShowAggregations(value: Boolean): Self = this.set("showAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAggregations: Self = this.set("showAggregations", js.undefined)
    
    @scala.inline
    def setShowAllFieldsDrillThrough(value: Boolean): Self = this.set("showAllFieldsDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllFieldsDrillThrough: Self = this.set("showAllFieldsDrillThrough", js.undefined)
    
    @scala.inline
    def setShowCalculatedValuesButton(value: Boolean): Self = this.set("showCalculatedValuesButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCalculatedValuesButton: Self = this.set("showCalculatedValuesButton", js.undefined)
    
    @scala.inline
    def setShowDefaultSlice(value: Boolean): Self = this.set("showDefaultSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDefaultSlice: Self = this.set("showDefaultSlice", js.undefined)
    
    @scala.inline
    def setShowDrillThroughConfigurator(value: Boolean): Self = this.set("showDrillThroughConfigurator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDrillThroughConfigurator: Self = this.set("showDrillThroughConfigurator", js.undefined)
    
    @scala.inline
    def setShowEmptyData(value: Boolean): Self = this.set("showEmptyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEmptyData: Self = this.set("showEmptyData", js.undefined)
    
    @scala.inline
    def setShowFieldListSearch(value: Boolean): Self = this.set("showFieldListSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFieldListSearch: Self = this.set("showFieldListSearch", js.undefined)
    
    @scala.inline
    def setShowMemberProperties(value: Boolean): Self = this.set("showMemberProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMemberProperties: Self = this.set("showMemberProperties", js.undefined)
    
    @scala.inline
    def setShowOutdatedDataAlert(value: Boolean): Self = this.set("showOutdatedDataAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOutdatedDataAlert: Self = this.set("showOutdatedDataAlert", js.undefined)
    
    @scala.inline
    def setSimplifyFieldListFolders(value: Boolean): Self = this.set("simplifyFieldListFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplifyFieldListFolders: Self = this.set("simplifyFieldListFolders", js.undefined)
    
    @scala.inline
    def setSorting(value: String): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setStrictDataTypes(value: Boolean): Self = this.set("strictDataTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictDataTypes: Self = this.set("strictDataTypes", js.undefined)
    
    @scala.inline
    def setTimePattern(value: String): Self = this.set("timePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePattern: Self = this.set("timePattern", js.undefined)
    
    @scala.inline
    def setUseOlapFormatting(value: Boolean): Self = this.set("useOlapFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOlapFormatting: Self = this.set("useOlapFormatting", js.undefined)
    
    @scala.inline
    def setValidateFormulas(value: Boolean): Self = this.set("validateFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateFormulas: Self = this.set("validateFormulas", js.undefined)
    
    @scala.inline
    def setValidateReportFiles(value: Boolean): Self = this.set("validateReportFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateReportFiles: Self = this.set("validateReportFiles", js.undefined)
    
    @scala.inline
    def setViewType(value: String): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
  }
}
