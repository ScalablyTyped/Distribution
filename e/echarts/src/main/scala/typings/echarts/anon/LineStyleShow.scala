package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineStyleShow extends StObject {
  
  /**
    * The style of the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.lineStyle
    */
  var lineStyle: js.UndefOr[Width] = js.undefined
  
  /**
    * Whether to show the axis line of gauge chart.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object LineStyleShow {
  
  @scala.inline
  def apply(): LineStyleShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyleShow]
  }
  
  @scala.inline
  implicit class LineStyleShowMutableBuilder[Self <: LineStyleShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineStyle(value: Width): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
