package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ConnectorColor
import typings.devextreme.anon.EndAngle
import typings.devextreme.mod.DevExpress.common.charts.LabelOverlap
import typings.devextreme.mod.DevExpress.common.charts.Palette
import typings.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import typings.devextreme.mod.DevExpress.viz.dxBarGauge.TooltipHiddenEvent
import typings.devextreme.mod.DevExpress.viz.dxBarGauge.TooltipShownEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBarGaugeOptions
  extends StObject
     with BaseWidgetOptions[dxBarGauge] {
  
  /**
    * Specifies animation properties.
    */
  var animation: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies a color for the remaining segment of the bar&apos;s track.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a distance between bars in pixels.
    */
  var barSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a base value for bars.
    */
  var baseValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an end value for the gauge&apos;s invisible scale.
    */
  var endValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the shape of the gauge&apos;s arc.
    */
  var geometry: js.UndefOr[EndAngle] = js.undefined
  
  /**
    * Specifies the properties of the labels that accompany gauge bars.
    */
  var label: js.UndefOr[ConnectorColor] = js.undefined
  
  /**
    * Configures the legend.
    */
  var legend: js.UndefOr[dxBarGaugeLegend] = js.undefined
  
  /**
    * Configures the loading indicator.
    */
  @JSName("loadingIndicator")
  var loadingIndicator_dxBarGaugeOptions: js.UndefOr[dxBarGaugeLoadingIndicator] = js.undefined
  
  /**
    * A function that is executed when a tooltip becomes hidden.
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ TooltipHiddenEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip appears.
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ TooltipShownEvent, Unit]] = js.undefined
  
  /**
    * Sets the palette to be used for colorizing bars in the gauge.
    */
  var palette: js.UndefOr[js.Array[String] | Palette] = js.undefined
  
  /**
    * Specifies what to do with colors in the palette when their number is less than the number of bars in the gauge.
    */
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
  
  /**
    * Defines the radius of the bar that is closest to the center relatively to the radius of the topmost bar.
    */
  var relativeInnerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how the UI component should behave when bar labels overlap: hide certain labels or leave them overlapped.
    */
  var resolveLabelOverlapping: js.UndefOr[LabelOverlap] = js.undefined
  
  /**
    * Specifies a start value for the gauge&apos;s invisible scale.
    */
  var startValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_dxBarGaugeOptions: js.UndefOr[dxBarGaugeTooltip] = js.undefined
  
  /**
    * Specifies the array of values to be indicated on a bar gauge.
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object dxBarGaugeOptions {
  
  inline def apply(): dxBarGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxBarGaugeOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBarSpacing(value: Double): Self = StObject.set(x, "barSpacing", value.asInstanceOf[js.Any])
    
    inline def setBarSpacingUndefined: Self = StObject.set(x, "barSpacing", js.undefined)
    
    inline def setBaseValue(value: Double): Self = StObject.set(x, "baseValue", value.asInstanceOf[js.Any])
    
    inline def setBaseValueUndefined: Self = StObject.set(x, "baseValue", js.undefined)
    
    inline def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setGeometry(value: EndAngle): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setLabel(value: ConnectorColor): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLegend(value: dxBarGaugeLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setLoadingIndicator(value: dxBarGaugeLoadingIndicator): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setOnTooltipHidden(value: /* e */ TooltipHiddenEvent => Unit): Self = StObject.set(x, "onTooltipHidden", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHiddenUndefined: Self = StObject.set(x, "onTooltipHidden", js.undefined)
    
    inline def setOnTooltipShown(value: /* e */ TooltipShownEvent => Unit): Self = StObject.set(x, "onTooltipShown", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShownUndefined: Self = StObject.set(x, "onTooltipShown", js.undefined)
    
    inline def setPalette(value: js.Array[String] | Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setRelativeInnerRadius(value: Double): Self = StObject.set(x, "relativeInnerRadius", value.asInstanceOf[js.Any])
    
    inline def setRelativeInnerRadiusUndefined: Self = StObject.set(x, "relativeInnerRadius", js.undefined)
    
    inline def setResolveLabelOverlapping(value: LabelOverlap): Self = StObject.set(x, "resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    inline def setResolveLabelOverlappingUndefined: Self = StObject.set(x, "resolveLabelOverlapping", js.undefined)
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setTooltip(value: dxBarGaugeTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
