package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsInstances
  extends StObject
     with StandardParameters {
  
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Recurring event identifier.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The original start time of the instance in the result. Optional.
    */
  var originalStart: js.UndefOr[String] = js.undefined
  
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if singleEvents is False. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset.
    */
  var timeMax: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset.
    */
  var timeMin: js.UndefOr[String] = js.undefined
  
  /**
    * Time zone used in the response. Optional. The default is the time zone of the calendar.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsInstances {
  
  inline def apply(): ParamsResourceEventsInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInstances]
  }
  
  extension [Self <: ParamsResourceEventsInstances](x: Self) {
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOriginalStart(value: String): Self = StObject.set(x, "originalStart", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartUndefined: Self = StObject.set(x, "originalStart", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
