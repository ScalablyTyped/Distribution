package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cy extends StObject {
  
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.cx
    */
  var cx: js.UndefOr[Double] = js.undefined
  
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.cy
    */
  var cy: js.UndefOr[Double] = js.undefined
  
  /**
    * Outside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.r
    */
  var r: js.UndefOr[Double] = js.undefined
  
  /**
    * Inside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_ring.shape.r0
    */
  var r0: js.UndefOr[Double] = js.undefined
}
object Cy {
  
  @scala.inline
  def apply(): Cy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cy]
  }
  
  @scala.inline
  implicit class CyMutableBuilder[Self <: Cy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR0(value: Double): Self = StObject.set(x, "r0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR0Undefined: Self = StObject.set(x, "r0", js.undefined)
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
