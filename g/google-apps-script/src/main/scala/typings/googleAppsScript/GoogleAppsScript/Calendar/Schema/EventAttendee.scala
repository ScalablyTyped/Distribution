package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAttendee extends js.Object {
  var additionalGuests: js.UndefOr[Double] = js.native
  var comment: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var organizer: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[Boolean] = js.native
  var responseStatus: js.UndefOr[String] = js.native
  var self: js.UndefOr[Boolean] = js.native
}

object EventAttendee {
  @scala.inline
  def apply(): EventAttendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttendee]
  }
  @scala.inline
  implicit class EventAttendeeOps[Self <: EventAttendee] (val x: Self) extends AnyVal {
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
    def setAdditionalGuests(value: Double): Self = this.set("additionalGuests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalGuests: Self = this.set("additionalGuests", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setOrganizer(value: Boolean): Self = this.set("organizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    @scala.inline
    def setResource(value: Boolean): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResponseStatus(value: String): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStatus: Self = this.set("responseStatus", js.undefined)
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
  
}

