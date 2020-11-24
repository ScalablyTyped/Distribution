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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSourceField extends js.Object {
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowCrossGroupCalculation]
    */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowExpandAll]
    */
  var allowExpandAll: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowFiltering]
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowSorting]
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.allowSortingBySummary]
    */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.area]
    */
  var area: js.UndefOr[column | typings.devextreme.devextremeStrings.data | filter | row] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.areaIndex]
    */
  var areaIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.calculateCustomSummary]
    */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ SummaryProcess, _]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.calculateSummaryValue]
    */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.caption]
    */
  var caption: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.customizeText]
    */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ Value, String]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.dataField]
    */
  var dataField: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.dataType]
    */
  var dataType: js.UndefOr[date | number | string_] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.displayFolder]
    */
  var displayFolder: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.expanded]
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.filterType]
    */
  var filterType: js.UndefOr[exclude | include] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.filterValues]
    */
  var filterValues: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.format]
    */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupIndex]
    */
  var groupIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupInterval]
    */
  var groupInterval: js.UndefOr[day | dayOfWeek | month | quarter | year | Double] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.groupName]
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.headerFilter]
    */
  var headerFilter: js.UndefOr[AllowSearch] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.isMeasure]
    */
  var isMeasure: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.runningTotal]
    */
  var runningTotal: js.UndefOr[column | row] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.selector]
    */
  var selector: js.UndefOr[js.Function] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showGrandTotals]
    */
  var showGrandTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showTotals]
    */
  var showTotals: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.showValues]
    */
  var showValues: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBy]
    */
  var sortBy: js.UndefOr[displayText | value | none] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBySummaryField]
    */
  var sortBySummaryField: js.UndefOr[String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortBySummaryPath]
    */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortOrder]
    */
  var sortOrder: js.UndefOr[asc | desc] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.sortingMethod]
    */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ Children, /* b */ Children, Double]] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.summaryDisplayMode]
    */
  var summaryDisplayMode: js.UndefOr[
    absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
  ] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.summaryType]
    */
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.width]
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * [descr:PivotGridDataSource.Options.fields.wordWrapEnabled]
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}
object PivotGridDataSourceField {
  
  @scala.inline
  def apply(): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
  
  @scala.inline
  implicit class PivotGridDataSourceFieldOps[Self <: PivotGridDataSourceField] (val x: Self) extends AnyVal {
    
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
    def setAllowCrossGroupCalculation(value: Boolean): Self = this.set("allowCrossGroupCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCrossGroupCalculation: Self = this.set("allowCrossGroupCalculation", js.undefined)
    
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
    def setArea(value: column | typings.devextreme.devextremeStrings.data | filter | row): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setAreaIndex(value: Double): Self = this.set("areaIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaIndex: Self = this.set("areaIndex", js.undefined)
    
    @scala.inline
    def setCalculateCustomSummary(value: /* options */ SummaryProcess => _): Self = this.set("calculateCustomSummary", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateCustomSummary: Self = this.set("calculateCustomSummary", js.undefined)
    
    @scala.inline
    def setCalculateSummaryValue(value: /* e */ dxPivotGridSummaryCell => Double): Self = this.set("calculateSummaryValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateSummaryValue: Self = this.set("calculateSummaryValue", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* cellInfo */ Value => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDataType(value: date | number | string_): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDisplayFolder(value: String): Self = this.set("displayFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayFolder: Self = this.set("displayFolder", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setFilterType(value: exclude | include): Self = this.set("filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterType: Self = this.set("filterType", js.undefined)
    
    @scala.inline
    def setFilterValuesVarargs(value: js.Any*): Self = this.set("filterValues", js.Array(value :_*))
    
    @scala.inline
    def setFilterValues(value: js.Array[_]): Self = this.set("filterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValues: Self = this.set("filterValues", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    
    @scala.inline
    def setGroupInterval(value: day | dayOfWeek | month | quarter | year | Double): Self = this.set("groupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupInterval: Self = this.set("groupInterval", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setHeaderFilter(value: AllowSearch): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    
    @scala.inline
    def setIsMeasure(value: Boolean): Self = this.set("isMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMeasure: Self = this.set("isMeasure", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRunningTotal(value: column | row): Self = this.set("runningTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningTotal: Self = this.set("runningTotal", js.undefined)
    
    @scala.inline
    def setSelector(value: js.Function): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setShowGrandTotals(value: Boolean): Self = this.set("showGrandTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGrandTotals: Self = this.set("showGrandTotals", js.undefined)
    
    @scala.inline
    def setShowTotals(value: Boolean): Self = this.set("showTotals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTotals: Self = this.set("showTotals", js.undefined)
    
    @scala.inline
    def setShowValues(value: Boolean): Self = this.set("showValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValues: Self = this.set("showValues", js.undefined)
    
    @scala.inline
    def setSortBy(value: displayText | value | none): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortBySummaryField(value: String): Self = this.set("sortBySummaryField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBySummaryField: Self = this.set("sortBySummaryField", js.undefined)
    
    @scala.inline
    def setSortBySummaryPathVarargs(value: (Double | String)*): Self = this.set("sortBySummaryPath", js.Array(value :_*))
    
    @scala.inline
    def setSortBySummaryPath(value: js.Array[Double | String]): Self = this.set("sortBySummaryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBySummaryPath: Self = this.set("sortBySummaryPath", js.undefined)
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSortingMethod(value: (/* a */ Children, /* b */ Children) => Double): Self = this.set("sortingMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSortingMethod: Self = this.set("sortingMethod", js.undefined)
    
    @scala.inline
    def setSummaryDisplayMode(
      value: absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
    ): Self = this.set("summaryDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryDisplayMode: Self = this.set("summaryDisplayMode", js.undefined)
    
    @scala.inline
    def setSummaryType(value: avg | count | custom | max | min | sum | String): Self = this.set("summaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryType: Self = this.set("summaryType", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = this.set("wordWrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapEnabled: Self = this.set("wordWrapEnabled", js.undefined)
  }
}
