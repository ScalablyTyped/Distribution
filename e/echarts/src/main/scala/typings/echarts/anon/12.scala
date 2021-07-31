package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  /**
    * Data of the starting point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine.data.0
    */
  var `0`: js.UndefOr[SymbolSize] = js.undefined
  
  /**
    * Data of the ending point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine.data.1
    */
  var `1`: js.UndefOr[SymbolSize] = js.undefined
}
object `12` {
  
  @scala.inline
  def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set0(value: SymbolSize): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    @scala.inline
    def set1(value: SymbolSize): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
