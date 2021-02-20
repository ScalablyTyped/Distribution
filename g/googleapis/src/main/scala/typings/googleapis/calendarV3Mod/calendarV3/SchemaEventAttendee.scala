package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaEventAttendee extends StObject {
  
  /**
    * Number of additional guests. Optional. The default is 0.
    */
  var additionalGuests: js.UndefOr[Double] = js.native
  
  /**
    * The attendee&#39;s response comment. Optional.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * The attendee&#39;s name, if available. Optional.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The attendee&#39;s email address, if available. This field must be
    * present when adding an attendee. It must be a valid email address as per
    * RFC5322. Required when adding an attendee.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The attendee&#39;s Profile ID, if available. It corresponds to the id
    * field in the People collection of the Google+ API
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether this is an optional attendee. Optional. The default is False.
    */
  var optional: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the attendee is the organizer of the event. Read-only. The
    * default is False.
    */
  var organizer: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the attendee is a resource. Can only be set when the attendee is
    * added to the event for the first time. Subsequent modifications are
    * ignored. Optional. The default is False.
    */
  var resource: js.UndefOr[Boolean] = js.native
  
  /**
    * The attendee&#39;s response status. Possible values are:   -
    * &quot;needsAction&quot; - The attendee has not responded to the
    * invitation.  - &quot;declined&quot; - The attendee has declined the
    * invitation.  - &quot;tentative&quot; - The attendee has tentatively
    * accepted the invitation.  - &quot;accepted&quot; - The attendee has
    * accepted the invitation.
    */
  var responseStatus: js.UndefOr[String] = js.native
  
  /**
    * Whether this entry represents the calendar on which this copy of the
    * event appears. Read-only. The default is False.
    */
  var self: js.UndefOr[Boolean] = js.native
}
object SchemaEventAttendee {
  
  @scala.inline
  def apply(): SchemaEventAttendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventAttendee]
  }
  
  @scala.inline
  implicit class SchemaEventAttendeeMutableBuilder[Self <: SchemaEventAttendee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
    
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
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    @scala.inline
    def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
