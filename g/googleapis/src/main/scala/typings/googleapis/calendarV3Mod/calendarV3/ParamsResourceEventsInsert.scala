package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEventsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list
    * method. If you want to access the primary calendar of the currently
    * logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.native
  
  /**
    * Version number of conference data supported by the API client. Version 0
    * assumes no conference data support and ignores conference data in the
    * event's body. Version 1 enables support for copying of ConferenceData as
    * well as for creating new conferences using the createRequest field of
    * conferenceData. The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvent] = js.native
  
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the creation of the new event. Note that some emails
    * might still be sent even if you set the value to false. The default is
    * false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to send notifications about the creation of the new event. Note
    * that some emails might still be sent. The default is false.
    */
  var sendUpdates: js.UndefOr[String] = js.native
  
  /**
    * Whether API client performing operation supports event attachments.
    * Optional. The default is False.
    */
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}
object ParamsResourceEventsInsert {
  
  @scala.inline
  def apply(): ParamsResourceEventsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsInsertMutableBuilder[Self <: ParamsResourceEventsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    @scala.inline
    def setConferenceDataVersion(value: Double): Self = StObject.set(x, "conferenceDataVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceDataVersionUndefined: Self = StObject.set(x, "conferenceDataVersion", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    @scala.inline
    def setSendUpdates(value: String): Self = StObject.set(x, "sendUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendUpdatesUndefined: Self = StObject.set(x, "sendUpdates", js.undefined)
    
    @scala.inline
    def setSupportsAttachments(value: Boolean): Self = StObject.set(x, "supportsAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAttachmentsUndefined: Self = StObject.set(x, "supportsAttachments", js.undefined)
  }
}
