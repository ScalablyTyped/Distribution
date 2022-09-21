package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimedCount extends StObject {
  
  /**
    * Approximate number of occurrences in the given time period.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End of the time period to which `count` refers (excluded).
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start of the time period to which `count` refers (included).
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimedCount {
  
  inline def apply(): SchemaTimedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimedCount]
  }
  
  extension [Self <: SchemaTimedCount](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
