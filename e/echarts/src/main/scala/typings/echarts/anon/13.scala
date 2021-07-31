package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.0
    */
  var `0`: js.UndefOr[ValueDim] = js.undefined
  
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea.data.1
    */
  var `1`: js.UndefOr[ValueDim] = js.undefined
}
object `13` {
  
  @scala.inline
  def apply(): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set0(value: ValueDim): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    @scala.inline
    def set1(value: ValueDim): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
