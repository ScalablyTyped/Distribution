package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsQuickadd
  extends StObject
     with StandardParameters {
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use sendUpdates instead.
    *
    * Whether to send notifications about the creation of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Guests who should receive notifications about the creation of the new event.
    */
  var sendUpdates: js.UndefOr[String] = js.undefined
  
  /**
    * The text describing the event to be created.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsQuickadd {
  
  inline def apply(): ParamsResourceEventsQuickadd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsQuickadd]
  }
  
  extension [Self <: ParamsResourceEventsQuickadd](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    inline def setSendUpdates(value: String): Self = StObject.set(x, "sendUpdates", value.asInstanceOf[js.Any])
    
    inline def setSendUpdatesUndefined: Self = StObject.set(x, "sendUpdates", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
