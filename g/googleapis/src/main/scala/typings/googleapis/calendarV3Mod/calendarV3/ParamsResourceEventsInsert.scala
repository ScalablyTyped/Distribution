package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvent] = js.undefined
  
  /**
    * Deprecated. Please use sendUpdates instead.
    *
    * Whether to send notifications about the creation of the new event. Note that some emails might still be sent even if you set the value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to send notifications about the creation of the new event. Note that some emails might still be sent. The default is false.
    */
  var sendUpdates: js.UndefOr[String] = js.undefined
  
  /**
    * Whether API client performing operation supports event attachments. Optional. The default is False.
    */
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceEventsInsert {
  
  inline def apply(): ParamsResourceEventsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInsert]
  }
  
  extension [Self <: ParamsResourceEventsInsert](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setConferenceDataVersion(value: Double): Self = StObject.set(x, "conferenceDataVersion", value.asInstanceOf[js.Any])
    
    inline def setConferenceDataVersionUndefined: Self = StObject.set(x, "conferenceDataVersion", js.undefined)
    
    inline def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setRequestBody(value: SchemaEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    inline def setSendUpdates(value: String): Self = StObject.set(x, "sendUpdates", value.asInstanceOf[js.Any])
    
    inline def setSendUpdatesUndefined: Self = StObject.set(x, "sendUpdates", js.undefined)
    
    inline def setSupportsAttachments(value: Boolean): Self = StObject.set(x, "supportsAttachments", value.asInstanceOf[js.Any])
    
    inline def setSupportsAttachmentsUndefined: Self = StObject.set(x, "supportsAttachments", js.undefined)
  }
}
