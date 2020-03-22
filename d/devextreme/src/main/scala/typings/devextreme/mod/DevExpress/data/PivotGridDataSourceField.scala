package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonAllowSearch
import typings.devextreme.AnonChildren
import typings.devextreme.AnonSummaryProcess
import typings.devextreme.AnonValue
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
  /** Specifies whether to take neighboring groups' summary values into account when calculating a running total and absolute or percent variation. */
  var allowCrossGroupCalculation: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can expand/collapse all items within the same column or row header level using the context menu. */
  var allowExpandAll: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can filter the field's values. */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can change the field's sorting. */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can sort the pivot grid by summary values instead of field values. */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.undefined
  /** Specifies the field's area. */
  var area: js.UndefOr[column | typings.devextreme.devextremeStrings.data | filter | row] = js.undefined
  /** Specifies the field's order among the other fields in the same area. Corresponds to the field's order in the fields array by default. */
  var areaIndex: js.UndefOr[Double] = js.undefined
  /** Specifies a custom aggregate function. Applies only if the summaryType is "custom" and the remoteOperations is false. Cannot be used with an XmlaStore. */
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ AnonSummaryProcess, _]] = js.undefined
  /** Specifies a custom post-processing function for summary values. */
  var calculateSummaryValue: js.UndefOr[js.Function1[/* e */ dxPivotGridSummaryCell, Double]] = js.undefined
  /** Specifies the field's caption to be displayed in the field chooser and on the field panel. */
  var caption: js.UndefOr[String] = js.undefined
  /** Customizes the text displayed in summary cells. */
  var customizeText: js.UndefOr[js.Function1[/* cellInfo */ AnonValue, String]] = js.undefined
  /** Specifies which data source field provides data for the pivot grid field. */
  var dataField: js.UndefOr[String] = js.undefined
  /** Casts field values to a specific data type. */
  var dataType: js.UndefOr[date | number | string_] = js.undefined
  /** Specifies the name of the folder in which the field is located when displayed in the field chooser. */
  var displayFolder: js.UndefOr[String] = js.undefined
  /** Specifies whether to expand all items within the field's header level. */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. */
  var filterType: js.UndefOr[exclude | include] = js.undefined
  /** Specifies the values by which the field is filtered. */
  var filterValues: js.UndefOr[js.Array[_]] = js.undefined
  /** Formats field values before they are displayed. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Specifies the field's index within its group. */
  var groupIndex: js.UndefOr[Double] = js.undefined
  /** Specifies how the field's values are combined into groups for the headers. Cannot be used with an XmlaStore. */
  var groupInterval: js.UndefOr[day | dayOfWeek | month | quarter | year | Double] = js.undefined
  /** Specifies the name of the field's group. */
  var groupName: js.UndefOr[String] = js.undefined
  /** Configures the field's header filter. */
  var headerFilter: js.UndefOr[AnonAllowSearch] = js.undefined
  /** Specifies whether the field should be treated as a measure (a field providing data for calculation). */
  var isMeasure: js.UndefOr[Boolean] = js.undefined
  /** Specifies the field's identifier. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies whether to calculate the running total by rows or by columns. */
  var runningTotal: js.UndefOr[column | row] = js.undefined
  /** Specifies a function that combines the field's values into groups for the headers. Cannot be used with an XmlaStore or remote operations. */
  var selector: js.UndefOr[js.Function] = js.undefined
  /** Specifies whether to display the field's grand totals. Applies only if the field is in the data area. */
  var showGrandTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the field's totals. */
  var showTotals: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to display the field's summary values. Applies only if the field is in the data area. Inherits the showTotals' value by default. */
  var showValues: js.UndefOr[Boolean] = js.undefined
  /** Specifies how the field's values in the headers should be sorted. */
  var sortBy: js.UndefOr[displayText | value | none] = js.undefined
  /** Sorts the field's values in the headers by the specified measure's summary values. Accepts the measure's name, caption, dataField, or index in the fields array. */
  var sortBySummaryField: js.UndefOr[String] = js.undefined
  /** Specifies a path to the column or row whose summary values should be used to sort the field's values in the headers. */
  var sortBySummaryPath: js.UndefOr[js.Array[Double | String]] = js.undefined
  /** Specifies the field values' sorting order. */
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  /** Specifies a custom comparison function that sorts the field's values in the headers. */
  var sortingMethod: js.UndefOr[js.Function2[/* a */ AnonChildren, /* b */ AnonChildren, Double]] = js.undefined
  /** Specifies a predefined post-processing function. Does not apply when the calculateSummaryValue option is set. */
  var summaryDisplayMode: js.UndefOr[
    absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation
  ] = js.undefined
  /** Specifies how to aggregate the field's data. Cannot be used with an XmlaStore. */
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  /** Specifies whether the field is visible in the pivot grid and field chooser. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the field's width in pixels when the field is displayed in the pivot grid. */
  var width: js.UndefOr[Double] = js.undefined
  /** Specifies whether text that does not fit into a header item should be wrapped. */
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
    areaIndex: Int | Double = null,
    calculateCustomSummary: /* options */ AnonSummaryProcess => _ = null,
    calculateSummaryValue: /* e */ dxPivotGridSummaryCell => Double = null,
    caption: String = null,
    customizeText: /* cellInfo */ AnonValue => String = null,
    dataField: String = null,
    dataType: date | number | string_ = null,
    displayFolder: String = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    filterType: exclude | include = null,
    filterValues: js.Array[_] = null,
    format: format = null,
    groupIndex: Int | Double = null,
    groupInterval: day | dayOfWeek | month | quarter | year | Double = null,
    groupName: String = null,
    headerFilter: AnonAllowSearch = null,
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
    sortingMethod: (/* a */ AnonChildren, /* b */ AnonChildren) => Double = null,
    summaryDisplayMode: absoluteVariation | percentOfColumnGrandTotal | percentOfColumnTotal | percentOfGrandTotal | percentOfRowGrandTotal | percentOfRowTotal | percentVariation = null,
    summaryType: avg | count | custom | max | min | sum | String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): PivotGridDataSourceField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCrossGroupCalculation)) __obj.updateDynamic("allowCrossGroupCalculation")(allowCrossGroupCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowExpandAll)) __obj.updateDynamic("allowExpandAll")(allowExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSortingBySummary)) __obj.updateDynamic("allowSortingBySummary")(allowSortingBySummary.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (areaIndex != null) __obj.updateDynamic("areaIndex")(areaIndex.asInstanceOf[js.Any])
    if (calculateCustomSummary != null) __obj.updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(calculateCustomSummary))
    if (calculateSummaryValue != null) __obj.updateDynamic("calculateSummaryValue")(js.Any.fromFunction1(calculateSummaryValue))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (displayFolder != null) __obj.updateDynamic("displayFolder")(displayFolder.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (filterValues != null) __obj.updateDynamic("filterValues")(filterValues.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(isMeasure)) __obj.updateDynamic("isMeasure")(isMeasure.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (runningTotal != null) __obj.updateDynamic("runningTotal")(runningTotal.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrandTotals)) __obj.updateDynamic("showGrandTotals")(showGrandTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(showValues)) __obj.updateDynamic("showValues")(showValues.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortBySummaryField != null) __obj.updateDynamic("sortBySummaryField")(sortBySummaryField.asInstanceOf[js.Any])
    if (sortBySummaryPath != null) __obj.updateDynamic("sortBySummaryPath")(sortBySummaryPath.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sortingMethod != null) __obj.updateDynamic("sortingMethod")(js.Any.fromFunction2(sortingMethod))
    if (summaryDisplayMode != null) __obj.updateDynamic("summaryDisplayMode")(summaryDisplayMode.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridDataSourceField]
  }
}

