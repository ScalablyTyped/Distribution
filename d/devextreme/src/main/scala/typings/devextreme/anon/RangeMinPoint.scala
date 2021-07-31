package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeMinPoint extends StObject {
  
  var rangeMaxPoint: js.UndefOr[String] = js.undefined
  
  var rangeMinPoint: js.UndefOr[String] = js.undefined
}
object RangeMinPoint {
  
  @scala.inline
  def apply(): RangeMinPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeMinPoint]
  }
  
  @scala.inline
  implicit class RangeMinPointMutableBuilder[Self <: RangeMinPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRangeMaxPoint(value: String): Self = StObject.set(x, "rangeMaxPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeMaxPointUndefined: Self = StObject.set(x, "rangeMaxPoint", js.undefined)
    
    @scala.inline
    def setRangeMinPoint(value: String): Self = StObject.set(x, "rangeMinPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeMinPointUndefined: Self = StObject.set(x, "rangeMinPoint", js.undefined)
  }
}
