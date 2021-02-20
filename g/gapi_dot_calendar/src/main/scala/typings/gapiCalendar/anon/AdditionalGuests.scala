package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalGuests extends StObject {
  
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
  implicit class AdditionalGuestsMutableBuilder[Self <: AdditionalGuests] (val x: Self) extends AnyVal {
    
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
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setResponseStatus(value: AttendeeResponseStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
  }
}
