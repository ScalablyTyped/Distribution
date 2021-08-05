package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait D extends StObject {
  
  /**
    * Alias of
    * [pathData](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.d
    */
  var d: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    *
    * `layout` can be used to specify the transform strategy.
    *
    * Optional value:
    *
    * + `'center'`: Keep aspect ratio, put the path in
    * the center of the rect, expand as far as possible
    * but never overflow.
    * + `'cover'`: Transform the path according to the
    * aspect ratio of the rect, fill the rect and do not
    * overflow.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout
    */
  var layout: js.UndefOr[String] = js.undefined
  
  /**
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * .
    *
    * For example, `'M0,0 L0,-20 L30,-20 C42,-20 38,-1
    * 50,-1 L70,-1 L70,0 Z'`。
    *
    * If
    * [width](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width)
    * ,
    * [height](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.height)
    * ,
    * [x](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x)
    * and
    * [y](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y)
    * specified, `pathData` will be transformed to fit
    * the defined rect.
    * If they are not specified, do not do that.
    *
    * [layout](https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.layout)
    * can be used to specify the transform strategy.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.pathData
    */
  var pathData: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.width
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.x
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_path.shape.y
    */
  var y: js.UndefOr[Double] = js.undefined
}
object D {
  
  inline def apply(): D = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[D]
  }
  
  extension [Self <: D](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
    
    inline def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
