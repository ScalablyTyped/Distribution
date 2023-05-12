package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.common.charts.AxisScaleType
import typings.devextreme.mod.DevExpress.common.charts.ChartsDataType
import typings.devextreme.mod.DevExpress.common.charts.TimeIntervalConfig
import typings.devextreme.mod.DevExpress.common.charts.VisualRangeUpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxis
  extends StObject
     with dxChartCommonAxisSettings {
  
  /**
    * Enables auto-calculated scale breaks. Applies only if the axis&apos; type is &apos;continuous&apos; or &apos;logarithmic&apos; and valueType is &apos;numeric&apos;.
    */
  var autoBreaksEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the &apos;continuous&apos; and &apos;logarithmic&apos; types.
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * Declares a custom scale break collection. Applies only if the axis&apos; type is &apos;continuous&apos; or &apos;logarithmic&apos;.
    */
  var breaks: js.UndefOr[js.Array[typings.devextreme.mod.DevExpress.common.charts.ScaleBreak]] = js.undefined
  
  /**
    * Specifies the order of categories on an axis of the &apos;discrete&apos; type.
    */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  
  /**
    * Specifies the appearance of those constant lines that belong to the value axis.
    */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartValueAxis: js.UndefOr[dxChartValueAxisConstantLineStyle] = js.undefined
  
  /**
    * Declares a collection of constant lines belonging to the value axis.
    */
  var constantLines: js.UndefOr[js.Array[dxChartValueAxisConstantLines]] = js.undefined
  
  /**
    * Specifies the position of the value axis on the argument axis.
    */
  var customPosition: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Configures the labels of the value axis.
    */
  @JSName("label")
  var label_dxChartValueAxis: js.UndefOr[dxChartValueAxisLabel] = js.undefined
  
  /**
    * Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes.
    */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the value to be raised to a power when generating ticks for an axis of the &apos;logarithmic&apos; type.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets a limit on auto-calculated scale breaks. Custom scale breaks are not counted.
    */
  var maxAutoBreakCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the minimum length of the visual range.
    */
  var minVisualRangeLength: js.UndefOr[TimeIntervalConfig] = js.undefined
  
  /**
    * Specifies how many minor ticks to place between two neighboring major ticks.
    */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the interval between minor ticks. Applies only to continuous axes.
    */
  var minorTickInterval: js.UndefOr[TimeIntervalConfig] = js.undefined
  
  /**
    * Adds a pixel-measured empty space between two side-by-side value axes. Applies if several value axes are located on one side of the chart.
    */
  var multipleAxesSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the name of the value axis.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the shift in pixels of the value axis.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Binds the value axis to a pane.
    */
  var pane: js.UndefOr[String] = js.undefined
  
  /**
    * Relocates the value axis.
    */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
    * Specifies whether or not to show zero on the value axis.
    */
  var showZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Declares a collection of strips belonging to the value axis.
    */
  var strips: js.UndefOr[js.Array[dxChartValueAxisStrips]] = js.undefined
  
  /**
    * Synchronizes two or more value axes with each other at a specific value.
    */
  var synchronizedValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the interval between major ticks. Does not apply to discrete axes.
    */
  var tickInterval: js.UndefOr[TimeIntervalConfig] = js.undefined
  
  /**
    * Configures the axis title.
    */
  @JSName("title")
  var title_dxChartValueAxis: js.UndefOr[dxChartValueAxisTitle] = js.undefined
  
  /**
    * Specifies the type of the value axis.
    */
  var `type`: js.UndefOr[AxisScaleType] = js.undefined
  
  /**
    * Casts values to a specified data type.
    */
  var valueType: js.UndefOr[ChartsDataType] = js.undefined
  
  /**
    * Defines the axis&apos; displayed range. Cannot be wider than the wholeRange.
    */
  var visualRange: js.UndefOr[
    typings.devextreme.mod.DevExpress.common.charts.VisualRange | (js.Array[Double | String | js.Date])
  ] = js.undefined
  
  /**
    * Specifies how the axis&apos;s visual range should behave when chart data is updated.
    */
  var visualRangeUpdateMode: js.UndefOr[VisualRangeUpdateMode] = js.undefined
  
  /**
    * Defines the range where the axis can be zoomed and panned.
    */
  var wholeRange: js.UndefOr[
    typings.devextreme.mod.DevExpress.common.charts.VisualRange | (js.Array[Double | String | js.Date])
  ] = js.undefined
}
object dxChartValueAxis {
  
