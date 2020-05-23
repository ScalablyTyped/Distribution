package typings.flexmonster.mod

import typings.flexmonster.anon.ActiveMeasure
import typings.flexmonster.anon.DateFormat
import typings.flexmonster.anon.Dragging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  def apply(
    caseSensitiveMembers: js.UndefOr[Boolean] = js.undefined,
    chart: ActiveMeasure = null,
    configuratorActive: js.UndefOr[Boolean] = js.undefined,
    configuratorButton: js.UndefOr[Boolean] = js.undefined,
    datePattern: String = null,
    dateTimePattern: String = null,
    dateTimezoneOffset: js.UndefOr[Double] = js.undefined,
    defaultDateType: String = null,
    defaultHierarchySortName: String = null,
    drillThrough: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    filter: DateFormat = null,
    grid: Dragging = null,
    grouping: js.UndefOr[Boolean] = js.undefined,
    saveAllFormats: js.UndefOr[Boolean] = js.undefined,
    selectEmptyCells: js.UndefOr[Boolean] = js.undefined,
    showAggregationLabels: js.UndefOr[Boolean] = js.undefined,
    showAggregations: js.UndefOr[Boolean] = js.undefined,
    showAllFieldsDrillThrough: js.UndefOr[Boolean] = js.undefined,
    showCalculatedValuesButton: js.UndefOr[Boolean] = js.undefined,
    showDefaultSlice: js.UndefOr[Boolean] = js.undefined,
    showDrillThroughConfigurator: js.UndefOr[Boolean] = js.undefined,
    showEmptyData: js.UndefOr[Boolean] = js.undefined,
    showFieldListSearch: js.UndefOr[Boolean] = js.undefined,
    showMemberProperties: js.UndefOr[Boolean] = js.undefined,
    showOutdatedDataAlert: js.UndefOr[Boolean] = js.undefined,
    simplifyFieldListFolders: js.UndefOr[Boolean] = js.undefined,
    sorting: String = null,
    strictDataTypes: js.UndefOr[Boolean] = js.undefined,
    timePattern: String = null,
    useOlapFormatting: js.UndefOr[Boolean] = js.undefined,
    validateFormulas: js.UndefOr[Boolean] = js.undefined,
    validateReportFiles: js.UndefOr[Boolean] = js.undefined,
    viewType: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitiveMembers)) __obj.updateDynamic("caseSensitiveMembers")(caseSensitiveMembers.get.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (!js.isUndefined(configuratorActive)) __obj.updateDynamic("configuratorActive")(configuratorActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(configuratorButton)) __obj.updateDynamic("configuratorButton")(configuratorButton.get.asInstanceOf[js.Any])
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern.asInstanceOf[js.Any])
    if (dateTimePattern != null) __obj.updateDynamic("dateTimePattern")(dateTimePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(dateTimezoneOffset)) __obj.updateDynamic("dateTimezoneOffset")(dateTimezoneOffset.get.asInstanceOf[js.Any])
    if (defaultDateType != null) __obj.updateDynamic("defaultDateType")(defaultDateType.asInstanceOf[js.Any])
    if (defaultHierarchySortName != null) __obj.updateDynamic("defaultHierarchySortName")(defaultHierarchySortName.asInstanceOf[js.Any])
    if (!js.isUndefined(drillThrough)) __obj.updateDynamic("drillThrough")(drillThrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saveAllFormats)) __obj.updateDynamic("saveAllFormats")(saveAllFormats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectEmptyCells)) __obj.updateDynamic("selectEmptyCells")(selectEmptyCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAggregationLabels)) __obj.updateDynamic("showAggregationLabels")(showAggregationLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAggregations)) __obj.updateDynamic("showAggregations")(showAggregations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllFieldsDrillThrough)) __obj.updateDynamic("showAllFieldsDrillThrough")(showAllFieldsDrillThrough.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCalculatedValuesButton)) __obj.updateDynamic("showCalculatedValuesButton")(showCalculatedValuesButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaultSlice)) __obj.updateDynamic("showDefaultSlice")(showDefaultSlice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDrillThroughConfigurator)) __obj.updateDynamic("showDrillThroughConfigurator")(showDrillThroughConfigurator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showEmptyData)) __obj.updateDynamic("showEmptyData")(showEmptyData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showFieldListSearch)) __obj.updateDynamic("showFieldListSearch")(showFieldListSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMemberProperties)) __obj.updateDynamic("showMemberProperties")(showMemberProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutdatedDataAlert)) __obj.updateDynamic("showOutdatedDataAlert")(showOutdatedDataAlert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifyFieldListFolders)) __obj.updateDynamic("simplifyFieldListFolders")(simplifyFieldListFolders.get.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (!js.isUndefined(strictDataTypes)) __obj.updateDynamic("strictDataTypes")(strictDataTypes.get.asInstanceOf[js.Any])
    if (timePattern != null) __obj.updateDynamic("timePattern")(timePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(useOlapFormatting)) __obj.updateDynamic("useOlapFormatting")(useOlapFormatting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateFormulas)) __obj.updateDynamic("validateFormulas")(validateFormulas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateReportFiles)) __obj.updateDynamic("validateReportFiles")(validateReportFiles.get.asInstanceOf[js.Any])
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

