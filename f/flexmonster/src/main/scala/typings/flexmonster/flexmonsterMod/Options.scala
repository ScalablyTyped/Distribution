package typings.flexmonster.flexmonsterMod

import typings.flexmonster.Anon_ActiveMeasure
import typings.flexmonster.Anon_DateFormat
import typings.flexmonster.Anon_Dragging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var caseSensitiveMembers: js.UndefOr[Boolean] = js.undefined
  var chart: js.UndefOr[Anon_ActiveMeasure] = js.undefined
  var configuratorActive: js.UndefOr[Boolean] = js.undefined
  var configuratorButton: js.UndefOr[Boolean] = js.undefined
  var datePattern: js.UndefOr[String] = js.undefined
  var dateTimePattern: js.UndefOr[String] = js.undefined
  var dateTimezoneOffset: js.UndefOr[Double] = js.undefined
  var defaultDateType: js.UndefOr[String] = js.undefined
  var defaultHierarchySortName: js.UndefOr[String] = js.undefined
  var drillThrough: js.UndefOr[Boolean] = js.undefined
  var editing: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Anon_DateFormat] = js.undefined
  var grid: js.UndefOr[Anon_Dragging] = js.undefined
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
    chart: Anon_ActiveMeasure = null,
    configuratorActive: js.UndefOr[Boolean] = js.undefined,
    configuratorButton: js.UndefOr[Boolean] = js.undefined,
    datePattern: String = null,
    dateTimePattern: String = null,
    dateTimezoneOffset: Int | Double = null,
    defaultDateType: String = null,
    defaultHierarchySortName: String = null,
    drillThrough: js.UndefOr[Boolean] = js.undefined,
    editing: js.UndefOr[Boolean] = js.undefined,
    filter: Anon_DateFormat = null,
    grid: Anon_Dragging = null,
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
    if (!js.isUndefined(caseSensitiveMembers)) __obj.updateDynamic("caseSensitiveMembers")(caseSensitiveMembers)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (!js.isUndefined(configuratorActive)) __obj.updateDynamic("configuratorActive")(configuratorActive)
    if (!js.isUndefined(configuratorButton)) __obj.updateDynamic("configuratorButton")(configuratorButton)
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern)
    if (dateTimePattern != null) __obj.updateDynamic("dateTimePattern")(dateTimePattern)
    if (dateTimezoneOffset != null) __obj.updateDynamic("dateTimezoneOffset")(dateTimezoneOffset.asInstanceOf[js.Any])
    if (defaultDateType != null) __obj.updateDynamic("defaultDateType")(defaultDateType)
    if (defaultHierarchySortName != null) __obj.updateDynamic("defaultHierarchySortName")(defaultHierarchySortName)
    if (!js.isUndefined(drillThrough)) __obj.updateDynamic("drillThrough")(drillThrough)
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(grouping)) __obj.updateDynamic("grouping")(grouping)
    if (!js.isUndefined(saveAllFormats)) __obj.updateDynamic("saveAllFormats")(saveAllFormats)
    if (!js.isUndefined(selectEmptyCells)) __obj.updateDynamic("selectEmptyCells")(selectEmptyCells)
    if (!js.isUndefined(showAggregationLabels)) __obj.updateDynamic("showAggregationLabels")(showAggregationLabels)
    if (!js.isUndefined(showAggregations)) __obj.updateDynamic("showAggregations")(showAggregations)
    if (!js.isUndefined(showAllFieldsDrillThrough)) __obj.updateDynamic("showAllFieldsDrillThrough")(showAllFieldsDrillThrough)
    if (!js.isUndefined(showCalculatedValuesButton)) __obj.updateDynamic("showCalculatedValuesButton")(showCalculatedValuesButton)
    if (!js.isUndefined(showDefaultSlice)) __obj.updateDynamic("showDefaultSlice")(showDefaultSlice)
    if (!js.isUndefined(showDrillThroughConfigurator)) __obj.updateDynamic("showDrillThroughConfigurator")(showDrillThroughConfigurator)
    if (!js.isUndefined(showEmptyData)) __obj.updateDynamic("showEmptyData")(showEmptyData)
    if (!js.isUndefined(showFieldListSearch)) __obj.updateDynamic("showFieldListSearch")(showFieldListSearch)
    if (!js.isUndefined(showMemberProperties)) __obj.updateDynamic("showMemberProperties")(showMemberProperties)
    if (!js.isUndefined(showOutdatedDataAlert)) __obj.updateDynamic("showOutdatedDataAlert")(showOutdatedDataAlert)
    if (!js.isUndefined(simplifyFieldListFolders)) __obj.updateDynamic("simplifyFieldListFolders")(simplifyFieldListFolders)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    if (!js.isUndefined(strictDataTypes)) __obj.updateDynamic("strictDataTypes")(strictDataTypes)
    if (timePattern != null) __obj.updateDynamic("timePattern")(timePattern)
    if (!js.isUndefined(useOlapFormatting)) __obj.updateDynamic("useOlapFormatting")(useOlapFormatting)
    if (!js.isUndefined(validateFormulas)) __obj.updateDynamic("validateFormulas")(validateFormulas)
    if (!js.isUndefined(validateReportFiles)) __obj.updateDynamic("validateReportFiles")(validateReportFiles)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[Options]
  }
}

