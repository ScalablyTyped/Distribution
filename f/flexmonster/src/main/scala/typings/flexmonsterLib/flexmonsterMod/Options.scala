package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chart: js.UndefOr[flexmonsterLib.Anon_ActiveMeasure] = js.undefined
  var configuratorActive: js.UndefOr[scala.Boolean] = js.undefined
  var configuratorButton: js.UndefOr[scala.Boolean] = js.undefined
  var datePattern: js.UndefOr[java.lang.String] = js.undefined
  var dateTimePattern: js.UndefOr[java.lang.String] = js.undefined
  var dateTimezoneOffset: js.UndefOr[scala.Double] = js.undefined
  var defaultDateType: js.UndefOr[java.lang.String] = js.undefined
  var defaultHierarchySortName: js.UndefOr[java.lang.String] = js.undefined
  var drillThrough: js.UndefOr[scala.Boolean] = js.undefined
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[flexmonsterLib.Anon_DateFormat] = js.undefined
  var grid: js.UndefOr[flexmonsterLib.Anon_Dragging] = js.undefined
  var grouping: js.UndefOr[scala.Boolean] = js.undefined
  var saveAllFormats: js.UndefOr[scala.Boolean] = js.undefined
  var selectEmptyCells: js.UndefOr[scala.Boolean] = js.undefined
  var showAggregationLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showAggregations: js.UndefOr[scala.Boolean] = js.undefined
  var showAllFieldsDrillThrough: js.UndefOr[scala.Boolean] = js.undefined
  var showCalculatedValuesButton: js.UndefOr[scala.Boolean] = js.undefined
  var showDefaultSlice: js.UndefOr[scala.Boolean] = js.undefined
  var showDrillThroughConfigurator: js.UndefOr[scala.Boolean] = js.undefined
  var showEmptyData: js.UndefOr[scala.Boolean] = js.undefined
  var showMemberProperties: js.UndefOr[scala.Boolean] = js.undefined
  var showOutdatedDataAlert: js.UndefOr[scala.Boolean] = js.undefined
  var sorting: js.UndefOr[java.lang.String] = js.undefined
  var timePattern: js.UndefOr[java.lang.String] = js.undefined
  var useOlapFormatting: js.UndefOr[scala.Boolean] = js.undefined
  var viewType: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chart: flexmonsterLib.Anon_ActiveMeasure = null,
    configuratorActive: js.UndefOr[scala.Boolean] = js.undefined,
    configuratorButton: js.UndefOr[scala.Boolean] = js.undefined,
    datePattern: java.lang.String = null,
    dateTimePattern: java.lang.String = null,
    dateTimezoneOffset: scala.Int | scala.Double = null,
    defaultDateType: java.lang.String = null,
    defaultHierarchySortName: java.lang.String = null,
    drillThrough: js.UndefOr[scala.Boolean] = js.undefined,
    editing: js.UndefOr[scala.Boolean] = js.undefined,
    filter: flexmonsterLib.Anon_DateFormat = null,
    grid: flexmonsterLib.Anon_Dragging = null,
    grouping: js.UndefOr[scala.Boolean] = js.undefined,
    saveAllFormats: js.UndefOr[scala.Boolean] = js.undefined,
    selectEmptyCells: js.UndefOr[scala.Boolean] = js.undefined,
    showAggregationLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showAggregations: js.UndefOr[scala.Boolean] = js.undefined,
    showAllFieldsDrillThrough: js.UndefOr[scala.Boolean] = js.undefined,
    showCalculatedValuesButton: js.UndefOr[scala.Boolean] = js.undefined,
    showDefaultSlice: js.UndefOr[scala.Boolean] = js.undefined,
    showDrillThroughConfigurator: js.UndefOr[scala.Boolean] = js.undefined,
    showEmptyData: js.UndefOr[scala.Boolean] = js.undefined,
    showMemberProperties: js.UndefOr[scala.Boolean] = js.undefined,
    showOutdatedDataAlert: js.UndefOr[scala.Boolean] = js.undefined,
    sorting: java.lang.String = null,
    timePattern: java.lang.String = null,
    useOlapFormatting: js.UndefOr[scala.Boolean] = js.undefined,
    viewType: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
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
    if (!js.isUndefined(showMemberProperties)) __obj.updateDynamic("showMemberProperties")(showMemberProperties)
    if (!js.isUndefined(showOutdatedDataAlert)) __obj.updateDynamic("showOutdatedDataAlert")(showOutdatedDataAlert)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    if (timePattern != null) __obj.updateDynamic("timePattern")(timePattern)
    if (!js.isUndefined(useOlapFormatting)) __obj.updateDynamic("useOlapFormatting")(useOlapFormatting)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[Options]
  }
}

