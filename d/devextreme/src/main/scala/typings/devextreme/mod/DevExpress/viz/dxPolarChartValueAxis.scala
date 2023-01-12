package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.AxisScaleType
import typings.devextreme.mod.DevExpress.common.charts.ChartsDataType
import typings.devextreme.mod.DevExpress.viz.dxPolarChart.ValueAxisVisualRangeUpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartValueAxis
  extends StObject
     with dxPolarChartCommonAxisSettings {
  
  /**
    * Specifies a coefficient for dividing the value axis.
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the order of categories on an axis of the &apos;discrete&apos; type.
    */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  
  /**
    * Defines an array of the value axis constant lines.
    */
  var constantLines: js.UndefOr[js.Array[dxPolarChartValueAxisConstantLines]] = js.undefined
  
  /**
    * Specifies properties for value axis labels.
    */
  @JSName("label")
  var label_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisLabel] = js.undefined
  
  /**
    * Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes.
    */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for a logarithmic axis.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a coefficient that determines the spacing between the maximum series point and the axis.
    */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a coefficient that determines the spacing between the minimum series point and the axis.
    */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum length of the visual range.
    */
  var minVisualRangeLength: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies the number of minor ticks between two neighboring major ticks.
    */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the interval between minor ticks.
    */
  var minorTickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * Specifies whether or not to indicate a zero value on the value axis.
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies properties for value axis strips.
    */
  var strips: js.UndefOr[js.Array[dxPolarChartValueAxisStrips]] = js.undefined
  
  /**
    * Specifies an interval between axis ticks/grid lines.
    */
  var tickInterval: js.UndefOr[VizTimeInterval] = js.undefined
  
  /**
    * An object defining the configuration properties for axis ticks.
    */
  @JSName("tick")
  var tick_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisTick] = js.undefined
  
  /**
    * Specifies the required type of the value axis.
    */
  var `type`: js.UndefOr[AxisScaleType] = js.undefined
  
  /**
    * Indicates whether to display series with indents from axis boundaries.
    */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the desired type of axis values.
    */
  var valueType: js.UndefOr[ChartsDataType] = js.undefined
  
  /**
    * Defines the axis&apos; displayed range. Cannot be wider than the wholeRange.
    */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  
  /**
    * Specifies how the axis&apos;s visual range should behave when the PolarChart data is updated.
    */
  var visualRangeUpdateMode: js.UndefOr[ValueAxisVisualRangeUpdateMode] = js.undefined
  
  /**
    * Defines the range where the axis can be zoomed.
    */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
}
object dxPolarChartValueAxis {
  
  inline def apply(): dxPolarChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartValueAxis] (val x: Self) extends AnyVal {
    
    inline def setAxisDivisionFactor(value: Double): Self = StObject.set(x, "axisDivisionFactor", value.asInstanceOf[js.Any])
    
    inline def setAxisDivisionFactorUndefined: Self = StObject.set(x, "axisDivisionFactor", js.undefined)
    
    inline def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setConstantLines(value: js.Array[dxPolarChartValueAxisConstantLines]): Self = StObject.set(x, "constantLines", value.asInstanceOf[js.Any])
    
    inline def setConstantLinesUndefined: Self = StObject.set(x, "constantLines", js.undefined)
    
    inline def setConstantLinesVarargs(value: dxPolarChartValueAxisConstantLines*): Self = StObject.set(x, "constantLines", js.Array(value*))
    
    inline def setLabel(value: dxPolarChartValueAxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMaxValueMargin(value: Double): Self = StObject.set(x, "maxValueMargin", value.asInstanceOf[js.Any])
    
    inline def setMaxValueMarginUndefined: Self = StObject.set(x, "maxValueMargin", js.undefined)
    
    inline def setMinValueMargin(value: Double): Self = StObject.set(x, "minValueMargin", value.asInstanceOf[js.Any])
    
    inline def setMinValueMarginUndefined: Self = StObject.set(x, "minValueMargin", js.undefined)
    
    inline def setMinVisualRangeLength(value: VizTimeInterval): Self = StObject.set(x, "minVisualRangeLength", value.asInstanceOf[js.Any])
    
    inline def setMinVisualRangeLengthUndefined: Self = StObject.set(x, "minVisualRangeLength", js.undefined)
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(value: VizTimeInterval): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setStrips(value: js.Array[dxPolarChartValueAxisStrips]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: dxPolarChartValueAxisStrips*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setTick(value: dxPolarChartValueAxisTick): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(value: VizTimeInterval): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setType(value: AxisScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueMarginsEnabled(value: Boolean): Self = StObject.set(x, "valueMarginsEnabled", value.asInstanceOf[js.Any])
    
    inline def setValueMarginsEnabledUndefined: Self = StObject.set(x, "valueMarginsEnabled", js.undefined)
    
    inline def setValueType(value: ChartsDataType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setVisualRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = StObject.set(x, "visualRange", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUndefined: Self = StObject.set(x, "visualRange", js.undefined)
    
    inline def setVisualRangeUpdateMode(value: ValueAxisVisualRangeUpdateMode): Self = StObject.set(x, "visualRangeUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUpdateModeUndefined: Self = StObject.set(x, "visualRangeUpdateMode", js.undefined)
    
    inline def setVisualRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "visualRange", js.Array(value*))
    
    inline def setWholeRange(value: VizRange | (js.Array[Double | String | js.Date])): Self = StObject.set(x, "wholeRange", value.asInstanceOf[js.Any])
    
    inline def setWholeRangeUndefined: Self = StObject.set(x, "wholeRange", js.undefined)
    
    inline def setWholeRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "wholeRange", js.Array(value*))
  }
}
