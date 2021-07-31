package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureObject extends StObject {
  
  var aggregation: js.UndefOr[String] = js.undefined
  
  var uniqueName: String
}
object MeasureObject {
  
  @scala.inline
  def apply(uniqueName: String): MeasureObject = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureObject]
  }
  
  @scala.inline
  implicit class MeasureObjectMutableBuilder[Self <: MeasureObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
