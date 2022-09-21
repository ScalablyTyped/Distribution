package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFutureReservationTimeWindow extends StObject {
  
  var duration: js.UndefOr[SchemaDuration] = js.undefined
  
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start time of the Future Reservation. The start_time is an RFC3339 string.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFutureReservationTimeWindow {
  
  inline def apply(): SchemaFutureReservationTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFutureReservationTimeWindow]
  }
  
  extension [Self <: SchemaFutureReservationTimeWindow](x: Self) {
    
    inline def setDuration(value: SchemaDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
