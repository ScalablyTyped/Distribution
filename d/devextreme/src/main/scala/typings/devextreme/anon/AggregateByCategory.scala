package typings.devextreme.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateByCategory extends StObject {
  
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  var breakStyle: js.UndefOr[Line] = js.undefined
  
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  
  var categories: js.UndefOr[js.Array[Double | String | typings.std.Date]] = js.undefined
  
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  
  var endValue: js.UndefOr[Double | typings.std.Date | String] = js.undefined
  
  var holidays: js.UndefOr[js.Array[typings.std.Date | Double | String]] = js.undefined
  
  var label: js.UndefOr[OverlappingBehavior] = js.undefined
  
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  var marker: js.UndefOr[Label] = js.undefined
  
  var maxRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  
  var minRange: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  
  var minorTick: js.UndefOr[ColorOpacity] = js.undefined
  
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  
  var showCustomBoundaryTicks: js.UndefOr[Boolean] = js.undefined
  
  var singleWorkdays: js.UndefOr[js.Array[typings.std.Date | Double | String]] = js.undefined
  
  var startValue: js.UndefOr[Double | typings.std.Date | String] = js.undefined
  
  var tick: js.UndefOr[OpacityWidth] = js.undefined
  
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  
  var `type`: js.UndefOr[continuous | discrete | logarithmic | semidiscrete] = js.undefined
  
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  
  var workdaysOnly: js.UndefOr[Boolean] = js.undefined
}
object AggregateByCategory {
  
  inline def apply(): AggregateByCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateByCategory]
  }
  
  extension [Self <: AggregateByCategory](x: Self) {
    
    inline def setAggregateByCategory(value: Boolean): Self = StObject.set(x, "aggregateByCategory", value.asInstanceOf[js.Any])
    
    inline def setAggregateByCategoryUndefined: Self = StObject.set(x, "aggregateByCategory", js.undefined)
    
    inline def setAggregationGroupWidth(value: Double): Self = StObject.set(x, "aggregationGroupWidth", value.asInstanceOf[js.Any])
    
    inline def setAggregationGroupWidthUndefined: Self = StObject.set(x, "aggregationGroupWidth", js.undefined)
    
    inline def setAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setBreakStyle(value: Line): Self = StObject.set(x, "breakStyle", value.asInstanceOf[js.Any])
    
    inline def setBreakStyleUndefined: Self = StObject.set(x, "breakStyle", js.undefined)
    
    inline def setBreaks(value: js.Array[ScaleBreak]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ScaleBreak*): Self = StObject.set(x, "breaks", js.Array(value :_*))
    
    inline def setCategories(value: js.Array[Double | String | typings.std.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | typings.std.Date)*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    inline def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    inline def setEndValue(value: Double | typings.std.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setHolidays(value: js.Array[typings.std.Date | Double | String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: (typings.std.Date | Double | String)*): Self = StObject.set(x, "holidays", js.Array(value :_*))
    
    inline def setLabel(value: OverlappingBehavior): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMarker(value: Label): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMaxRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
    
    inline def setMaxRangeUndefined: Self = StObject.set(x, "maxRange", js.undefined)
    
    inline def setMinRange(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "minRange", value.asInstanceOf[js.Any])
    
    inline def setMinRangeUndefined: Self = StObject.set(x, "minRange", js.undefined)
    
    inline def setMinorTick(value: ColorOpacity): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setPlaceholderHeight(value: Double): Self = StObject.set(x, "placeholderHeight", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderHeightUndefined: Self = StObject.set(x, "placeholderHeight", js.undefined)
    
    inline def setShowCustomBoundaryTicks(value: Boolean): Self = StObject.set(x, "showCustomBoundaryTicks", value.asInstanceOf[js.Any])
    
    inline def setShowCustomBoundaryTicksUndefined: Self = StObject.set(x, "showCustomBoundaryTicks", js.undefined)
    
    inline def setSingleWorkdays(value: js.Array[typings.std.Date | Double | String]): Self = StObject.set(x, "singleWorkdays", value.asInstanceOf[js.Any])
    
    inline def setSingleWorkdaysUndefined: Self = StObject.set(x, "singleWorkdays", js.undefined)
    
    inline def setSingleWorkdaysVarargs(value: (typings.std.Date | Double | String)*): Self = StObject.set(x, "singleWorkdays", js.Array(value :_*))
    
    inline def setStartValue(value: Double | typings.std.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setTick(value: OpacityWidth): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: continuous | discrete | logarithmic | semidiscrete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueType(value: datetime | numeric | string_): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setWorkWeek(value: js.Array[Double]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
    
    inline def setWorkWeekVarargs(value: Double*): Self = StObject.set(x, "workWeek", js.Array(value :_*))
    
    inline def setWorkdaysOnly(value: Boolean): Self = StObject.set(x, "workdaysOnly", value.asInstanceOf[js.Any])
    
    inline def setWorkdaysOnlyUndefined: Self = StObject.set(x, "workdaysOnly", js.undefined)
  }
}
