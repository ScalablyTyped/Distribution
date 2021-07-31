package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  /**
    * Fill color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-line.line.areaStyle)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.color
    */
  var color: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Origin position of area.
    *
    * By default, the area between axis line and data will be the
    * area to be filled.
    * This config enables you to fill data to the max or min of
    * the axis data.
    *
    * Valid values include: `'auto'` (default), `'start'`, `'end'`.
    *
    * + `'auto'` to fill between axis line to data;
    * + `'start'` to fill between min axis value (when not `inverse`)
    * to data;
    * + `'end'` to fill between max axis value (when not `inverse`)
    * to data;
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.origin
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line.areaStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowColor
    */
  var shadowColor: js.UndefOr[typings.echarts.echarts.EChartOption.Color] = js.undefined
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}
object Origin {
  
  @scala.inline
  def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  
  @scala.inline
  implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: typings.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
