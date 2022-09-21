package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.ChartsDataType
import typings.devextreme.mod.DevExpress.common.charts.DiscreteAxisDivisionMode
import typings.devextreme.mod.DevExpress.viz.ScaleBreak
import typings.devextreme.mod.DevExpress.viz.VizTimeInterval
import typings.devextreme.mod.DevExpress.viz.dxRangeSelector.AxisScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateByCategory extends StObject {
  
  /**
    * Aggregates series points that fall into the same category.
    */
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the length of aggregation intervals in pixels. Does not apply if aggregateByCategory is true. May be ignored in favor of the aggregationInterval property.
    */
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the length of aggregation intervals in scale units. Applies only to the scale of the continuous or logarithmic type.
    */
  var aggregationInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies whether to allow decimal values on the scale. When false, the scale contains integer values only.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the scale breaks&apos; appearance.
    */
  var breakStyle: js.UndefOr[Line] = js.undefined
  
  /**
    * Declares a scale break collection. Applies only if the scale&apos;s type is &apos;continuous&apos; or &apos;logarithmic&apos;.
    */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  
  /**
    * Specifies the order of arguments on a discrete scale.
    */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  
  /**
    * 
    */
  var discreteAxisDivisionMode: js.UndefOr[DiscreteAxisDivisionMode] = js.undefined
  
  /**
    * Specifies whether to force the scale to start and end on ticks.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the scale&apos;s end value.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Days to be excluded from the scale when workdaysOnly is true.
    */
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  
  /**
    * Specifies common properties for scale labels.
    */
  var label: js.UndefOr[OverlappingBehavior] = js.undefined
  
  /**
    * Specifies a value used to calculate the range on a logarithmic scale within which the scale should be linear. Applies only if the data source contains negative values or zeroes.
    */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for a logarithmic scale.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies properties for the date-time scale&apos;s markers.
    */
  var marker: js.UndefOr[SeparatorHeight] = js.undefined
  
  /**
    * Specifies the maximum range that can be selected.
    */
  var maxRange: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the minimum range that can be selected.
    */
  var minRange: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies properties of the range selector&apos;s minor ticks.
    */
  var minorTick: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Specifies the number of minor ticks between neighboring major ticks.
    */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an interval between minor ticks.
    */
  var minorTickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the height of the space reserved for the scale in pixels.
    */
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not to show ticks for the boundary scale values, when neither major ticks nor minor ticks are created for these values.
    */
  var showCustomBoundaryTicks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Days to be included in the scale when workdaysOnly is true.
    */
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  
  /**
    * Specifies the scale&apos;s start value.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Specifies properties defining the appearance of scale ticks.
    */
  var tick: js.UndefOr[OpacityWidth] = js.undefined
  
  /**
    * Specifies an interval between axis ticks.
    */
  var tickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the type of the scale.
    */
  var `type`: js.UndefOr[AxisScale] = js.undefined
  
  /**
    * Specifies the type of values on the scale.
    */
  var valueType: js.UndefOr[ChartsDataType] = js.undefined
  
  /**
    * Specifies which days are workdays. The array can contain values from 0 (Sunday) to 6 (Saturday). Applies only if workdaysOnly is true.
    */
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Leaves only workdays on the scale: the work week days plus single workdays minus holidays. Applies only if the scale&apos;s valueType is &apos;datetime&apos;.
    */
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
    
    inline def setAggregationInterval(value: VizTimeInterval): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setBreakStyle(value: Line): Self = StObject.set(x, "breakStyle", value.asInstanceOf[js.Any])
    
    inline def setBreakStyleUndefined: Self = StObject.set(x, "breakStyle", js.undefined)
    
    inline def setBreaks(value: js.Array[ScaleBreak]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ScaleBreak*): Self = StObject.set(x, "breaks", js.Array(value*))
    
    inline def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDiscreteAxisDivisionMode(value: DiscreteAxisDivisionMode): Self = StObject.set(x, "discreteAxisDivisionMode", value.asInstanceOf[js.Any])
    
    inline def setDiscreteAxisDivisionModeUndefined: Self = StObject.set(x, "discreteAxisDivisionMode", js.undefined)
    
    inline def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    inline def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setHolidays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "holidays", js.Array(value*))
    
    inline def setLabel(value: OverlappingBehavior): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMarker(value: SeparatorHeight): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMaxRange(value: VizTimeInterval): Self = StObject.set(x, "maxRange", value.asInstanceOf[js.Any])
    
    inline def setMaxRangeUndefined: Self = StObject.set(x, "maxRange", js.undefined)
    
    inline def setMinRange(value: VizTimeInterval): Self = StObject.set(x, "minRange", value.asInstanceOf[js.Any])
    
    inline def setMinRangeUndefined: Self = StObject.set(x, "minRange", js.undefined)
    
    inline def setMinorTick(value: ColorOpacity): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(value: VizTimeInterval): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setPlaceholderHeight(value: Double): Self = StObject.set(x, "placeholderHeight", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderHeightUndefined: Self = StObject.set(x, "placeholderHeight", js.undefined)
    
    inline def setShowCustomBoundaryTicks(value: Boolean): Self = StObject.set(x, "showCustomBoundaryTicks", value.asInstanceOf[js.Any])
    
    inline def setShowCustomBoundaryTicksUndefined: Self = StObject.set(x, "showCustomBoundaryTicks", js.undefined)
    
    inline def setSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "singleWorkdays", value.asInstanceOf[js.Any])
    
    inline def setSingleWorkdaysUndefined: Self = StObject.set(x, "singleWorkdays", js.undefined)
    
    inline def setSingleWorkdaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "singleWorkdays", js.Array(value*))
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setTick(value: OpacityWidth): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(value: VizTimeInterval): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: AxisScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueType(value: ChartsDataType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setWorkWeek(value: js.Array[Double]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
    
    inline def setWorkWeekVarargs(value: Double*): Self = StObject.set(x, "workWeek", js.Array(value*))
    
    inline def setWorkdaysOnly(value: Boolean): Self = StObject.set(x, "workdaysOnly", value.asInstanceOf[js.Any])
    
    inline def setWorkdaysOnlyUndefined: Self = StObject.set(x, "workdaysOnly", js.undefined)
  }
}
