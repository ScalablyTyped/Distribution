package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  /**
    * Specify the left-top point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.0
    */
  var `0`: js.UndefOr[Name] = js.undefined
  
  /**
    * Specify the right-bottom point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1
    */
  var `1`: js.UndefOr[Name] = js.undefined
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set0(value: Name): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Undefined: Self = StObject.set(x, "0", js.undefined)
    
    @scala.inline
    def set1(value: Name): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Undefined: Self = StObject.set(x, "1", js.undefined)
  }
}
