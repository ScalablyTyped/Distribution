package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.0
    */
  var `0`: js.UndefOr[ValueIndex] = js.undefined
  
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.1
    */
  var `1`: js.UndefOr[ValueIndex] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def set0(value: ValueIndex): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    inline def set1(value: ValueIndex): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
