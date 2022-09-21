package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent extends StObject {
  
  /**
    * The end time of the event.
    */
  var endTime: js.UndefOr[SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime] = js.undefined
  
  /**
    * ID of the event.
    */
  var eventId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of the event.
    */
  var startTime: js.UndefOr[SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime] = js.undefined
  
  /**
    * Title of the event (at the time the message was generated).
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent {
  
  inline def apply(): SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent](x: Self) {
    
    inline def setEndTime(value: SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setStartTime(value: SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
