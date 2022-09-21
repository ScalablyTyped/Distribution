package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markLine.data.0
    */
  var `0`: js.UndefOr[SymbolKeepAspect] = js.undefined
  
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markLine.data.1
    */
  var `1`: js.UndefOr[Label] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def set0(value: SymbolKeepAspect): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    inline def set1(value: Label): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
