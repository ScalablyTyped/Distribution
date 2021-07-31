package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clockwise extends StObject {
  
  /**
    * Whether draw clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cx
    */
  var cx: js.UndefOr[Double] = js.undefined
  
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cy
    */
  var cy: js.UndefOr[Double] = js.undefined
  
  /**
    * end anble, in radian.
    *
    *
    * @default
    * "Math.PI * 2"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * Outside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r
    */
  var r: js.UndefOr[Double] = js.undefined
  
  /**
    * Inside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r0
    */
  var r0: js.UndefOr[Double] = js.undefined
  
  /**
    * start angle, in radian.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}
object Clockwise {
  
  @scala.inline
  def apply(): Clockwise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clockwise]
  }
  
  @scala.inline
  implicit class ClockwiseMutableBuilder[Self <: Clockwise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR0(value: Double): Self = StObject.set(x, "r0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR0Undefined: Self = StObject.set(x, "r0", js.undefined)
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
