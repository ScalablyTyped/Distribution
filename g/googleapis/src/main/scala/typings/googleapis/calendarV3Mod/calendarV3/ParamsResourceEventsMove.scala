package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEventsMove extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Calendar identifier of the source calendar where the event currently is
    * on.
    */
  var calendarId: js.UndefOr[String] = js.native
  /**
    * Calendar identifier of the target calendar where the event is to be moved
    * to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Event identifier.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * Deprecated. Please use sendUpdates instead.  Whether to send
    * notifications about the change of the event's organizer. Note that some
    * emails might still be sent even if you set the value to false. The
    * default is false.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Guests who should receive notifications about the change of the event's
    * organizer.
    */
  var sendUpdates: js.UndefOr[String] = js.native
}

object ParamsResourceEventsMove {
  @scala.inline
  def apply(): ParamsResourceEventsMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEventsMove]
  }
  @scala.inline
  implicit class ParamsResourceEventsMoveOps[Self <: ParamsResourceEventsMove] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarId: Self = this.set("calendarId", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    @scala.inline
    def setSendNotifications(value: Boolean): Self = this.set("sendNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotifications: Self = this.set("sendNotifications", js.undefined)
    @scala.inline
    def setSendUpdates(value: String): Self = this.set("sendUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendUpdates: Self = this.set("sendUpdates", js.undefined)
  }
  
}

