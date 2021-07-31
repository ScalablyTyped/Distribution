package typings.echarts.anon

import typings.echarts.echarts.VisualMap.RangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InRange extends StObject {
  
  var inRange: js.UndefOr[RangeObject] = js.undefined
  
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
}
object InRange {
  
  @scala.inline
  def apply(): InRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InRange]
  }
  
  @scala.inline
  implicit class InRangeMutableBuilder[Self <: InRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInRange(value: RangeObject): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
    
    @scala.inline
    def setOutOfRange(value: RangeObject): Self = StObject.set(x, "outOfRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutOfRangeUndefined: Self = StObject.set(x, "outOfRange", js.undefined)
  }
}
