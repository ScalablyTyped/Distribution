package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor0 extends StObject {
  
  /**
    * Border color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Border color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor0
    */
  var borderColor0: js.UndefOr[String] = js.undefined
  
  /**
    * Border width of candlestick.
    * There is no border when it is `0`.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Fill color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Fill color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color0
    */
  var color0: js.UndefOr[String] = js.undefined
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}
object BorderColor0 {
  
  inline def apply(): BorderColor0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor0]
  }
  
  extension [Self <: BorderColor0](x: Self) {
    
    inline def setBorderColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor0(value: String): Self = StObject.set(x, "borderColor0", value.asInstanceOf[js.Any])
    
    inline def setBorderColor0Undefined: Self = StObject.set(x, "borderColor0", js.undefined)
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColor0(value: String): Self = StObject.set(x, "color0", value.asInstanceOf[js.Any])
    
    inline def setColor0Undefined: Self = StObject.set(x, "color0", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
