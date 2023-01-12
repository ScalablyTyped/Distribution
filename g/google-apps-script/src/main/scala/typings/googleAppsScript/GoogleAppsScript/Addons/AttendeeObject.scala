package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Object with information on individual attendees to Calendar events
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#attendee
  */
trait AttendeeObject extends StObject {
  
  var additionalGuests: Double
  
  var comment: String
  
  var displayName: String
  
  var email: String
  
  var optional: Boolean
  
  var organizer: Boolean
  
  var resource: Boolean
  
  var responseStatus: InvitationResponseStatus
  
  var self: Boolean
}
object AttendeeObject {
  
  inline def apply(
    additionalGuests: Double,
    comment: String,
    displayName: String,
    email: String,
    optional: Boolean,
    organizer: Boolean,
    resource: Boolean,
    responseStatus: InvitationResponseStatus,
    self: Boolean
  ): AttendeeObject = {
    val __obj = js.Dynamic.literal(additionalGuests = additionalGuests.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttendeeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttendeeObject] (val x: Self) extends AnyVal {
    
    inline def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResponseStatus(value: InvitationResponseStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
