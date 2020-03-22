package typings.devextreme

import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.semidiscrete
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.viz.ScaleBreak
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregateByCategory extends js.Object {
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  var breakStyle: js.UndefOr[AnonLine] = js.undefined
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  var endValue: js.UndefOr[Double | Date | String] = js.undefined
  var holidays: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  var label: js.UndefOr[AnonOverlappingBehavior] = js.undefined
  var linearThreshold: js.UndefOr[Double] = js.undefined
  var logarithmBase: js.UndefOr[Double] = js.undefined
  var marker: js.UndefOr[AnonLabel] = js.undefined
  var maxRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  var minRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  var minorTick: js.UndefOr[AnonColorOpacity] = js.undefined
  var minorTickCount: js.UndefOr[Double] = js.undefined
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  var showCustomBoundaryTicks: js.UndefOr[Boolean] = js.undefined
  var singleWorkdays: js.UndefOr[js.Array[Date | Double | String]] = js.undefined
  var startValue: js.UndefOr[Double | Date | String] = js.undefined
  var tick: js.UndefOr[AnonOpacityWidth] = js.undefined
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  var `type`: js.UndefOr[continuous | discrete | logarithmic | semidiscrete] = js.undefined
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  var workdaysOnly: js.UndefOr[Boolean] = js.undefined
}

object AnonAggregateByCategory {
  @scala.inline
  def apply(
    aggregateByCategory: js.UndefOr[Boolean] = js.undefined,
    aggregationGroupWidth: Int | Double = null,
    aggregationInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    breakStyle: AnonLine = null,
    breaks: js.Array[ScaleBreak] = null,
    categories: js.Array[Double | String | Date] = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    endValue: Double | Date | String = null,
    holidays: js.Array[Date | Double | String] = null,
    label: AnonOverlappingBehavior = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    marker: AnonLabel = null,
    maxRange: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minRange: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorTick: AnonColorOpacity = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    placeholderHeight: Int | Double = null,
    showCustomBoundaryTicks: js.UndefOr[Boolean] = js.undefined,
    singleWorkdays: js.Array[Date | Double | String] = null,
    startValue: Double | Date | String = null,
    tick: AnonOpacityWidth = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    `type`: continuous | discrete | logarithmic | semidiscrete = null,
    valueType: datetime | numeric | string_ = null,
    workWeek: js.Array[Double] = null,
    workdaysOnly: js.UndefOr[Boolean] = js.undefined
  ): AnonAggregateByCategory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateByCategory)) __obj.updateDynamic("aggregateByCategory")(aggregateByCategory.asInstanceOf[js.Any])
    if (aggregationGroupWidth != null) __obj.updateDynamic("aggregationGroupWidth")(aggregationGroupWidth.asInstanceOf[js.Any])
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (maxRange != null) __obj.updateDynamic("maxRange")(maxRange.asInstanceOf[js.Any])
    if (minRange != null) __obj.updateDynamic("minRange")(minRange.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (placeholderHeight != null) __obj.updateDynamic("placeholderHeight")(placeholderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomBoundaryTicks)) __obj.updateDynamic("showCustomBoundaryTicks")(showCustomBoundaryTicks.asInstanceOf[js.Any])
    if (singleWorkdays != null) __obj.updateDynamic("singleWorkdays")(singleWorkdays.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(workdaysOnly)) __obj.updateDynamic("workdaysOnly")(workdaysOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregateByCategory]
  }
}

