package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarEventsDollarInstances extends StandardParameters {
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

object ParamsDollarResourceDollarEventsDollarInstances {
  @scala.inline
  def apply(
    alt: String = null,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    calendarId: String = null,
    eventId: String = null,
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
  ): ParamsDollarResourceDollarEventsDollarInstances = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ParamsDollarResourceDollarEventsDollarInstances]
  }
}

