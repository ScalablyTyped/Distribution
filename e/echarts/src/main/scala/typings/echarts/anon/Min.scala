package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  /**
    * Maximum scaling
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit.max
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum scaling
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit.min
    */
  var min: js.UndefOr[Double] = js.undefined
}
object Min {
  
  inline def apply(): Min = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Min]
  }
  
  extension [Self <: Min](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
