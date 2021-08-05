package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEventsWatch
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to always include a value in the email field for the organizer,
    * creator and attendees, even if no real email is available (i.e. a
    * generated, non-working value will be provided). The use of this option is
    * discouraged and should only be used by clients which cannot handle the
    * absence of an email address value in the mentioned places. Optional. The
    * default is False.
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
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
    * Specifies event ID in the iCalendar format to be included in the
    * response. Optional.
    */
  var iCalUID: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of events returned on one result page. The number of
    * events in the resulting page may be less than this value, or none at all,
    * even if there are more events matching the query. Incomplete pages can be
    * detected by a non-empty nextPageToken field in the response. By default
    * the value is 250 events. The page size can never be larger than 2500
    * events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The order of the events returned in the result. Optional. The default is
    * an unspecified, stable order.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Extended properties constraint specified as propertyName=value. Matches
    * only private properties. This parameter might be repeated multiple times
    * to return events that match all given constraints.
    */
  var privateExtendedProperty: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Free text search terms to find events that match these terms in any
    * field, except for extended properties. Optional.
    */
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.undefined
  
  /**
    * Extended properties constraint specified as propertyName=value. Matches
    * only shared properties. This parameter might be repeated multiple times
    * to return events that match all given constraints.
    */
  var sharedExtendedProperty: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the
    * result. Cancelled instances of recurring events (but not the underlying
    * recurring event) will still be included if showDeleted and singleEvents
    * are both False. If showDeleted and singleEvents are both True, only
    * single instances of deleted events (but not the underlying recurring
    * events) are returned. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to include hidden invitations in the result. Optional. The
    * default is False.
    */
  var showHiddenInvitations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to expand recurring events into instances and only return single
    * one-off events and instances of recurring events, but not the underlying
    * recurring events themselves. Optional. The default is False.
    */
  var singleEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Token obtained from the nextSyncToken field returned on the last page of
    * results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. All events
    * deleted since the previous list request will always be in the result set
    * and it is not allowed to set showDeleted to False. There are several
    * query parameters that cannot be specified together with nextSyncToken to
    * ensure consistency of the client state.  These are:  - iCalUID  - orderBy
    * - privateExtendedProperty  - q  - sharedExtendedProperty  - timeMin  -
    * timeMax  - updatedMin If the syncToken expires, the server will respond
    * with a 410 GONE response code and the client should clear its storage and
    * perform a full synchronization without any syncToken. Learn more about
    * incremental synchronization. Optional. The default is to return all
    * entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
  
  /**
    * Upper bound (exclusive) for an event's end time to filter by. Optional.
    * The default is not to filter by end time. Must be an RFC3339 timestamp
    * with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00,
    * 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If
    * timeMin is set, timeMax must be greater than timeMin.
    */
  var timeMax: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound (inclusive) for an event's start time to filter by. Optional.
    * The default is not to filter by start time. Must be an RFC3339 timestamp
    * with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00,
    * 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If
    * timeMax is set, timeMin must be smaller than timeMax.
    */
  var timeMin: js.UndefOr[String] = js.undefined
  
  /**
    * Time zone used in the response. Optional. The default is the time zone of
    * the calendar.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Lower bound for an event's last modification time (as a RFC3339
    * timestamp) to filter by. When specified, entries deleted since this time
    * will always be included regardless of showDeleted. Optional. The default
    * is not to filter by last modification time.
    */
  var updatedMin: js.UndefOr[String] = js.undefined
}
object ParamsResourceEventsWatch {
  
  inline def apply(): ParamsResourceEventsWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsWatch]
  }
  
  extension [Self <: ParamsResourceEventsWatch](x: Self) {
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
    
    inline def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
    
    inline def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPrivateExtendedProperty(value: js.Array[String]): Self = StObject.set(x, "privateExtendedProperty", value.asInstanceOf[js.Any])
    
    inline def setPrivateExtendedPropertyUndefined: Self = StObject.set(x, "privateExtendedProperty", js.undefined)
    
    inline def setPrivateExtendedPropertyVarargs(value: String*): Self = StObject.set(x, "privateExtendedProperty", js.Array(value :_*))
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setRequestBody(value: SchemaChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSharedExtendedProperty(value: js.Array[String]): Self = StObject.set(x, "sharedExtendedProperty", value.asInstanceOf[js.Any])
    
    inline def setSharedExtendedPropertyUndefined: Self = StObject.set(x, "sharedExtendedProperty", js.undefined)
    
    inline def setSharedExtendedPropertyVarargs(value: String*): Self = StObject.set(x, "sharedExtendedProperty", js.Array(value :_*))
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setShowHiddenInvitations(value: Boolean): Self = StObject.set(x, "showHiddenInvitations", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenInvitationsUndefined: Self = StObject.set(x, "showHiddenInvitations", js.undefined)
    
    inline def setSingleEvents(value: Boolean): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    inline def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
  }
}
