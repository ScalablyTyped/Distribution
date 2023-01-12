package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.common.charts.ArgumentAxisHoverMode
import typings.devextreme.mod.DevExpress.common.charts.AxisScaleType
import typings.devextreme.mod.DevExpress.common.charts.ChartsDataType
import typings.devextreme.mod.DevExpress.common.charts.VisualRangeUpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxis
  extends StObject
     with dxChartCommonAxisSettings {
  
  /**
    * Aggregates series points that fall into the same category.
    */
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the length of aggregation intervals in pixels. Does not apply if aggregateByCategory is true. May be ignored in favor of the aggregationInterval property.
    */
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the length of aggregation intervals in axis units. Applies only to axes of continuous and logarithmic types.
    */
  var aggregationInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Casts arguments to a specified data type.
    */
  var argumentType: js.UndefOr[ChartsDataType] = js.undefined
  
  /**
    * Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the &apos;continuous&apos; and &apos;logarithmic&apos; types.
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Declares a scale break collection. Applies only if the axis&apos; type is &apos;continuous&apos; or &apos;logarithmic&apos;.
    */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  
  /**
    * Specifies the order of categories on an axis of the &apos;discrete&apos; type.
    */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  
  /**
    * Specifies the appearance of those constant lines that belong to the argument axis.
    */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisConstantLineStyle] = js.undefined
  
  /**
    * Declares a collection of constant lines belonging to the argument axis.
    */
  var constantLines: js.UndefOr[js.Array[dxChartArgumentAxisConstantLines]] = js.undefined
  
  /**
    * Specifies the position of the argument axis on the value axis.
    */
  var customPosition: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Specifies the name of a value axis on which the argument axis should be positioned. Applies only to multi-axis charts.
    */
  var customPositionAxis: js.UndefOr[String] = js.undefined
  
  /**
    * Dates to be excluded from the axis when workdaysOnly is true.
    */
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  
  /**
    * Specifies chart elements to be highlighted when a user points to an axis label.
    */
  var hoverMode: js.UndefOr[ArgumentAxisHoverMode] = js.undefined
  
  /**
    * Configures the labels of the argument axis.
    */
  @JSName("label")
  var label_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisLabel] = js.undefined
  
  /**
    * Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes.
    */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for an axis of the &apos;logarithmic&apos; type.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum length of the visual range.
    */
  var minVisualRangeLength: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies how many minor ticks to place between two neighboring major ticks.
    */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the interval between minor ticks. Applies only to the axes of the &apos;continuous&apos; type.
    */
  var minorTickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the shift in pixels of the argument axis.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Relocates the argument axis.
    */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
    * Dates to be included on the axis when workdaysOnly is true.
    */
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  
  /**
    * Declares a collection of strips belonging to the argument axis.
    */
  var strips: js.UndefOr[js.Array[dxChartArgumentAxisStrips]] = js.undefined
  
  /**
    * Specifies the interval between major ticks.
    */
  var tickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Configures the axis title.
    */
  @JSName("title")
  var title_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisTitle] = js.undefined
  
  /**
    * Specifies the type of the argument axis.
    */
  var `type`: js.UndefOr[AxisScaleType] = js.undefined
  
  /**
    * Defines the axis&apos; displayed range. Cannot be wider than the wholeRange.
    */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  
  /**
    * Specifies how the axis&apos;s visual range should behave when chart data is updated.
    */
  var visualRangeUpdateMode: js.UndefOr[VisualRangeUpdateMode] = js.undefined
  
  /**
    * Defines the range where the axis can be zoomed and panned.
    */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  
  /**
    * Specifies which days are workdays. The array can contain values from 0 (Sunday) to 6 (Saturday). Applies only if workdaysOnly is true.
    */
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Leaves only workdays on the axis: the work week days plus single workdays minus holidays. Applies only if the axis&apos; argumentType is &apos;datetime&apos;.
    */
  var workdaysOnly: js.UndefOr[Boolean] = js.undefined
}
object dxChartArgumentAxis {
  
