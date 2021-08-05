package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurvenessShadowBlur extends StObject {
  
  /**
    * The color of the tree edge.
    *
    *
    * @default
    * ""#ccc""
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The curvature of the tree edge.
    *
    *
    * @default
    * 0.5
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.undefined
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-tree.tree.emphasis.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the tree edge.
    *
    *
    * @default
    * 1.5
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CurvenessShadowBlur {
  
  inline def apply(): CurvenessShadowBlur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurvenessShadowBlur]
  }
  
  extension [Self <: CurvenessShadowBlur](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCurveness(value: Double): Self = StObject.set(x, "curveness", value.asInstanceOf[js.Any])
    
    inline def setCurvenessUndefined: Self = StObject.set(x, "curveness", js.undefined)
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
