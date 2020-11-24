package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  var additionalGuests: js.UndefOr[integer] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var email: String = js.native
  
  var id: String = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var organizer: Boolean = js.native
  
  var resource: Boolean = js.native
  
  var responseStatus: AttendeeResponseStatus = js.native
  
  var self: Boolean = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    email: String,
    id: String,
    organizer: Boolean,
    resource: Boolean,
    responseStatus: AttendeeResponseStatus,
    self: Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizer(value: Boolean): Self = this.set("organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Boolean): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: AttendeeResponseStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: Boolean): Self = this.set("self", value.asInstanceOf[js.Any])
    
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
  }
}
