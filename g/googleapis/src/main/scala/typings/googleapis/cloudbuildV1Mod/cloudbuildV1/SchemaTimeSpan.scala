package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSpan extends StObject {
  
  /**
    * End of time span.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start of time span.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeSpan {
  
  inline def apply(): SchemaTimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSpan]
  }
  
  extension [Self <: SchemaTimeSpan](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
