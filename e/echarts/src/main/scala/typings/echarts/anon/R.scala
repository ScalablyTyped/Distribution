package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  /**
    * The height of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.height
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify border radius of the rectangular here.
    * Generally, `r` should be `[topLeftRadius, topRightRadius,
    * BottomRightRadius, bottomLeftRadius]`, where each
    * item is a number.
    *
    * Abbreviation is enabled, for example:
    *
    * + `r`: `1` means `[1, 1, 1, 1]`
    * + `r`: `[1]` means `[1, 1, 1, 1]`
    * + `r`: `[1, 2]` means `[1, 2, 1, 2]`
    * + `r`: `[1, 2, 3]` means `[1, 2, 3, 2]`
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.r
    */
  var r: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The width of the shape of the element.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.width
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * The x value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.x
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y value of the left-top corner of the element
    * in the coordinate system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_rect.shape.y
    */
  var y: js.UndefOr[Double] = js.undefined
}
object R {
  
  @scala.inline
  def apply(): R = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setR(value: js.Array[js.Any]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRVarargs(value: js.Any*): Self = StObject.set(x, "r", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
