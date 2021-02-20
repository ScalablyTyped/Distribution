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
trait ParamsResourceEventsInstances extends StandardParameters {
  
  /**
    * Whether to always include a value in the email field for the organizer,
    * creator and attendees, even if no real email is available (i.e. a
    * generated, non-working value will be provided). The use of this option is
    * discouraged and should only be used by clients which cannot handle the
    * absence of an email address value in the mentioned places. Optional. The
    * default is False.
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  
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
    * Recurring event identifier.
    */
  var eventId: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of events returned on one result page. By default the
    * value is 250 events. The page size can never be larger than 2500 events.
    * Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The original start time of the instance in the result. Optional.
    */
  var originalStart: js.UndefOr[String] = js.native
  
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the
    * result. Cancelled instances of recurring events will still be included if
    * singleEvents is False. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional.
    * The default is not to filter by start time. Must be an RFC3339 timestamp
    * with mandatory time zone offset.
    */
  var timeMax: js.UndefOr[String] = js.native
  
  /**
    * Lower bound (inclusive) for an event's end time to filter by. Optional.
    * The default is not to filter by end time. Must be an RFC3339 timestamp
    * with mandatory time zone offset.
    */
  var timeMin: js.UndefOr[String] = js.native
  
  /**
    * Time zone used in the response. Optional. The default is the time zone of
    * the calendar.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object ParamsResourceEventsInstances {
  
  @scala.inline
  def apply(): ParamsResourceEventsInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInstances]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsInstancesMutableBuilder[Self <: ParamsResourceEventsInstances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
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
    def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOriginalStart(value: String): Self = StObject.set(x, "originalStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartUndefined: Self = StObject.set(x, "originalStart", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