  inline def apply(): dxChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartValueAxis] (val x: Self) extends AnyVal {
    
    inline def setAutoBreaksEnabled(value: Boolean): Self = StObject.set(x, "autoBreaksEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoBreaksEnabledUndefined: Self = StObject.set(x, "autoBreaksEnabled", js.undefined)
    
    inline def setAxisDivisionFactor(value: Double): Self = StObject.set(x, "axisDivisionFactor", value.asInstanceOf[js.Any])
    
    inline def setAxisDivisionFactorUndefined: Self = StObject.set(x, "axisDivisionFactor", js.undefined)
    
    inline def setBreaks(value: js.Array[typings.devextreme.mod.DevExpress.common.charts.ScaleBreak]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: typings.devextreme.mod.DevExpress.common.charts.ScaleBreak*): Self = StObject.set(x, "breaks", js.Array(value*))
    
    inline def setCategories(value: js.Array[Double | String | js.Date]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setConstantLineStyle(value: dxChartValueAxisConstantLineStyle): Self = StObject.set(x, "constantLineStyle", value.asInstanceOf[js.Any])
    
    inline def setConstantLineStyleUndefined: Self = StObject.set(x, "constantLineStyle", js.undefined)
    
    inline def setConstantLines(value: js.Array[dxChartValueAxisConstantLines]): Self = StObject.set(x, "constantLines", value.asInstanceOf[js.Any])
    
    inline def setConstantLinesUndefined: Self = StObject.set(x, "constantLines", js.undefined)
    
    inline def setConstantLinesVarargs(value: dxChartValueAxisConstantLines*): Self = StObject.set(x, "constantLines", js.Array(value*))
    
    inline def setCustomPosition(value: Double | js.Date | String): Self = StObject.set(x, "customPosition", value.asInstanceOf[js.Any])
    
    inline def setCustomPositionUndefined: Self = StObject.set(x, "customPosition", js.undefined)
    
    inline def setLabel(value: dxChartValueAxisLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLinearThreshold(value: Double): Self = StObject.set(x, "linearThreshold", value.asInstanceOf[js.Any])
    
    inline def setLinearThresholdUndefined: Self = StObject.set(x, "linearThreshold", js.undefined)
    
    inline def setLogarithmBase(value: Double): Self = StObject.set(x, "logarithmBase", value.asInstanceOf[js.Any])
    
    inline def setLogarithmBaseUndefined: Self = StObject.set(x, "logarithmBase", js.undefined)
    
    inline def setMaxAutoBreakCount(value: Double): Self = StObject.set(x, "maxAutoBreakCount", value.asInstanceOf[js.Any])
    
    inline def setMaxAutoBreakCountUndefined: Self = StObject.set(x, "maxAutoBreakCount", js.undefined)
    
    inline def setMinVisualRangeLength(value: TimeIntervalConfig): Self = StObject.set(x, "minVisualRangeLength", value.asInstanceOf[js.Any])
    
    inline def setMinVisualRangeLengthUndefined: Self = StObject.set(x, "minVisualRangeLength", js.undefined)
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTickInterval(value: TimeIntervalConfig): Self = StObject.set(x, "minorTickInterval", value.asInstanceOf[js.Any])
    
    inline def setMinorTickIntervalUndefined: Self = StObject.set(x, "minorTickInterval", js.undefined)
    
    inline def setMultipleAxesSpacing(value: Double): Self = StObject.set(x, "multipleAxesSpacing", value.asInstanceOf[js.Any])
    
    inline def setMultipleAxesSpacingUndefined: Self = StObject.set(x, "multipleAxesSpacing", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
    
    inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
    
    inline def setStrips(value: js.Array[dxChartValueAxisStrips]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: dxChartValueAxisStrips*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setSynchronizedValue(value: Double): Self = StObject.set(x, "synchronizedValue", value.asInstanceOf[js.Any])
    
    inline def setSynchronizedValueUndefined: Self = StObject.set(x, "synchronizedValue", js.undefined)
    
    inline def setTickInterval(value: TimeIntervalConfig): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
    
    inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    
    inline def setTitle(value: dxChartValueAxisTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: AxisScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueType(value: ChartsDataType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setVisualRange(
      value: typings.devextreme.mod.DevExpress.common.charts.VisualRange | (js.Array[Double | String | js.Date])
    ): Self = StObject.set(x, "visualRange", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUndefined: Self = StObject.set(x, "visualRange", js.undefined)
    
    inline def setVisualRangeUpdateMode(value: VisualRangeUpdateMode): Self = StObject.set(x, "visualRangeUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setVisualRangeUpdateModeUndefined: Self = StObject.set(x, "visualRangeUpdateMode", js.undefined)
    
    inline def setVisualRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "visualRange", js.Array(value*))
    
    inline def setWholeRange(
      value: typings.devextreme.mod.DevExpress.common.charts.VisualRange | (js.Array[Double | String | js.Date])
    ): Self = StObject.set(x, "wholeRange", value.asInstanceOf[js.Any])
    
    inline def setWholeRangeUndefined: Self = StObject.set(x, "wholeRange", js.undefined)
    
    inline def setWholeRangeVarargs(value: (Double | String | js.Date)*): Self = StObject.set(x, "wholeRange", js.Array(value*))
  }
}
