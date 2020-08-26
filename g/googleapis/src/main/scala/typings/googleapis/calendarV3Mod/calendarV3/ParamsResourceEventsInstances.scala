package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventsInstances extends StandardParameters {
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

object ParamsResourceEventsInstances {
  @scala.inline
  def apply(): ParamsResourceEventsInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsInstances]
  }
  @scala.inline
  implicit class ParamsResourceEventsInstancesOps[Self <: ParamsResourceEventsInstances] (val x: Self) extends AnyVal {
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
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOriginalStart(value: String): Self = this.set("originalStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalStart: Self = this.set("originalStart", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
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
  }
  
}

