package typings.gaugejs

import typings.gaugejs.anon.Color
import typings.gaugejs.anon.DivColor
import typings.gaugejs.anon.FontSize
import typings.gaugejs.anon.PointerOptionsiconPathstr
import typings.gaugejs.anon.StaticZoneOptionsheightnu
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gaugejs", "Gauge")
  @js.native
  open class Gauge protected ()
    extends StObject
       with BaseGauge {
    /**
      * Creates a new gauge renderer for the given canvas element.
      * @param canvas The canvas element to render to.
      */
    def this(canvas: HTMLCanvasElement) = this()
    
    /**
      * The max gauge value.
      */
    var maxValue: Double = js.native
    
    /**
      * Sets the current value of the gauge pointer.
      * @param value
      */
    def set(value: Double): Boolean = js.native
  }
  
  @js.native
  trait BaseGauge
    extends StObject
       with ValueUpdater {
    
    /**
      * Sets the minimum gauge value (prefer over gauge.minValue)
      * @param minValue
      */
    def setMinValue(minValue: Double): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Configure the gauge renderer with the given options.
      * @param options The configuration options for the gauge.
      */
    def setOptions(): this.type = js.native
    def setOptions(options: GaugeOptions): this.type = js.native
    
    /**
      * ?
      * @param textField
      */
    def setTextField(textField: TextRenderer): TextRenderer = js.native
    def setTextField(textField: TextRendererElement): TextRenderer = js.native
  }
  
  trait BaseOptions extends StObject {
    
    var angle: Double
    
    var colorStart: String
    
    var colorStop: String
    
    var generateGradient: Boolean
    
    var highDpiSupport: Boolean
    
    var limitMax: Boolean
    
    var limitMin: Boolean
    
    var lineWidth: Double
    
    var pointer: PointerOptions
    
    var radiusScale: Double
    
    var strokeColor: String
  }
  object BaseOptions {
    
    inline def apply(
      angle: Double,
      colorStart: String,
      colorStop: String,
      generateGradient: Boolean,
      highDpiSupport: Boolean,
      limitMax: Boolean,
      limitMin: Boolean,
      lineWidth: Double,
      pointer: PointerOptions,
      radiusScale: Double,
      strokeColor: String
    ): BaseOptions = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setColorStart(value: String): Self = StObject.set(x, "colorStart", value.asInstanceOf[js.Any])
      
      inline def setColorStop(value: String): Self = StObject.set(x, "colorStop", value.asInstanceOf[js.Any])
      
      inline def setGenerateGradient(value: Boolean): Self = StObject.set(x, "generateGradient", value.asInstanceOf[js.Any])
      
      inline def setHighDpiSupport(value: Boolean): Self = StObject.set(x, "highDpiSupport", value.asInstanceOf[js.Any])
      
      inline def setLimitMax(value: Boolean): Self = StObject.set(x, "limitMax", value.asInstanceOf[js.Any])
      
      inline def setLimitMin(value: Boolean): Self = StObject.set(x, "limitMin", value.asInstanceOf[js.Any])
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setPointer(value: PointerOptions): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setRadiusScale(value: Double): Self = StObject.set(x, "radiusScale", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait GaugeOptions
    extends StObject
       with BaseOptions {
    
    var percentColors: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.undefined
    
    @JSName("pointer")
    var pointer_GaugeOptions: PointerOptionsiconPathstr
    
    var renderTicks: js.UndefOr[DivColor] = js.undefined
    
    var staticLabels: js.UndefOr[Color] = js.undefined
    
    var staticZones: js.UndefOr[js.Array[StaticZoneOptions | StaticZoneOptionsheightnu]] = js.undefined
  }
  object GaugeOptions {
    
    inline def apply(
      angle: Double,
      colorStart: String,
      colorStop: String,
      generateGradient: Boolean,
      highDpiSupport: Boolean,
      limitMax: Boolean,
      limitMin: Boolean,
      lineWidth: Double,
      pointer: PointerOptionsiconPathstr,
      radiusScale: Double,
      strokeColor: String
    ): GaugeOptions = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorStart = colorStart.asInstanceOf[js.Any], colorStop = colorStop.asInstanceOf[js.Any], generateGradient = generateGradient.asInstanceOf[js.Any], highDpiSupport = highDpiSupport.asInstanceOf[js.Any], limitMax = limitMax.asInstanceOf[js.Any], limitMin = limitMin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], radiusScale = radiusScale.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeOptions]
    }
    
    extension [Self <: GaugeOptions](x: Self) {
      
      inline def setPercentColors(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "percentColors", value.asInstanceOf[js.Any])
      
      inline def setPercentColorsUndefined: Self = StObject.set(x, "percentColors", js.undefined)
      
      inline def setPercentColorsVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "percentColors", js.Array(value*))
      
      inline def setPointer(value: PointerOptionsiconPathstr): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setRenderTicks(value: DivColor): Self = StObject.set(x, "renderTicks", value.asInstanceOf[js.Any])
      
      inline def setRenderTicksUndefined: Self = StObject.set(x, "renderTicks", js.undefined)
      
      inline def setStaticLabels(value: Color): Self = StObject.set(x, "staticLabels", value.asInstanceOf[js.Any])
      
      inline def setStaticLabelsUndefined: Self = StObject.set(x, "staticLabels", js.undefined)
      
      inline def setStaticZones(value: js.Array[StaticZoneOptions | StaticZoneOptionsheightnu]): Self = StObject.set(x, "staticZones", value.asInstanceOf[js.Any])
      
      inline def setStaticZonesUndefined: Self = StObject.set(x, "staticZones", js.undefined)
      
      inline def setStaticZonesVarargs(value: (StaticZoneOptions | StaticZoneOptionsheightnu)*): Self = StObject.set(x, "staticZones", js.Array(value*))
    }
  }
  
  trait PointerOptions extends StObject {
    
    var color: String
    
    var length: Double
    
    var strokeWidth: Double
  }
  object PointerOptions {
    
    inline def apply(color: String, length: Double, strokeWidth: Double): PointerOptions = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerOptions]
    }
    
    extension [Self <: PointerOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait StaticZoneOptions extends StObject {
    
    var max: Double
    
    var min: Double
    
    var strokeStyle: String
  }
  object StaticZoneOptions {
    
    inline def apply(max: Double, min: Double, strokeStyle: String): StaticZoneOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticZoneOptions]
    }
    
    extension [Self <: StaticZoneOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextRenderer extends StObject {
    
    /* private */ def render(gauge: Gauge): String
  }
  object TextRenderer {
    
    inline def apply(render: Gauge => String): TextRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[TextRenderer]
    }
    
    extension [Self <: TextRenderer](x: Self) {
      
      inline def setRender(value: Gauge => String): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  trait TextRendererElement extends StObject {
    
    var innerHTML: String
    
    var style: FontSize
  }
  object TextRendererElement {
    
    inline def apply(innerHTML: String, style: FontSize): TextRendererElement = {
      val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextRendererElement]
    }
    
    extension [Self <: TextRendererElement](x: Self) {
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: FontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueUpdater extends StObject {
    
    /**
      * The animation speed of the gauge pointer (default is 32)
      */
    var animationSpeed: Double = js.native
    
    def update(): Boolean = js.native
    def update(force: Boolean): Boolean = js.native
  }
}
