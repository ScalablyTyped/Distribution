package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEventsUpdate extends StandardParameters {
  
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
    * Version number of conference data supported by the API client. Version 0
    * assumes no conference data support and ignores conference data in the
    * event's body. Version 1 enables support for copying of ConferenceData as
    * well as for creating new conferences using the createRequest field of
    * conferenceData. The default is 0.
    */
  var conferenceDataVersion: js.UndefOr[Double] = js.native
  
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
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEvent] = js.native
  
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the event update (for example, description changes,
    * etc.). Note that some emails might still be sent even if you set the
    * value to false. The default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Guests who should receive notifications about the event update (for
    * example, title changes, etc.).
    */
  var sendUpdates: js.UndefOr[String] = js.native
  
  /**
    * Whether API client performing operation supports event attachments.
    * Optional. The default is False.
    */
  var supportsAttachments: js.UndefOr[Boolean] = js.native
}
object ParamsResourceEventsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceEventsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceEventsUpdateOps[Self <: ParamsResourceEventsUpdate] (val x: Self) extends AnyVal {
    
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
    def setConferenceDataVersion(value: Double): Self = this.set("conferenceDataVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceDataVersion: Self = this.set("conferenceDataVersion", js.undefined)
    
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: Double): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEvent): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
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
  }
}
