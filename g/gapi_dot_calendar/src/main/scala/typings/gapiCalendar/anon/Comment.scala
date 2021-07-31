package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  var additionalGuests: js.UndefOr[integer] = js.undefined
  
  var comment: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var id: String
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var organizer: Boolean
  
  var resource: Boolean
  
  var responseStatus: AttendeeResponseStatus
  
  var self: Boolean
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
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalGuests(value: integer): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalGuestsUndefined: Self = StObject.set(x, "additionalGuests", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: AttendeeResponseStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