  inline def apply(): dxChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartArgumentAxis] (val x: Self) extends AnyVal {
    
    inline def setAggregateByCategory(value: Boolean): Self = StObject.set(x, "aggregateByCategory", value.asInstanceOf[js.Any])
    
    inline def setAggregateByCategoryUndefined: Self = StObject.set(x, "aggregateByCategory", js.undefined)
    
    inline def setAggregationGroupWidth(value: Double): Self = StObject.set(x, "aggregationGroupWidth", value.asInstanceOf[js.Any])
    
    inline def setAggregationGroupWidthUndefined: Self = StObject.set(x, "aggregationGroupWidth", js.undefined)
    
    inline def setAggregationInterval(value: VizTimeInterval): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setArgumentType(value: ChartsDataType): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setArgumentTypeUndefined: Self = StObject.set(x, "argumentType", js.undefined)
    
    inline def setAxisDivisionFactor(value: Double): Self = StObject.set(x, "axisDivisionFactor", value.asInstanceOf[js.Any])
    
    inline def setAxisDivisionFactorUndefined: Self = StObject.set(x, "axisDivisionFactor", js.undefined)
    
    inline def setBreaks(value: js.Array[ScaleBreak]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ScaleBreak*): Self = StObject.set(x, "breaks", js.Array(value*))
    
    inline def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setConstantLineStyle(value: dxChartArgumentAxisConstantLineStyle): Self = StObject.set(x, "constantLineStyle", value.asInstanceOf[js.Any])
    
    inline def setConstantLineStyleUndefined: Self = StObject.set(x, "constantLineStyle", js.undefined)
    
    inline def setConstantLines(value: js.Array[dxChartArgumentAxisConstantLines]): Self = StObject.set(x, "constantLines", value.asInstanceOf[js.Any])
    
    inline def setConstantLinesUndefined: Self = StObject.set(x, "constantLines", js.undefined)
    
    inline def setConstantLinesVarargs(value: dxChartArgumentAxisConstantLines*): Self = StObject.set(x, "constantLines", js.Array(value*))
    
    inline def setCustomPosition(value: Double | js.Date | String): Self = StObject.set(x, "customPosition", value.asInstanceOf[js.Any])
    
    inline def setCustomPositionAxis(value: String): Self = StObject.set(x, "customPositionAxis", value.asInstanceOf[js.Any])
    
    inline def setCustomPositionAxisUndefined: Self = StObject.set(x, "customPositionAxis", js.undefined)
    
    inline def setCustomPositionUndefined: Self = StObject.set(x, "customPosition", js.undefined)
    
    inline def setHolidays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
    
    inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
    
    inline def setHolidaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "holidays", js.Array(value*))
    
    inline def setHoverMode(value: ArgumentAxisHoverMode): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setLabel(value: dxChartArgumentAxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMinVisualRangeLength(value: VizTimeInterval): Self = StObject.set(x, "minVisualRangeLength", value.asInstanceOf[js.Any])
    
    inline def setMinVisualRangeLengthUndefined: Self = StObject.set(x, "minVisualRangeLength", js.undefined)
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(value: VizTimeInterval): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSingleWorkdays(value: js.Array[js.Date | Double | String]): Self = StObject.set(x, "singleWorkdays", value.asInstanceOf[js.Any])
    
    inline def setSingleWorkdaysUndefined: Self = StObject.set(x, "singleWorkdays", js.undefined)
    
    inline def setSingleWorkdaysVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "singleWorkdays", js.Array(value*))
    
    inline def setStrips(value: js.Array[dxChartArgumentAxisStrips]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: dxChartArgumentAxisStrips*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setTickInterval(value: VizTimeInterval): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTitle(value: dxChartArgumentAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: AxisScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisualRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = StObject.set(x, "visualRange", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUndefined: Self = StObject.set(x, "visualRange", js.undefined)
    
    inline def setVisualRangeUpdateMode(value: VisualRangeUpdateMode): Self = StObject.set(x, "visualRangeUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUpdateModeUndefined: Self = StObject.set(x, "visualRangeUpdateMode", js.undefined)
    
    inline def setVisualRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "visualRange", js.Array(value*))
    
    inline def setWholeRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = StObject.set(x, "wholeRange", value.asInstanceOf[js.Any])
    
    inline def setWholeRangeUndefined: Self = StObject.set(x, "wholeRange", js.undefined)
    
    inline def setWholeRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "wholeRange", js.Array(value*))
    
    inline def setWorkWeek(value: js.Array[Double]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
    
    inline def setWorkWeekVarargs(value: Double*): Self = StObject.set(x, "workWeek", js.Array(value*))
    
    inline def setWorkdaysOnly(value: Boolean): Self = StObject.set(x, "workdaysOnly", value.asInstanceOf[js.Any])
    
    inline def setWorkdaysOnlyUndefined: Self = StObject.set(x, "workdaysOnly", js.undefined)
  }
}
