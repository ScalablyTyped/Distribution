package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureObject extends StObject {
  
  var aggregation: js.UndefOr[String] = js.undefined
  
  var uniqueName: String
}
object MeasureObject {
  
  inline def apply(uniqueName: String): MeasureObject = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureObject] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
