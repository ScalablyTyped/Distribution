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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridDataSourceField extends js.Object {
  /** @name PivotGridDataSource.Options.fields.allowCrossGroupCalculation */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.allowExpandAll */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.allowFiltering */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.allowSorting */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.allowSortingBySummary */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.area */
  var area: js.UndefOr[column | typings.devextreme.devextremeStrings.data | filter | row] = js.undefined
  /** @name PivotGridDataSource.Options.fields.areaIndex */
  var areaIndex: js.UndefOr[Double] = js.undefined
  /** @name PivotGridDataSource.Options.fields.calculateCustomSummary */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ SummaryProcess, _]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.calculateSummaryValue */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.caption */
  var caption: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ Value, String]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.dataField */
  var dataField: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.dataType */
  var dataType: js.UndefOr[date | number | string_] = js.undefined
  /** @name PivotGridDataSource.Options.fields.displayFolder */
  var displayFolder: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.expanded */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.filterType */
  var filterType: js.UndefOr[exclude | include] = js.undefined
  /** @name PivotGridDataSource.Options.fields.filterValues */
  var filterValues: js.UndefOr[js.Array[_]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.format */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** @name PivotGridDataSource.Options.fields.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** @name PivotGridDataSource.Options.fields.groupInterval */
  var groupInterval: js.UndefOr[day | dayOfWeek | month | quarter | year | Double] = js.undefined
  /** @name PivotGridDataSource.Options.fields.groupName */
  var groupName: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.headerFilter */
  var headerFilter: js.UndefOr[AllowSearch] = js.undefined
  /** @name PivotGridDataSource.Options.fields.isMeasure */
  var isMeasure: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.runningTotal */
  var runningTotal: js.UndefOr[column | row] = js.undefined
  /** @name PivotGridDataSource.Options.fields.selector */
  var selector: js.UndefOr[js.Function] = js.undefined
  /** @name PivotGridDataSource.Options.fields.showGrandTotals */
  var showGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.showTotals */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.showValues */
  var showValues: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.sortBy */
  var sortBy: js.UndefOr[displayText | value | none] = js.undefined
  /** @name PivotGridDataSource.Options.fields.sortBySummaryField */
  var sortBySummaryField: js.UndefOr[String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.sortBySummaryPath */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.sortOrder */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  /** @name PivotGridDataSource.Options.fields.sortingMethod */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ Children, /* b */ Children, Double]] = js.undefined
  /** @name PivotGridDataSource.Options.fields.summaryDisplayMode */
  var summaryDisplayMode: js.UndefOr[
    absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
  ] = js.undefined
  /** @name PivotGridDataSource.Options.fields.summaryType */
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  /** @name PivotGridDataSource.Options.fields.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name PivotGridDataSource.Options.fields.width */
  var width: js.UndefOr[Double] = js.undefined
  /** @name PivotGridDataSource.Options.fields.wordWrapEnabled */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object PivotGridDataSourceField {
  @scala.inline
  def apply(
    allowCrossGroupCalculation: js.UndefOr[Boolean] = js.undefined,
    allowExpandAll: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowSortingBySummary: js.UndefOr[Boolean] = js.undefined,
    area: column | typings.devextreme.devextremeStrings.data | filter | row = null,
    areaIndex: js.UndefOr[Double] = js.undefined,
    calculateCustomSummary: /* options */ SummaryProcess => _ = null,
    calculateSummaryValue: /* e */ dxPivotGridSummaryCell => Double = null,
    caption: String = null,
    customizeText: /* cellInfo */ Value => String = null,
    dataField: String = null,
    dataType: date | number | string_ = null,
    displayFolder: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    filterType: exclude | include = null,
    filterValues: js.Array[_] = null,
    format: format = null,
    groupIndex: js.UndefOr[Double] = js.undefined,
    groupInterval: day | dayOfWeek | month | quarter | year | Double = null,
    groupName: String = null,
    headerFilter: AllowSearch = null,
    isMeasure: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    runningTotal: column | row = null,
    selector: js.Function = null,
    showGrandTotals: js.UndefOr[Boolean] = js.undefined,
    showTotals: js.UndefOr[Boolean] = js.undefined,
    showValues: js.UndefOr[Boolean] = js.undefined,
    sortBy: displayText | value | none = null,
    sortBySummaryField: String = null,
    sortBySummaryPath: js.Array[Double | String] = null,
    sortOrder: asc | desc = null,
    sortingMethod: (/* a */ Children, /* b */ Children) => Double = null,
    summaryDisplayMode: absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation = null,
    summaryType: avg | count | custom | max | min | sum | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCrossGroupCalculation)) __obj.updateDynamic("allowCrossGroupCalculation")(allowCrossGroupCalculation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpandAll)) __obj.updateDynamic("allowExpandAll")(allowExpandAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSortingBySummary)) __obj.updateDynamic("allowSortingBySummary")(allowSortingBySummary.get.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (!js.isUndefined(areaIndex)) __obj.updateDynamic("areaIndex")(areaIndex.get.asInstanceOf[js.Any])
    if (calculateCustomSummary != null) __obj.updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(calculateCustomSummary))
    if (calculateSummaryValue != null) __obj.updateDynamic("calculateSummaryValue")(js.Any.fromFunction1(calculateSummaryValue))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIndex)) __obj.updateDynamic("groupIndex")(groupIndex.get.asInstanceOf[js.Any])
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeasure)) __obj.updateDynamic("isMeasure")(isMeasure.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (runningTotal != null) __obj.updateDynamic("runningTotal")(runningTotal.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrandTotals)) __obj.updateDynamic("showGrandTotals")(showGrandTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValues)) __obj.updateDynamic("showValues")(showValues.get.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortBySummaryField != null) __obj.updateDynamic("sortBySummaryField")(sortBySummaryField.asInstanceOf[js.Any])
    if (sortBySummaryPath != null) __obj.updateDynamic("sortBySummaryPath")(sortBySummaryPath.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (summaryDisplayMode != null) __obj.updateDynamic("summaryDisplayMode")(summaryDisplayMode.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
}

