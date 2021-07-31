package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarBorderWidth extends StObject {
  
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.undefined
  
  /**
    * The bodrder width of bar.
    * defaults to have no border.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Bar color..
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar.data.emphasis.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}
object BarBorderWidth {
  
  @scala.inline
  def apply(): BarBorderWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarBorderWidth]
  }
  
  @scala.inline
  implicit class BarBorderWidthMutableBuilder[Self <: BarBorderWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarBorderColor(value: String): Self = StObject.set(x, "barBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBorderColorUndefined: Self = StObject.set(x, "barBorderColor", js.undefined)
    
    @scala.inline
    def setBarBorderWidth(value: Double): Self = StObject.set(x, "barBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBorderWidthUndefined: Self = StObject.set(x, "barBorderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
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
