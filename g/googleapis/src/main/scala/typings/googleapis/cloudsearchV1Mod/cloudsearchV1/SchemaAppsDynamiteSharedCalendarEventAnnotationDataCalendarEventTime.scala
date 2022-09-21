package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime extends StObject {
  
  /**
    * All day event.
    */
  var allDay: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Non all day event.
    */
  var timed: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime {
  
  inline def apply(): SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime](x: Self) {
    
    inline def setAllDay(value: SchemaDate): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setTimed(value: String): Self = StObject.set(x, "timed", value.asInstanceOf[js.Any])
    
    inline def setTimedNull: Self = StObject.set(x, "timed", null)
    
    inline def setTimedUndefined: Self = StObject.set(x, "timed", js.undefined)
  }
}
