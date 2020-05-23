package typings.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalUID extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is
    * available (i.e. a generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
    * user, use the "primary" keyword.
    */
  var calendarId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Specifies event ID in the iCalendar format to be included in the response. Optional. */
  var iCalUID: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if
    * there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is
    * 250 events. The page size can never be larger than 2500 events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The order of the events returned in the result. Optional. The default is an unspecified, stable order. */
  var orderBy: js.UndefOr[String] = js.undefined
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to
    * return events that match all given constraints.
    */
  var privateExtendedProperty: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Free text search terms to find events that match these terms in any field, except for extended properties. Optional. */
  var q: js.UndefOr[String] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to
    * return events that match all given constraints.
    */
  var sharedExtendedProperty: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying
    * recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single
    * instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  /** Whether to include hidden invitations in the result. Optional. The default is False. */
  var showHiddenInvitations: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying
    * recurring events themselves. Optional. The default is False.
    */
  var singleEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list
    * request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it
    * is not allowed to set showDeleted to False.
    * There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
    *
    * These are:
    * - iCalUID
    * - orderBy
    * - privateExtendedProperty
    * - q
    * - sharedExtendedProperty
    * - timeMin
    * - timeMax
    * - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full
    * synchronization without any syncToken.
    * Learn more about incremental synchronization.
    * Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.undefined
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with
    * mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is
    * set, timeMax must be greater than timeMin.
    */
  var timeMax: js.UndefOr[String] = js.undefined
  /**
    * Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with
    * mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is
    * set, timeMin must be smaller than timeMax.
    */
  var timeMin: js.UndefOr[String] = js.undefined
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.undefined
  /**
    * Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be
    * included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    */
  var updatedMin: js.UndefOr[String] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object ICalUID {
  @scala.inline
  def apply(
    calendarId: String,
    alt: String = null,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    iCalUID: String = null,
    key: String = null,
    maxAttendees: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    orderBy: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    privateExtendedProperty: String | js.Array[String] = null,
    q: String = null,
    quotaUser: String = null,
    sharedExtendedProperty: String | js.Array[String] = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHiddenInvitations: js.UndefOr[Boolean] = js.undefined,
    singleEvents: js.UndefOr[Boolean] = js.undefined,
    syncToken: String = null,
    timeMax: String = null,
    timeMin: String = null,
    timeZone: String = null,
    updatedMin: String = null,
    userIp: String = null
  ): ICalUID = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (privateExtendedProperty != null) __obj.updateDynamic("privateExtendedProperty")(privateExtendedProperty.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (sharedExtendedProperty != null) __obj.updateDynamic("sharedExtendedProperty")(sharedExtendedProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHiddenInvitations)) __obj.updateDynamic("showHiddenInvitations")(showHiddenInvitations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleEvents)) __obj.updateDynamic("singleEvents")(singleEvents.get.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalUID]
  }
}

