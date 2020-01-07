package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarEventsDollarGet extends StandardParameters {
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
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The maximum number of attendees to include in the response. If there are
    * more than the specified number of attendees, only the participant is
    * returned. Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  /**
    * Time zone used in the response. Optional. The default is the time zone of
    * the calendar.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarEventsDollarGet {
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
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    timeZone: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarEventsDollarGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarEventsDollarGet]
  }
}

