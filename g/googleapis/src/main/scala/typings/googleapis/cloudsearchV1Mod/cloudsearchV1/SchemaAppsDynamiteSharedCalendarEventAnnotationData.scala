package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedCalendarEventAnnotationData extends StObject {
  
  var calendarEvent: js.UndefOr[SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent] = js.undefined
  
  /**
    * Notification about the creation of an event.
    */
  var eventCreation: js.UndefOr[SchemaAppsDynamiteSharedCalendarEventAnnotationDataEventCreation] = js.undefined
}
object SchemaAppsDynamiteSharedCalendarEventAnnotationData {
  
  inline def apply(): SchemaAppsDynamiteSharedCalendarEventAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedCalendarEventAnnotationData]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedCalendarEventAnnotationData](x: Self) {
    
    inline def setCalendarEvent(value: SchemaAppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent): Self = StObject.set(x, "calendarEvent", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventUndefined: Self = StObject.set(x, "calendarEvent", js.undefined)
    
    inline def setEventCreation(value: SchemaAppsDynamiteSharedCalendarEventAnnotationDataEventCreation): Self = StObject.set(x, "eventCreation", value.asInstanceOf[js.Any])
    
    inline def setEventCreationUndefined: Self = StObject.set(x, "eventCreation", js.undefined)
  }
}
