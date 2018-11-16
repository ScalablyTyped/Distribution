package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_TimeMin extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated,
                   * non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an
                   * email address value in the mentioned places. Optional. The default is False.
                   */
  var alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
                   * user, use the "primary" keyword.
                   */
  var calendarId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies event ID in the iCalendar format to be included in the response. Optional. */
  var iCalUID: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
                   * Optional.
                   */
  var maxAttendees: js.UndefOr[scala.Double] = js.undefined
  /**
                   * Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if
                   * there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is
                   * 250 events. The page size can never be larger than 2500 events. Optional.
                   */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The order of the events returned in the result. Optional. The default is an unspecified, stable order. */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to
                   * return events that match all given constraints.
                   */
  var privateExtendedProperty: js.UndefOr[java.lang.String] = js.undefined
  /** Free text search terms to find events that match these terms in any field, except for extended properties. Optional. */
  var q: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to
                   * return events that match all given constraints.
                   */
  var sharedExtendedProperty: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying
                   * recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single
                   * instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
                   */
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to include hidden invitations in the result. Optional. The default is False. */
  var showHiddenInvitations: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying
                   * recurring events themselves. Optional. The default is False.
                   */
  var singleEvents: js.UndefOr[scala.Boolean] = js.undefined
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
  var syncToken: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with
                   * mandatory time zone offset, e.g., 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but will be ignored. If timeMin is set,
                   * timeMax must be greater than timeMin.
                   */
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with
                   * mandatory time zone offset, e.g., 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but will be ignored. If timeMax is set,
                   * timeMin must be smaller than timeMax.
                   */
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be
                   * included regardless of showDeleted. Optional. The default is not to filter by last modification time.
                   */
  var updatedMin: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

