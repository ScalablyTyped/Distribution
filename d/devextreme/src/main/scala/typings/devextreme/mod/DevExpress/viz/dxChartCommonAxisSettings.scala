package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.anon.Line
import typings.devextreme.anon.Shift
import typings.devextreme.mod.DevExpress.common.charts.DiscreteAxisDivisionMode
import typings.devextreme.mod.DevExpress.viz.dxChart.AggregatedPointsPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonAxisSettings extends StObject {
  
  /**
    * 
    */
  var aggregatedPointsPosition: js.UndefOr[AggregatedPointsPosition] = js.undefined
  
  /**
    * Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the scale breaks&apos; appearance.
    */
  var breakStyle: js.UndefOr[Line] = js.undefined
  
  /**
    * Specifies the color of the axis line.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the appearance of all constant lines in the UI component.
    */
  var constantLineStyle: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyle] = js.undefined
  
  /**
    * Specifies whether ticks and grid lines should cross axis labels or lie between them. Applies only to the axes of the &apos;discrete&apos; type.
    */
  var discreteAxisDivisionMode: js.UndefOr[DiscreteAxisDivisionMode] = js.undefined
  
  /**
    * Specifies whether to force the axis to start and end on ticks.
    */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the grid.
    */
  var grid: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Inverts the axis.
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures axis labels.
    */
  var label: js.UndefOr[dxChartCommonAxisSettingsLabel] = js.undefined
  
  /**
    * Controls the empty space between the maximum series points and the axis. Applies only to the axes of the &apos;continuous&apos; and &apos;logarithmic&apos; type.
    */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the empty space between the minimum series points and the axis. Applies only to the axes of the &apos;continuous&apos; and &apos;logarithmic&apos; type.
    */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the minor grid.
    */
  var minorGrid: js.UndefOr[ColorOpacity] = js.undefined
  
  /**
    * Configures the appearance of minor axis ticks.
    */
  var minorTick: js.UndefOr[Shift] = js.undefined
  
  /**
    * Specifies how transparent the axis line should be.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Reserves a pixel-measured space for the axis.
    */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the appearance of strips.
    */
  var stripStyle: js.UndefOr[dxChartCommonAxisSettingsStripStyle] = js.undefined
  
  /**
    * Configures the appearance of major axis ticks.
    */
  var tick: js.UndefOr[Shift] = js.undefined
  
  /**
    * Configures axis titles.
    */
  var title: js.UndefOr[dxChartCommonAxisSettingsTitle] = js.undefined
  
  /**
    * Adds an empty space between the axis and the minimum and maximum series points.
    */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Makes the axis line visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the axis line in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object dxChartCommonAxisSettings {
  
  inline def apply(): dxChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonAxisSettings] (val x: Self) extends AnyVal {
    
    inline def setAggregatedPointsPosition(value: AggregatedPointsPosition): Self = StObject.set(x, "aggregatedPointsPosition", value.asInstanceOf[js.Any])
    
    inline def setAggregatedPointsPositionUndefined: Self = StObject.set(x, "aggregatedPointsPosition", js.undefined)
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setBreakStyle(value: Line): Self = StObject.set(x, "breakStyle", value.asInstanceOf[js.Any])
    
    inline def setBreakStyleUndefined: Self = StObject.set(x, "breakStyle", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConstantLineStyle(value: dxChartCommonAxisSettingsConstantLineStyle): Self = StObject.set(x, "constantLineStyle", value.asInstanceOf[js.Any])
    
    inline def setConstantLineStyleUndefined: Self = StObject.set(x, "constantLineStyle", js.undefined)
    
    inline def setDiscreteAxisDivisionMode(value: DiscreteAxisDivisionMode): Self = StObject.set(x, "discreteAxisDivisionMode", value.asInstanceOf[js.Any])
    
    inline def setDiscreteAxisDivisionModeUndefined: Self = StObject.set(x, "discreteAxisDivisionMode", js.undefined)
    
    inline def setEndOnTick(value: Boolean): Self = StObject.set(x, "endOnTick", value.asInstanceOf[js.Any])
    
    inline def setEndOnTickUndefined: Self = StObject.set(x, "endOnTick", js.undefined)
    
    inline def setGrid(value: ColorOpacity): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setLabel(value: dxChartCommonAxisSettingsLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxValueMargin(value: Double): Self = StObject.set(x, "maxValueMargin", value.asInstanceOf[js.Any])
    
    inline def setMaxValueMarginUndefined: Self = StObject.set(x, "maxValueMargin", js.undefined)
    
    inline def setMinValueMargin(value: Double): Self = StObject.set(x, "minValueMargin", value.asInstanceOf[js.Any])
    
    inline def setMinValueMarginUndefined: Self = StObject.set(x, "minValueMargin", js.undefined)
    
    inline def setMinorGrid(value: ColorOpacity): Self = StObject.set(x, "minorGrid", value.asInstanceOf[js.Any])
    
    inline def setMinorGridUndefined: Self = StObject.set(x, "minorGrid", js.undefined)
    
    inline def setMinorTick(value: Shift): Self = StObject.set(x, "minorTick", value.asInstanceOf[js.Any])
    
    inline def setMinorTickUndefined: Self = StObject.set(x, "minorTick", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPlaceholderSize(value: Double): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderSizeUndefined: Self = StObject.set(x, "placeholderSize", js.undefined)
    
    inline def setStripStyle(value: dxChartCommonAxisSettingsStripStyle): Self = StObject.set(x, "stripStyle", value.asInstanceOf[js.Any])
    
    inline def setStripStyleUndefined: Self = StObject.set(x, "stripStyle", js.undefined)
    
    inline def setTick(value: Shift): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTitle(value: dxChartCommonAxisSettingsTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValueMarginsEnabled(value: Boolean): Self = StObject.set(x, "valueMarginsEnabled", value.asInstanceOf[js.Any])
    
    inline def setValueMarginsEnabledUndefined: Self = StObject.set(x, "valueMarginsEnabled", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
