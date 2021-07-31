package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the deletion of the event. Note that some emails
    * might still be sent even if you set the value to false. The default is
    * false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Guests who should receive notifications about the deletion of the event.
    */
  var sendUpdates: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsDelete {
  
  @scala.inline
  def apply(): ParamsResourceEventsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsDeleteMutableBuilder[Self <: ParamsResourceEventsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
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
