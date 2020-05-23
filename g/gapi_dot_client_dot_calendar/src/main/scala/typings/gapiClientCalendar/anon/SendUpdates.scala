package typings.gapiClientCalendar.anon

import typings.gapiClientCalendar.gapi.client.calendar.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUpdates extends js.Object {
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
  /**
    * Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's
    * body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData.
    * The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.undefined
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
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Request body */
  var resource: Event
  /**
    * Deprecated. Please use sendUpdates instead.
    *
    * Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you
    * set the value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  /** Guests who should receive notifications about the event update (for example, title changes, etc.). */
  var sendUpdates: js.UndefOr[String] = js.undefined
  /** Whether API client performing operation supports event attachments. Optional. The default is False. */
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object SendUpdates {
  @scala.inline
  def apply(
    calendarId: String,
    eventId: String,
    resource: Event,
    alt: String = null,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    conferenceDataVersion: js.UndefOr[Double] = js.undefined,
    fields: String = null,
    key: String = null,
    maxAttendees: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    sendNotifications: js.UndefOr[Boolean] = js.undefined,
    sendUpdates: String = null,
    supportsAttachments: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): SendUpdates = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conferenceDataVersion)) __obj.updateDynamic("conferenceDataVersion")(conferenceDataVersion.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotifications)) __obj.updateDynamic("sendNotifications")(sendNotifications.get.asInstanceOf[js.Any])
    if (sendUpdates != null) __obj.updateDynamic("sendUpdates")(sendUpdates.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsAttachments)) __obj.updateDynamic("supportsAttachments")(supportsAttachments.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUpdates]
  }
}

