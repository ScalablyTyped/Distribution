package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventAttendee extends StObject {
  
  /**
    * Number of additional guests. Optional. The default is 0.
    */
  var additionalGuests: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The attendee's response comment. Optional.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The attendee's name, if available. Optional.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The attendee's email address, if available. This field must be present when adding an attendee. It must be a valid email address as per RFC5322.
    * Required when adding an attendee.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The attendee's Profile ID, if available.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this is an optional attendee. Optional. The default is False.
    */
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the attendee is the organizer of the event. Read-only. The default is False.
    */
  var organizer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the attendee is a resource. Can only be set when the attendee is added to the event for the first time. Subsequent modifications are ignored. Optional. The default is False.
    */
  var resource: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The attendee's response status. Possible values are:
    * - "needsAction" - The attendee has not responded to the invitation (recommended for new events).
    * - "declined" - The attendee has declined the invitation.
    * - "tentative" - The attendee has tentatively accepted the invitation.
    * - "accepted" - The attendee has accepted the invitation.  Warning: If you add an event using the values declined, tentative, or accepted, attendees with the "Add invitations to my calendar" setting set to "When I respond to invitation in email" won't see an event on their calendar unless they choose to change their invitation response in the event invitation email.
    */
  var responseStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this entry represents the calendar on which this copy of the event appears. Read-only. The default is False.
    */
  var self: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaEventAttendee {
  
  inline def apply(): SchemaEventAttendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventAttendee]
  }
  
  extension [Self <: SchemaEventAttendee](x: Self) {
    
    inline def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalGuestsNull: Self = StObject.set(x, "additionalGuests", null)
    
    inline def setAdditionalGuestsUndefined: Self = StObject.set(x, "additionalGuests", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    inline def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusNull: Self = StObject.set(x, "responseStatus", null)
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfNull: Self = StObject.set(x, "self", null)
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
