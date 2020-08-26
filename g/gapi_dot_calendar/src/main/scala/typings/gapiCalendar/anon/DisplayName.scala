package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayName extends js.Object {
  // The organizer's name, if available.
  var displayName: js.UndefOr[String] = js.native
  // The organizer's email address, if available.
  var email: js.UndefOr[String] = js.native
  // The organizer's Profile ID, if available.
  var id: js.UndefOr[String] = js.native
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var self: js.UndefOr[Boolean] = js.native
}

object DisplayName {
  @scala.inline
  def apply(): DisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayName]
  }
  @scala.inline
  implicit class DisplayNameOps[Self <: DisplayName] (val x: Self) extends AnyVal {
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
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
  
}

