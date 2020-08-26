package typings.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltAlwaysIncludeEmail extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is
    * available (i.e. a generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in
    * user, use the "primary" keyword.
    */
  var calendarId: String = js.native
  /**
    * Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's
    * body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData.
    * The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.native
  /** Event identifier. */
  var eventId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned.
    * Optional.
    */
  var maxAttendees: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use sendUpdates instead.
    *
    * Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you
    * set the value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  /** Guests who should receive notifications about the event update (for example, title changes, etc.). */
  var sendUpdates: js.UndefOr[String] = js.native
  /** Whether API client performing operation supports event attachments. Optional. The default is False. */
  var supportsAttachments: js.UndefOr[Boolean] = js.native
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}

object AltAlwaysIncludeEmail {
  @scala.inline
  def apply(calendarId: String, eventId: String): AltAlwaysIncludeEmail = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltAlwaysIncludeEmail]
  }
  @scala.inline
  implicit class AltAlwaysIncludeEmailOps[Self <: AltAlwaysIncludeEmail] (val x: Self) extends AnyVal {
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
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    @scala.inline
    def setConferenceDataVersion(value: Double): Self = this.set("conferenceDataVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceDataVersion: Self = this.set("conferenceDataVersion", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setSendNotifications(value: Boolean): Self = this.set("sendNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotifications: Self = this.set("sendNotifications", js.undefined)
    @scala.inline
    def setSendUpdates(value: String): Self = this.set("sendUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendUpdates: Self = this.set("sendUpdates", js.undefined)
    @scala.inline
    def setSupportsAttachments(value: Boolean): Self = this.set("supportsAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsAttachments: Self = this.set("supportsAttachments", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

