package typings.gapiClientCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxResults extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated,
    * non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an
    * email address value in the mentioned places. Optional. The default is False.
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
    * user, use the "primary" keyword.
    */
  var calendarId: String
  /** Recurring event identifier. */
  var eventId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.undefined
  /** Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The original start time of the instance in the result. Optional. */
  var originalStart: js.UndefOr[String] = js.undefined
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if
    * singleEvents is False. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with
    * mandatory time zone offset.
    */
  var timeMax: js.UndefOr[String] = js.undefined
  /**
    * Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with
    * mandatory time zone offset.
    */
  var timeMin: js.UndefOr[String] = js.undefined
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonMaxResults {
  @scala.inline
  def apply(
    calendarId: String,
    eventId: String,
    alt: String = null,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    maxAttendees: Int | Double = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    originalStart: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    timeMax: String = null,
    timeMin: String = null,
    timeZone: String = null,
    userIp: String = null
  ): AnonMaxResults = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (originalStart != null) __obj.updateDynamic("originalStart")(originalStart.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxResults]
  }
}

