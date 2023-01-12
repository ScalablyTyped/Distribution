package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `01` extends StObject {
  
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.0
    */
  var `0`: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-boxplot.markLine.data.1
    */
  var `1`: js.UndefOr[LineStyle] = js.undefined
}
object `01` {
  
  inline def apply(): `01` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`01`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `01`] (val x: Self) extends AnyVal {
    
    inline def set0(value: LineStyle): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    inline def set1(value: LineStyle): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
