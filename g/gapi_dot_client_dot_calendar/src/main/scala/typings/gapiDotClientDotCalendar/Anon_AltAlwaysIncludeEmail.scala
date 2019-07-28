package typings.gapiDotClientDotCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltAlwaysIncludeEmail extends js.Object {
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
  /** Event identifier. */
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
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltAlwaysIncludeEmail {
  @scala.inline
  def apply(
    calendarId: String,
    eventId: String,
    alt: String = null,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    maxAttendees: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    timeZone: String = null,
    userIp: String = null
  ): Anon_AltAlwaysIncludeEmail = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, eventId = eventId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltAlwaysIncludeEmail]
  }
}

