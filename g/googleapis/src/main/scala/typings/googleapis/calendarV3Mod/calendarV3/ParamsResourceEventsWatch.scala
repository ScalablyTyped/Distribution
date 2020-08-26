package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventsWatch extends StandardParameters {
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
    * Specifies event ID in the iCalendar format to be included in the
    * response. Optional.
    */
  var iCalUID: js.UndefOr[String] = js.native
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  /**
    * Maximum number of events returned on one result page. The number of
    * events in the resulting page may be less than this value, or none at all,
    * even if there are more events matching the query. Incomplete pages can be
    * detected by a non-empty nextPageToken field in the response. By default
    * the value is 250 events. The page size can never be larger than 2500
    * events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The order of the events returned in the result. Optional. The default is
    * an unspecified, stable order.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Token specifying which result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Extended properties constraint specified as propertyName=value. Matches
    * only private properties. This parameter might be repeated multiple times
    * to return events that match all given constraints.
    */
  var privateExtendedProperty: js.UndefOr[js.Array[String]] = js.native
  /**
    * Free text search terms to find events that match these terms in any
    * field, except for extended properties. Optional.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.native
  /**
    * Extended properties constraint specified as propertyName=value. Matches
    * only shared properties. This parameter might be repeated multiple times
    * to return events that match all given constraints.
    */
  var sharedExtendedProperty: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to include deleted events (with status equals "cancelled") in the
    * result. Cancelled instances of recurring events (but not the underlying
    * recurring event) will still be included if showDeleted and singleEvents
    * are both False. If showDeleted and singleEvents are both True, only
    * single instances of deleted events (but not the underlying recurring
    * events) are returned. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include hidden invitations in the result. Optional. The
    * default is False.
    */
  var showHiddenInvitations: js.UndefOr[Boolean] = js.native
  /**
    * Whether to expand recurring events into instances and only return single
    * one-off events and instances of recurring events, but not the underlying
    * recurring events themselves. Optional. The default is False.
    */
  var singleEvents: js.UndefOr[Boolean] = js.native
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
  var syncToken: js.UndefOr[String] = js.native
  /**
    * Upper bound (exclusive) for an event's end time to filter by. Optional.
    * The default is not to filter by end time. Must be an RFC3339 timestamp
    * with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00,
    * 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If
    * timeMin is set, timeMax must be greater than timeMin.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * Lower bound (inclusive) for an event's start time to filter by. Optional.
    * The default is not to filter by start time. Must be an RFC3339 timestamp
    * with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00,
    * 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If
    * timeMax is set, timeMin must be smaller than timeMax.
    */
  var timeMin: js.UndefOr[String] = js.native
  /**
    * Time zone used in the response. Optional. The default is the time zone of
    * the calendar.
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * Lower bound for an event's last modification time (as a RFC3339
    * timestamp) to filter by. When specified, entries deleted since this time
    * will always be included regardless of showDeleted. Optional. The default
    * is not to filter by last modification time.
    */
  var updatedMin: js.UndefOr[String] = js.native
}

object ParamsResourceEventsWatch {
  @scala.inline
  def apply(): ParamsResourceEventsWatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsWatch]
  }
  @scala.inline
  implicit class ParamsResourceEventsWatchOps[Self <: ParamsResourceEventsWatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarId: Self = this.set("calendarId", js.undefined)
    @scala.inline
    def setICalUID(value: String): Self = this.set("iCalUID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICalUID: Self = this.set("iCalUID", js.undefined)
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrivateExtendedPropertyVarargs(value: String*): Self = this.set("privateExtendedProperty", js.Array(value :_*))
    @scala.inline
    def setPrivateExtendedProperty(value: js.Array[String]): Self = this.set("privateExtendedProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateExtendedProperty: Self = this.set("privateExtendedProperty", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaChannel): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSharedExtendedPropertyVarargs(value: String*): Self = this.set("sharedExtendedProperty", js.Array(value :_*))
    @scala.inline
    def setSharedExtendedProperty(value: js.Array[String]): Self = this.set("sharedExtendedProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedExtendedProperty: Self = this.set("sharedExtendedProperty", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setShowHiddenInvitations(value: Boolean): Self = this.set("showHiddenInvitations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHiddenInvitations: Self = this.set("showHiddenInvitations", js.undefined)
    @scala.inline
    def setSingleEvents(value: Boolean): Self = this.set("singleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleEvents: Self = this.set("singleEvents", js.undefined)
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setUpdatedMin(value: String): Self = this.set("updatedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedMin: Self = this.set("updatedMin", js.undefined)
  }
  
}

