package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emphasis extends StObject {
  
  /**
    * border color, whose format is similar to that
    * of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.undefined
  
  /**
    * border width.
    * No border when it is set to be 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.color
    */
  var color: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[BorderType] = js.undefined
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}
object Emphasis {
  
  inline def apply(): Emphasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emphasis]
  }
  
  extension [Self <: Emphasis](x: Self) {
    
    inline def setBorderColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderType(value: String): Self = StObject.set(x, "borderType", value.asInstanceOf[js.Any])
    
    inline def setBorderTypeUndefined: Self = StObject.set(x, "borderType", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEmphasis(value: BorderType): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
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
