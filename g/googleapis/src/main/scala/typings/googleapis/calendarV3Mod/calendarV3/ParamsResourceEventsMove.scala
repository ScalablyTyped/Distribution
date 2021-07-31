package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsMove
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Calendar identifier of the source calendar where the event currently is
    * on.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Calendar identifier of the target calendar where the event is to be moved
    * to.
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the change of the event's organizer. Note that some
    * emails might still be sent even if you set the value to false. The
    * default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Guests who should receive notifications about the change of the event's
    * organizer.
    */
  var sendUpdates: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsMove {
  
  @scala.inline
  def apply(): ParamsResourceEventsMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsMove]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsMoveMutableBuilder[Self <: ParamsResourceEventsMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    @scala.inline
    def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    @scala.inline
    def setSendUpdates(value: String): Self = StObject.set(x, "sendUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUpdatesUndefined: Self = StObject.set(x, "sendUpdates", js.undefined)
  }
}
