package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeWindow extends StObject {
  
  /**
    * End time of the time window (inclusive). If not specified, the current timestamp is used instead.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start time of the time window (exclusive).
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeWindow {
  
  inline def apply(): SchemaTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeWindow]
  }
  
  extension [Self <: SchemaTimeWindow](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
