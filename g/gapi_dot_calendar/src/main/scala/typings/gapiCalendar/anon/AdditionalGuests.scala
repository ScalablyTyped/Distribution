package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalGuests extends js.Object {
  
  var additionalGuests: js.UndefOr[integer] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var email: String = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var responseStatus: js.UndefOr[AttendeeResponseStatus] = js.native
}
object AdditionalGuests {
  
  @scala.inline
  def apply(email: String): AdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalGuests]
  }
  
  @scala.inline
  implicit class AdditionalGuestsOps[Self <: AdditionalGuests] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalGuests(value: integer): Self = this.set("additionalGuests", value.asInstanceOf[js.Any])
    
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
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setResponseStatus(value: AttendeeResponseStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseStatus: Self = this.set("responseStatus", js.undefined)
  }
}
