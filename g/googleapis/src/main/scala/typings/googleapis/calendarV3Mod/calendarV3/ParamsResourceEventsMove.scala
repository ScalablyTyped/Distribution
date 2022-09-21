package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsMove
  extends StObject
     with StandardParameters {
  
  /**
    * Calendar identifier of the source calendar where the event currently is on.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Calendar identifier of the target calendar where the event is to be moved to.
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use sendUpdates instead.
    *
    * Whether to send notifications about the change of the event's organizer. Note that some emails might still be sent even if you set the value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Guests who should receive notifications about the change of the event's organizer.
    */
  var sendUpdates: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsMove {
  
  inline def apply(): ParamsResourceEventsMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsMove]
  }
  
  extension [Self <: ParamsResourceEventsMove](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    inline def setSendUpdates(value: String): Self = StObject.set(x, "sendUpdates", value.asInstanceOf[js.Any])
    
    inline def setSendUpdatesUndefined: Self = StObject.set(x, "sendUpdates", js.undefined)
  }
}
