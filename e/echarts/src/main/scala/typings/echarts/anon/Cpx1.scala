package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cpx1 extends StObject {
  
  /**
    * x of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx1
    */
  var cpx1: js.UndefOr[Double] = js.undefined
  
  /**
    * x of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx2
    */
  var cpx2: js.UndefOr[Double] = js.undefined
  
  /**
    * y of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy1
    */
  var cpy1: js.UndefOr[Double] = js.undefined
  
  /**
    * y of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy2
    */
  var cpy2: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.percent
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x1
    */
  var x1: js.UndefOr[Double] = js.undefined
  
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x2
    */
  var x2: js.UndefOr[Double] = js.undefined
  
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y1
    */
  var y1: js.UndefOr[Double] = js.undefined
  
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y2
    */
  var y2: js.UndefOr[Double] = js.undefined
}
object Cpx1 {
  
  @scala.inline
  def apply(): Cpx1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cpx1]
  }
  
  @scala.inline
  implicit class Cpx1MutableBuilder[Self <: Cpx1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpx1(value: Double): Self = StObject.set(x, "cpx1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpx1Undefined: Self = StObject.set(x, "cpx1", js.undefined)
    
    @scala.inline
    def setCpx2(value: Double): Self = StObject.set(x, "cpx2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpx2Undefined: Self = StObject.set(x, "cpx2", js.undefined)
    
    @scala.inline
    def setCpy1(value: Double): Self = StObject.set(x, "cpy1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpy1Undefined: Self = StObject.set(x, "cpy1", js.undefined)
    
    @scala.inline
    def setCpy2(value: Double): Self = StObject.set(x, "cpy2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpy2Undefined: Self = StObject.set(x, "cpy2", js.undefined)
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
